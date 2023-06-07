/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author USER
 */
public class Tabung {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double getLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    public double getVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}