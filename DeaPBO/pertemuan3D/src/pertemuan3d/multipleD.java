package pertemuan3d;
// Interface pertama
interface Hewan {
    void makan(); // Metode abstrak
}

// Interface kedua
interface Peliharaan {
    void bermain();
}

// Kelas Kucing mengimplementasikan dua interface sekaligus
class Kucing implements Hewan, Peliharaan {
    @Override
    public void makan() {
        System.out.println("Kucing sedang makan...");
    }

    @Override
    public void bermain() {
        System.out.println("Kucing sedang bermain...");
    }
}

// Kelas utama
public class multipleD {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.makan();
        kucing.bermain();
    }
}