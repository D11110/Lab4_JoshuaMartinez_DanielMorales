package lab4_joshuamartinez_danielmorales;

import java.util.ArrayList;

public abstract class AereoNormal extends Transporte{
    private String gasolina, pais_partida, pais_llegada;

    public AereoNormal() {
        super();
    }

    public AereoNormal(String gasolina, String pais_partida, String pais_llegada, int distancia, double altitud, ArrayList primates) {
        super(distancia, altitud, primates);
        this.gasolina = gasolina;
        this.pais_partida = pais_partida;
        this.pais_llegada = pais_llegada;
    }

    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }

    public String getPais_partida() {
        return pais_partida;
    }

    public void setPais_partida(String pais_partida) {
        this.pais_partida = pais_partida;
    }

    public String getPais_llegada() {
        return pais_llegada;
    }

    public void setPais_llegada(String pais_llegada) {
        this.pais_llegada = pais_llegada;
    }

    @Override
    public String toString() {
        return "AereoNormal{" + "gasolina=" + gasolina + ", pais_partida=" + pais_partida + ", pais_llegada=" + pais_llegada + super.toString() +'}';
    }
    
    
    
}
