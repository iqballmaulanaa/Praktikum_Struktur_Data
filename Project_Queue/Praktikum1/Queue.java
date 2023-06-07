/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;

/**
 *
 * @author USER
 */
public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekAt(int position) {
        if (!isEmpty()) {
            if (position >= 0 && position < size) {
                int index = (front + position) % max;
                System.out.println("Elemen pada posisi " + position + " adalah " + data[index]);
            } else {
                System.out.println("Posisi tidak valid");
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(int data) {
        if (!isEmpty()) {
            int position = -1;
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                if (this.data[index] == data) {
                    position = i;
                    break;
                }
            }
            if (position >= 0) {
                System.out.println("Data " + data + " ditemukan pada posisi " + position);
            } else {
                System.out.println("Data " + data + " tidak ditemukan dalam queue");
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            System.out.print("Isi queue: ");
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.print(data[i] + " ");
            System.out.println("\nJumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
                        } else {
            front = (front + 1) % max;
        }
    }
    return dt;
}
}