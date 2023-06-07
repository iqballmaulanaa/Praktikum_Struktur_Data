/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu12;

/**
 *
 * @author USER
 */
class Node {
    int noAntrian;
    String nama;
    Node next;
    Node prev;

    public Node(int noAntrian, String nama) {
        this.noAntrian = noAntrian;
        this.nama = nama;
        this.next = null;
        this.prev = null;
    }
}