package model;

import java.time.*;
//inheritance/sub-class
public class Dosen extends Pegawai{
    // atribut tambahan untuk dosen
    private String nidn;
    private String Jurusan;
    private String BidangKeahlian;

    // constructor
    public Dosen(){
        this.nidn = nidn;
        this.Jurusan = Jurusan;
        this.BidangKeahlian= BidangKeahlian;
    }

    public Dosen(String id, String nama, LocalDate tgllhr, String Alamat, String NoTelp, String Status, int gol, int LamaKerja,
                 String nidn, String Jurusan, String BidangKeahlian){
        setIdPegawai(id);
        setNama(nama);
        setTglLahir(tgllhr);
        setAlamat(Alamat);
        setNoTelp(NoTelp);
        setStatus(Status);
        setGol(gol);
        setLamaKerja(LamaKerja);

        this.nidn = nidn;
        this.Jurusan = Jurusan;
        this.BidangKeahlian= BidangKeahlian;

    }

    // getter dan setter
    // method (3)
    public String getNidn() {
        return nidn;
    }
    // method (4)
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
    // method (5)
    public String getJurusan() {
        return Jurusan;
    }
    //method (6)
    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }
    // method (7)
    public String getBidangKeahlian() {
        return BidangKeahlian;
    }
    //method (8)
    public void setBidangKeahlian(String bidangKeahlian) {
        BidangKeahlian = bidangKeahlian;
    }

    // Method menghitung tunjangan pegawai dosen (1)
    long hitungTunjDosen(){
        long tunjDosen = 1000000;
        return tunjDosen;
    }

    // Method menghitung tunjangan fungsional dosen (2)
    long hitungTunjFungsional(){
        long tunjFungsional;
        if (this.hitungUsia() < 40){
            tunjFungsional = 1700000;
        } else {
            tunjFungsional = 2000000;
        }

        return tunjFungsional;
    }


    // cetak data pegawai, rincian gaji, total gaji
    public void printPegawai(){
        System.out.println("ID Pegawai       : " + this.getIdPegawai());
        System.out.println("Nama Pegawai     : " + this.getNama());
        System.out.println("Tgl Lahir        : " + this.getTglLahir());
        System.out.println("Alamat           : " + this.getAlamat());
        System.out.println("No Telpon        : " + this.getNoTelp());
        System.out.println("Status           : " + this.getStatus());
        System.out.println("Golongan         : " + this.getGol());
        System.out.println("Lama Kerja       : " + this.getLamaKerja());
        System.out.println("NIDN             : " + this.getNidn());
        System.out.println("Jurusan          : " + this.getJurusan());
        System.out.println("Bidang Keahlian  : " + this.getBidangKeahlian());
        System.out.println("Usia             : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok       : Rp " + this.hitungGapok());
        System.out.println("Bonus            : Rp " + this.hitungBonus());
        System.out.println("Tunjangan Pegawai: Rp " + this.hitungTunj());
        System.out.println("Tunjangan Dosen  : Rp " + this.hitungTunjDosen());
        System.out.println("Tunjangan Fungsi : Rp " + this.hitungTunjFungsional());
    }

}

