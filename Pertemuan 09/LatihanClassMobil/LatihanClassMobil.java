/**
 * NIM     : D1041241026
 * Nama    : Edwin Hermili
 * Program untuk membuat class "Mobil".
 */

class Mobil {
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
        System.out.println('\n');
    }

    public void percepat() {
        kecepatan += 20;
        System.out.println("Mobil dipercepat...\n");
    }

    public void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam\n");
    }
}

public class LatihanClassMobil {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Silver";
        mobil1.tahun = 2020;
        mobil1.kecepatan = 0;
        
        mobil1.tampilkanSpesifikasi();

        mobil1.percepat();
        mobil1.percepat();

        mobil1.tampilkanKecepatan();
    }
}