/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu12;

/**
 *
 * @author USER
 */
class FilmList {
    Film head;
    Film tail;

    public FilmList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahDataAwal(int id, String judul, double rating) {
        Film newFilm = new Film(id, judul, rating);
        if (isEmpty()) {
            head = newFilm;
            tail = newFilm;
        } else {
            newFilm.next = head;
            head.prev = newFilm;
            head = newFilm;
        }
        System.out.println("Data film berhasil ditambahkan di posisi awal.");
    }

    public void tambahDataAkhir(int id, String judul, double rating) {
        Film newFilm = new Film(id, judul, rating);
        if (isEmpty()) {
            head = newFilm;
            tail = newFilm;
        } else {
            tail.next = newFilm;
            newFilm.prev = tail;
            tail = newFilm;
        }
        System.out.println("Data film berhasil ditambahkan di posisi akhir.");
    }

    public void tambahDataTertentu(int id, String judul, double rating, int posisi) {
        Film newFilm = new Film(id, judul, rating);
        if (isEmpty()) {
            head = newFilm;
            tail = newFilm;
            System.out.println("Data film berhasil ditambahkan di posisi ke-1.");
            return;
        }
        Film current = head;
        int count = 1;
        while (count < posisi && current != null) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Posisi yang dituju tidak valid.");
            return;
        }
        newFilm.prev = current.prev;
        newFilm.next = current;
        if (current.prev != null) {
            current.prev.next = newFilm;
        } else {
            head = newFilm;
        }
        current.prev = newFilm;
        System.out.println("Data film berhasil ditambahkan di posisi ke-" + posisi + ".");
    }

    public void hapusDataPertama() {
        if (isEmpty()) {
            System.out.println("Tidak ada data film yang dapat dihapus.");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data film pertama berhasil dihapus.");
    }

    public void hapusDataTerakhir() {
        if (isEmpty()) {
            System.out.println("Tidak ada data film yang dapat dihapus.");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data film terakhir berhasil dihapus.");
    }

    public void hapusDataTertentu(int posisi) {
        if (isEmpty()) {
            System.out.println("Tidak ada data film yang dapat dihapus.");
            return;
}
Film current = head;
int count = 1;
while (count < posisi && current != null) {
current = current.next;
count++;
}
if (current == null) {
System.out.println("Posisi yang dituju tidak valid.");
return;
}
if (current.prev != null) {
current.prev.next = current.next;
} else {
head = current.next;
}
if (current.next != null) {
current.next.prev = current.prev;
} else {
tail = current.prev;
}
System.out.println("Data film pada posisi ke-" + posisi + " berhasil dihapus.");
}
    public void cetakData() {
    if (isEmpty()) {
        System.out.println("Tidak ada data film.");
        return;
    }
    Film current = head;
    while (current != null) {
        System.out.println("ID: " + current.id);
        System.out.println("Judul Film: " + current.judul);
        System.out.println("Rating: " + current.rating);
        System.out.println();
        current = current.next;
    }
}
    public Film cariData(int id) {
    if (isEmpty()) {
        return null;
    }
    Film current = head;
    while (current != null) {
        if (current.id == id) {
            return current;
        }
        current = current.next;
    }
    return null;
}

public void urutDataRatingDesc() {
    if (isEmpty()) {
        System.out.println("Tidak ada data film yang dapat diurutkan.");
        return;
    }
    boolean swapped;
    Film current;
    Film temp;
    do {
        swapped = false;
        current = head;
        while (current.next != null) {
            if (current.rating < current.next.rating) {
                temp = current.next;
                current.next = temp.next;
                if (temp.next != null) {
                    temp.next.prev = current;
                } else {
                    tail = current;
                }
                temp.prev = current.prev;
                temp.next = current;
                if (current.prev != null) {
                    current.prev.next = temp;
                } else {
                    head = temp;
                }
                current.prev = temp;
                swapped = true;
            } else {
                current = current.next;
            }
        }
    } while (swapped);
    System.out.println("Data film berhasil diurutkan berdasarkan rating secara descending.");
}
}