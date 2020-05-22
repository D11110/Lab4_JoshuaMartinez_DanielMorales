package lab4_joshuamartinez_danielmorales;

import java.util.ArrayList;

public class Espacial extends Transporte{
   private String tipo_combustible, planeta_partidad, planeta_llegada;

    public Espacial() {
        super();
    }

    public Espacial(String tipo_combustible, String planeta_partidad, String planeta_llegada, int distancia, double altitud, ArrayList primates) {
        super(distancia, altitud, primates);
        this.tipo_combustible = tipo_combustible;
        this.planeta_partidad = planeta_partidad;
        this.planeta_llegada = planeta_llegada;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public String getPlaneta_partidad() {
        return planeta_partidad;
    }

    public void setPlaneta_partidad(String planeta_partidad) {
        this.planeta_partidad = planeta_partidad;
    }

    public String getPlaneta_llegada() {
        return planeta_llegada;
    }

    public void setPlaneta_llegada(String planeta_llegada) {
        this.planeta_llegada = planeta_llegada;
    }

    @Override
    public String toString() {
        return "Espacial{" + "tipo_combustible=" + tipo_combustible + ", planeta_partidad=" + planeta_partidad + ", planeta_llegada=" + planeta_llegada + super.toString() +'}';
    }
    
    
    
    
}
