/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu11;

/**
 *
 * @author USER
 */
public class Main {
 public static void main(String[] args) {
Queue antrian = new Queue(5);
    Mahasiswa mhs1 = new Mahasiswa("19001", "Andi", 1, 3.5);
    antrian.enqueue(mhs1);
    
    Mahasiswa mhs2 = new Mahasiswa("19002", "Budi", 2, 3.2);
    antrian.enqueue(mhs2);
    
    Mahasiswa mhs3 = new Mahasiswa("19003", "Cindy", 3, 3.8);
    antrian.enqueue(mhs3);
    
    antrian.print();
    
    antrian.peek();
    
    antrian.peekRear();
    
    antrian.peekPosition("19002");
    
    antrian.printMahasiswa(2);
}
}