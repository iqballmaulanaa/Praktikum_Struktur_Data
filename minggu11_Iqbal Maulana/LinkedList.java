/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu11;

/**
 *
 * @author USER
 */
public class LinkedList {
    Node head;

    static class Node {
        String data;
        Node next;

        Node(String d) {
            data = d;
            next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addAfter(String keyword, String data) {
        Node temp = head;
        while(temp != null) {
            if(temp.data.equals(keyword)) {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
    }

    public void addBefore(String keyword, String data) {
        Node temp = head;
        if(head.data.equals(keyword)) {
            addFirst(data);
            return;
        }
        while(temp.next != null) {
            if(temp.next.data.equals(keyword)) {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("e");
        list.addFirst("d");
        list.addFirst("c");
        list.addFirst("b");
        list.addFirst("a");
        list.printList();
        list.addAfter("c", "cc");
        list.printList();
        list.addBefore("e", "ee");
        list.printList();
    }
}