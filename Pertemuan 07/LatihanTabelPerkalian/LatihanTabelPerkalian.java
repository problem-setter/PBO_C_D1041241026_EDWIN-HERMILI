/**
 * NIM     : D1041241026
 * Nama    : Edwin Hermili
 * Program untuk menampilkan tabel perkalian untuk angka tertentu (misal 7) dari 1 sampai 12 menggunakan for loop.
 */

public class LatihanTabelPerkalian {
    public static void main(String[] args) {
        int angka = 7;

        System.out.println("=== TABEL PERKALIAN " + angka + " ===");
        for (int i = 0; i < 12; i++) {
            System.out.println(angka + " * " + (i + 1) + " = " + (angka * (i + 1)));
        }
    }
}