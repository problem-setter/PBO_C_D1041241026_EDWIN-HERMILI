/*
NIM     : D1041241026
Nama    : Edwin Hermili
Program untuk menyimpan dan menampilkan informasi produk
*/

public class LatihanProduk {
    public static final double PAJAK = 0.11;
    public static void main(String[] args) {
        String namaProduk = "Laptop ASUS";
        int hargaSatuan = 7000000, jumlahStok = 15;
        boolean statusTersedia = true;

        double totalHarga = (hargaSatuan * jumlahStok);
        double totalPAJAK = (totalHarga * PAJAK);

        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk        : " + namaProduk);
        System.out.println("Harga Satuan       : " + hargaSatuan);
        System.out.println("Jumlah Stok        : " + jumlahStok);
        System.out.println("Status Tersedia    : " + statusTersedia);
        System.out.println("---");
        System.out.println("Total Nilai Stok   : Rp" + (long) totalHarga);
        System.out.println("Pajak (11%)        : Rp" + (long) totalPAJAK);
    }
}