/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class MainPacMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean kondisi = true;
        String pilih, submit;
        int lebar, tinggi;
        
        System.out.println("+------------+");
        System.out.println("| Luas Arena |");
        System.out.println("+------------+");
        System.out.print("Lebar\t: ");
        lebar = input.nextInt();
        System.out.print("Tinggi\t: ");
        tinggi = input.nextInt();
        
        PacMan player1 = new PacMan(lebar, tinggi);
        
        System.out.println("+-----------------+");
        System.out.println("|     Pac Man     |");
        System.out.println("+-----------------+");
        System.out.println("L/l untuk ke kiri");
        System.out.println("R/r untuk ke kanan");
        System.out.println("U/u untuk ke atas");
        System.out.println("D/d untuk ke bawah");
        
        while (kondisi) {
            System.out.print("Masukkan inputan : ");
            pilih = input.next();
            if (pilih.equalsIgnoreCase("l")){
                player1.moveLeft();
            }
            else if (pilih.equalsIgnoreCase("r")) {
                player1.moveRight();
            }
            else if (pilih.equalsIgnoreCase("u")) {
                player1.moveUp();
            }
            else if (pilih.equalsIgnoreCase("d")) {
                player1.moveDown();
            }
            System.out.print("Sudah? ketik y, belum? ketik huruf lain : ");
            submit = input.next();
            if (submit.equalsIgnoreCase("y")) {
                kondisi = false;    
            }
        }
        player1.printPosition();
    }  
}
