public class Animale {
    String genere, specie;

    public Animale() {
        genere = "animale generico";
        specie = "specie generica";
    }

    public void verso() {
        System.out.println("verso dell'animale");
    }

    @Override
    public String toString() {
        String str = "";

        str = str + genere;
        str = str + " " + specie;

        return str;
    }
}
