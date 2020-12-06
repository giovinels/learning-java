
/*
 * Consegna: scrivere un programma che prende un numero intero
 *  come input da terminale e stampa:
 *      1) "numero primo" se il numero è un numero primo
 *      2) "non primo" se il numero non è un numero primo
 */

 import java.util.Scanner;

 public class Main {
     public static int getNumber() {
         Scanner t = new Scanner(System.in);

         System.out.print("Inserisci un numero: ");
         return t.nextInt();
     }

     public static void main(String[] args) {
         int x = getNumber();
         int i;
         boolean isPrime = true;

         for(i = 2; i < x; i++) {
             if(x % i == 0) {
                 isPrime = false;
             }
         }

         if(isPrime == false) {
             System.out.println("non primo");
         } else {
             System.out.println("numero primo");
         }
     }
 }
