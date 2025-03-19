package pertemuan4D_lat4;

interface Hewan {
    void makan();
}

interface Mamalia {
    void menyusui();
}

class Kucing implements Hewan, Mamalia {
    public void makan() {
        System.out.println("Kucing makan ikan.");
    }
    
    public void menyusui() {
        System.out.println("Kucing menyusui anaknya.");
    }
}

// Main class
public class lat4D {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();
        kucing1.makan();
        kucing1.menyusui();
    }
}

