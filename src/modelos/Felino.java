
package modelos;

import java.util.ArrayList;


public class Felino extends Mascota{
    
    private boolean portadorToxoplasmosis;

    public Felino(boolean portadorToxoplasmosis, String nombre, String raza, String color, short edad) {
        super(nombre, raza, color, edad);
        this.portadorToxoplasmosis = portadorToxoplasmosis;
    }

    public boolean isPortadorToxoplasmosis() {
        return portadorToxoplasmosis;
    }

    public void setPortadorToxoplasmosis(boolean portadorToxoplasmosis) {
        this.portadorToxoplasmosis = portadorToxoplasmosis;
    }
    
  
    
}
