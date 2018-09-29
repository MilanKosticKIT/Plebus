package modul.gebauede;

import modul.spieler.Spieler;

import java.util.Map;

public abstract class Gebaeude {

    private int hoeheY;
    private int breteX;
    private int positionY;
    private int positionX;
    private int gebauedeStufe;
    private Map<int, Ressourcenmenge> verbesserungsKosten;
    private Spieler besitzenderSpieler;

}
