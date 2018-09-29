package modul.ressourcen;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class RessourcenMengeTest {

    RessourcenMenge rm;


    public void setUp() throws Exception {
        rm = new RessourcenMenge(Map.of(Ressourcen.Holz, 10,Ressourcen.Stein,100,Ressourcen.Geld,300));
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void RessoucenMengeErstellenHolzSteinGeld(){
        try{
            rm = new RessourcenMenge(Map.of(Ressourcen.Holz, 10,Ressourcen.Stein,100,Ressourcen.Geld,300));
        }catch (Exception e){
            e.printStackTrace();
        }

        assertEquals(rm.getRessource(Ressourcen.Holz), 10);
        assertEquals(rm.getRessource(Ressourcen.Stein), 100);
        assertEquals(rm.getRessource(Ressourcen.Geld), 300);
    }

    @org.junit.Test
    public void RessoucenMengeErstellenFisch(){
        try{
            rm = new RessourcenMenge(Map.of(Ressourcen.Fisch,300));
        }catch (Exception e){
            e.printStackTrace();
        }

        assertEquals(rm.getRessource(Ressourcen.Fisch), 300);
    }

    @org.junit.Test
    public void RessoucenMengeErstellenBrot(){
        try{
            rm = new RessourcenMenge(Map.of(Ressourcen.Brot,300));
        }catch (Exception e){
            e.printStackTrace();
        }

        assertEquals(rm.getRessource(Ressourcen.Brot), 300);
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