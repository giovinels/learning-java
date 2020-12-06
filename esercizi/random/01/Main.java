import java.util.Scanner;
/*
 * Scrivi un programma che legge un numero e visualizza
 *  su schermo tutti i suoi divisori
 */

public class Main {
    public static int getNumber() {
        Scanner t = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        return t.nextInt();
    }

    public static void main(String[] args) {
        int x = getNumber();
        int i;

        if(x <= 0) {
            System.out.println("Input non accettato");
        } else {
            for(i = 1; i <= x; i++) {
                if(x % i == 0) {
                    System.out.println("I divisori sono: " + i);
                }
            }
        }
    }
}
