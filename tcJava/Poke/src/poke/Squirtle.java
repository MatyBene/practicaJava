
package poke;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle -> Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle -> Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle -> Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle -> Hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle -> Pistola agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle -> Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Squirtle -> Hidropulso");
    }
    
}
