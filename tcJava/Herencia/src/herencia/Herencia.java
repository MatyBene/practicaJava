package herencia;

public class Herencia {

    public static void main(String[] args) {

        Empleado emple = new Empleado();
        
        emple.getNumLegajo(); // METODO PROPIO
        emple.getApellido(); // METODO HEREDADO DE PERSONA
        
        Consultor consul = new Consultor();
        
        consul.getNumConsultor(); // METODO PROPIO
        consul.getApellido(); // METODO HEREDADO DE PERSONA
    }
    
}
