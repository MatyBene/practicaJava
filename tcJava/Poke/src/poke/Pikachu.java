
package poke;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu -> Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu -> Arañazo");    
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu -> Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu -> Impactrueno");    
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu -> Puño trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Pikachu -> Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Pikachu -> Rayo carga");
    }
    
}
