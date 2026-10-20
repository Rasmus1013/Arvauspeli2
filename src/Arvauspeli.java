// Tämä on Arvauspeli-ohjelma. Käyttäjä yrittää arvata nimen.
import java.util.Scanner;

public class Arvauspeli {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String secret = "Ismo";
        String guess = "";

        System.out.println("Arvaa nimeni!");

        while (true) {
            System.out.print("Arvaus: ");
            guess = in.nextLine();

            if (guess.equalsIgnoreCase(secret)) {
                System.out.println("Oikein!.");
                break;
            } else {
                System.out.println("Väärin!");
            }
        }

System.out.println("Kiitos pelaamisesta!");
    }
}
