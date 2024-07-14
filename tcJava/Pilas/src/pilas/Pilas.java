
package pilas;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia? " + pila.isEmpty());
        
        // AGREGAR
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        // RECORRIDO
        for(Integer pilita : pila){
            System.out.println(pilita);
        }
        
        // MOSTRAR
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia? " + pila.isEmpty());
        
        // ELIMINAR ULTIMO ELEMENTO
        pila.pop();
        
        // VERIFICAR EN QUE POSICION ESTA CIERTO ELEMENTO, -1 SI NO SE ENCUENTRA DENTRO DE LA PILA
        System.out.println("Esta el 3? " + pila.search(3));
        System.out.println("Esta el 5? " + pila.search(5));
        
        // ULTIMO ELEMENTO AGREGADO
        System.out.println("Ultimo elemento: " + pila.peek());
        
    }
    
}
