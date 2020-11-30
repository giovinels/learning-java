
public class ClassePrincipale {
    public static void main(String[] args) {
        Timbro t1, t2, t3;

        t1 = new Timbro("Timbro di Kimo!", "Verde", 10, 11);
        t2 = new Timbro("Timbro di Vale!", "Azzurro", 15, 20);
        t3 = new Timbro("Timbro a caso!", "Marrone", 5, 5);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
    }
}
