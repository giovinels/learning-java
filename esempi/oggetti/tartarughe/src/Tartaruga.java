public class Tartaruga {
    String nomeSpecie;
    int etàMax;
    String colore;
    boolean diTerra;

    //costruttore della classe Tartaruga (per creare gli oggetti Tartaruga)
    public Tartaruga(String nome_specie, int eta_max, String color, boolean terra) {
        nomeSpecie = nome_specie;
        etàMax = eta_max;
        colore = color;
        diTerra = terra;
    }

    public void saluta() {
        System.out.println("ciao, sono una " + nomeSpecie);
    }
}
