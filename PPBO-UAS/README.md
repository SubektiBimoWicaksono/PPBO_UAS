# PPBO-UAS
V3922041 SUBEKTI BIMO WICAKSONO


1. Kelas `Buku`:
   - `Buku` adalah kelas yang merepresentasikan sebuah buku di perpustakaan.
   - Atribut `judul` digunakan untuk menyimpan judul buku.
   - Atribut `penulis` digunakan untuk menyimpan nama penulis buku.
   - Atribut `tersedia` adalah boolean yang menunjukkan apakah buku tersebut tersedia atau tidak.
   - Konstruktor `Buku` digunakan untuk membuat objek `Buku` baru dengan menginisialisasi atribut-atributnya.
   - Metode `getJudul` dan `getPenulis` digunakan untuk mengambil nilai atribut `judul` dan `penulis`.
   - Metode `isTersedia` digunakan untuk memeriksa ketersediaan buku.
   - Metode `setTersedia` digunakan untuk mengubah status ketersediaan buku.

2. Kelas `Perpustakaan`:
   - `Perpustakaan` adalah kelas yang merepresentasikan perpustakaan dan mengelola daftar buku.
   - Atribut `daftarBuku` adalah ArrayList yang digunakan untuk menyimpan objek `Buku` yang ada di perpustakaan.
   - Konstruktor `Perpustakaan` digunakan untuk membuat objek `Perpustakaan` baru dengan menginisialisasi atribut `daftarBuku`.
   - Metode `tambahBuku` digunakan untuk menambahkan buku baru ke daftar buku di perpustakaan.
   - Metode `pinjamBuku` digunakan untuk meminjam buku dengan memeriksa ketersediaan buku dalam daftar. Jika buku tersedia, status ketersediaannya diubah.
   - Metode `tampilkanDaftarBuku` digunakan untuk menampilkan daftar buku beserta status ketersediaannya.

3. Kelas `Main`:
   - `Main` adalah kelas tempat program dijalankan.
   - Pada `main` method, kita membuat objek `Perpustakaan` dan `Scanner` untuk mengambil input dari pengguna.
   - Kemudian, kita menambahkan beberapa buku ke perpustakaan menggunakan metode `tambahBuku` pada objek `Perpustakaan`.
   - Program akan menampilkan menu yang memungkinkan pengguna untuk memilih opsi, seperti menambahkan buku, meminjam buku, atau menampilkan daftar buku.
   - Pengguna dapat memasukkan input sesuai dengan opsi yang dipilih.
   - Setiap opsi akan memanggil metode yang sesuai pada objek `Perpustakaan` untuk melakukan tugas yang diinginkan.
   - Program akan terus berjalan sampai pengguna memilih opsi untuk keluar (`0`).
   - Setelah itu, program akan mencetak pesan terima kasih dan berakhir.