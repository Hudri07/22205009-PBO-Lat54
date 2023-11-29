package pkg22205009.pbo.lat54;

/**
 * Nama         : Asmalik Hudri
 * Prodi        : Teknik Informatika
 * Semester     : 3
 * Matakuliah   : Pemrograman Berorientasi Objek (PBO)
 */

// Kelas dasar yang mempresentasikan koordinat
class Koordinat {

    protected int x;    //Variabel untuk menyimpan nilai x
    protected int y;    //Variabel untuk menyimpan nilai y

    // Konstruktor kelas Koordinat dengan menginisialisasi propertinya
    public Koordinat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method Getter untuk mendapatkan nilai x
    public int getX() {
        return x;
    }

    // Method Setter untuk mengatur nilai x
    public void setX(int x) {
        this.x = x;
    }

    // Method Getter untuk mendapatkan nilai y
    public int getY() {
        return y;
    }

    // Method Setter untuk mengatur nilai y
    public void setY(int y) {
        this.y = y;
    }
}

// Kelas turunan yang mempresentasikan warna koordinat
class WarnaKoordinat extends Koordinat {

    public String namaWarna;  //Variabel untuk menyimpan nama warna

    // Konstruktor untuk kelas warna koordinat yang memanggil konstruktor kelas koordinat menggunakan "super"
    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.namaWarna = namaWarna;
    }

    // Method Getter untuk mendapatkan nama warna
    public String getNamaWarna() {
        return namaWarna;
    }

    // Method Setter untuk mengatur nama warna
    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}

// Kelas utama yang berisi method main untuk menjalankan program
public class PBOLat54{
    
    public static void main(String[] args) {
        WarnaKoordinat  wk = new WarnaKoordinat(10, 4, "Jingga");
        System.out.println("Warna Koordinat : " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + wk.getX() + ", y : " + wk.getY());
    }
}