
public class MainOggetti03 {
    public static void main(String[] args) {
        CampioneLoL vex = new CampioneLoL("Vex");
        CampioneLoL yuumi = new CampioneLoL("Yuumi");
        CampioneLoL sona = new CampioneLoL("Sona");
        CampioneLoL leona = new CampioneLoL("Leona");

        vex.setDescrizione("Yordle depresso");
        yuumi.setDescrizione("gatto odiato da tutti");
        sona.setDescrizione("musicista mage");
        leona.setDescrizione("tank engager");

        vex.setQ("lancia un proiettile che infligge danni e accelera durante il volo");
        vex.setW("ottiene uno scudo e danneggia i nemici vicini");
        vex.setE("evoca una zona di rallentamento che infligge danni e applica dolore ai nemici");
        vex.setR("spara un proiettile che marchia un campione nemico, rilancia per scattare verso di lui e infliggere danni");

        yuumi.setQ("lancia un proiettile che infligge danni al primo bersaglio colpito");
        yuumi.setW("aumenta passivamente la sua forza adattiva e quella dell'alleato");
        yuumi.setE("cura se stessa e gli alleati");
        yuumi.setR("canalizza sette ondate che infliggono danni e immobilizzano");

        sona.setQ("infligge danni magici a due nemici nelle vicinanze");
        sona.setW("cura lei e un alleato nelle vicinanze");
        sona.setE("conferisce velocità di movimento bonus");
        sona.setR("stordisce i nemici");

        leona.setQ("infligge danni magici e stordisce i nemici");
        leona.setW("alza il suo scudo per ottenere danni, armatura e resistenza magica");
        leona.setE("infligge danni magici a tutti i nemici in una linea");
        leona.setR("infligge danni ai nemici e li stordisce");

        //System.out.println(vex.getName() + ": " + vex.getDescrizione() + ": " + vex.getQ());
        //System.out.println(yuumi.getName() + ": " + yuumi.getDescrizione() + ": " + yuumi.getQ());
        //System.out.println(sona.getName() + ": " + sona.getDescrizione() + ": " + sona.getQ());
        //System.out.println(leona.getName() + ": " + leona.getDescrizione() + ": " + leona.getQ());

        System.out.println(vex.toString());
        System.out.println(yuumi.toString());
        System.out.println(sona.toString());
        System.out.println(leona.toString());
    }
}
