
package poke;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander -> Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander -> Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander -> Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander -> Puño fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander -> Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander -> Lanzallamas");
    }
    
}
