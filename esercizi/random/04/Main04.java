
/*
 * Consegna: leggere una lista di 6 numeri da terminale, restituire in
 *  output la differenza fra la somma dei numeri pari e la somma dei
 *  numeri dispari inseriti.
 * Esempi:
 *  inserendo <1, 1, 1, 2, 2, 2> l'output sarà 3
 *  inserendo <0, 6, 1, 3, 4, 5> l'output sarà 1
 *  inserendo <9, 2, 4, 7, 1, 3> l'output sarà -14
 */
import java.util.Scanner;

public class Main04 {
    public static int getNumber() {
        Scanner t = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        return t.nextInt();
    }

    public static void main(String[] args) {
        int i;
        int pari = 0;
        int dispari = 0;
        int input;

        for(i = 0; i < 6; i++) {
            input = getNumber();
            if(input % 2 == 0) {
                pari = pari + input;
            } else {
                dispari = dispari + input;
            }
        }

        System.out.println("Il risulato è: " + (pari - dispari));
    }
}
