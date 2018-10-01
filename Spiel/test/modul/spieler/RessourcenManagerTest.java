package modul.spieler;

import modul.ressourcen.Ressource;
import modul.ressourcen.RessourcenMenge;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class RessourcenManagerTest {

    private RessourcenManager rm;

    /**
     * Setzt den RessourcenManager zurueck auf null.
     *
     * @throws Exception
     *         Aufgetretene Exceptions
     */
    @After
    public void tearDown() throws Exception {
        rm = null;
    }

    /**
     * Konstruktor-Test mit allen Ressourcen mit Werten zwischen 0 und Kapazitaet = 100.
     */
    @Test
    public void RessourcenManagerTest1() {
        rm = new RessourcenManager(100, new RessourcenMenge(Map.of(Ressource.Geld, 10, Ressource.Brot, 20, Ressource.Fisch, 60, Ressource.Holz, 30, Ressource.Stein, 50)));
        assertNotNull(rm);
    }

    /**
     * Konstruktor-Test mit allen Ressourcen mit Werten zwischen 0 und Kapazitaet = 10.
     */
    @Test
    public void RessourcenManagerTest2() {
        rm = new RessourcenManager(10, new RessourcenMenge(Map.of(Ressource.Geld, 5, Ressource.Brot, 6, Ressource.Fisch, 4, Ressource.Holz, 3, Ressource.Stein, 9)));
        assertNotNull(rm);
    }

    /**
     * Konstruktor-Test mit allen Ressourcen mit Werten zwischen 0 und Kapazitaet = 10.
     * 0 und Kapazitaet sind auch vorhanden.
     */
    @Test
    public void RessourcenManagerTest3() {
        rm = new RessourcenManager(10, new RessourcenMenge(Map.of(Ressource.Geld, 5, Ressource.Brot, 0, Ressource.Fisch, 4, Ressource.Holz, 10, Ressource.Stein, 8)));
        assertNotNull(rm);
    }

    /**
     * Konstruktor-Test mit Geld ueber Kapazitaet.
     */
    @Test
    public void RessourcenManagerTest4() {
        rm = new RessourcenManager(10, new RessourcenMenge(Map.of(Ressource.Geld, 500, Ressource.Brot, 3, Ressource.Fisch, 4, Ressource.Holz, 5, Ressource.Stein, 8)));
        assertNotNull(rm);
    }

    /**
     * Konstruktor-Test mit ungueltigen Werten. Die Ressourcen sind zum Teil negativ.
     */
    @Test(expected = IllegalArgumentException.class)
    public void RessourcenManagerTest5() {
        rm = new RessourcenManager(10, new RessourcenMenge(Map.of(Ressource.Geld, 5, Ressource.Brot, -6, Ressource.Fisch, 4, Ressource.Holz, -3, Ressource.Stein, 9)));
    }

    /**
     * Konstruktor-Test mit ungueltigen Werten. Die Kapazitaet ist negativ.
     */
    @Test(expected = IllegalArgumentException.class)
    public void RessourcenManagerTest6() {
        rm = new RessourcenManager(-10, new RessourcenMenge(Map.of(Ressource.Geld, 5, Ressource.Brot, 6, Ressource.Fisch, 4, Ressource.Holz, 3, Ressource.Stein, 9)));
    }

    /**
     * Konstruktor-Test mit ungueltigen Werten. Die Ressourcen ueberschreiten zum Teil die
     * Kapazitaet.
     */
    @Test(expected = ZuVieleRessourcenException.class)
    public void RessourcenManagerTest7() {
        rm = new RessourcenManager(10, new RessourcenMenge(Map.of(Ressource.Geld, 5, Ressource.Brot, 6, Ressource.Fisch, 4, Ressource.Holz, 3, Ressource.Stein, 11)));
    }

    /**
     * Konstruktor-Test mit ungueltigen Werten. Es sind nicht alle Ressourcen vorhanden.
     */
    @Test(expected = IllegalArgumentException.class)
    public void RessourcenManagerTest8() {
        rm = new RessourcenManager(10, new RessourcenMenge(Map.of(Ressource.Brot, 6, Ressource.Fisch, 4, Ressource.Holz, 3, Ressource.Stein, 11)));
    }

    /**
     * Konstruktor-Test mit ungueltigen Werten. Es sind nicht alle Ressourcen vorhanden.
     */
    @Test(expected = IllegalArgumentException.class)
    public void RessourcenManagerTest9() {
        rm = new RessourcenManager(10, new RessourcenMenge(Map.of(Ressource.Brot, 6, Ressource.Fisch, 4, Ressource.Geld, 9)));
    }

    /**
     * Konstruktor-Test mit ungueltigen Werten. Die RessourcenMenge ist nicht angegeben.
     */
    @Test(expected = NullPointerException.class)
    public void RessourcenManagerTest10() {
        rm = new RessourcenManager(10, null);
    }

    /**
     * Test fuer getRessourcen, ob eine RessourcenMenge != null zurueckgegeben wird.
     */
    @Test
    public void getRessourcenTest1() {
        rm = new RessourcenManager(10, new RessourcenMenge(Map.of(Ressource.Geld, 500, Ressource.Brot, 3, Ressource.Fisch, 4, Ressource.Holz, 5, Ressource.Stein, 8)));
        assertNotNull(rm.getRessourcen());
    }

    /**
     * Test fuer getRessourcen, bei dem die erhaltene Menge verglichen wird.
     */
    @Test
    public void getRessourcenTest2() {
        RessourcenMenge ressourcenMenge = new RessourcenMenge(Map.of(Ressource.Geld, 500, Ressource.Brot, 3, Ressource.Fisch, 4, Ressource.Holz, 5, Ressource.Stein, 8));
        rm = new RessourcenManager(10, ressourcenMenge);
        assertEquals(ressourcenMenge, rm.getRessourcen());
    }

    @Test
    public void addRessourcen() {// todo tests schreiben
    }

    /**
     * Test fuer getLagerKapazitaet.
     */
    @Test
    public void getLagerKapazitaetTest1() {
        rm = new RessourcenManager(10, new RessourcenMenge(Map.of(Ressource.Geld, 5, Ressource.Brot, 3, Ressource.Fisch, 4, Ressource.Holz, 5, Ressource.Stein, 8)));
        assertEquals(10, rm.getLagerKapazitaet());
    }

    /**
     * Test fuer getLagerKapazitaet.
     */
    @Test
    public void getLagerKapazitaetTest2() {
        rm = new RessourcenManager(123456, new RessourcenMenge(Map.of(Ressource.Geld, 500, Ressource.Brot, 3, Ressource.Fisch, 4, Ressource.Holz, 5, Ressource.Stein, 8)));
        assertEquals(123456, rm.getLagerKapazitaet());
    }

    /**
     * Test fuer addLagerKapazitaet mit 10 + 10.
     */
    @Test
    public void addLagerKapazitaetTest1() {
        rm = new RessourcenManager(10, new RessourcenMenge(Map.of(Ressource.Geld, 5, Ressource.Brot, 3, Ressource.Fisch, 4, Ressource.Holz, 5, Ressource.Stein, 8)));
        rm.addLagerkapazitaet(10);
        assertEquals(20, rm.getLagerKapazitaet());
    }

    /**
     * Test fuer addLagerKapazitaet mit 10 - 5. Die Ressourcen sind in ausreichend geringer Anzahl
     * vorhanden (<= 5).
     */
    @Test
    public void addLagerKapazitaetTest2() {
        rm = new RessourcenManager(10, new RessourcenMenge(Map.of(Ressource.Geld, 5, Ressource.Brot, 3, Ressource.Fisch, 4, Ressource.Holz, 5, Ressource.Stein, 2)));
        rm.addLagerkapazitaet(-5);
        assertEquals(5, rm.getLagerKapazitaet());
    }

    /**
     * Test mit ungueltigem Wert fuer addLagerKapazitaet mit 10 - 15.
     */
    @Test(expected = IllegalArgumentException.class)
    public void addLagerKapazitaetTest3() {
        rm = new RessourcenManager(10, new RessourcenMenge(Map.of(Ressource.Geld, 5, Ressource.Brot, 3, Ressource.Fisch, 4, Ressource.Holz, 5, Ressource.Stein, 2)));
        rm.addLagerkapazitaet(-15);
    }

    /**
     * Test fuer addLagerKapazitaet mit 10 - 5. Die Ressourcen sind in groesserer Anzahl
     * vorhanden als die verringerte Kapazitaet.
     */
    @Test(expected = ZuVieleRessourcenException.class)
    public void addLagerKapazitaetTest4() {
        rm = new RessourcenManager(10, new RessourcenMenge(Map.of(Ressource.Geld, 7, Ressource.Brot, 3, Ressource.Fisch, 9, Ressource.Holz, 5, Ressource.Stein, 2)));
        rm.addLagerkapazitaet(-5);
    }

}