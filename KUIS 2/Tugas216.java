//Nadia Dwi Yulianti, 26410706203, SIB 1D, Kode B
import java.util.Scanner;
public class Tugas216 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah ruang baca: " );
        int jumlahRuangBaca = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();

        for (int i = 1; i <= jumlahHari; i++) {
            System.out.println("jumlah pengunjung tidak boleh negatif");
            int totalPengunjung = 0;
            for (int j = 1; j <= jumlahRuangBaca; j++) {
                System.out.print("Masukkan jumlah pengunjung ruang baca ke-" + j + " pada hari ke-" + i + ": ");
                int jumlahPengunjung = sc.nextInt();
                if (jumlahPengunjung < 0) {
                    System.out.println("Jumlah pengunjung tidak boleh negatif. Masukkan kembali.");
                    j--; // Mengulangi input untuk ruang baca yang sama
                } else {
                    totalPengunjung += jumlahPengunjung;
                }
            }
            System.out.println("Total pengunjung pada hari ke-" + i + ": " + totalPengunjung);
        }
        sc.close();


    }
}
