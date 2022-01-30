import java.util.Scanner;

public class Main03 {
    public static String getString() {
        Scanner t = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        return t.nextLine();
    }

    /**
     * Scrivi una funzione "lunghezza" accetta una stringa come parametro in ingresso
     * e stampa su terminale la lunghezza della stringa.
     * Tieni a mente che per trovare la lunghezza di una stringa, si può utilizzare
     * nomeStringa.length()
     */
    public static void lunghezza(String parola) {
        System.out.println(parola.length());
    }

    public static void main(String[] args) {
        String str = getString();
        System.out.println("Hai inserito: " + str);
        System.out.print("lunghezza stringa: ");
        lunghezza(str);

        System.out.println("la stringa è tartaruga?: " + str.equals("tartaruga"));

        //for(inizializzazione; condizione_di_uscita; incremento) {
            // operazione da ripetere
            // operazione da ripetere
            // ..
        //}

    }
}
