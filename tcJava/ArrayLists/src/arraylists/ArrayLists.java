
package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        // VENTAJA DEL ARRAYLIST ES QUE PUEDO IR DIRECTO AL INDICE QUE QUIERO
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(6, "Matias", 27));
        lista.add(new Persona(3, "Aixa", 26));
        lista.add(new Persona(2, "Gabriel", 45));
        lista.add(new Persona(1, "Vanina", 4));
        
        // RECORRER POR INDICE
        System.out.println("---FOR---");
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        System.out.println("------");
        
        // RECORRER POR FOREACH
        System.out.println("---FOREACH---");
        for(Persona perso:lista){
            System.out.println("Prueba: " + perso.getNombre());
        }
        System.out.println("------");
    }
    
}
