package model;

import java.time.*;
public class main {

    public static void main(String[] args) {

        // object constructor 2
        Pegawai p1 = new Pegawai("NadaSalsa");
        // object constructor 3
        Pegawai p2 = new Pegawai(1234);
        // object data pegawai (constructor 1)
        Pegawai p3 = new Pegawai();
        p3.setIdPegawai("PB01");
        p3.setNama("Nada Salsabila");
        p3.setTglLahir(LocalDate.of(1992, 8, 7));
        p3.setAlamat("Jalan Sidoarjo No. 45");
        p3.setNoTelp("081250827979");
        p3.setStatus("Menikah");
        p3.setGol(1);
        p3.setLamaKerja(4);
        p3.printPegawai();
        p3.thnks("Nada Salsabila");
        p3.user("NadaSalsabila");

        // object constructor 2
        Pegawai p4 = new Pegawai("IkaR");
        // object constructor 3
        Pegawai p5 = new Pegawai(67819);
        // object data pegawai (constructor 1)
        Pegawai p6 = new Pegawai();
        p6.setIdPegawai("PB02");
        p6.setNama("Riska Sari");
        p6.setTglLahir(LocalDate.of(1991, 10, 13));
        p6.setAlamat("Jalan Pramuka No. 45");
        p6.setNoTelp("081250827979");
        p6.setStatus("Belum Menikah");
        p6.setGol(2);
        p6.setLamaKerja(6);
        p6.printPegawai();
        p6.thnks("Riska Sari");
        p6.user("IkaR");

        // object constructor 2
        Pegawai p7 = new Pegawai("NabaQ");
        // object constructor 3
        Pegawai p9 = new Pegawai(0121);
        // object data pegawai dosen (constructor 1)
        Dosen d1 = new Dosen();
        d1.setIdPegawai("PB03");
        d1.setNama("Naba Quratu");
        d1.setTglLahir(LocalDate.of(1993, 03, 23));
        d1.setAlamat("Jalan Antasari No.22");
        d1.setNoTelp("081250830108");
        d1.setStatus("Menikah");
        d1.setGol(1);
        d1.setLamaKerja(8);
        d1.setNidn("200901759");
        d1.setJurusan("Teknologi Informatika");
        d1.setBidangKeahlian( "Aplikasi Java");
        d1.printPegawai();
        d1.thnks("Naba Quratu");
        d1.user("NabaQ");

    }
}
