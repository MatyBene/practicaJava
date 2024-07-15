
package pruebahashmap;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {

    public static void main(String[] args) {
        
        Map<Integer,String> mapaEmpleados = new HashMap<>();
        
        mapaEmpleados.put(1523, "Matias");
        mapaEmpleados.put(1524, "Aixa");
        mapaEmpleados.put(1525, "Benedetti");
        
        boolean estaono = mapaEmpleados.containsKey(1522);
        
        if(estaono == true){
            System.out.println("El valor buscado esta.");
        } else {
            System.out.println("El valor buscado no esta.");
        }
        
        System.out.println(mapaEmpleados.values());
        System.out.println(mapaEmpleados.keySet());
        
        String nombre = mapaEmpleados.get(1523);
        System.out.println("El empleado buscado es: " + nombre);
        
        mapaEmpleados.remove(1524);
        
    }
    
}
