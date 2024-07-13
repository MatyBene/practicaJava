
package linkedlists;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {
        // LAS LINKEDLIST NO TIENEN UN INDICE BIEN DETERMINADO, ESTAN PENSADAS PARA VERSE REGISTRO POR REGISTRO
        // TIENEN LA PARTICULARIDAD DE PODER AGREGAR AL PRINCIPIO O AL FINAL DE LA LISTA
        List<Persona> lista = new LinkedList<Persona>();
        
        // AGREGAR PERSONAS AL FINAL DE LA LISTA
        lista.add(new Persona(6, "Matias", 27));
        lista.add(new Persona(3, "Aixa", 26));
        lista.add(new Persona(2, "Gabriel", 45));
        lista.add(new Persona(1, "Vanina", 4));
        
        // AGREGAR PERSONAS AL PRINCIPIO DE LA LISTA
        lista.add(0, new Persona(66, "Maty", 12));
        
        // RECORRER POR FOREACH
        System.out.println("---FOREACH---");
        for(Persona perso:lista){
            System.out.println("Prueba: " + perso.getNombre());
        }
        System.out.println("------");
    }
    
}
