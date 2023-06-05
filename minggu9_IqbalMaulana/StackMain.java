/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack(5);
        char pilih;
        do {
            System.out.println("Jenis: ");
            String jenis = sc.nextLine();
            System.out.println("Warna: ");
            String warna = sc.nextLine();
            System.out.println("Merk: ");
            String merk = sc.nextLine();
            System.out.println("Ukuran: ");
            String ukuran = sc.nextLine();
            System.out.println("Harga: ");
            double harga = sc.nextDouble();
            sc.nextLine();

            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        } while (pilih == 'y');

        stk.print();
        stk.getMin(); // tambahan
        stk.pop();
        stk.peek();
        stk.print();
    }
}