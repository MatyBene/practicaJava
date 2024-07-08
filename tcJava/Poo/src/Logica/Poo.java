package Logica;

public class Poo {

    public static void main(String[] args) {
        
        Alumno al1 = new Alumno(); // PARA CREAR UN ALUMNO VACIO CON EL METODO CONSTRUCTOR
        Alumno al2 = new Alumno(6, "Matias", "Benedetti"); // PARA CREAR UN ALUMNO CON EL METODO CONSTRUCTOR
        
        System.out.println("La id del alumno 2: " + al2.getId());
        System.out.println("El nombre del alumno 2 es: " + al2.getNombre());
        System.out.println("El apellido del almuno 2 es: " + al2.getApellido());
        System.out.println("-------------------------------------------------");
        
        al1.setId(9);
        al1.setNombre("oscar");
        al1.setApellido("funes");
        
        System.out.println("La id del alumno 1: " + al1.getId());
        System.out.println("El nombre del alumno 1 es: " + al1.getNombre());
        System.out.println("El apellido del almuno 1 es: " + al1.getApellido());
        System.out.println("-------------------------------------------------");
        
        al2.setId(66); // EDITO ID
        
        System.out.println("La id del alumno 2: " + al2.getId());
        System.out.println("El nombre del alumno 2 es: " + al2.getNombre());
        System.out.println("El apellido del almuno 2 es: " + al2.getApellido());
        System.out.println("-------------------------------------------------");
        
    }
    
}
