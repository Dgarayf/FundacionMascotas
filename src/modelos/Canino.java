
package modelos;

import java.util.ArrayList;


public class Canino extends Mascota{
    
    private short nivelEntrenamiento;

    public Canino(short nivelEntrenamiento, String nombre, String raza, String color, short edad) {
        super(nombre, raza, color, edad);
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public short getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    public void setNivelEntrenamiento(short nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }
    
    //crea y devuelve un arrayList de caninos vacio
    
    public static ArrayList<Canino> listaCaninos(){
        
        ArrayList<Canino> caninos= new ArrayList();
        
        return caninos;
}
    
    
}
