import java.awt.*;

public class Main {
    /**
     * Proviamo ad utilizzare degli oggetti prefatti dagli sviluppatori di Java.
     * Il sito di documentazione si trova a: https://docs.oracle.com/javase/9/docs/api/overview-summary.html
     * @param args
     */
    public static void main(String[] args) throws AWTException, InterruptedException { /* per throws AWTException guardare la parte del lancio di eccezioni (se l'hai fatta)*/
        Robot robottino = new Robot();

        System.out.println("Dormo 3 secondi");
        //dormo per 3 secondi (ti do il tempo di spostare il mouse nel posto giusto)
        Thread.sleep(3000);

        System.out.println("Ora scrivo");
        for(int i = 0; i < 8; i++) {
            robottino.keyPress(65);
            robottino.keyRelease(65);

            // dormo per 1 secondo
            Thread.sleep(1000);
        }

        System.out.println("Finito!");
    }
}
