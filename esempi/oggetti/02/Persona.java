
public class Persona {
    String nome, cognome;
    char sesso;
    int anni;
    Cane02 cane;

    public Persona(String nome, String cognome, char sesso, int anni) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.anni = anni;
    }

    public void setCane(Cane02 cane) {
        this.cane = cane;
    }

    public String toString() {
        String str = "nome: " + nome + "\n" +
                     "cognome: " + cognome + "\n" +
                     "sesso: ";

        switch(sesso) {
            case 'm':
                str = str + "maschio" + "\n";
                break;
            case 'f':
                str = str + "femmina" + "\n";
                break;
            default:
                str = str + "sconosciuto" + "\n";
                break;
        }

        str = str + "anni: " + anni + "\n";

        if(cane != null) {
            str = str + "possiede il cane: " + cane.toString() + "\n";
        }

        return str;
    }
}
