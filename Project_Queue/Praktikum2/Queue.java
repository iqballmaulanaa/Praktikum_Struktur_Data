/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author USER
 */
public class Queue {
    private Nasabah[] data;
    private int tail;
    private int head;

    public Queue(int jumlah) {
        data = new Nasabah[jumlah];
    }

    public boolean isEmpty() {
        return tail == 0;
    }

    public boolean isFull() {
        return tail == data.length;
    }

    public void enqueue(Nasabah value) {
        if (isFull()) {
            System.out.println("Antrian penuh");
        } else {
            data[tail] = value;
            tail++;
        }
    }

    public Nasabah dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        } else {
            Nasabah temp = data[0];
            for (int i = 0; i < tail - 1; i++) {
                data[i] = data[i+1];
            }
            tail--;
            return temp;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Nasabah terdepan: " + data[0].norek + " " + data[0].nama + " " + data[0].alamat + " " + data[0].umur + " " + data[0].saldo);
        }
    }

    public void print() {
    if (isEmpty()) {
        System.out.println("Antrian kosong");
    } else {
        System.out.println("Isi antrian: ");
        for (int i = 0; i < tail; i++) {
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
        }
        System.out.println("Jumlah elemen dalam antrian: " + tail);
    }
}
}