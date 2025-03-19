package pertemuan3D;

interface Hewan {
    void bersuara(); // Method abstrak
}

// Kelas burung mengimplementasikan interface Hewan
class Burung implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Burung berkicau: cuittt cuittt");
    }
}

// Kelas Ular mengimplementasikan interface Hewan
class Ular implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Ular Mendesih : ssttttt sstttt");
    }
}

// Main class
public class interfaceD {
    public static void main(String[] args) {
        Hewan Burung = new Burung();
        Hewan Ular = new Ular();

        Burung.bersuara();
        Ular.bersuara();
    }
}