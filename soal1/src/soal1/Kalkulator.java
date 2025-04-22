package soal1;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char ulang;
            
            do {
                // Input angka dan operator
                System.out.print("Masukkan angka pertama: ");
                double angka1 = scanner.nextDouble();
                
                System.out.print("Masukkan operator (+, -, *, /, %): ");
                char operator = scanner.next().charAt(0);
                
                System.out.print("Masukkan angka kedua: ");
                double angka2 = scanner.nextDouble();
                
                double hasil;
                boolean valid = true;
                
                // Operasi berdasarkan operator
                switch (operator) {
                    case '+' -> hasil = angka1 + angka2;
                    case '-' -> hasil = angka1 - angka2;
                    case '*' -> hasil = angka1 * angka2;
                    case '/' -> {
                        if (angka2 == 0) {
                            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                            valid = false;
                            hasil = 0;
                        } else {
                            hasil = angka1 / angka2;
                        }
                    }
                    case '%' -> hasil = angka1 % angka2;
                    default -> {
                        System.out.println("Operator tidak valid!");
                        valid = false;
                        hasil = 0;
                    }
                }
                
                // Tampilkan hasil jika operator valid
                if (valid) {
                    System.out.println("Hasil: " + hasil);
                }
                
                // Tanya ulang
                System.out.print("Ingin menghitung lagi? (y/n): ");
                ulang = scanner.next().charAt(0);
                
            } while (ulang == 'y' || ulang == 'Y');
            
            System.out.println("Terima kasih telah menggunakan kalkulator!");
        }
    }
}
