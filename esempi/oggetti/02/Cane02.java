
public class Cane02 {
    String nome, dataDiNascita;

    public Cane02(String nome, String dataDiNascita) {
        this.nome = nome; /* il this serve a risolvere l'omonimia e indicare
                           * che si vuole assegnaere il parametro attuale
                           * della funzione all'attributo 'nome' della
                           * classe cane*/

        this.dataDiNascita = dataDiNascita;
        /* Ora ho assegnato i parametri attuali agli attributi
         * del cane che sto creando. Il metodo costruttore non
         * ha bisogno del return (come non ha bisogno del nome
         * della funzione dopo il tipo 'in questo caso Cane').*/
    }

    public void faiCacca() {
        System.out.println(nome + ": plop");
    }

    public String toString() {
        return "Nome: " + this.nome + ". Nato il " + dataDiNascita;
        /* Non e' sbagliato utilizzare "this." per riferirsi ad un attributo,
         * ma in questo caso e' ridondante in quanto non ci sono omonimie,
         * quindi potrebbe essere anche tolto.*/
    }
}
