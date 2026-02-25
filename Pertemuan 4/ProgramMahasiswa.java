class Mahasiswa {
    String nama;
    String NIM;
    int umur;

    public void infoMahasiswa() {
        // System.out.println("==================");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + NIM);
        System.out.println("Umur   : " + umur);
        System.out.println("==================");
    }
}

public class ProgramMahasiswa {
    public static void main(String[] args) {
        
        Mahasiswa[] arr = new Mahasiswa[10000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Mahasiswa();
            arr[i].nama = "Mahasiswa " + (i + 1);
            arr[i].NIM = "D104124102" + (i + 1);
            arr[i].umur = 20 + i;
            arr[i].infoMahasiswa();
        }


        // Mahasiswa mahasiswa1 = new Mahasiswa();
        // Mahasiswa mahasiswa2 = new Mahasiswa();
        // Mahasiswa mahasiswa3 = new Mahasiswa();

        // mahasiswa1.nama = "Edwin";
        // mahasiswa1.NIM = "D1041241026";
        // mahasiswa1.umur = 20;

        // mahasiswa1.infoMahasiswa();
    }
}