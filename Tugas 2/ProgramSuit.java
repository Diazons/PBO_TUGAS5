import java.util.Random; import java.util.Scanner;

public class ProgramSuit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] tjk = {"t", "j", "k"};
            String jariKom = tjk[new Random().nextInt(tjk.length)];
            String jari;

            while(true) {
                System.out.println("Mau keluarin jari apanih (t, j, atau k): ");
                jari = scanner.nextLine();
                if (jari.equals("t") || jari.equals("j") || jari.equals("k")) {
                    break;
                }
                System.out.println(jari + " apaan?");
            }

            System.out.println("Komputer: " + jariKom);

            if (jari.equals(jariKom)) {
                System.out.println("Ciyee seri");
            }
            else if (jari.equals("t")) {
                if (jariKom.equals("k")) {
                    System.out.println("Anjay Menang");

                } else if (jariKom.equals("j")) {
                    System.out.println("Lol dek kalah kamu!");
                }
            }

            else if (jari.equals("j")) {
                if (jariKom.equals("t")) {
                    System.out.println("Anjay Menang");

                } else if (jariKom.equals("k")) {
                    System.out.println("Lol dek kalah kamu!");
                }
            }

            else {
                if (jariKom.equals("j")) {
                    System.out.println("Anjay Menang");

                } else if (jariKom.equals("t")) {
                    System.out.println("Lol dek kalah kamu!");
                }
            }

            System.out.println("Mau main lagi ga kids? (yuk/skip)");
            String maenLagi = scanner.nextLine();

            if (!maenLagi.equals("yuk")) {
                break;
            }
        }
        scanner.close();
    }
}