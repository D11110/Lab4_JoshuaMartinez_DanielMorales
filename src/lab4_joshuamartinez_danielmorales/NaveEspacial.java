package lab4_joshuamartinez_danielmorales;

import java.util.ArrayList;

public class NaveEspacial extends Espacial{
    private int propulsores;

    public NaveEspacial() {
        super();
    }

    public NaveEspacial(int propulsores, String tipo_combustible, String planeta_partidad, String planeta_llegada, int distancia, double altitud, ArrayList primates) {
        super(tipo_combustible, planeta_partidad, planeta_llegada, distancia, altitud, primates);
        this.propulsores = propulsores;
    }

    public int getPropulsores() {
        return propulsores;
    }

    public void setPropulsores(int propulsores) {
        this.propulsores = propulsores;
    }

    @Override
    public String toString() {
        return "NaveEspacial{" + "propulsores=" + propulsores + super.toString() +'}';
    }
    
    
    
}
