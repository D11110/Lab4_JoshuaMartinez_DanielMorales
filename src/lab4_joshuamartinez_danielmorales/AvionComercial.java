package lab4_joshuamartinez_danielmorales;

import java.util.ArrayList;

public class AvionComercial extends AereoNormal{
    private int pasajeros;
    private boolean automatico;

    public AvionComercial() {
        super();
    }

    public AvionComercial(int pasajeros, boolean automatico, String gasolina, String pais_partida, String pais_llegada, int distancia, double altitud, ArrayList primates) {
        super(gasolina, pais_partida, pais_llegada, distancia, altitud, primates);
        this.pasajeros = pasajeros;
        this.automatico = automatico;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    @Override
    public String toString() {
        return "AvionComercial{" + "pasajeros=" + pasajeros + ", automatico=" + automatico + super.toString() +'}';
    }

    @Override
    public void viajar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
