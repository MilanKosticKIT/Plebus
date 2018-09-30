package modul.gebauede.erzeugergebaeude;

import modul.ressourcen.RessourcenMenge;
import modul.spieler.Spieler;

import java.util.Map;

/**
 * Ein Erzeugergebaeude fuer Stein.
 */
public class Steinbruch {
    private static Map<Integer, RessourcenMenge> verbesserungsKosten;
    private static Map<Integer, RessourcenMenge> produktionsWerte;
    private Map<Integer, Long> produktionsdauer;

    /**
     * Erstellt einen Steinbruch mit den gegebenen Gebaeude- und Produktionsdaten.
     *
     * @param produktionAnfangZeitpunkt
     *         Der Anfangszeitpunkt der Produktion
     * @param produktionEndeZeitpunkt
     *         Der Endzeitpunkt der Produktion
     * @param arbeitsfortschritt
     *         Der Produktionsfortschritt
     * @param x
     *         Die x-Position des Steinbruchs
     * @param y
     *         Die y-Position des Steinbruchs
     * @param stufe
     *         Die aktuelle Verbesserungsstufe
     * @param spieler
     *         Der Besitzer des Steinbruchs
     */
    public Steinbruch(long produktionAnfangZeitpunkt, long produktionEndeZeitpunkt, long arbeitsfortschritt, int x, int y, int stufe, Spieler spieler) {
        // todo implementieren
    }

    /**
     * Erstellt einen neuen Steinbruch ohne bereits vorhandene Produktion.
     *
     * @param x
     *         Die x-Position des Steinbruchs
     * @param y
     *         Die y-Position des Steinbruchs
     * @param stufe
     *         Die aktuelle Verbesserungsstufe
     * @param spieler
     *         Der Besitzer des Steinbruchs
     */
    public Steinbruch(int x, int y, int stufe, Spieler spieler) {
        // todo implementieren
    }

    /**
     * Gibt die RessourcenMenge zurueck, die fuer den Bau des Steinbruchs benutzt werden soll.
     * Hierbei enthaelt die RessourcenMenge als Kosten, also negative Resscourcen.
     *
     * @return Die Kosten als RessourcenMenge
     */
    public static RessourcenMenge getBaukosten() {
        //todo implementieren
    }

}
