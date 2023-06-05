/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author USER
 */
public class Barang {

    String namaBarang, jenisBarang;
    int stok, hargaSatuan;
    
    Barang(){
        
    }
    Barang (String nm, String jn, int st, int hs) {
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    
    void tampilBarang() {
        System.out.println("Nama\t: " + namaBarang);
        System.out.println("Jenis\t: " + jenisBarang);
        System.out.println("Stok\t: " + stok);
        System.out.println("Harga Satuan\t: " + hargaSatuan);
    }
    void tambahStok(int n){
        stok = stok + n;
    }
    void kurangiStok(int n){
        stok = stok - n;
    }
    int hitungHargaTotal(int jumlah) {
       return jumlah * hargaSatuan;
    }
}

