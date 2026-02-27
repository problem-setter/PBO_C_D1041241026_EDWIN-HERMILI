/**
 * NIM     : D1041241026
 * Nama    : Edwin Hermili
 * Program untuk menampilkan hasil yang sama menggunakan while, do-while, dan for loop.
 * 
 * Refleksi:
 * Jenis loop yang lebih mudah dipahami untuk mencetak angka dari 1 hingga 5 adalah for loop.
 * Menurut saya pribadi, hal ini dikarenakan kita sudah mengetahui kondisi pasti dari program yang akan kita buat.
 * Kita mengetahui kondisi awal dan kondisi akhir secara jelas, di mana kondisi awalnya adalah 1 dan kondisi akhirnya adalah 5.
 * Sehingga, penggunaan for loop dalam studi kasus ini akan lebih efektif jika dibandingkan dengan penggunaan jenis loop while dan do-while.
 */

public class LatihanRefleksi {
    public static void main(String[] args) {
        System.out.println("=== MENGGUNAKAN WHILE ===");
        int angkaWhile = 1;
        while (angkaWhile <= 5) {
            System.out.print(angkaWhile + " ");
            angkaWhile++;
        }
        System.out.println('\n');

        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        int angkaDoWhile = 1;
        do { 
            System.out.print(angkaDoWhile + " ");
            angkaDoWhile++;
        } while (angkaDoWhile <= 5);
        System.out.println('\n');

        System.out.println("=== MENGGUNAKAN FOR ===");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}