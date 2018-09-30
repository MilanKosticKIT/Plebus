package modul.karte;

import modul.gebauede.Gebaeude;

/**
 * Ein einzelnes Feld auf der Karte.
 */
public class Rasterfeld {
    private Untergrund untergrund;
    private Gebaeude gebautesGebaeude;

    /**
     * Erstellt ein Rasterfeld mit dem gegebenen Untergrund.
     *
     * @param untergrund Der Untergrund
     */
    public Rasterfeld(Untergrund untergrund) {
        // todo implementieren
    }

    /**
     * Gibt den Untergrund des Felds zurueck.
     *
     * @return Der Untergrund
     */
    public Untergrund getUntergrund() {
        return untergrund;
    }

    /**
     * Gibt das Gebaeude zurueck, das auf diesem Feld gebaut ist.
     *
     * @return Das Gebaeude auf diesem Feld, {@code null} wenn kein Gebaeude auf dem Feld steht.
     */
    public Gebaeude getGebaeude() {
        // todo implementieren
    }

    /**
     * Setzt das Gebaeude, das auf diesem Rasterfeld gebaut ist.
     *
     * @param gebaeude Das Gebaeude, dass auf diesem Feld gebaut wurde, oder {@code null}.
     */
    public void setGebaeude(Gebaeude gebaeude) {
        // todo implementieren
    }

    /**
     * Entfernt das Gebaeude auf diesem Feld, sodass das Feld danach leer ist.
     */
    public void deleteGebaeude() {
        // todo implementieren
    }
}
