package herencia;

public class Herencia {

    public static void main(String[] args) {

        /* HERENCIA */
        
//        Empleado emple = new Empleado();
//        
//        emple.getNumLegajo(); // METODO PROPIO
//        emple.getApellido(); // METODO HEREDADO DE PERSONA
//        
//        Consultor consul = new Consultor();
//        
//        consul.getNumConsultor(); // METODO PROPIO
//        consul.getApellido(); // METODO HEREDADO DE PERSONA
        
        /* -------- */
        
        /* POLIMORFISMO */
        
        // Son formas diferentes de representar a una persona, por eso las puedo guardar en un vector de tipo Persona
        Persona vector[] = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        
        Persona persona = new Persona();
        Consultor consultor = new Consultor();
        
        persona = consultor; // como consultor es hijo de la clase persona, se pueden hacer estas asignaciones
        
        /* -------- */
    }
    
}
