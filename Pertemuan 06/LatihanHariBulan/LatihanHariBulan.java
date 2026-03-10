/**
 * NIM     : D1041241026
 * Nama    : Edwin Hermili
 * Program untuk menentukan jumlah hari dalam bulan tertentu.
 */

public class LatihanHariBulan {
    public static void main(String[] args) {
        int month = 4;
        String namaBulan;

        System.out.println("=== JUMLAH HARI DALAM BULAN ===");
        switch (month) {
            case 1:
                namaBulan = "Januari";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
                break;
            case 2:
                namaBulan = "Februari";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
                break;
            case 3:
                namaBulan = "Maret";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
                break;
            case 4:
                namaBulan = "April";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
                break;
            case 5:
                namaBulan = "Mei";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
                break;
            case 6:
                namaBulan = "Juni";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
                break;
            case 7:
                namaBulan = "Juli";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
                break;
            case 8:
                namaBulan = "Agustus";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
                break;
            case 9:
                namaBulan = "September";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
                break;
            case 10:
                namaBulan = "Oktober";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
                break;
            case 11:
                namaBulan = "November";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
                break;
            case 12:
                namaBulan = "Desember";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
                break;
            default:
                break;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Jumlah hari: 31 hari");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Jumlah hari: 30 hari");
                break;
            case 2:
                System.out.println("Jumlah hari: 28 hari");
                break;
            default:
                break;
        }
    }
}