package bagian3multiclass;

public class MainPerpustakaan {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(
            new Buku("Laskar Pelangi", "Andrea Hirata", 2005)
        );

        perpus.tambahBuku(
            new Buku("Bumi Manusia", "Pramoedya", 1980)
        );

        perpus.tambahBuku(
            new Buku("Anak Semua Bangsa", "Pramoedya", 1981)
        );

        perpus.tampilkanKoleksi();

        System.out.println("\n=== Meminjam Buku ===");
        perpus.pinjamBuku("Bumi Manusia");

        System.out.println("\n=== Mengembalikan Buku ===");
        perpus.kembalikanBuku("Bumi Manusia");

        System.out.println("\n=== Cari Penulis ===");
        perpus.cariPenulis("Pramoedya");
    }
}