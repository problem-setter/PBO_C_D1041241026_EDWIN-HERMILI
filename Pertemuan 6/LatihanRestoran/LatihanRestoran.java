/**
 * NIM     : D1041241026
 * Nama    : Edwin Hermili
 * Program untuk menampilkan menu restoran dan harga.
 */

public class LatihanRestoran {
    public static void main(String[] args) {
        int menuCode = 1;
        int quantity = 2;
        int harga = 0;

        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println();

        System.out.println("Pesanan Anda:");
        switch (menuCode) {
            case 1: // Nasi Goreng - Rp15.000
                harga = 15000;
                System.out.println("Nama Menu: Nasi Goreng");
                break;
            case 2: // Mie Ayam - Rp12.000
                harga = 12000;
                System.out.println("Nama Menu: Mie Ayam");
                break;
            case 3: // Bakso - Rp10.000
                harga = 10000;
                System.out.println("Nama Menu: Bakso");
                break;
            case 4: // Soto Ayam - Rp13.000
                harga = 13000;
                System.out.println("Nama Menu: Soto Ayam");
                break;
            case 5: // Es Teh - Rp3.000
                harga = 3000;
                System.out.println("Nama Menu: Es Teh");
                break;
        }
        System.out.println("Harga Satuan: Rp" + harga);
        System.out.println("Jumlah: " + quantity);
        System.out.println("---");
        System.out.println("Total Bayar: Rp" + (harga * quantity));
    }
}