/*
NIM     : D1041241026
Nama    : Edwin Hermili
Program untuk operasi aritmatika sederhana dan perubahan nilai variabel
*/

public class LatihPerhitungan {
    public static void main(String[] args) {
        int saldo = 1000000;
        System.out.println("Saldo Awal               : " + saldo);
        int setoran = 500000;
        System.out.println("Setoran                  : " + setoran);
        saldo += setoran;
        System.out.println("Saldo Setelah Setor      : " + saldo);

        int penarikan = 250000;
        System.out.println("Penarikan                : " + penarikan);
        saldo -= penarikan;
        System.out.println("Saldo Akhir              : " + saldo);
    }
}