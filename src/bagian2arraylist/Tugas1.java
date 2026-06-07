package bagian2arraylist;

import java.util.ArrayList;
public class Tugas1 {
    public static void main(String[] args) {
        // 1. Buat ArrayList<String> daftar belanja
        ArrayList<String> daftarBelanja = new ArrayList<>();

        // 2. Tambah 4 item
        daftarBelanja.add("Minyak Goreng");
        daftarBelanja.add("Beras"); // Ini item ke-2 (indeks 1)
        daftarBelanja.add("Gula Pasir");
        daftarBelanja.add("Telur");

        System.out.println("Daftar awal: " + daftarBelanja);

        // 3. Hapus item ke-2 (indeks 1)
        daftarBelanja.remove(1); 

        // 4. Tampilkan isi list beserta jumlah akhirnya
        System.out.println("\n--- Isi List Akhir ---");
        for (String item : daftarBelanja) {
            System.out.println("- " + item);
        }
        System.out.println("Jumlah akhir item: " + daftarBelanja.size());
    }
}  