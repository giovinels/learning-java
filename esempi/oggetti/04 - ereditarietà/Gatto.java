public class Gatto extends Animale {
    public Gatto() {
        genere = "Felis";
        specie = "F. Silvestris";
    }

    @Override
    public void verso() {
        System.out.println("MIAO");
    }
}
