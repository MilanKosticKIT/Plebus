package modul.gebauede;

import modul.ressourcen.Ressource;
import modul.ressourcen.RessourcenMenge;
import modul.spieler.Spieler;

import java.util.Map;

/**
 * Ein Wohnhaus, das Bewohner besitzt, die Geld produzieren und Nahrung verbrauchen.
 */
public class Wohnhaus {
    private static Map<Integer, RessourcenMenge> verbesserungsKosten;
    private long produktionAnfangZeitpunkt;
    private long produktionEndeZeitpunkt;
    private int bewohnerAnzahl;
    private static Map<Integer, Integer> bewohnerInStufe;
    private static Map<Integer, Integer> bewohnerKonsum;

    /**
     * Erstellt ein Wohnhaus mit der gegebenen Bewohneranzahl und Gebaeude- und Produktionsdaten.
     *
     * @param bewohnerAnzahl
     *         Die Anzahl der Bewohner
     * @param produktionAnfangZeitpunkt
     *         Der Anfangszeitpunkt der Produktion
     * @param produktionEndeZeitpunkt
     *         Der Endzeitpunkt der Produktion
     * @param x
     *         Die x-Position des Wohnhauses
     * @param y
     *         Die y-Position des Wohnhauses
     * @param stufe
     *         Die aktuelle Verbesserungsstufe
     * @param spieler
     *         Der Besitzer des Wohnhauses
     */
    public Wohnhaus(int bewohnerAnzahl, long produktionAnfangZeitpunkt, long produktionEndeZeitpunkt, int x, int y, int stufe, Spieler spieler) {
        // todo implementieren
    }

    /**
     * Erstellt ein neues Wohnhaus ohne bereits vorhandene Produktion bzw. Bewohner.
     *
     * @param x
     *         Die x-Position des Wohnhauses
     * @param y
     *         Die y-Position des Wohnhauses
     * @param stufe
     *         Die aktuelle Verbesserungsstufe
     * @param spieler
     *         Der Besitzer des Wohnhauses
     */
    public Wohnhaus(int x, int y, int stufe, Spieler spieler) {
        // todo implementieren
    }

    /**
     * Gibt die RessourcenMenge zurueck, die fuer den Bau des Wohnhauses benutzt werden soll.
     * Hierbei enthaelt die RessourcenMenge Kosten, also negative Resscourcen.
     *
     * @return Die Kosten als RessourcenMenge
     */
    public static RessourcenMenge getBaukosten() {
        //todo implementieren
    }

    /**
     * Liefert den Konsum eines Bewohners.
     *
     * @return Den Konsum eines Bewohners
     */
    public int getBewohnerKonsum() {
        // todo implementieren
    }

    /**
     * Startet die Produktion dieses Wohnhauses.
     *
     * @return Ob die Produktion gestartet werden konnte, {@code false}, wenn die Produktion bereits laeuft.
     */
    public boolean starteProduktion() {
        // todo implementieren
    }

    /**
     * Schliesst die Produktion ab und verbucht die Produzierten Ressourcen.
     *
     * @return Ob die Produktion beendet werden konnte, {@code false}, wenn die Produktion nicht laeuft.
     */
    public boolean vollendeProduktion() {
        // todo implementieren
    }

    /**
     * Gibt den Gesamtverbrauch an Nahrung des Wohnhauses zurueck. Da es verschiedene Nahrungsmittel
     * gibt, muessen diese separat herausgesucht und entfernt werden.
     *
     * @return Der Verbrauch dieses Wohnhauses
     */
    public int getVerbrauch() {
        // todo implementieren
    }

    /**
     * Die Produktionsmenge der erzeugten Ressource.
     *
     * @return Die Menge der produzierten Ressource.
     */
    public int getProduktionsVolumen() {
       // todo implementieren
    }

    /**
     * Liefert die Ressource, die dieses Gebaeude produziert.
     *
     * @return Die produzierte Ressource
     */
    public Ressource getProdukt() {
        // todo implementieren
    }

    /**
     * Gibt die Anzahl der aktuellen Bewohner in diesem Wohnhaus zurueck
     *
     * @return Die Bewohneranzahl
     */
    public int getBewohnerAnzahl() {
        // todo implementieren
    }
}
