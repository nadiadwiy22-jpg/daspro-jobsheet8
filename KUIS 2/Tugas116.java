//Nadia Dwi Yulianti, 26410706203, SIB 1D, Kode B
import java.util.Scanner;
public class Tugas116 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System .out.print("Masukkan nilai tugas mahasiswa: ");
        int nilaiTugas = sc.nextInt();

        int totalNilai = 0;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= jumlahMahasiswa; j++) {
                System.out.print("Masukkan nilai tugas mahasiswa ke-" + j + ": ");
                int nilai = sc.nextInt();
                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai tidak valid. Masukkan nilai antara 0 dan 100.");
                    j--; // Mengulangi input untuk mahasiswa yang sama
                } else {
                    totalNilai += nilai;
                }
            }
            double rataRata = (double) totalNilai / jumlahMahasiswa;
            System.out.println("Rata-rata nilai tugas mahasiswa: " + rataRata);
        }
    }
    
}
