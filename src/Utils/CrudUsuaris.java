package Utils;

import java.util.ArrayList;

/**
 *
 * @author aigardo
 */
public class CrudUsuaris {
    
    private ArrayList<Usuaris>arrayUsuaris;
    
    public CrudUsuaris() {
        arrayUsuaris = new ArrayList<Usuaris>();
    }
    
    public void afegir (Usuaris users) {
        arrayUsuaris.add(users);
    }
    
    public Usuaris obtenir (int posicio) {
        return arrayUsuaris.get(posicio);
    }
    
    public int tamany() {
        return arrayUsuaris.size();
    }
    
}
