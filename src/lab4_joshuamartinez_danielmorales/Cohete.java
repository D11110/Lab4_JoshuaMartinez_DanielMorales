package lab4_joshuamartinez_danielmorales;

import java.util.ArrayList;

public class Cohete extends Espacial{
    private int separaciones;

    public Cohete() {
        super();
    }

    public Cohete(int separaciones, String tipo_combustible, String planeta_partidad, String planeta_llegada, int distancia, double altitud, ArrayList primates) {
        super(tipo_combustible, planeta_partidad, planeta_llegada, distancia, altitud, primates);
        this.separaciones = separaciones;
    }

    public int getSeparaciones() {
        return separaciones;
    }

    public void setSeparaciones(int separaciones) {
        this.separaciones = separaciones;
    }

    @Override
    public String toString() {
        return "Cohete{" + "separaciones=" + separaciones + super.toString() +'}';
    }
    
    
    
    
}
