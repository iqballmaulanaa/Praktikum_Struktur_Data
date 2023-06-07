/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;
/**
 *
 * @author USER
 */
public class PencarianMain {
    public static void main(String[] args) {
        double[] data={2.7, 2.9, 3.04, 3.12, 3.54, 3.87, 3.91};
        OrderedSearch os= new OrderedSearch (data);
        System.out.println("Isi elemen array: ");
        os.tampilkan ();
        double key=3.12;
        int index= os.cari (key);
        if(index!= -1) {
            System.out.println("Data "+ key+ "pada index "+ index);
        } else{
                System.out.println("Data "+ key+" tidak ditemukan");
    }
} 
}