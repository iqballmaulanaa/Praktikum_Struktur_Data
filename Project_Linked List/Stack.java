/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu11;

/**
 *
 * @author USER
 */
public class Stack {
    Node top;

    static class Node {
        String data;
        Node next;

        Node(String d) {
            data = d;
            next = null;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if(isEmpty()) {
            return "Stack Underflow";
        }
        String data = top.data;
        top = top.next;
        return data;
    }

    public void printStack() {
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Bahasa");
        stack.push("Android");
        stack.push("Komputer");
        stack.push("Basis Data");
        stack.push("Matematika");
        stack.push("Algoritma");
        stack.push("Statistika");
        stack.push("Multimedia");
        stack.printStack();
    }
}