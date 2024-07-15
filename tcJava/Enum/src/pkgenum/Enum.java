
package pkgenum;

public class Enum { // PALABRA CLAVE PARA DEFINIR UN TIPO DE DATO QUE REPRESENTA UN CONJUNTO FIJO DE CONSTANTES

    enum Color{
        ROJO, AZUL, VERDE, AMARILLO, NARANJA, NEGRO, BLANCO
    }
    
    public static void main(String[] args) {
        
//        Color color = Color.ROJO;
//        System.out.println("color = " + color);
        
        for(Color c : Color.values()){
            System.out.println("Color = " + c);
        }

    }
    
}
