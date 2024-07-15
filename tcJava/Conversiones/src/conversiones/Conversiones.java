
package conversiones;

public class Conversiones {

    public static void main(String[] args) {
        
        // CASTEO EN TIPO NUMERICOS
        
        double num = 1.67;
        System.out.println("DOUBLE = " + num);
        
        // CASTEO A ENTERO
        int numInt = (int) num;
        System.out.println("INT = " + numInt);
        
        // CASTEO A LONG
        long numLong = (long) num; 
        System.out.println("LONG = " + numLong);
        
        // ------------
        
        // CONVERSION DE STRING A TIPO NUMERICO
        
        String cantidad = "15";
        String precio = "150.27";
        
        int cantInt = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);
        
        System.out.println("El valor total de la compra es: " + (cantInt * precioDouble));
        
        // ------------
        
        // CONVERSION DE TIPO NUMERICO A STRING
        
        int edad = 27;
        double estatura = 1.89;
        
        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);
        
        System.out.println("Edad: " + edadString + " Estatura: " + estaturaString);
        
        // ------------
    }
    
}
