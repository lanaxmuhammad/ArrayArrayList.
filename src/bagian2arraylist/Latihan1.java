package bagian2arraylist;
import java.util.ArrayList;
public class Latihan1 {
    public static void main(String[] args) {
        // Membuat ArrayList kosong yang menampung String
        ArrayList<String> mahasiswa = new ArrayList<>();

        // add() menambah elemen di akhir
        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");

        // Menampilkan output ke layar
        System.out.println("Isi list : " + mahasiswa);
        System.out.println("Jumlah   : " + mahasiswa.size());
        System.out.println("Index 1  : " + mahasiswa.get(1));
    }
}
