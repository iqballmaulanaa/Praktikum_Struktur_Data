/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author USER
 */
public class Kerucut {
    private double jariJari;
    private double tinggi;
    private double garisPelukis;

    public Kerucut(double jariJari, double tinggi, double garisPelukis) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        this.garisPelukis = garisPelukis;
    }

    public double getLuasPermukaan() {
        return Math.PI * jariJari * (jariJari + garisPelukis);
    }

    public double getVolume() {
        return (1.0/3.0) * Math.PI * jariJari * jariJari * tinggi;
    }
}