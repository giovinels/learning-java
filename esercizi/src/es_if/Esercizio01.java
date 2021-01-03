

public class Esercizio01 {
    /*
     * scrivere del codice che dichiara una variabile intera e stampa
     * uno dei seguenti messaggi:
     * - "positivo!" se la variabile ha un valore > 0
     * - "negativo!" se la variabile ha una valore < 0
     * - "zero!" se la variabile vale esattamente 0
     * */
    public static void main(String[] args) {
        int x = 2;

        //soluzione 1

        if(x > 0) {
            System.out.println("positivo!");
        } else if(x < 0) {
            System.out.println("negativo!");
        } else {
            System.out.println("zero!");
        }

        //soluzione 2

        if(x > 0) {
            System.out.println("positivo!");
        } else {
            if(x < 0) {
                System.out.println("negativo!");
            } else {
                System.out.println("zero!");
            }
        }
    }
}
