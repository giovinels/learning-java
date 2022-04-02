public class MyAnimale {
    String genere, specie;

    public MyAnimale() {
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
