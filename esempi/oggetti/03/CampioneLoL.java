
public class CampioneLoL {
    // attributo nome
    private String name;
    private String descrizione;
    private String q;
    private String w;
    private String e;
    private String r;

    // costruttore
    public CampioneLoL(String name) {
        this.name = name;
    }

    // funzione get per ottenere l'attributo nome
    public String getName() {
        return name;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getQ() {
        return q;
    }

    public String getW() {
        return w;
    }

    public String getE() {
        return e;
    }

    public String getR() {
        return r;
    }

    // funzione set per sovrascrivere l'attributo nome
    public void setName(String name) {
        this.name = name;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public void setW(String w) {
        this.w = w;
    }

    public void setE(String e) {
        this.e = e;
    }

    public void setR(String r) {
        this.r = r;
    }

    @Override
    public String toString() {
        String str = "";

        str = str + name + ": "
                  + descrizione
                  + "\n\tQ: " + q
                  + "\n\tW: " + w
                  + "\n\tE: " + e
                  + "\n\tR: " + r;

        return str;
    }
}
