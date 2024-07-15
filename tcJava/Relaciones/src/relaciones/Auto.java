
package relaciones;

import java.util.List;

public class Auto {
    
    private Long id;
    private String marca;
    private String modelo;
    // RELACION 1 A 1 
    // LA RELACION UNIDIRECCIONAL, VA EN EL OBJETO QUE MAS ME PARECE. DEPENDE EL CONTEXTO
//     private Propietario prop; // DECLARE UN OBJETO DE TIPO PROPIETARIO, GENERANDO UNA RELACION 1 A 1
    
    // RELACION 1 A N
    // QUIERO QUE UN AUTO TENGA TODOS LOS PROPIETARIOS QUE QUIERA
    // DEL LADO DE LA LOGICA ES AL REVES DEL DE BASE DE DATOS
    private List<Propietario> listaPropietarios; //UN AUTO TIENE COMO ATRIBUTO UNA LISTA DE PROPIETARIOS
    
    
    public Auto() {
    }

    public Auto(Long id, String marca, String modelo, List<Propietario> listaPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
    }

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", listaPropietarios=" + listaPropietarios + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }
    
}
