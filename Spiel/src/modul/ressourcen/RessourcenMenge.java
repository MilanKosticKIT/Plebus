package modul.ressourcen;

import java.util.Map;

/**
 * Eine Sammlung verschiedener Ressourcen in unterschiedlicher Anzahl.
 */
public class RessourcenMenge {
    // Map mit <Ressource, Anzahl>
    private Map<Ressource, Integer> ressourcen;

    /**
     * Erstellt eine RessourcenMenge aus den gegebenen Ressourcen.
     * <p>
     * Eine RessourcenMenge kann z.B einen Status oder eine Aenderung darstellen, daher sind
     * positive und negative Zahlen moeglich.
     * <p>
     *
     * @param ressourcen
     *         Eine Map mit allen Ressourcen als Key und deren Anzahl als Value
     * @throws NullPointerException
     *         Wenn die uebergebene Map null ist
     * @throws IllegalArgumentException
     *         Wenn die uebergebene Map leer ist
     */
    public RessourcenMenge(Map<Ressource, Integer> ressourcen) throws IllegalArgumentException, NullPointerException {
        //TODO Methode implementieren
    }

    /**
     * Gibt die Anzahl zurueck, in der die uebergebene Ressource in dieser RessourcenMenge vorliegt.
     * <p>
     * Wenn die Ressource nicht in dieser RessourcenMenge existiert, so wird 0 zurueckgegeben.
     *
     * @param ressource
     *         Die Ressource, dessen Anzahl zurueckgegeben wird
     * @return Die Anzahl der Ressource
     */
    public int getRessource(Ressource ressource) {
        //TODO Methode implementieren
        return;
    }

    /**
     * Fuegt eine Ressource in der gegebenen Anzahl dieser RessourcenMenge hinzu.
     * <p>
     * Der Angegebene Wert wird mit dem in der RessourcenMenge vorhandenem Wert verrechnet und es
     * koennen nur Ressourcen hinzugefuegt werden, die bereits in der RessourcenMenge vorhanden
     * sind.
     *
     * @param ressource
     *         Die Ressource, die hinzugefuegt wird
     * @param anzahl
     *         Die Anzahl der Ressource
     * @throws IllegalArgumentException
     *         Falls die angegebene Ressource nicht in der RessourcenMenge vorhanden ist.
     */
    public void addRessource(Ressource ressource, int anzahl) throws IllegalArgumentException {
        //TODO Methode implementieren.
    }
}
