/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author USER
 */
import java.util.*;

public class StrukBelanja {
    public static void main(String[] args) {
        Stack<String> strukBelanja = new Stack<>();
        
        // Menambahkan delapan struk belanja ke dalam stack
        strukBelanja.push("Nomor transaksi: 001, Tanggal pembelian: 2022-03-01, Jumlah barang: 5, Total harga: 150000");
        strukBelanja.push("Nomor transaksi: 002, Tanggal pembelian: 2022-03-03, Jumlah barang: 3, Total harga: 75000");
        strukBelanja.push("Nomor transaksi: 003, Tanggal pembelian: 2022-03-05, Jumlah barang: 2, Total harga: 50000");
        strukBelanja.push("Nomor transaksi: 004, Tanggal pembelian: 2022-03-10, Jumlah barang: 4, Total harga: 120000");
        strukBelanja.push("Nomor transaksi: 005, Tanggal pembelian: 2022-03-15, Jumlah barang: 6, Total harga: 180000");
        strukBelanja.push("Nomor transaksi: 006, Tanggal pembelian: 2022-03-18, Jumlah barang: 2, Total harga: 50000");
        strukBelanja.push("Nomor transaksi: 007, Tanggal pembelian: 2022-03-22, Jumlah barang: 3, Total harga: 75000");
        strukBelanja.push("Nomor transaksi: 008, Tanggal pembelian: 2022-03-27, Jumlah barang: 5, Total harga: 150000");

        // Menampilkan informasi struk belanja yang tersimpan di dalam stack
        System.out.println("Daftar struk belanja yang tersimpan:");
        for (String struk : strukBelanja) {
            System.out.println(struk);
        }
        
        // Mengambil lima struk belanja dari stack untuk ditukarkan dengan voucher
        System.out.println("\nStruk belanja yang diambil untuk ditukarkan dengan voucher:");
        for (int i = 0; i < 5; i++) {
            String struk = strukBelanja.pop();
            System.out.println(struk);
        }
    }
}