public void insertBefore(int key, int input) {
    Node newNode = new Node(input, null);
    if (isEmpty()) {
        System.out.println("Linked list kosong, tidak bisa menambahkan data sebelum " + key);
        return;
    }
    if (head.data == key) {
        addFirst(input);
        return;
    }
    Node temp = head;
    while (temp.next != null && temp.next.data != key) {
        temp = temp.next;
    }
    if (temp.next == null) {
        System.out.println("Data " + key + " tidak ditemukan dalam linked list, tidak bisa menambahkan data sebelumnya");
    } else {
        newNode.next = temp.next;
        temp.next = newNode;
    }
}
