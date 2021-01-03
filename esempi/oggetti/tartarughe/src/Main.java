public class Main {
    public static void main(String[] args) {
        Tartaruga t1; //dichiarazione di una variabile di tipo Tartaruga
        Tartaruga t2;

        t1 = new Tartaruga("tartaruga mediterranea",
                               110,
                                 "verde e marrone",
                                 true);

        t2 = new Tartaruga("tartaruga caretta",
                               60,
                                 "marrone",
                                 false);

        System.out.println("t1 nome specie: " + t1.nomeSpecie);
        System.out.println("t2 nome specie: " + t2.nomeSpecie);

        t1.saluta();
        t2.saluta();
    }
}
