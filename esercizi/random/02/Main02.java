import java.util.Scanner;
/*
 * Consegna: scrivere un programma che, dati 10 numeri in
 *  ingresso, restituisce come risultato la quantità di
 *  numeri pari e la quantità di numeri dispari
 */

 public class Main02 {
     public static int getInput() {
         Scanner t = new Scanner(System.in);

         System.out.print("Inserisci numero: ");
         return t.nextInt();
     }

     public static void main(String[] args) {
         int x, i;
         int pari = 0, dispari = 0;

         for(i = 0; i < 10; i++) {
             x = getInput();

             if(x % 2 == 0) {
                 //pari
                 pari = pari + 1;
             } else {
                 //dispari
                 dispari = dispari + 1;
             }
         }

         System.out.println("I numeri pari sono: " + pari);
         System.out.println("I numeri dispari sono: " + dispari);
     }
 }
