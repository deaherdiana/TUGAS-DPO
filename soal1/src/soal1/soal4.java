package soal1;

import java.util.ArrayList;
import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            
            while (running) {
                System.out.println("\n===== MENU TO-DO LIST =====");
                System.out.println("1. Tambah Tugas");
                System.out.println("2. Lihat Semua Tugas");
                System.out.println("3. Hapus Tugas");
                System.out.println("4. Keluar");
                System.out.print("Pilih opsi (1-4): ");
                
                int pilihan = scanner.nextInt();
                scanner.nextLine(); // bersihkan newline
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan nama tugas: ");
                        String tugas = scanner.nextLine();
                        toDoList.add(tugas);
                        System.out.println("Tugas ditambahkan.");
                    }
                    case 2 -> {
                        System.out.println("\n===== DAFTAR TUGAS =====");
                        if (toDoList.isEmpty()) {
                            System.out.println("Belum ada tugas.");
                        } else {
                            for (int i = 0; i < toDoList.size(); i++) {
                                System.out.println((i + 1) + ". " + toDoList.get(i));
                            }
                        }
                    }
                    case 3 -> {
                        System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();
                        if (index > 0 && index <= toDoList.size()) {
                            String removed = toDoList.remove(index - 1);
                            System.out.println("Tugas '" + removed + "' telah dihapus.");
                        } else {
                            System.out.println("Nomor tugas tidak valid.");
                        }
                    }
                    case 4 -> {
                        running = false;
                        System.out.println("Terima kasih! Program selesai.");
                    }
                    default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        }
    }
}
