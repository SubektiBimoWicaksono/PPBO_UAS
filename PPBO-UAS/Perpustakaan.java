import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<Buku> daftarBuku;

    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(String judul, String penulis) {
        Buku buku = new Buku(judul, penulis);
        daftarBuku.add(buku);
    }

    public void pinjamBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equals(judul) && buku.isTersedia()) {
                buku.setTersedia(false);
                System.out.println("Buku " + judul + " berhasil dipinjam.");
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak tersedia.");
    }

    public void tampilkanDaftarBuku() {
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println("Judul: " + buku.getJudul() + ", Penulis: " + buku.getPenulis() +
                    ", Tersedia: " + (buku.isTersedia() ? "Ya" : "Tidak"));
        }
    }
}
