class Node {
    Buku data; //Menyimpan data buku
    Node next; //Menunjuk ke node berikutnya

    //Constructor untuk membuat node baru
    public Node(Buku data) {
        this.data = data;
        this.next = null;
    }
}