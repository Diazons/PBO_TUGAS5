import java.util.Scanner;

public class Mencarikata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata;
        String klm = "kalau dilakukan dengan sepenuh hati maka besi batangan" +
                "pun kalau digosok terus menerus akan menjadi jarum";

        System.out.println("" +klm);

        while(true){
            System.out.println("Input salah satu kata dari kalimat di atas:");
            kata = sc.nextLine();
            if (klm.contains(kata)){
                System.out.println("Benar! Pada kalimat di atas terdapat kata: " + kata);
                break;
            } else {
                System.out.println("Mohon input kata yang benar!");
            }
        }
    }
}
