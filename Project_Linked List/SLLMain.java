/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu11;

/**
 *
 * @author USER
 */
public class SLLMain { 
    public static void main(String[] args) { 
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print(); // Linked list kosong
        
        singLL.addFirst(890);
        singLL.print(); // Isi Linked List:  890
        
        singLL.addLast(760);
        singLL.print(); // Isi Linked List:  890    760
        
        singLL.addFirst(700);
        singLL.print(); // Isi Linked List:  890    760
        
        singLL.insertAfter(700, 999);
        singLL.print(); // Isi Linked List:  700    999    890    760
        
        singLL.insertAt (3, 833);
        singLL.print(); // Isi Linked List:  700    999    890    833    760
        
        System.out.println("Data pada indeks ke-1="+singLL.getData(1));
System.out.println("Data 3 berada pada indeks ke-"+singLL.indexOf (760));
singLL.remove (999);
singLL.print();
singLL.removeAt (0);
singLL.print();
singLL.removeFirst();
singLL.print();
singLL.removeLast();
singLL.print();
}
}