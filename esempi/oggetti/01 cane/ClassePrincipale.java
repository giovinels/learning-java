
public class ClassePrincipale {
    public static void main(String[] args) {
        Cane macchia, tata;

        macchia = new Cane("Macchia", "24/05/2008");
        tata = new Cane("Tata", "20/03/2005");

        System.out.println("cane 1: " + macchia.toString());
        System.out.println("cane 2: " + tata.toString());

        macchia.faiCacca();
    }
}
