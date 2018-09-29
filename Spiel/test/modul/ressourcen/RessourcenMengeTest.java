package modul.ressourcen;

import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Test Klasse fuer RessourcenMenge.
 */
public class RessourcenMengeTest {

    RessourcenMenge rm;

    /**
     * Nicht "@before", da nicht ueberall vewendet.
     *
     * @throws Exception Aufgetretene Exceptions
     */
    public void setUp() throws Exception {
        rm = new RessourcenMenge(Map.of(Ressource.Holz, 10,Ressource.Stein,100,Ressource.Geld,300));
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void RessoucenMengeErstellenHolzSteinGeld(){
        try{
            rm = new RessourcenMenge(Map.of(Ressource.Holz, 10,Ressource.Stein,100,Ressource.Geld,300));
        }catch (Exception e){
            e.printStackTrace();
        }

        assertEquals(rm.getRessource(Ressource.Holz), 10);
        assertEquals(rm.getRessource(Ressource.Stein), 100);
        assertEquals(rm.getRessource(Ressource.Geld), 300);
    }

    @org.junit.Test
    public void RessoucenMengeErstellenFisch(){
        try{
            rm = new RessourcenMenge(Map.of(Ressource.Fisch,300));
        }catch (Exception e){
            e.printStackTrace();
        }

        assertEquals(rm.getRessource(Ressource.Fisch), 300);
    }

    @org.junit.Test
    public void RessoucenMengeErstellenBrot(){
        try{
            rm = new RessourcenMenge(Map.of(Ressource.Brot,300));
        }catch (Exception e){
            e.printStackTrace();
        }

        assertEquals(rm.getRessource(Ressource.Brot), 300);
    }

    /*
    @org.junit.Test
    public void RessoucenMengeErstellenLeer(){
        try{
            rm = new RessourcenMenge(Map.of());
        }catch (Exception e){
            e.printStackTrace();
        }

    //TODO: Test erstellen bei dem eine leere Map uebergeben wird und der Konstruktor das aber abweist.
    }*/

    @org.junit.Test
    public void getRessourcenNotExisting() {

    }

    @org.junit.Test
    public void addRessourcen() {
    }
}