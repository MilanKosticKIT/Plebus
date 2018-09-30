package modul.spieler;

import modul.gebauede.Gebaeude;
import modul.gebauede.GebaeudeTyp;

import java.util.List;
import java.util.Map;

/**
 * Eine Ansammlung von verschiedenen Gebaeuden. Wird verwendent, um alle Gebaeude eines Spielers zu speichern.
 */
public class GebaeudeListe {
    private Map<GebaeudeTyp, List<? extends Gebaeude>> gebaeudeSpeicher;

    /**
     * Erstellt eine leere GebaeudeListe.
     */
    public GebaeudeListe() {
        // todo implementieren
    }

    /**
     * Fuegt ein Gebaeude der GebaeudeListe hinzu. Der Typ des Gebaeudes muss hierbei angegeben werden.
     *
     * @param typ Der GebaeudeTyp
     * @param gebaeude Das Gebaeude, das hinzugefuegt wird
     * @throws NullPointerException Wenn das Gebaeude null ist
     * @throws IllegalArgumentException Wenn der GebaeudeTyp nicht dem Gebaeude entspricht
     */
    public void addGebaeude(GebaeudeTyp typ, Gebaeude gebaeude) throws NullPointerException, IllegalArgumentException {
        // todo implementieren
    }

    /**
     * Entfernt ein Gebaeude aus der GebaeudeListe. Der Typ des Gebaeudes muss hierbei angegeben werden.
     *
     * @param typ Der GebaeudeTyp
     * @param gebaeude Das Gebaeude, das entfernt wird
     * @throws NullPointerException Wenn das angegebene Gebaeude null ist
     * @throws IllegalArgumentException Wenn der GebaeudeTyp nicht dem Gebaeude entspricht
     */
    public void removeGebaeude(GebaeudeTyp typ, Gebaeude gebaeude) throws NullPointerException, IllegalArgumentException {
        // todo implementieren
    }

    /**
     * Gibt eine Liste von allen Gebaeuden des angegebenen Typs zurueck.
     *
     * @param typ Der GebaeudeTyp
     * @return Eine {@code List<? extends Gebaeude>} des entsprechenden Typs
     */
    public List<? extends Gebaeude> getGebaeudeListeDesTyps(GebaeudeTyp typ) {
        // todo implementieren
    }
}
