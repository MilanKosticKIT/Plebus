package modul.ressourcen;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Test Klasse fuer RessourcenMenge.
 */
public class RessourcenMengeTest {

    private RessourcenMenge rm;

    /**
     * Nicht "@before", da nicht ueberall vewendet.
     *
     * @throws Exception
     *         Aufgetretene Exceptions
     */
    public void setUp() throws Exception {
        rm = new RessourcenMenge(Map.of(Ressource.Holz, 10, Ressource.Stein, 100, Ressource.Geld, 300));
    }

    /**
     * Setzt die in den Tests benutzte RessourcenMenge zurueck auf null.
     *
     * @throws Exception
     *         Aufgetretene Exceptions
     */
    @org.junit.After
    public void tearDown() throws Exception {
        rm = null;
    }

    /**
     * Konstruktor-Test mit 10 Holz, 100 Stein und 300 Geld.
     */
    @org.junit.Test
    public void RessoucenMengeTest1() {
        rm = new RessourcenMenge(Map.of(Ressource.Holz, 10, Ressource.Stein, 100, Ressource.Geld, 300));
        assertNotNull(rm);
    }

    /**
     * Konstruktor-Test mit 300 Fisch.
     */
    @org.junit.Test
    public void RessoucenMengeTest2() {
        rm = new RessourcenMenge(Map.of(Ressource.Fisch, 300));
        assertNotNull(rm);
    }

    /**
     * Konstruktor-Test mit -20 Brot und 0 Geld.
     */
    @org.junit.Test
    public void RessoucenMengeTest3() {
        rm = new RessourcenMenge(Map.of(Ressource.Brot, -20, Ressource.Geld, 30));
        assertNotNull(rm);
    }

    /**
     * Konstruktor-Test mit null.
     */
    @org.junit.Test(expected = NullPointerException.class)
    public void RessourcenMengeTest4() {
        rm = new RessourcenMenge(null);
    }

    /**
     * Konstruktor-Test mit leerer Map.
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void RessoucenMengeTest5() {
        rm = new RessourcenMenge(new HashMap<>());
    }

    /**
     * Konstruktor-Test mit einer Map, in der Ressourcen nur in der Menge 0 vorliegen.
     */
    @org.junit.Test()
    public void RessoucenMengeTest6() {
        rm = new RessourcenMenge(Map.of(Ressource.Geld, 0, Ressource.Brot, 0));
        assertNotNull(rm);
    }

    /**
     * Konstruktor-Test mit allen Ressourcen (100 Brot, -1000 Fisch, 10_000 Stein, -100_000 Holz und
     * 1_000_000 Geld).
     */
    @org.junit.Test
    public void RessoucenMengeTest7() {
        rm = new RessourcenMenge(Map.of(Ressource.Brot, 100, Ressource.Fisch, -1000, Ressource.Stein, 10_000, Ressource.Holz, -100_000, Ressource.Geld, 1_000_000));
        assertNotNull(rm);
    }

    /**
     * Test fuer getRessource mit 10 Brot.
     */
    @org.junit.Test
    public void getRessource1() {
        rm = new RessourcenMenge(Map.of(Ressource.Brot, 10));
        assertEquals(10, rm.getRessource(Ressource.Brot));
    }

    /**
     * Test fuer getRessource mit -1 Holz.
     */
    @org.junit.Test
    public void getRessource2() {
        rm = new RessourcenMenge(Map.of(Ressource.Holz, -1));
        assertEquals(-1, rm.getRessource(Ressource.Holz));
    }

    /**
     * Test fuer getRessource mit 0 Fisch.
     */
    @org.junit.Test
    public void getRessource3() {
        rm = new RessourcenMenge(Map.of(Ressource.Holz, 1, Ressource.Fisch, 0));
        assertEquals(0, rm.getRessource(Ressource.Fisch));
    }

    /**
     * Test fuer getRessource mit nicht vorhandenem Geld.
     */
    @org.junit.Test
    public void getRessource4() {
        rm = new RessourcenMenge(Map.of(Ressource.Holz, 1, Ressource.Fisch, 3));
        assertEquals(0, rm.getRessource(Ressource.Geld));
    }

    /**
     * Test fuer getRessource mit allen Ressourcen.
     */
    @org.junit.Test
    public void getRessource5() {
        rm = new RessourcenMenge(Map.of(Ressource.Brot, 1, Ressource.Fisch, 2, Ressource.Holz, 3, Ressource.Stein, -4, Ressource.Geld, 5));
        assertEquals(1, rm.getRessource(Ressource.Brot));
        assertEquals(2, rm.getRessource(Ressource.Fisch));
        assertEquals(3, rm.getRessource(Ressource.Holz));
        assertEquals(-4, rm.getRessource(Ressource.Stein));
        assertEquals(5, rm.getRessource(Ressource.Geld));
    }

    /**
     * Test fuer Hinzufuegen von Ressource mit 1 Brot.
     */
    @org.junit.Test
    public void addRessource1() {
        rm = new RessourcenMenge(Map.of(Ressource.Brot, 1));
        rm.addRessource(Ressource.Brot, 1);
        assertEquals(2, rm.getRessource(Ressource.Brot));
    }

    /**
     * Test fuer Hinzufuegen von Ressource mit -3 Stein.
     */
    @org.junit.Test
    public void addRessource2() {
        rm = new RessourcenMenge(Map.of(Ressource.Stein, 10));
        rm.addRessource(Ressource.Stein, -3);
        assertEquals(7, rm.getRessource(Ressource.Stein));
    }

    /**
     * Test fuer Hinzufuegen von nicht vorhandener Ressource.
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void addRessource3() {
        rm = new RessourcenMenge(Map.of(Ressource.Stein, 10));
        rm.addRessource(Ressource.Brot, -3);
    }

    /**
     * Test fuer Hinzufuegen von Ressource mit 0 Holz.
     */
    @org.junit.Test
    public void addRessource4() {
        rm = new RessourcenMenge(Map.of(Ressource.Holz, 10, Ressource.Stein, 10, Ressource.Geld, 30));
        rm.addRessource(Ressource.Holz, 0);
        assertEquals(10, rm.getRessource(Ressource.Holz));
    }
}