
package sobrescrituraysobrecarga;

public class Perro extends SerVivo{

    private String nombrePerro;
    private double peso;
    private String raza;
    private String sexo;
    
    // CONSTRUCTORES
    
    // GETTERS Y SETTERS
    
    // OTROS METODOS
    
    @Override
    public void hacerSonido() {
        System.out.println("Perro -> ladrido");
    }
    
}
