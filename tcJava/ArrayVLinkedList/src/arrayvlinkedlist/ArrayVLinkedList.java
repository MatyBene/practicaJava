
package arrayvlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVLinkedList {

    public static void main(String[] args) {
        
        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(6, "Matias", 27));
        listaArray.add(new Persona(3, "Aixa", 26));
        listaArray.add(new Persona(2, "Gabriel", 45));
        listaArray.add(new Persona(1, "Vanina", 4));
        
        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(6, "Matias", 27));
        listaLinked.add(new Persona(3, "Aixa", 26));
        listaLinked.add(new Persona(2, "Gabriel", 45));
        listaLinked.add(new Persona(1, "Vanina", 4));
        
        // METODO REMOVE
        
        // REMOVE EN ARRAYLIST
        listaArray.remove(2);
        
        // REMOVE EN LINKEDLIST
        String nombreBorrar = "Gabriel";
        for(Persona perso : listaLinked){
            if(perso.getNombre().equals(nombreBorrar)){
                listaLinked.remove(perso);
                break;
            }
        }
        
        System.out.println("------LUEGO DE ELIMINAR------");
        // RECORRIDO POR FOREACH
        System.out.println("------ARRAYLIST------");
        for(Persona persona : listaArray){
            System.out.println("Persona: " + persona.getNombre());
        }
        
        System.out.println("------LINKEDLIST------");
        for(Persona persona : listaArray){
            System.out.println("Persona: " + persona.getNombre());
        }
        
        // METODO SIZE
        System.out.println("Tamano de la lista: ");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());
        
        // METODO GETFIRST Y GETLAST (SOLO PARA LINKEDLIST)
        System.out.println("Primer elemento de LinkedList: " + listaLinked.getFirst().toString());
        System.out.println("Ultimo elemento de LinkedList: " + listaLinked.getLast().toString());
        
        // METODO CLEAR
        listaArray.clear();
        listaLinked.clear();
        
        // METODO ISEMPTY
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());
        
    }
    
}
