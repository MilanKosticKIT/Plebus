package modul.gebauede;

import modul.ressourcen.RessourcenMenge;
import modul.spieler.Spieler;

import java.util.Map;

/**
 * Ein Gebaeude, das Lagerkapazitaet besitzt bzw. fuer die Lagerung von Ressourcen benutzt wird.
 */
public class Lagerhaus {
    private static Map<Integer, Integer> lagerKapazitaet;
    private static Map<Integer, RessourcenMenge> verbesserungskosten;


    /**
     * Erstellt ein neues Lagerhaus.
     *
     * @param x
     *         Die x-Position des Gebaeudes
     * @param y
     *         Die y-Position des Gebaeudes
     * @param stufe
     *         Die aktuelle Verbesserungsstufe
     * @param spieler
     *         Der Besitzer des Gebaeudes
     */
    public Lagerhaus(int x, int y, int stufe, Spieler spieler) {
        // todo implementieren
    }

    /**
     * Gibt die RessourcenMenge zurueck, die fuer den Bau des Lagerhauses benutzt werden soll.
     * Hierbei enthaelt die RessourcenMenge Kosten, also negative Resscourcen.
     *
     * @return Die Kosten als RessourcenMenge
     */
    public static RessourcenMenge getBaukosten() {
        //todo implementieren
    }

    /**
     * Gibt die aktuelle Kapazitaet dieses Lagerhauses zurueck.
     *
     * @return Die Lagerkapazitaet
     */
    public int getLagerKapazitaet() {
        // todo implementieren
    }
}
