/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu12;

/**
 *
 * @author USER
 */
class Queue {
    Node front;
    Node rear;
    int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int noAntrian, String nama) {
        Node newNode = new Node(noAntrian, nama);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = rear;
            rear.prev = newNode;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        Node temp = front;
        front = front.prev;

        if (front == null) {
            rear = null;
        } else {
            front.next = null;
        }

        System.out.println(temp.nama + " telah selesai divaksinasi.");
        size--;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        Node current = rear;
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println("++++++++++++++++++++++++");
        System.out.println("|No.\t|Nama\t|");
        while (current != null) {
            System.out.println("|" + current.noAntrian + "\t|" + current.nama + "\t|");
            current = current.next;
        }
        System.out.println("Sisa Antrian: " + size);
    }
}