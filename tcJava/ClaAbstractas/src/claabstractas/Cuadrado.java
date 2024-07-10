
package claabstractas;

public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() { // tengo el mismo metodo que mi clase madre pero lo voy a implementar de manera distinta
        double resultado = lado * lado;
        return resultado;
    }
    
}
