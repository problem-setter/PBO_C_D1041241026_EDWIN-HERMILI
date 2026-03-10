/**
* Program demonstrasi Keyword THIS
* Pertemuan 10: Constructor & This Keyword
*/

// Kata kunci THIS mengacu pada atribut milik object saat ini
class This {
    // Atribut
    int i;
    float f;
    int z;

    // Constructor 1: 2 parameter
    public This(int i, float f) {
        this.i = i; // this.i = atribut, i = parameter
        this.f = f; // this.f = atribut, f = parameter
        z = 5; // z tidak perlu this (tidak ada parameter z)

        System.out.println("2 parameter");
    }

    // Constructor 2: 1 parameter
    public This(int i) {
        this.i = i; // this.i = atribut, i = parameter
        System.out.println("1 parameter");
    }
}

public class p03This {
    // public static void main(String args[]) {
    //     // Memanggil constructor dengan 2 parameter
    //     This t = new This(1, 2.5f);
    // }


    // Modifikasi: Memanggil Constructor Berbeda
    public static void main(String args[]) {
        // Object 1: Constructor 2 parameter
        This t1 = new This(1, 2.5f);

        // Object 2: Constructor 1 parameter
        This t2 = new This(10);

        // Tampilkan nilai atribut
        System.out.println("t1: i=" + t1.i + ", f=" + t1.f + ", z=" + t1.z);
        System.out.println("t2: i=" + t2.i + ", f=" + t2.f + ", z=" + t2.z);
    }
}
