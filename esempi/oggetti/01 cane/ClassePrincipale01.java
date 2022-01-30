
public class ClassePrincipale01 {
    public static void main(String[] args) {
        Cane01 macchia, tata;

        macchia = new Cane01("Macchia", "24/05/2008");
        tata = new Cane01("Tata", "20/03/2005");

        System.out.println("cane 1: " + macchia.toString());
        System.out.println("cane 2: " + tata.toString());

        macchia.faiCacca();
    }
}
