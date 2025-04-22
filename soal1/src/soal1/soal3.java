package soal1;

import java.util.Random;
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            
            int angkaAcak = random.nextInt(100) + 1; // angka antara 1–100
            int tebakan;
            int jumlahTebakan = 0;
            
            System.out.println("=== Permainan Tebak Angka ===");
            System.out.println("Saya telah memilih angka antara 1 sampai 100.");
            System.out.println("Coba tebak! (Ketik 0 untuk keluar)");
            
            while (true) {
                System.out.print("Masukkan tebakanmu: ");
                tebakan = scanner.nextInt();
                
                if (tebakan == 0) {
                    System.out.println("Kamu keluar dari permainan. Angka yang benar adalah: " + angkaAcak);
                    break;
                }
                
                jumlahTebakan++;
                
                if (tebakan < angkaAcak) {
                    System.out.println("Terlalu kecil!");
                } else if (tebakan > angkaAcak) {
                    System.out.println("Terlalu besar!");
                } else {
                    System.out.println("Selamat! Kamu menebak dengan benar.");
                    System.out.println("Jumlah percobaan: " + jumlahTebakan);
                    break;
                }
            }
        }
    }
}
