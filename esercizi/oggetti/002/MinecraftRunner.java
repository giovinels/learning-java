import java.awt.*;

public class MinecraftRunner {
    /**
     * Proviamo ad utilizzare degli oggetti prefatti dagli sviluppatori di Java.
     * Il sito di documentazione si trova a: https://docs.oracle.com/javase/9/docs/api/overview-summary.html
     * @param args
     */
    public static void main(String[] args) throws AWTException, InterruptedException { /* per throws AWTException guardare la parte del lancio di eccezioni (se l'hai fatta)*/
        Robot robottino = new Robot();

        System.out.println("Dormo 3 secondi, poi vado avanti per 5, infine esco");
        //dormo per 3 secondi (ti do il tempo di spostare il mouse nel posto giusto)
        Thread.sleep(3000);

        //premo W (ovvero 119) per andare avanti
        robottino.keyPress(87);

        //aspetto 5 secondi
        Thread.sleep(5000);

        //smetto di premere W per fermarmi
        robottino.keyRelease(87);

        System.out.println("Finito!");
    }
}