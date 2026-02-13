/*
NIM     : D1041241026
Nama    : Edwin Hermili
Program untuk menyimpan dan menampilkan data mahasiswa
*/

public class LatihDataMahasiswa {
    public static void main(String[] args) {
        String nim = "230101001";
        String nama = "Budi Santoso";
        char kelas = 'A';
        boolean statusAktif = true;
        double ipk = 3.75f;
        int totalSks = 72;

        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NIM               : " + nim);
        System.out.println("Nama              : " + nama);
        System.out.println("Kelas             : " + kelas);
        System.out.println("Status Aktif      : " + statusAktif);
        System.out.println("IPK Semester      : " + ipk);
        System.out.println("Total SKS         : " + totalSks);
    }
}