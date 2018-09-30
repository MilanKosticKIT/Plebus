package modul.spieler;

import modul.gebauede.Gebaeude;

import java.awt.*;
import java.util.PriorityQueue;

/**
 * Das Modell eines Spielers mit dessen Eigenschaften, Gebaeuden und RessourcenManager.
 */
public class Spieler {

    private String name;
    private Color farbe;
    private RessourcenManager ressourcenManager;
    private PriorityQueue<Gebaeude> produktionsListe;
    private GebaeudeListe eigeneGebaeude;

    /**
     * Erzeugt einen Spieler, der bereits Ressourcen und Gebaeude besitzt, die eventuell gerade am
     * Produzieren sind.
     *
     * @param name Der Name des Spielers
     * @param farbe Die Farbe des Spieler
     * @param ressourcenManager Der RessourcenManager des Spielers
     * @param gebaeude Die GebaeudeListe des Spielers
     * @param produktionsListe Die Liste der Gebaeude, die aktuell produzieren
     */
    public Spieler(String name, Color farbe, RessourcenManager ressourcenManager, GebaeudeListe gebaeude, PriorityQueue produktionsListe) {
        // todo implementieren
    }

    /**
     * Erzeugt einen Spieler neu, sodass dieser Ressourcen und Gebaeude besitzt, aber aktuell keine Gebaeude produzieren.
     *
     * @param name Der Name des Spielers
     * @param farbe Die Farbe des Spielers
     * @param ressourcenManager Der RessourcenManager des Spielers
     * @param gebaeude Die GebaeudeListe des Spielers
     */
    public Spieler(String name, Color farbe, RessourcenManager ressourcenManager, GebaeudeListe gebaeude) {
        // todo implementieren
    }

    /**
     * Gibt den Namen des Spielers zurueck.
     *
     * @return Der Name des Spielers
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gibt die Farbe des Spielers zurueck.
     *
     * @return Die Farbe des Spielers
     */
    public Color getFarbe() {
        return this.farbe;
    }

    /**
     * Erhaelt den RessourcenManager dieses Spielers.
     *
     * @return Der RessourcenManager des Spielers
     */
    public RessourcenManager getRessourcenManager() {
        return this.ressourcenManager;
    }

    /**
     * Arbeitet die Produktionsliste ab, sodass bei abgeschlossener Produktion von Ressourcen diese
     * entsprechend verbucht werden.
     */
    public void arbeiteProduktionsListeAb() {
        // todo implementieren
    }

    /**
     * Fuegt ein Gebaeude zur Produktionsliste hinzu, sodass die Produktion gestartet wird.
     *
     * @param gebaeude
     *         Das Gebaeude, das der Liste hinzugefuegt wird
     * @throws NullPointerException
     *         Wenn das gegebene Gebaeude null ist
     */
    public void fuegeGebaeudeZurProduktionsListeHinzu(Gebaeude gebaeude) throws NullPointerException {
        // todo implementieren
    }

    /**
     * Entfernt ein Gebaeude aus der Produktionsliste, sodass die Produktion gestoppt bzw. nicht
     * weiter ueberprueft wird.
     *
     * @param gebaeude
     *         Das Gebaeude, das aus der Liste entfernt wird.
     * @throws IllegalArgumentException
     *         Wenn das Gebaeude nicht in der Produktionsliste vorhanden ist
     * @throws NullPointerException
     *         Wenn die gegebene Referenz null ist
     */
    public void entferneGebaeudeVonProduktionsListe(Gebaeude gebaeude) throws IllegalArgumentException, NullPointerException {
        // todo implementieren
    }


}
