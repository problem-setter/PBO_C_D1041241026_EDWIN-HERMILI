/*
NIM     : D1041241026
Nama    : Edwin Hermili
Program untuk menerima bilangan dan menentukan sebuah bilangan adalah bilangan positif, negatif, atau nol dan bilangan genap atau ganjil (jika bukan nol).
*/

public class LatihanBilangan {
    public static void main(String[] args) {
        int number = -7;
        String jenisBilangan;
        String parity = (number % 2 == 1 || number % 2 == -1) ? "Ganjil" : (number != 0) ? "Genap" : "-"; 
        
        if (number > 0) {
            jenisBilangan = "Bilangan positif";
        } else if (number < 0) {
            jenisBilangan = "Bilangan negatif";
        } else {
            jenisBilangan = "Bilangan nol";
        }

        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + number);
        System.out.println("Jenis: " + jenisBilangan);
        System.out.println("Tipe: " + parity);
    }
}