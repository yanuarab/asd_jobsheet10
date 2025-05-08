package TugasJobsheet10;

import java.util.Scanner;

public class MainKRS25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS25 antrian = new AntrianKRS25(10); // Maksimal antrian 10
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat Dua Mahasiswa Terdepan");
            System.out.println("5. Lihat Mahasiswa Paling Akhir");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Jumlah Mahasiswa yang Sudah Proses KRS");
            System.out.println("8. Jumlah Mahasiswa yang Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian25(mhs);
                    break;

                case 2:
                    antrian.prosesKRS25();
                    break;

                case 3:
                    antrian.tampilkanSemua25();
                    break;

                case 4:
                    antrian.tampilkanDuaTerdepan25();
                    break;

                case 5:
                    antrian.tampilkanPalingAkhir25();
                    break;

                case 6:
                    System.out.println("Jumlah Mahasiswa dalam Antrian: " + antrian.getJumlahAntrian());
                    break;

                case 7:
                    System.out.println("Jumlah Mahasiswa yang Sudah Proses KRS: " + antrian.getJumlahProsesKRS());
                    break;

                case 8:
                    System.out.println("Jumlah Mahasiswa yang Belum Proses KRS: " + antrian.getJumlahBelumProses());
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}