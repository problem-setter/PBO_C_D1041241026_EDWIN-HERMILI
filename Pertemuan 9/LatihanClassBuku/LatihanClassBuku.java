/**
 * NIM     : D1041241026
 * Nama    : Edwin Hermili
 * Program untuk membuat class "Buku".
 */

class Buku {
    String judul;
    String pengarang;
    int harga;

    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul     : " + this.judul);
        System.out.println("Pengarang : " + this.pengarang);
        System.out.println("Harga     : Rp" + this.harga);
        System.out.println();
    }
}

public class LatihanClassBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Java";
        buku1.pengarang = "Budi Raharjo";
        buku1.harga = 125000;

        buku1.tampilkanInfo();

        
        Buku buku2 = new Buku();
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.pengarang = "Rinaldi Munir";
        buku2.harga = 150000;

        buku2.tampilkanInfo();
    }
}