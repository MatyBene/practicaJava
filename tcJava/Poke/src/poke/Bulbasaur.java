
package poke;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur -> Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur -> Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur -> Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur -> Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur -> Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasaur -> Hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur -> Latigo cepa");
    }
    
}
