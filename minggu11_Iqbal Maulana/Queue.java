/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu11;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Queue {
    private AntrianMahasiswa front, rear;
    private int size, max;

    public Queue(int n) {
        front = null;
        rear = null;
        size = 0;
        max = n;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa m) {
        AntrianMahasiswa node = new AntrianMahasiswa(m);
        if (isEmpty()) {
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
        size++;
        System.out.println("Mahasiswa dengan NIM " + m.nim + " berhasil mengantri.");
    }

    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else {
            Mahasiswa m = front.mahasiswa;
            front = front.next;
            size--;
            if (isEmpty()) {
                rear = null;
            }
            System.out.println("Mahasiswa dengan NIM " + m.nim + " telah keluar dari antrian.");
            return m;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            AntrianMahasiswa current = front;
            while (current != null) {
                System.out.println(current.mahasiswa.nim + " - " + current.mahasiswa.nama);
                current = current.next;
            }
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println(front.mahasiswa.nim + " - " + front.mahasiswa.nama);
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println(rear.mahasiswa.nim + " - " + rear.mahasiswa.nama);
        }
    }

    public void peekPosition(String nim) {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            AntrianMahasiswa current = front;
            int position = 1;
            boolean found = false;
            while (current != null) {
                if (current.mahasiswa.nim.equals(nim)) {
                    found = true;
                    break;
                }
                current = current.next;
                position++;
            }
            if (found) {
                System.out.println("Mahasiswa dengan NIM " + nim + " berada di posisi " + position + " dalam antrian.");
            } else {
                System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan dalam antrian.");
            }
        }
    }

    public void printMahasiswa(int posisi) {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            if (posisi > size) {
                System.out.println("Posisi melebihi ukuran antrian.");
            } else {
                AntrianMahasiswa current = front;
                            int count = 1;
            while (count < posisi) {
                current = current.next;
                count++;
            }
            System.out.println("Data Mahasiswa pada posisi ke-" + posisi);
            System.out.println("NIM: " + current.mahasiswa.nim);
            System.out.println("Nama: " + current.mahasiswa.nama);
            System.out.println("Absen: " + current.mahasiswa.absen);
            System.out.println("IPK: " + current.mahasiswa.ipk);
        }
    }
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan jumlah antrian: ");
    int n = input.nextInt();

    Queue q = new Queue(n);

    for (int i = 0; i < n; i++) {
        System.out.println("\nData Mahasiswa ke-" + (i+1));
        System.out.print("NIM: ");
        String nim = input.next();
        System.out.print("Nama: ");
        String nama = input.next();
        System.out.print("Absen: ");
        int absen = input.nextInt();
        System.out.print("IPK: ");
        double ipk = input.nextDouble();

        Mahasiswa mhs = new Mahasiswa(nim, nama, absen, ipk);
        AntrianMahasiswa antri = new AntrianMahasiswa(mhs);

        q.enqueue(antri.mahasiswa);
    }

    System.out.println("\nData Mahasiswa yang Mengantri: ");
    q.print();

    System.out.println("\nData Mahasiswa pada Posisi ke-2: ");
    q.printMahasiswa(2);
}
}