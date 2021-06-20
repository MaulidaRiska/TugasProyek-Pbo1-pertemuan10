package model;

import java.time.*;
//inheritance/sub-class
public class Dosen extends Pegawai{
    // atribut tambahan untuk dosen
    String nidn;
    String Jurusan;
    String BidangKeahlian;


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
        System.out.println("ID Pegawai       : " + this.idPegawai);
        System.out.println("Nama Pegawai     : " + this.nama);
        System.out.println("Tgl Lahir        : " + this.tglLahir);
        System.out.println("Alamat           : " + this.Alamat);
        System.out.println("No Telpon        : " + this.NoTelp);
        System.out.println("Status           : " + this.Status);
        System.out.println("Golongan         : " + this.gol);
        System.out.println("Lama Kerja       : " + this.LamaKerja);
        System.out.println("NIDN             : " + this.nidn);
        System.out.println("Jurusan          : " + this.Jurusan);
        System.out.println("Bidang Keahlian  : " + this.BidangKeahlian);
        System.out.println("Usia             : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok       : Rp " + this.hitungGapok());
        System.out.println("Bonus            : Rp " + this.hitungBonus());
        System.out.println("Tunjangan Pegawai: Rp " + this.hitungTunj());
        System.out.println("Tunjangan Dosen  : Rp " + this.hitungTunjDosen());
        System.out.println("Tunjangan Fungsi : Rp " + this.hitungTunjFungsional());
    }

}

