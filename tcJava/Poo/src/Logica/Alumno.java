package Logica;

public class Alumno {
    /* ATRIBUTOS */
    
    int id;
    String nombre;
    String apellido;
    
    /* ---------------------------- */
    
    /* METODOS CONSTRUCTORES */

    public Alumno() { // CONSTRUCTOR VACIO
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
   
    /* ---------------------------- */
    
    /* GETTER & SETTER */

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
    
    
    
    /* ---------------------------- */
    
    /* METODOS PERSONALIZADOS*/
    
    public void mostrarNombre(){
        System.out.println("El nombre del alumno es " + nombre);
    }
    
    public void saberAprobado(double calificacion){
        if(calificacion >= 6){
            System.out.println("Aprobado.");
        } else {
            System.out.println("Desaprobado.");
        }
    }
    
    /* ---------------------------- */
    
}
