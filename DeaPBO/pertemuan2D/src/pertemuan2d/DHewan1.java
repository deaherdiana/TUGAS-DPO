package pertemuan2D;
interface Hewan {
    void bersuara(); // Method abstrak
}

// Kelas Burung mengimplementasikan interface Hewan
class Burung implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Burung berkicau:cuitttt cuittt");
    }
}

// Kelas Ular mengimplementasikan interface Hewan
class Ular implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Ular Berdesis: sssttttt sstttttt!");
    }
}

// Main class
public class DHewan1 {
    public static void main(String[] args) {
        Hewan Burung = new Burung();
        Hewan Ular = new Ular();

        Burung.bersuara();
        Ular.bersuara();
    }
}