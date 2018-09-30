package modul.gebauede.erzeugergebaeude;

import modul.ressourcen.RessourcenMenge;
import modul.spieler.Spieler;

import java.util.Map;

/**
 * Ein Erzeugergebaeude fuer Holz.
 */
public class Holzfaeller {
    private static Map<Integer, RessourcenMenge> verbesserungsKosten;
    private static Map<Integer, RessourcenMenge> produktionsWerte;
    private Map<Integer, Long> produktionsdauer;

    /**
     * Erstellt einen Holzfaeller mit den gegebenen Gebaeude- und Produktionsdaten.
     *
     * @param produktionAnfangZeitpunkt
     *         Der Anfangszeitpunkt der Produktion
     * @param produktionEndeZeitpunkt
     *         Der Endzeitpunkt der Produktion
     * @param arbeitsfortschritt
     *         Der Produktionsfortschritt
     * @param x
     *         Die x-Position des Holzfaellers
     * @param y
     *         Die y-Position des Holzfaellers
     * @param stufe
     *         Die aktuelle Verbesserungsstufe
     * @param spieler
     *         Der Besitzer des Holzfaellers
     */
    public Holzfaeller(long produktionAnfangZeitpunkt, long produktionEndeZeitpunkt, long arbeitsfortschritt, int x, int y, int stufe, Spieler spieler) {
        // todo implementieren
    }

    /**
     * Erstellt einen neuen Holzfaeller ohne bereits vorhandene Produktion.
     *
     * @param x
     *         Die x-Position des Holzfaellers
     * @param y
     *         Die y-Position des Holzfaellers
     * @param stufe
     *         Die aktuelle Verbesserungsstufe
     * @param spieler
     *         Der Besitzer des Holzfaellers
     */
    public Holzfaeller(int x, int y, int stufe, Spieler spieler) {
        // todo implementieren
    }

    /**
     * Gibt die RessourcenMenge zurueck, die fuer den Bau des Holzfaellers benutzt werden soll.
     * Hierbei enthaelt die RessourcenMenge Kosten, also negative Resscourcen.
     *
     * @return Die Kosten als RessourcenMenge
     */
    public static RessourcenMenge getBaukosten() {
        //todo implementieren
    }

}
