
// membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}
public class Main1 {
    public static void main(String[] args) throws Exception {
        // instansiasi/ membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "yazz";
        mahasiswa1.NIM ="12345";
        mahasiswa1.jurusan ="teknik informatika";
        mahasiswa1.IPK = 4;
        mahasiswa1.umur = 18;
        System.out.println("\n");

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
        System.out.println("\n");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "miftah";
        mahasiswa2.NIM ="202967";
        mahasiswa2.jurusan ="teknik mesin";
        mahasiswa2.IPK = 3.7;
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);

    }
}