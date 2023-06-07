/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author USER
 */
public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("================================");
        
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("================================");
        
        try {
            dll.add(40, 1);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("Data awal pada Linked Lists adalah: " + dll.getFirst()); 
            System.out.println("Data akhir pada Linked Lists adalah: " + dll.getLast());
            System.out.println("Data indeks ke-1 pade Linked Lists adalah: " + dll.get(1));
            System.out.println("================================");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        dll.clear();
        dll.print();
        System.out.println("Size: " + dll.size());
        
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("==============================");
        try {
            dll.removeFirst();
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("==============================");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            dll.removeLast();
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("==============================");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            dll.remove(1);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("==============================");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===============================");
        dll.addFirst (3);
        dll.addLast (4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===============================");
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===============================");
        
    }
}