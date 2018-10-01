package modul.spieler;

import modul.ressourcen.Ressource;
import modul.ressourcen.RessourcenMenge;

/**
 * Verwaltet die Ressourcen eines Spielers.
 */
public class RessourcenManager {
    private int lagerKapazitaet;
    private RessourcenMenge ressourcen;

    /**
     * Erzeugt einen RessourcenManager mit der gegebenen Kapazitaet und Ressourcen. Die Kapazitaet
     * gilt fuer jede Ressource einzeln, allerdings nicht fuer Geld.
     * <p>
     * Sie darf, genau wie die Ressourcen, nur positive Werte besitzen, wobei die Ressourcenanzahl
     * die Kapazitaet nicht ueberschreiten darf. Die RessourcenMenge muss jede Ressource enthalten.
     * </p>
     *
     * @param lagerKapazitaet
     *         Die Ausgangskapazitaet
     * @param ressourcen
     *         Die Ausgangsressourcen
     * @throws IllegalArgumentException
     *         Falls negative Werte vorhanden sind
     * @throws NullPointerException
     *         Wenn die gegebene RessourcenMenge null ist
     * @throws ZuVieleRessourcenException
     *         Wenn die Ressourcen die Kapazitaet ueberschreiten
     */
    public RessourcenManager(int lagerKapazitaet, RessourcenMenge ressourcen) throws IllegalArgumentException, NullPointerException, ZuVieleRessourcenException {
        // todo implementieren
    }

    /**
     * Gibt die Ressourcen des RessourcenManagers zurueck.
     *
     * @return Die RessourcenMenge
     */
    public RessourcenMenge getRessourcen() {
        return this.ressourcen;
    }

    /**
     * Fuegt die gegebenen Ressourcen dem RessourcenManager hinzu. Hierbei können die Ressourcen
     * auch Kosten darstellen, indem sie negative Werte enthalten.
     *
     * @param ressourcen
     *         Die RessourcenMenge, die hinzugefuegt wird
     * @return Ob die Ressourcen vollstaendig hinzugefuegt wurden konnten
     * @throws NullPointerException
     *         Wenn die gegebene RessourcenMenge null ist
     * @throws IllegalArgumentException
     *         Falls durch eine negative Aenderung der Bestand einer Ressource unter 0 fallen wuerde
     * @throws ZuVieleRessourcenException
     *         Wenn die Ressourcen die Lagerkapazitaet ueberschreiten wuerden.
     */
    public boolean addRessourcen(RessourcenMenge ressourcen) throws NullPointerException, IllegalArgumentException, ZuVieleRessourcenException {
        // todo implementieren
    }

    /**
     * Gibt die Lagerkapazitaet zurueck. Diese gilt fuer alle Ressourcen ausser Geld.
     *
     * @return Die Lagerkapazitaet
     */
    public int getLagerKapazitaet() {
        return this.lagerKapazitaet;
    }

    /**
     * Erhoeht die LagerKapazitaet des RessourcenManagers. Die Kapazitaet gilt nicht fuer Geld. Der
     * Wert kann auch negativ sein und somit eine Verringerung der Kapazitaet darstellen.
     *
     * @param lagerKapazitaet
     *         Die Lagerkapazitaet, die hinzugefuegt wird
     * @throws IllegalArgumentException
     *         Falls der Wert der Lagerkapazitaet unter 1 geraten wuerde
     * @throws ZuVieleRessourcenException
     *         Falls die Lagerkapazitaet unter bereits vorhandene Ressourcenanzahlen sinken wuerde
     */
    public void addLagerkapazitaet(int lagerKapazitaet) throws IllegalArgumentException, ZuVieleRessourcenException {
        // todo implementieren
    }


}
