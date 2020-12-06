
/*
 * Consegna: dati due array a[] e b[], entrambi lunghi 5 elementi,
 *  ottenere un array c[] contenente ad ogni indice la somma dei 2
 *  elementi corrispondenti negli array a[] e b[].
 *  Infine, stampare c[].
 */

public class Es2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];

        a[0] = 5;
        a[1] = 7;
        a[2] = 2;
        a[3] = 0;
        a[4] = 2;

        b[0] = 1;
        b[1] = 3;
        b[2] = 9;
        b[3] = 12;
        b[4] = 4;

        for(int i = 0; i <= 4; i++) {
            c[i] = a[i] + b[i];

            System.out.println(c[i]);
        }
    }
}
