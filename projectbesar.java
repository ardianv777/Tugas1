/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectBesar;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class projectbesar {

    static int waktu, hargaKamar, usia, totalKamar, totalObat, totalOperasi, totalInfus, infus, oksigen, totalOksigen, totalKeseluruhan, kamar;
    static String nama, gender, golD, alamat, pembayar, namaDokter, kelas;

    public static void main(String[] args) {
        int menu;
        Scanner in = new Scanner(System.in);

        do {
            //Daftar Menu yang akan Dipilih
            System.out.println("----------- MENU -----------");
            System.out.println("1. Identitas Pasien");
            System.out.println("2. Dokter");
            System.out.println("3. Jenis Kamar");
            System.out.println("4. Jangka Waktu Rawat Inap");
            System.out.println("5. Rincian Biaya");
            System.out.println("6. Cetak Kwitansi");
            System.out.println("7. Keluar");

            //Pilih Menu
            System.out.print("\n>> Pilih Menu : ");
            menu = in.nextInt();
            System.out.println("");

            switch (menu) {

                case 1:
                    //Input Identitas
                    Data();
                    break;

                case 2:
                    //Pilih Dokter
                    dokter();
                    break;

                case 3:
                    //Pilih Kamar
                    kamar();
                    break;

                case 4:
                    //Input lama menginap (hari)
                    waktu();
                    break;

                case 5:
                    //Input Rincian Biaya
                    biaya();
                    break;

                case 6:
                    //Cetak Kwitansi
                    hasil();
                    break;

                case 7:
                    //Keluar
                    System.out.println("Berhasil Keluar ! ");
                    System.out.println("");
                    break;

                default:
                    System.out.println("Data yang Dimasukkan Salah !");
                    System.out.println("");
                    break;
            }

        } while (menu != 7);
    }

    public static void Data() {
        Scanner in = new Scanner(System.in);
        System.out.println("---------------- Identitas Pasien -----------------");
        System.out.print("Nama Pembayar         : ");
        pembayar = in.next();
        System.out.print("Nama Pasien           : ");
        nama = in.next();
        System.out.print("Alamat                : ");
        alamat = in.next();
        System.out.print("Usia                  : ");
        usia = in.nextInt();
        System.out.print("Jenis Kelamin (L/P)   : ");
        gender = in.next();
        gender = gender.toUpperCase();
        if ("L".equals(gender)) {
            gender = "Laki - Laki";
        } else if ("P".equals(gender)) {
            gender = "Perempuan";
        } else {
            System.out.println("\nInput Invalid ! Masukkan Lagi Data yang Benar\n");
            gender = "-";
        }
        System.out.println("");
    }

    public static void dokter() {
        int dokter;
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------- Dokter ---------------------");
        System.out.println("1. dr. Haezer, Sp.S     (Spesialis Saraf)");
        System.out.println("2. dr. Prischia, Sp.OG  (Spesialis Kandungan)");
        System.out.println("3. dr. Ardian, Sp.PD    (Spesialis Penyakit Dalam)");
        System.out.println("4. dr. Maria, Sp. OT    (Spesialis Orthopedi)");
        System.out.println("5. dr. Damar, Sp.B      (Spesialis Bedah)");
        System.out.println("6. dr. Dhea             (Dokter Umum) ");

        System.out.print("Pilih Dokter : ");
        dokter = in.nextInt();

        switch (dokter) {
            case 1:
                namaDokter = "dr. Haezer, Sp.S (Spesialis Saraf)";
                break;
            case 2:
                namaDokter = "dr. Prischia, Sp.OG (Spesialis Kandungan)";
                break;
            case 3:
                namaDokter = "dr. Ardian, Sp.PD (Spesialis Penyakit Dalam)";
                break;
            case 4:
                namaDokter = "dr. Maria, Sp. OT (Spesialis Orthopedi)";
                break;
            case 5:
                namaDokter = "dr. Damar, Sp.B (Spesialis Bedah)";
                break;
            case 6:
                namaDokter = "dr. Dhea (Dokter Umum)";
                break;
            default:
                System.out.println("\nInput Invalid ! Masukkan Lagi Data yang Benar\n");
                namaDokter = "-";
                break;
        }
        System.out.println("");
    }

    public static void kamar() {

        Scanner in = new Scanner(System.in);
        System.out.println("---------------- Pilih Jenis Kamar ----------------");
        System.out.println("1. Kelas 1 ");
        System.out.println("2. Kelas 2 ");
        System.out.println("3. Kelas 3 ");
        System.out.println("4. VIP ");
        System.out.println("5. VVIP ");
        System.out.print("Pilih Kamar : ");
        kamar = in.nextInt();

        switch (kamar) {
            case 1:
                hargaKamar = 250000;
                kelas = "Kelas 1";
                break;
            case 2:
                hargaKamar = 500000;
                kelas = "Kelas 2";
                break;
            case 3:
                hargaKamar = 750000;
                kelas = "Kelas 3";
                break;
            case 4:
                hargaKamar = 2250000;
                kelas = "VIP";
                break;
            case 5:
                hargaKamar = 5000000;
                kelas = "VVIP";
                break;

            default:
                System.out.println("\nInput Invalid ! Masukkan Lagi Data yang Benar\n");
                kelas = "(-)";
                break;
        }
        System.out.println("");
    }

    public static void waktu() {
        if (kamar == 1 || kamar == 2 || kamar == 3 || kamar == 4 || kamar == 5) {
            Scanner in = new Scanner(System.in);
            System.out.println("------------- Jangka Waktu Rawat Inap -------------");
            System.out.print("Jangka Waktu Pasien Rawat Inap (hari) : ");
            waktu = in.nextInt();
            System.out.println("");
        } else {
            waktu = 0;
            hargaKamar = 0;
            System.out.println("------------- Jangka Waktu Rawat Inap -------------");
            System.out.println("Jangka Waktu Pasien Rawat Inap (hari) : " + waktu + " (Kesalahan Dalam Menginput Jenis Kamar)");
        }
        System.out.println("");
        totalKamar = waktu * hargaKamar;
    }

    public static void biaya() {

        Scanner in = new Scanner(System.in);

        System.out.println("------------------ Rincian Biaya ------------------");
        System.out.println("Biaya Kamar                   = " + totalKamar);
        System.out.print("Biaya Obat                    = ");
        totalObat = in.nextInt();
        System.out.print("Biaya Operasi                 = ");
        totalOperasi = in.nextInt();
        System.out.print("Infus (Botol 500 ml)          = ");
        infus = in.nextInt();
        totalInfus = infus * 24500;
        System.out.print("Oksigen (lpm)                 = ");
        oksigen = in.nextInt();
        totalOksigen = oksigen * 700;

        totalKeseluruhan = totalKamar + totalObat + totalOperasi + totalInfus + totalOksigen;
        System.out.println("");
    }

    public static void hasil() {
        String tanggal;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Tanggal : ");
        tanggal = in.next();
        System.out.println("");
        System.out.println("|==============================================="
                + "========================================================");

        System.out.println("|\t\t\t\t\t\tRS MEDICA JAYA");

        //Kolom Identitas
        System.out.println("|\t\t\t\t\t\t\t\t\t\t Tanggal : " + tanggal);
        System.out.println("| Nama Pembayar\t: " + pembayar);
        System.out.println("| Nama Pasien\t: " + nama);
        System.out.println("| Jenis Kelamin\t: " + gender);
        System.out.println("| Alamat\t: " + alamat);
        System.out.println("| Nama Dokter\t: " + namaDokter);
        System.out.println("|\n|\tKeterangan : ");
        System.out.println("|");

        //Kolom Keterangan Biaya
        System.out.print("|\tKebutuhan");
        System.out.print("\t|\tHarga per satuan (Rp)");
        System.out.print("\t|\tSatuan\t");
        System.out.println("\t|\tTotal (Rp)\t");

        System.out.println("|\t------------------------------------------"
                + "------------------------------------------------------");

        //Kamar
        System.out.print("|\tKamar " + kelas);
        System.out.print("\t\t" + hargaKamar);
        System.out.print("\t\t\t\t" + waktu + " hari");
        System.out.println("\t\t\t" + totalKamar);

        //Infus
        System.out.print("|\tInfus ");
        System.out.print("\t\t\t" + "24500");
        System.out.print("\t\t\t\t" + infus + " botol");
        System.out.println("\t\t\t" + totalInfus);

        //Oksigen
        System.out.print("|\tOksigen");
        System.out.print("\t\t\t" + "700");
        System.out.print("\t\t\t\t" + oksigen + " lpm");
        System.out.println("\t\t\t" + totalOksigen);

        //Obat
        System.out.println("|\tObat\t\t\t\t\t\t\t\t\t\t" + totalObat);
        System.out.println("|\t________________________________________"
                + "_______________________________________________________+ ");

        //Total
        System.out.println("|");
        System.out.println("|\tTotal Pembayaran (Rp)\t\t\t\t\t\t\t\t" + totalKeseluruhan);

        System.out.println("|");
        System.out.println("|\t\t\t\t\t   Terima Kasih, Salam Sehat");
        System.out.println("|\t\t\t\t\t\tRS MEDICA JAYA");

        System.out.println("___________________________________________________"
                + "_____________________________________________________");
        System.out.println("");

    }
}
