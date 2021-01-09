package array;

import java.util.Scanner;

/**
 * Leggi da tastiera N numeri interi (N definito come costante - assegnare a vostra scelta un valore compreso tra 7 e 15)
 * e memorizzali all'interno di un array. Controlla che ciascun numero ricevuto sia compreso tra -7 e +40: in caso
 * contrario, continua a richiederlo in input finchè non rispetterà il vincolo desiderato.
 * Il programma dovrà quindi:
 * - stampare a video i numeri duplicati presenti nel vettore..
 * Esempio:
 * N = 10
 * Ricevo i numeri: -3, 2, 12, -1, -3, 1, -3, 10, -1, 2
 * Il programma dovrà stampare a video:
 * -3, 2, -1
 */
public class EsMeli01 {
    public static int getNumber() {
        Scanner t = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        return t.nextInt();
    }

    public static void main(String[] args) {
       int N = 10;
       int[] array = new int[N];
       int[] doppi = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = getNumber();
        }

        for(int i = 0; i < N; i++) {
            int indicePrimaComparsa = -1;

            //cerco l'indice della prima occorrenza di array[i]
            for(int j = 0; (indicePrimaComparsa == -1) && (j < N); j++ ) {
                if(array[j] == array[i]) {
                    indicePrimaComparsa = j;
                }
            }

            doppi[indicePrimaComparsa]++;
        }

        boolean firstNumberWritten = false;

        for(int i = 0; i < N; i++) {
            if(doppi[i] > 1) {
                if(firstNumberWritten) {
                    System.out.print(", " + array[i]);
                } else {
                    System.out.print(array[i]);
                    firstNumberWritten = true;
                }
            }
        }
        System.out.println();
    }
}
