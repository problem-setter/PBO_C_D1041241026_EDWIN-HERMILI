/**
 * NIM     : D1041241026
 * Nama    : Edwin Hermili
 * Program untuk menampilkan menu makan untuk 3 hari, masing-masing dengan 2 waktu makan (pagi dan siang).
 */

public class LatihanMenuHarian {
    public static void main(String[] args) {
        System.out.println("=== MENU MAKAN 3 HARI ===");
        
        String[] namaWaktu = {"Pagi", "Siang"};

        for (int hari = 1; hari <= 3; hari++) {
            System.out.println("Hari " + hari + ":");
            
            for (int waktu = 0; waktu < 2; waktu++) {
                System.out.print("    " + namaWaktu[waktu] + ": ");
                switch (hari) {
                    case 1:
                        if (waktu == 0) {
                            System.out.println("Nasi Goreng");
                        } else {
                            System.out.println("Soto Ayam");
                        }
                        break;
                    case 2:
                        if (waktu == 0) {
                            System.out.println("Bubur Ayam");
                        } else {
                            System.out.println("Mie Goreng");
                        }
                        break;
                    case 3:
                        if (waktu == 0) {
                            System.out.println("Roti Bakar");
                        } else {
                            System.out.println("Nasi Uduk");
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }
}