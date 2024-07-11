
package sobrescrituraysobrecarga;

public class Animal {
    
    private int idAnimal;
    private String descripcion;
    
    // CONSTRUCTORES
    
    // METODOS GETTERS Y SETTERS
    
    // OTROS METODOS
    
    // SOBRECARGA DE METODOS, EN UNA MISMA CLASE SE PUEDEN TENER METODOS CON EL MISMO NOMBRE. sE IDENTIFICA CUAL SE VA A UTILIZAR MEDIANTE LOS PARAMETROS
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    
    public void hacerSonido(String nombreAnimal){
        System.out.println("El animal " + nombreAnimal + "hace un sonido");
    }
    
    public void hacerSonido(String nombreAnimal, String tipoSonido){
        System.out.println("El animal " + nombreAnimal + "hace un sonido de tipo " + tipoSonido);
    }
    
    // SOBRESCRITURA DE METODOS
}
