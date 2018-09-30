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
     * Erzeugt einen RessourcenManager mit der gegebenen Kapazitaet und Ressourcen.
     *
     * @param lagerKapazitaet Die Ausgangskapazitaet
     * @param ressourcen Die Ausgangsressourcen
     */
    public RessourcenManager(int lagerKapazitaet, RessourcenMenge ressourcen) {
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
     * auch Kosten darstellen, indem sich negative Werte enthalten.
     *
     * @param ressourcen
     *         Die RessourcenMenge, die hinzugefuegt wird
     * @throws NullPointerException Wenn die gegebene RessourcenMenge null ist
     * @throws IllegalArgumentException todo restliches javadoc
     */
    public void addRessourcen(RessourcenMenge ressourcen) throws NullPointerException, IllegalArgumentException {
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
     * Erhoeht die LagerKapazitaet des RessourcenManagers. Die Kapazitaet gilt nicht fuer Geld.
     *
     * @param lagerKapazitaet Die Lagerkapazitaet, die hinzugefuegt wird
     */
    public void addLagerkapazitaet(int lagerKapazitaet) {
        // todo implementieren
    }


}
