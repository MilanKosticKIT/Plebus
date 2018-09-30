package modul.gebauede.erzeugergebaeude;

import modul.ressourcen.RessourcenMenge;
import modul.spieler.Spieler;

import java.util.Map;

/**
 * Ein Erzeugergebaeude fuer Fisch (Nahrung).
 */
public class Fischerei {
    private static Map<Integer, RessourcenMenge> verbesserungsKosten;
    private static Map<Integer, RessourcenMenge> produktionsWerte;
    private Map<Integer, Long> produktionsdauer;

    /**
     * Erstellt eine Fischerei mit den gegebenen Gebaeude- und Produktionsdaten.
     *
     * @param produktionAnfangZeitpunkt
     *         Der Anfangszeitpunkt der Produktion
     * @param produktionEndeZeitpunkt
     *         Der Endzeitpunkt der Produktion
     * @param arbeitsfortschritt
     *         Der Produktionsfortschritt
     * @param x
     *         Die x-Position der Fischerei
     * @param y
     *         Die y-Position der Fischerei
     * @param stufe
     *         Die aktuelle Verbesserungsstufe
     * @param spieler
     *         Der Besitzer der Fischerei
     */
    public Fischerei(long produktionAnfangZeitpunkt, long produktionEndeZeitpunkt, long arbeitsfortschritt, int x, int y, int stufe, Spieler spieler) {
        // todo implementieren
    }

    /**
     * Erstellt eine neue Fischerei ohne bereits vorhandene Produktion.
     *
     * @param x
     *         Die x-Position der Fischerei
     * @param y
     *         Die y-Position der Fischerei
     * @param stufe
     *         Die aktuelle Verbesserungsstufe
     * @param spieler
     *         Der Besitzer der Fischerei
     */
    public Fischerei(int x, int y, int stufe, Spieler spieler) {
        // todo implementieren
    }

    /**
     * Gibt die RessourcenMenge zurueck, die fuer den Bau der Fischerei benutzt werden soll.
     * Hierbei enthaelt die RessourcenMenge Kosten, also negative Resscourcen.
     *
     * @return Die Kosten als RessourcenMenge
     */
    public static RessourcenMenge getBaukosten() {
        //todo implementieren
    }

}
