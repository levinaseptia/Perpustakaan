class LinkedList {
    Node head; //Menujuk head atau node pertama

    //Constructor untuk membuat LinkedList
    public LinkedList() {
        head = null;
    }

    //Menambahkan buku ke akhir LinkedList 
    public void push(Buku buku) {
        Node baru = new Node(buku); //Membuat node baru dari data buku

        //Jika LinkedList masih kosong
        if (head == null) {
            head = baru;
            return;
        }

        //Mencari node terakhir
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        //Menghubungkan node terakhir dengan node baru
        current.next = baru;
    }


    //
    public void pop() {
        //Jika LinkedList kosong
        if (head == null) {
            System.out.println("Tidak ada data untuk dihapus.");
            return;
        }

        //Jika hanya ada 1 buku
        if (head.next == null) {
            head = null;
            return;
        }

        // Mencari node sebelum node terakhir
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        //Menghapus node terakhir
        current.next = null;
    }

    //Mencari buku berdasarkan kode buku
    public void cariBuku(String kodeBuku) {
        Node current = head;
        while (current != null) {
            // Mencari buku berdasarkan kode buku
            if (current.data.kodeBuku.equals(kodeBuku)) {
                System.out.println("Buku ditemukan!");
                System.out.println("Kode: " + current.data.kodeBuku);
                System.out.println("Judul: " + current.data.judulBuku);
                System.out.println("Penulis: " + current.data.penulis);
                return;
            }

            // Pindah ke node berikutnya
            current = current.next;
        }

        // Jika buku tidak ditemukan
        System.out.println("Buku tidak ditemukan.");
    }

    // Menampilkan semua buku
    public void tampilkanSemuaBuku() {
        Node current = head;
        int jumlah = 0;

        // Mengecek apakah LinkedList kosong
        if (head == null) {
            System.out.println("Belum ada data buku.");
            return;
        }

        System.out.println("Daftar Buku:");

        // Menampilkan buku satu per satu
        while (current != null) {
            System.out.println(
                "Kode: " + current.data.kodeBuku
                + " | Judul: " + current.data.judulBuku
                + " | Penulis: " + current.data.penulis
            );

            jumlah++;
            current = current.next;
        }

        System.out.println("Total Buku: " + jumlah);
    }
    
}