
public class ClassePrincipale {
    public static void main(String[] args) {
        Persona mario, lucia, p3;
        Cane dog;

        mario = new Persona("Mario", "Rossi", 'm', 40);
        lucia = new Persona("Lucia", "Verdi", 'f', 12);
        p3 = new Persona("Pippo", "Baudo", 'n', 22);

        dog = new Cane("Bob", "1/1/2020");
        mario.setCane(dog);

        System.out.println(mario.toString());
        System.out.println(lucia.toString());
        System.out.println(p3.toString());
    }
}
