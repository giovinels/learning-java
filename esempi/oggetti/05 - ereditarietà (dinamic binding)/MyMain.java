public class MyMain {
    public static void main(String[] args) {
        MyAnimale[] listaAnimali = new MyAnimale[5];

        listaAnimali[0] = new MyGatto("Matisse");
        listaAnimali[1] = new MyCane();
        listaAnimali[2] = new MyGatto("Gatto2");
        listaAnimali[3] = new MyCane();
        listaAnimali[4] = new MyGatto("Gatto3");

        for(int i = 0; i < listaAnimali.length; i++) {
            listaAnimali[i].verso();
        }

        for(int i = 0; i < listaAnimali.length; i++) {
            System.out.println(listaAnimali[i].toString());
        }

        MyGatto gat = new MyGatto("Gattino");
        System.out.println(gat.getName());

        System.out.println(((MyGatto) listaAnimali[0]).getName());
    }
}
