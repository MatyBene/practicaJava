
package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {
        
        Auto auto = new Auto();
        
        auto.setId(1L);
        auto.setMarca("Renault");
        auto.setModelo("Duster");
        
        List<Propietario> listaPropietarios = new ArrayList<Propietario>();
        
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        
        prop1.setId(6L);
        prop1.setNombre("Matias");
        prop1.setApellido("Benedetti");
            
        prop2.setId(2L);
        prop2.setNombre("sss");
        prop2.setApellido("weew");
        
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        
        auto.setListaPropietarios(listaPropietarios);
        
        System.out.println("El auto " + auto.getMarca() + " " + auto.getModelo() + " tiene como propietarios a: " + auto.getListaPropietarios().toString());
        
        
    }
    
}
