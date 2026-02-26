/**
 * NIM     : D1041241026
 * Nama    : Edwin Hermili
 * Program untuk mengonversi angka (1-12) menjadi nama bulan.
 */

public class LatihanBulan {
    public static void main(String[] args) {
        int month = 13;
        String bulan;

        System.out.println("=== KONVERSI BULAN ===");
        System.out.println("Angka Bulan: " + month);
        
        switch (month) {
            case 1:
                bulan = "Januari";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 2:
                bulan = "Februari";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 3:
                bulan = "Maret";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 4:
                bulan = "April";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 5:
                bulan = "Mei";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 6:
                bulan = "Juni";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 7:
                bulan = "Juli";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 8:
                bulan = "Agustus";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 9:
                bulan = "September";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 10:
                bulan = "Oktober";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 11:
                bulan = "November";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 12:
                bulan = "Desember";
                System.out.println("Nama Bulan: " + bulan);
                break;
            default:
                System.out.println("Error: Angka bulan tidak valid (1-12)");
                break;
        }
    }
}