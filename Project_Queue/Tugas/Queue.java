/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author USER
 */
public class Queue {
    private int front;
    private int rear;
    private int count;
    private Mahasiswa[] antrian;
    private int capacity;

    public Queue(int size) {
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
        antrian = new Mahasiswa[capacity];
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public boolean isFull() {
        return (size() == capacity);
    }
    
    public Mahasiswa[] getAntrian() {
    return antrian;
}

    public void enqueue(Mahasiswa data) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            rear = (rear + 1) % capacity;
            antrian[rear] = data;
            count++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return -1;
        } else {
            int result = front;
            front = (front + 1) % capacity;
            count--;
            return result;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling depan:");
            System.out.println("NIM    : " + antrian[front].getNim());
            System.out.println("Nama   : " + antrian[front].getNama());
            System.out.println("Absen  : " + antrian[front].getAbsen());
            System.out.println("IPK    : " + antrian[front].getIpk());
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling belakang:");
            System.out.println("NIM    : " + antrian[rear].getNim());
            System.out.println("Nama   : " + antrian[rear].getNama());
            System.out.println("Absen  : " + antrian[rear].getAbsen());
            System.out.println("IPK    : " + antrian[rear].getIpk());
        }
    }
    
    public void dequeue(int posisi) {
    if (isEmpty()) {
        System.out.println("Antrian kosong");
    } else if (posisi < 1 || posisi > size()) {
        System.out.println("Posisi yang dimasukkan tidak valid");
    } else {
        int index = (front + posisi - 1) % capacity;
        Mahasiswa removedMahasiswa = antrian[index];
        for (int i = posisi - 1; i < size() - 1; i++) {
            int currIndex = (front + i) % capacity;
            int nextIndex = (front + i + 1) % capacity;
            antrian[currIndex] = antrian[nextIndex];
        }
        rear = (rear - 1 + capacity) % capacity;
        count--;
        System.out.println("Mahasiswa dengan NIM " + removedMahasiswa.getNim() + " telah dikeluarkan dari antrian");
    }
}
    
    public void peekPosition(String nim) {
        boolean found = false;
        int pos = -1;
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            if (antrian[index].getNim().equals(nim)) {
                found = true;
                pos = index;
                break;
            }
        }
        if (found) {
            System.out.println("Mahasiswa dengan NIM " + nim + " berada di posisi antrian ke-" + (pos - front + 1));
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan dalam antrian");
        }
    }

    public void printMahasiswa(int posisi) {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else if (posisi < 1 || posisi > size()) {
            System.out.println("Posisi yang dimasukkan tidak valid");
} else {
System.out.println("Mahasiswa pada posisi ke-" + posisi + ":");
int index = (front + posisi - 1) % capacity;
System.out.println("NIM : " + antrian[index].getNim());
System.out.println("Nama : " + antrian[index].getNama());
System.out.println("Absen : " + antrian[index].getAbsen());
System.out.println("IPK : " + antrian[index].getIpk());
}
}
}