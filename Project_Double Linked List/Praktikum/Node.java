/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author USER
 */
public class Node {
    int data;
    Node prev, next;
    Node(Node prev, int data, Node next) {
        this.prev=prev;
        this.data=data;
        this.next=next;
    }
}
