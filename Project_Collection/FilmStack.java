/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu16;

/**
 *
 * @author USER
 */
import java.util.Scanner;
import java.util.Stack;

public class FilmStack {
    public static void main(String[] args) {
        Stack<Film> filmStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int idFilm = 1;

        while (true) {
            System.out.println("=========================");
            System.out.println("Data Film Layar Lebar Sepanjang Masa");
            System.out.println("=========================");
            System.out.println("1. Input Judul Film");
            System.out.println("2. Hapus Data Film Teratas");
            System.out.println("3. Cek Judul Film Teratas");
            System.out.println("4. Info semua Judul Film");
            System.out.println("5. Keluar");
            System.out.println("=========================");
            System.out.print("Pilih: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("ID Film: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Judul Film: ");
                String judulFilm = scanner.nextLine();
                System.out.print("Tahun Tayang: ");
                int tahunTayang = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Director: ");
                String director = scanner.nextLine();

                Film film = new Film(id, judulFilm, tahunTayang, director);
                filmStack.push(film);
                idFilm++;
            } else if (choice == 2) {
                if (filmStack.isEmpty()) {
                    System.out.println("Tumpukan film kosong.");
                } else {
                    Film removedFilm = filmStack.pop();
                    System.out.println("Film yang dihapus: " + removedFilm);
                }
            } else if (choice == 3) {
                if (filmStack.isEmpty()) {
                    System.out.println("Tumpukan film kosong.");
                } else {
                    Film topFilm = filmStack.peek();
                    System.out.println("Film teratas: " + topFilm);
                }
            } else if (choice == 4) {
                if (filmStack.isEmpty()) {
                    System.out.println("Tumpukan film kosong.");
                } else {
                    System.out.println("Daftar Judul Film:");
                    for (Film film : filmStack) {
                        System.out.println(film);
                    }
                }
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}