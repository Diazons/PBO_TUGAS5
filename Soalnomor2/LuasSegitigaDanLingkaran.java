import java.util.Scanner;

public class LuasSegitigaDanLingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Segitiga segitiga = new Segitiga();

        System.out.println("-----Menghitung Luas Segitiga-----");

        System.out.print("Alas dari segitiga: ");
        segitiga.setAlas(sc.nextInt());

        System.out.print("Tinggi dari segitiga: ");
        segitiga.setTinggi(sc.nextInt());

        System.out.println("Luas segitiga: " + segitiga.hitungLuas());

        Lingkaran lingkaran = new Lingkaran();

        System.out.println("\n-----Menghitung Luas lingkaran-----");

        System.out.print("Input jari-jari lingkaran: ");
        lingkaran.setJariJari(sc.nextInt());

        // menampilkan luas lingkaran
        System.out.printf("Luas lingkaran adalah: %.2f", lingkaran.hitungLuas());
        sc.close();
    }
 }