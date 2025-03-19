package pertemuan2D;
class Kendaraan {
    String merk;
    String tipe;
    int kecepatan;

    // Konstruktor
    public Kendaraan(String merk, String tipe, int kecepatan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

    // Method untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk + ", Tipe: " + tipe + ", Kecepatan: " + kecepatan + " km/jam");
    }

    // Method untuk menambah kecepatan
    public void tambahKecepatan(int km) {
        kecepatan += km;
        System.out.println(merk + " menambah kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Method untuk mengurangi kecepatan
    public void kurangiKecepatan(int km) {
        kecepatan -= km;
        if (kecepatan < 0) {
            kecepatan = 0;
        }
        System.out.println(merk + " mengurangi kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Method untuk menghentikan kendaraan
    public void berhenti() {
        kecepatan = 0;
        System.out.println("Kendaraan telah berhenti.");
    }
}

// Kelas utama untuk menjalankan program
public class kendaraanD {
    public static void main(String[] args) {
        // Membuat objek Kendaraan
        Kendaraan mobil = new Kendaraan("Pajero", "Mobil", 55);
        Kendaraan motor = new Kendaraan("Beat", "Motor", 30);

        // Menampilkan informasi dan mengubah kecepatan
        mobil.tampilkanInfo();
        mobil.tambahKecepatan(20);
        mobil.kurangiKecepatan(30);
        mobil.berhenti();
        mobil.tampilkanInfo();

        System.out.println();

        motor.tampilkanInfo();
        motor.tambahKecepatan(30);
        motor.kurangiKecepatan(40);
        motor.berhenti();
        motor.tampilkanInfo();
    }
}