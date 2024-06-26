public class Main {

    public static void main(String[] args){

        String mensaje = "Hola";
        Main m = new Main();
        m.Saludar(mensaje.toUpperCase());

        int numero = 10;        // dato primitivo
        Integer numero2 = 12;   // dato de referencia

        System.out.println("El numero de referencia es: " + numero2 + "\nEl numero primitivo es: " + numero);

        var nombre = "Gabriel"; // como en js
        System.out.println(nombre);

    }

    public void Saludar(String mensaje){

        System.out.println(mensaje);

    }
}