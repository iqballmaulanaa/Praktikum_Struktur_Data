/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu13;

/**
 *
 * @author USER
 */
class AntrianNasabah {
    private Nasabah head;

    AntrianNasabah() {
        head = null;
    }

    void tambahNasabah(String noRek, String nama) {
        Nasabah nasabah = new Nasabah(noRek, nama);
        if (head == null) {
            head = nasabah;
        } else {
            Nasabah current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nasabah;
        }
        System.out.println("Nasabah " + nama + " telah ditambahkan ke dalam antrian.");
    }

    Nasabah cariNasabah(String nama) {
        Nasabah current = head;
        while (current != null) {
            if (current.nama.equals(nama)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    void tampilkanAntrian() {
        System.out.println("Data Nasabah dalam Antrian:");
        if (head == null) {
            System.out.println("Antrian kosong.");
        } else {
            Nasabah current = head;
            while (current != null) {
                current.print();
                System.out.println("------------------------------");
                current = current.next;
            }
        }
    }

    void selesaiTransaksi() {
        if (head == null) {
            System.out.println("Antrian kosong.");
        } else if (head.next == null) {
            System.out.println("Hanya ada 1 nasabah dalam antrian.");
        } else {
            head = head.next.next;
            System.out.println("Dua nasabah pertama telah selesai dilayani.");
        }
    }

    void tambahNasabahDarurat(String noRek, String nama) {
        Nasabah nasabah = new Nasabah(noRek, nama);
        if (head == null) {
            head = nasabah;
        } else {
            nasabah.next = head;
            head = nasabah;
        }
        System.out.println("Nasabah darurat " + nama + " telah ditambahkan ke dalam antrian.");
    }
}