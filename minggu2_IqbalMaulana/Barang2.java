/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author USER
 */
public class Barang2 {
    String nama;
    int hargaSatuan, jumlah;

    Barang2(){
    }
    Barang2(int hs, int jm) {
        hargaSatuan = hs;
        jumlah = jm;
    }
    
    public int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }
    public int hitungDiskon() {
        int hargaDiskon = 0;
        if (hitungHargaTotal() > 100000) {
            hargaDiskon = (int)(hitungHargaTotal()*(0.1));
        }
        else if (hitungHargaTotal() >= 50000 && hitungHargaTotal() <= 100000){
            hargaDiskon = (int)(hitungHargaTotal()*(0.05));
        }
        else if (hitungHargaTotal() < 50000){
            hargaDiskon = 0;
        }
        return hargaDiskon;
    }
    public int hitungHargaBayar() {
        return hitungHargaTotal()-hitungDiskon();
    }
    public void displayTagihan() {
        System.out.println(hitungHargaBayar());
    }
}
