public class Main {
    public static void main(String[] args) {
        Animale a = new Animale();

        System.out.println("Stampo a:");
        System.out.println(a.toString());
        a.verso();
        System.out.println();

        Gatto b = new Gatto();

        System.out.println("Stampo b:");
        System.out.println(b.toString());
        b.verso();
        System.out.println();
    }
}
