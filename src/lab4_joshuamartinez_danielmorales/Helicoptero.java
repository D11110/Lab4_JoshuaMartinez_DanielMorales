package lab4_joshuamartinez_danielmorales;

import java.util.ArrayList;


public class Helicoptero extends AereoNormal{
    private int helices, patas;

    public Helicoptero() {
        super();
    }

    public Helicoptero(int helices, int patas, String gasolina, String pais_partida, String pais_llegada, int distancia, double altitud, ArrayList primates) {
        super(gasolina, pais_partida, pais_llegada, distancia, altitud, primates);
        this.helices = helices;
        this.patas = patas;
    }

    public int getHelices() {
        return helices;
    }

    public void setHelices(int helices) {
        this.helices = helices;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "Helicoptero{" + "helices=" + helices + ", patas=" + patas + super.toString() + '}';
    }
    
    
    
}
