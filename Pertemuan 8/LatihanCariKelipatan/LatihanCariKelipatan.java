/**
 * NIM     : D1041241026
 * Nama    : Edwin Hermili
 * Program untuk mencari kelipatan pertama dari 7 dalam rentang 1-50, lalu hentikan pencarian.
 */

public class LatihanCariKelipatan {
    public static void main(String[] args) {
        System.out.println("=== CARI KELIPATAN 7 ===");

        for (int i = 1; i <= 50; i++) {
            System.out.println("Cek: " + i);

            if (i % 7 == 0) {
                System.out.println("✓ Kelipatan 7 pertama: " + i);
                System.out.println("Pencarian selesai.");
                break;
            }
        }
    }
}
