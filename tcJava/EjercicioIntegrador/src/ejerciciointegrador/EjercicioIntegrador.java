package ejerciciointegrador;

import java.util.ArrayList;
import java.util.List;

public class EjercicioIntegrador {

    public static void main(String[] args) {
        
        List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();
        
        // PUNTO 2
        VideoJuego juego1 = new VideoJuego(123, "Banjo Kazooie", "Nintendo 64", 4, "Plataforma");
        VideoJuego juego2 = new VideoJuego(456, "Mario Party 3", "Nintendo 64", 4, "Plataforma");
        VideoJuego juego3 = new VideoJuego(789, "Age of Empire II", "PC", 1, "Estrategia");
        VideoJuego juego4 = new VideoJuego(234, "Counter Strike 1.6", "PC", 1, "");
        VideoJuego juego5 = new VideoJuego(345, "Mario Kart 64", "Nintendo 64", 2, "Plataforma");
        
        listaVideoJuegos.add(juego1);
        listaVideoJuegos.add(juego2);
        listaVideoJuegos.add(juego3);
        listaVideoJuegos.add(juego4);
        listaVideoJuegos.add(juego5);
        
        // PUNTO 3
        for(VideoJuego juego : listaVideoJuegos){
            System.out.println("Titulo: " + juego.getTitulo());
            System.out.println("Consola: " + juego.getConsola());
            System.out.println("Cantidad de jugadores: " + juego.getCantJugadores());
            System.out.println("------------");
        }
        
        // PUNTO 4
        juego1.setTitulo("Banjo Kazooie II");
        juego1.setCantJugadores(1);
        
        juego5.setTitulo("Super Mario Kart");
        juego5.setCantJugadores(4);
        
        // PUNTO 5
        for(VideoJuego juego : listaVideoJuegos){
            if(juego.getConsola().equals("Nintendo 64")){
//                System.out.println("Titulo: " + juego.getTitulo());
                System.out.println(juego.toString());
            }
        }
        
        
    }
    
}
