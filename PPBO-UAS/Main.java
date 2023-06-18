import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner scanner = new Scanner(System.in);

        perpustakaan.tambahBuku("Harry Potter", "J.K. Rowling");
        perpustakaan.tambahBuku("To Kill a Mockingbird", "Harper Lee");
        perpustakaan.tambahBuku("The Great Gatsby", "F. Scott Fitzgerald");

        boolean running = true;
        while (running) {
            System.out.println("\nPerpustakaan");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Tampilkan Daftar Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine();

            switch (opsi) {
                case 0:
                    running = false;
                    break;
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String penulis = scanner.nextLine();
                    perpustakaan.tambahBuku(judul, penulis);
                    System.out.println("Buku berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                    judul = scanner.nextLine();
                    perpustakaan.pinjamBuku(judul);
                    break;
                case 3:
                    perpustakaan.tampilkanDaftarBuku();
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }

        System.out.println("Terima kasih telah menggunakan perpustakaan.");
    }
}
