/*
NIM     : D1041241026
Nama    : Edwin Hermili
Program untuk menghitung diskon berdasarkan total belanja.
*/

public class LatihanDiskon {
    public static void main(String[] args) {
        double totalBelanja = 750000;
        double diskon;

        if (totalBelanja < 100000) {
            diskon = 0.00;
        } else if (totalBelanja < 500000) {
            diskon = 0.05;
        } else if (totalBelanja < 1000000) {
            diskon = 0.10;
        } else {
            diskon = 0.15;
        }

        double hargaAkhir = (totalBelanja - (totalBelanja * diskon));
        
        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp" + totalBelanja);
        System.out.println("Diskon (" + ((int)(diskon * 100)) + "%): Rp" + (totalBelanja * diskon));
        System.out.println("Harga Akhir: Rp" + (hargaAkhir));
        System.out.println("Anda hemat: Rp" + (totalBelanja * diskon));
    }
}