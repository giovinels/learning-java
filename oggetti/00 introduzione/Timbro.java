
public class Timbro {
    String descrizione, colore;
    int lunghezza, larghezza;

    public Timbro(String str, String color, int lung, int larg) {
        descrizione = str;
        colore = color;
        lunghezza = lung;
        larghezza = larg;
    }

    public String toString() {
        return "Descrizione: " +
               descrizione +
               ". Colore: " +
               colore +
               ". Lunghezza: " +
               lunghezza +
               ". Larghezza: " +
               larghezza;
    }
}
