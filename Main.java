import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LinkedList daftarBuku = new LinkedList();

        int pilihan;

        do {
            System.out.println("\n===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    // Tambah Buku
                    String kodeBuku;

                    do {
                        System.out.print("Masukkan Kode Buku (maks. 5 karakter): ");
                        kodeBuku = input.nextLine();

                        if (kodeBuku.length() > 5) {
                            System.out.println("Kode buku maksimal 5 karakter.");
                        }

                    } while (kodeBuku.length() > 5);

                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan Penulis: ");
                    String penulis = input.nextLine();

                    Buku buku = new Buku(kodeBuku, judul, penulis);
                    daftarBuku.push(buku);

                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    // Hapus Buku
                    daftarBuku.pop();
                    break;

                case 3:
                    // Cari Buku
                    System.out.print("Masukkan Kode Buku yang dicari: ");
                    String kodeCari = input.nextLine();

                    daftarBuku.cariBuku(kodeCari);
                    break;

                case 4:
                    // Tampilkan Semua Buku
                    daftarBuku.tampilkanSemuaBuku();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid.");
            }

        } while (pilihan != 5);

        input.close();
    }
}