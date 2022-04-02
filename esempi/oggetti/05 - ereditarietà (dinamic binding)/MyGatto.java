public class MyGatto extends MyAnimale {
    String name;

    public MyGatto(String name) {
        this.name = name;
        genere = "Felis";
        specie = "F. Silvestris";
    }

    public String getName() { return name; }

    @Override
    public void verso() {
        System.out.println("MIAO");
    }
}
