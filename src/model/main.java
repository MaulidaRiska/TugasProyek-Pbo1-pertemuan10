package model;

import java.time.LocalDate;

public class main {

    public static void main(String[] args) {

        // object constructor 2
        Pegawai p4 = new Pegawai("Naila");
        // object constructor 3
        Pegawai p5 = new Pegawai(67819);
        // object data pegawai (constructor 1)
        Pegawai p3 = new Pegawai();
         p3.idPegawai="PB01";
         p3.nama="Nada Salsabila";
         p3.tglLahir=LocalDate.of(1992, 8, 7);
         p3.Alamat="Jalan Sidoarjo No. 45";
         p3.NoTelp="081250827979";
         p3.Status="Menikah";
         p3.gol=1;
         p3.LamaKerja=4;
         p3.printPegawai();

        // object constructor 2
        Pegawai p1 = new Pegawai("Naila");
        // object constructor 3
        Pegawai p2 = new Pegawai(67819);
        // object data pegawai (constructor 1)
        Pegawai p6 = new Pegawai();
        p6.idPegawai="PB01";
        p6.nama="Nada Salsabila";
        p6.tglLahir=LocalDate.of(1992, 8, 7);
        p6.Alamat="Jalan Sidoarjo No. 45";
        p6.NoTelp="081250827979";
        p6.Status="Menikah";
        p6.gol=1;
        p6.LamaKerja=4;
        p6.printPegawai();

        // object data pegawai dosen (constructor 1)
        Dosen d1 = new Dosen();
        d1.idPegawai="PB03";
        d1.nama="Naba Quratu";
        d1.tglLahir=LocalDate.of(1993, 03, 23);
        d1.Alamat="Jalan Antasari No.22";
        d1.NoTelp="081250830108";
        d1.Status="Menikah";
        d1.gol=1;
        d1.LamaKerja=8;
        d1.nidn="200901759";
        d1.Jurusan="Teknologi Informatika";
        d1.BidangKeahlian="Aplikasi Java";
        d1.printPegawai();

    }
}
