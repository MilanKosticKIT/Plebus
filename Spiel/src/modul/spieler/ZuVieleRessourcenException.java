package modul.spieler;

/**
 * Diese Exception gibt an, dass zu viele Ressourcen vorhanden sind, wenn z.B. eine Kapazitaet
 * ueberschritten wuerde.
 */
public class ZuVieleRessourcenException extends IllegalArgumentException {

    /**
     * Erzeugt eine ZuVieleRessourcenException mit einer Fehlernachricht.
     *
     * @param message
     *         Die Fehlermeldung
     */
    public ZuVieleRessourcenException(String message) {
        super(message);
    }

    /**
     * Erzeugt eine ZuVieleRessourcenException.
     */
    public ZuVieleRessourcenException() {
        super();
    }
}
