public class Main {

    public static void main(String[] args){ // TODO LO QUE ESTE ACA ADENTRO ES LO QUE SE VA A EJECUTAR

        String mensaje = "Hola Java";
        Main m = new Main(); // Crea un objeto de tipo clase main
        m.Saludar(mensaje);

    }

    public void Saludar(String mensaje){

        System.out.println(mensaje);

    }

}

//public class Main {
//
//    public static void main(String[] args){ // TODO LO QUE ESTE ACA ADENTRO ES LO QUE SE VA A EJECUTAR
//        Saludar();
//    }
//
//    public static void Saludar(){
//        System.out.println("Hola Java");
//    }
//
//}