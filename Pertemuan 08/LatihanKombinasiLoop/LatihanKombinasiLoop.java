/**
 * NIM     : D1041241026
 * Nama    : Edwin Hermili
 * Program untuk mencari koordinat [2,3] dalam tabel 3x5 menggunakan nested loop, lalu hentikan pencarian dengan break.
 */

public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");

        boolean isFound = false;
        
        for (int x = 1; x <= 3; x++) {

            for (int y = 1; y <= 5; y++) {
                System.out.println("Cek: " + "[" + x + "," + y + "]");
                
                if (x == 2 && y == 3) {
                    isFound = true;
                    System.out.println("✓ Koordinat ditemukan!");
                    System.out.println("Pencarian selesai.");
                    break;
                }
            }

            if (isFound == true) {
                break;
            }
        }
    }
}