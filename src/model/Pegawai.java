package model;

import java.time.*;

//parentclass/superclass
public class Pegawai {
    // atribut
    String idPegawai;
    String nama;
    LocalDate tglLahir;
    String Alamat;
    String NoTelp;
    String Status;
    int gol;
    int LamaKerja;
    String User;
    int Pass;

    // constructor (1)
    public Pegawai(String idPegawai, String nama, LocalDate tglLahir, String alamat, String noTelp, String status, int gol, int lamaKerja) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.Alamat = alamat;
        this.NoTelp = noTelp;
        this.Status = status;
        this.gol = gol;
        this.LamaKerja = lamaKerja;
    }
    // constructor (1)
    public Pegawai() {
        System.out.println("      Data Gaji Pegawai        ");
        System.out.println("===============================");
    }
    // constructor (2)
    public Pegawai(String User)
    {
        this.User = User;
        System.out.println("===============================");
        System.out.println("Username: "+this.User);
        System.out.println("===============================");
    }
    // construktor (3)

    public Pegawai(int pass) {
        Pass = pass;
        System.out.println("Password: "+this.Pass);
        System.out.println("===============================");
    }

    // method menghitung usia pegawai (1)
    public int hitungUsia(){
        // mendapatkan tanggal hari ini
        LocalDate today = LocalDate.now();
        // hitung selisih tgl lahir dan tgl hari ini
        Period selisih = Period.between(this.tglLahir, today);
        return selisih.getYears();
    }

    //method hitung gaji pokok dari gol dan umur (2)
    public long hitungGapok(){
        long gapok = 0;
        if (this.gol == 1){
            if (this.hitungUsia() < 40){
                gapok = 3500000;
            } else {
                gapok = 4500000;
            }
        } else if (this.gol == 2){
            if (this.hitungUsia() < 40){
                gapok = 5000000;
            } else {
                gapok = 6000000;
            }
        }
        return gapok;
    }
    // method hitung bonus dari lama kerja (3)
    public long hitungBonus() {
        long bonus =0;
        if (this.LamaKerja >= 6) {
            bonus = 500000;
        } else {
            bonus = 0;
        }
        return bonus;
    }
    // method hitung Tunjangan dari Status (4)
    public long hitungTunj() {
        long tunj =0;
        if (this.Status == "Menikah") {
            tunj = 50000;
        } else {
            tunj = 0;
        }
        return tunj;
    }
    // method hitung gaji bersih (5)
    public long HitungGaber(){
        long sum = this.hitungGapok() + this.hitungBonus() + this.hitungTunj();
        return sum;
    }

    // mencetak data pegawai dan gaji pokoknya
    public void printPegawai(){
        System.out.println("ID Pegawai   : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Tgl Lahir    : " + this.tglLahir);
        System.out.println("Alamat       : " + this.Alamat );
        System.out.println("No Telpon    : " + this.NoTelp );
        System.out.println("Status       : " + this.Status);
        System.out.println("Golongan     : " + this.gol);
        System.out.println("Lama Kerja   : " + this.LamaKerja);
        System.out.println("Gaji Pokok   : Rp " + this.hitungGapok());
        System.out.println("Bonus        : Rp " + this.hitungBonus());
        System.out.println("Tunjangan    : Rp " + this.hitungTunj());
        System.out.println("Gaji Bersih  : Rp " + this.HitungGaber());
        System.out.println("");

    }

}

