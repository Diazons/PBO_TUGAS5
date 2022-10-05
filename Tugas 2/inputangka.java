import java.util.Scanner;

public class inputangka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        System.out.println("Masukan nilai: ");
        nilai = sc.nextInt();
        while (nilai > 10){
            System.out.println("Nilai yang anda masukan salah. \nMohon masukan nilai kembali:");
            nilai = sc.nextInt();
        }
        System.out.println("Nilai yang anda masukan adalah" + nilai);
      {
            
        }
    }
}
