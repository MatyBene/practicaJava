
package encapsulamiento;
// protected se usa en la clase padre para que solo las clases hijos puedan obtener esos atributos

public class Alumno {
    
    private int id; // convencion estandar todos los atributos de una clase son privados
    private String nombre;
    private String apellido;

    private Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
