/**
 * NIM     : D1041241026
 * Nama    : Edwin Hermili
 * Program untuk mensimulasikan validasi input nilai ujian (0-100) menggunakan do-while loop.
 */

public class LatihanValidasi {
    public static void main(String[] args) {
        int nilai = 0;
        int iterasi = 1;
        
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        do {
            System.out.println();
            if (iterasi == 1) {
                nilai = -10;
            } else if (iterasi == 2) {
                nilai = 150;
            } else if (iterasi == 3) {
                nilai = 85;
            }
            
            System.out.println("Percobaan input: " + nilai);
            if (0 <= nilai && nilai <= 100) {
                System.out.println("✓ Nilai valid: " + nilai);
            } else {
                System.out.println("Error: Nilai harus antara 0-100!");
            }
            iterasi++;
        } while (!(0 <= nilai && nilai <= 100));
    }
}