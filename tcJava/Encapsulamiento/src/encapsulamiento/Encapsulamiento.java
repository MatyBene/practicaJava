
package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        //Alumno al1 = new Alumno(); // Salta error porque en la clase alumno el constructor esta en privado
        Alumno al2 = new Alumno(6, "Matias", "Benedetti");
        
        System.out.println("id: " + al2.getId());
        System.out.println("nombre: " + al2.getNombre());
        System.out.println("apellido: " + al2.getApellido());
        
    }
    
}
