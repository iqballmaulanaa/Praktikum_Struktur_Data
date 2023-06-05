/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author USER
 */
public class MainPaskib {
    public static void main(String[] args) {
        DaftarAnggotaPaskibraka dap = new DaftarAnggotaPaskibraka();

        // contoh pengisian data
        dap.tambah(new Paskibraka("Iqbal", "XII IPA 1", 180));
        dap.tambah(new Paskibraka("Badi", "XII IPA 2", 167));
        dap.tambah(new Paskibraka("Lela", "XII IPA 3", 170));
        dap.tambah(new Paskibraka("Nafis", "XII IPA 4", 185));
        dap.tambah(new Paskibraka("Lely", "XII IPA 5", 165));
        dap.tambah(new Paskibraka("Retno", "XII IPA 6", 160));
        dap.tambah(new Paskibraka("Fara", "XII IPA 7", 169));
        dap.tambah(new Paskibraka("Bintang", "XII IPA 8", 183));
        dap.tambah(new Paskibraka("Natasya", "XII IPA 9", 168));
        dap.tambah(new Paskibraka("Alex", "XII IPA 10", 173));
        System.out.println("Siswa yang lolos seleksi minimal dengan tinggi badan 170 cm.");
        System.out.println("Sebelum sorting:");
        dap.tampilSeleksi(170);
        dap.Sorting();
        System.out.println("Setelah sorting:");
        dap.tampilSeleksi(170);
    }
}