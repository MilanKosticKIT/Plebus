package modul.ressourcen;

import java.util.Map;

public class RessourcenMenge {
    private Map<Ressourcen, Integer> ressourcen;

    public RessourcenMenge(Map<Ressourcen, Integer> ressourcen){
        this.ressourcen = ressourcen;
    }

    public int getRessourcen(Ressourcen ressource){
        return this.ressourcen.get(ressource);
    }

    public void addRessourcen(Ressourcen ressource, int anzahl){
        this.ressourcen.put(ressource , this.ressourcen.get(ressource) + anzahl);

    }
}
