public class IF {
    public static void main(String[] args) {
        int a = 5;
        int b;

        //esempio 1

        if(a > 5) {
            System.out.println("a vale più di 5");
        } else {
            System.out.println("a vale meno di 5");
        }

        //esempio 2 (con una sola istruzione si possono omettere le graffe)

        if(a > 5)
            System.out.println("a vale più di 5");
        else
            System.out.println("a vale meno di 5");

        //esempio 3 (si possono concatenare else if a piacere)

        if(a > 5) {
            System.out.println("a vale più di 5");
        } else if(a == 5) {
            System.out.println("a vale esattamente 5");
        } else if((a > 0) && (a > 5)) {
            System.out.println("0 < a < 5");
        } else {
            System.out.println("a minore o uguale a 0");
        }

        //esempio 4 (costrutto if contratto)

        b = (a > 5) ? 0 : 1;

    }
}
