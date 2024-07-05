public class Main {
    public static void main(String[] args) {
        int numero1 = 35;
        int numero2 = 20;
        int aux;

        System.out.println("CON VARIABLE AUXILIAR");

        System.out.println("---Antes---");

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);

        aux = numero1;
        numero1 = numero2;
        numero2 = aux;

        System.out.println("---Despues---");

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);

        int num1 = 35;
        int num2 = 20;

        System.out.println("SIN VARIABLE AUXILIAR");

        System.out.println("---Antes---");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("---Despues---");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}