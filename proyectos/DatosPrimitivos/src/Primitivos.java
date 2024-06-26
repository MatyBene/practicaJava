public class Primitivos {

    public static void main(String[] args) {
        /* ENTEROS */

        byte numero = 127;
        System.out.println("numero = " + numero);
        System.out.println("Cuantos BYTES tiene un Byte = " + Byte.BYTES);
        System.out.println("Cuantos BYTES tiene un Bites = " + Byte.SIZE);
        System.out.println("Maximo valor del tipo de dato = " + Byte.MAX_VALUE);
        System.out.println("Minimo valor del tipo de dato = " + Byte.MIN_VALUE);

        short numShort = 3000;
        System.out.println("numShort = " + numShort);
        System.out.println("Cuantos SHORT tiene un Byte = " + Short.BYTES);
        System.out.println("Cuantos SHORT tiene un Bites = " + Short.SIZE);
        System.out.println("Maximo valor del tipo de dato = " + Short.MAX_VALUE);
        System.out.println("Minimo valor del tipo de dato = " + Short.MIN_VALUE);

        /* COMA FLOTANTE */

        //float numReal0 = 2.0;
        float numReal1 = (float) 2210.0;
        //float numReal2 = 2.0F;
        //double numReal3 = 2.0;
        //float numReal4 = 2.12e3F; //2120.0
        //float numReal5 = 2.12e-3F; //0.00212

        System.out.println("numReal1 = " + numReal1);
        System.out.println("Cuantos FLOAT tiene un Byte = " + Float.BYTES);
        System.out.println("Cuantos FLOAT tiene un Bites = " + Float.SIZE);
        System.out.println("Maximo valor del tipo de dato = " + Float.MAX_VALUE);
        System.out.println("Minimo valor del tipo de dato = " + Float.MIN_VALUE);

        var numVar = 127; //por defecto me toma por int, si es del rango de byte trae lios a la hora de un programa pesado

    }
}
