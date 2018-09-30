package modul.gebauede.erzeugergebaeude;

import modul.gebauede.Gebaeude;
import modul.ressourcen.Ressource;
import modul.spieler.Spieler;

/**
 * Ein Gebaeude, das Ressourcen produzieret.
 */
public abstract class ErzeugerGebaeude extends Gebaeude {
    private long produktionAnfangZeitpunkt;
    private long produktionEndeZeitpunkt;
    private long arbeitsfortschritt;

    /**
     * Erstellt ein ErzeugerGebaeude mit den gegebenen Gebaeude- und Produktionsdaten.
     *
     * @param produktionAnfangZeitpunkt
     *         Der Anfangszeitpunkt der Produktion
     * @param produktionEndeZeitpunkt
     *         Der Endzeitpunkt der Produktion
     * @param arbeitsfortschritt
     *         Der Produktionsfortschritt
     * @param x
     *         Die x-Position des Gebaeudes
     * @param y
     *         Die y-Position des Gebaeudes
     * @param stufe
     *         Die aktuelle Verbesserungsstufe
     * @param spieler
     *         Der Besitzer des Gebaeudes
     */
    public ErzeugerGebaeude(long produktionAnfangZeitpunkt, long produktionEndeZeitpunkt, long arbeitsfortschritt, int x, int y, int stufe, Spieler spieler) {
        // todo implementieren
    }

    /**
     * Erstellt ein neues ErzeugerGebaeude ohne bereits vorhandene Produktion.
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
    public ErzeugerGebaeude(int x, int y, int stufe, Spieler spieler) {
        // todo implementieren
    }

    /**
     * Startet die Produktion dieses Erzeugergebaeudes.
     *
     * @return Ob die Produktion gestartet werden konnte, {@code false}, falls die Produktion
     * bereits laeuft.
     */
    public abstract boolean starteProduktion();

    /**
     * Pausiert die aktuelle Produktion.
     *
     * @return Ob die Produktion pausiert werden konnte, {@code false}, falls die Produktion aktuell
     * nicht laeuft.
     */
    public boolean pausiereProduktion() {
        // todo implementieren
    }

    /**
     * Stoppt die Produktion in diesem Gebaeude.
     *
     * @return Ob die Produktion gestoppt werden konnte, {@code false}, falls die Produktion
     * bereits gestoppt ist.
     */
    public boolean stoppeProduktion() {
        // todo implementieren
    }

    /**
     * Beenndet die aktuelle Produktion und verbucht die erzeugten Ressourcen.
     *
     * @return Ob die Produktion erfolgreich beendent werden konnte, {@code false}, falls der
     * Produktionsfortschritt nicht ausreicht.
     */
    public abstract void vollendeProduktion();

    /**
     * Liefert den aktuellen prozentualen Produktionsfortschritt.
     *
     * @return Der Prozentuale Produktionsfortschritt (Zwischen 0 und 1).
     */
    public double getProduktionsFortschritt() {
        //todo implementieren
    }

    /**
     * Gibt zurueck, ob die Produktion aktuell pausiert ist.
     *
     * @return Ob die Produktion pausiert ist
     */
    public boolean istProduktionPausier() {
        // todo implementieren
    }

    /**
     * Die Produktionsmenge der erzeugten Ressource.
     *
     * @return Die Menge der produzierten Ressource.
     */
    public abstract int getProduktionsVolumen();

    public abstract Ressource getProdukt();
}
