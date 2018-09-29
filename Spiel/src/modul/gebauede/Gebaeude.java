package modul.gebauede;

import modul.karte.Untergrund;
import modul.ressourcen.RessourcenMenge;
import modul.spieler.Spieler;

import java.util.Set;

/**
 * Eine abstrakte Repraesentation eines Gebaeudes, das von einem Spieler gebaut und verbessert
 * werden kann.
 */
public abstract class Gebaeude {
    // Die Groesse und Position des Gebaeudes auf der Karte
    private int hoeheY;
    private int breteX;
    private int positionY;
    private int positionX;
    // Die aktuelle Verbesserungsstufe des Gebaeudes
    private int gebauedeStufe;
    // Der Spieler, der das Gebaeude besitzt
    private Spieler besitzenderSpieler;

    /**
     * Gibt die Ressourcenkosten fuer die Verbesserung des Gebaeudes zur naechsten Stufe zurueck.
     * <p>
     * Ressourcenkosten werden als Ressourcenmenge mit negativen Ressourcen modelliert.
     *
     * @return Die Verbesserungskosten als RessourcenMenge
     */
    public abstract RessourcenMenge getVerbesserungsKosten();

    /**
     * Gibt die Menge der Untergruende zurueck, auf denen das Gebaeude gebaut werden darf.
     *
     * @return Ein Set, das die moeglichen Untergruende enthaelt
     */
    public abstract Set<Untergrund> getBaugrundTypen();

    /**
     * Gibt den Spieler zurueck, dem das Gebaeude gehoert.
     *
     * @return Der Spieler, der das Gebaeude besitzt
     */
    public Spieler getBesitzenderSpieler() {
        //TODO Methode implementieren
        return;
    }

    /**
     * Erhoeht die Stufe des Gebaeudes um 1.
     */
    public void stufeErhoehen() {
        //TODO Methode implementieren
    }

}
