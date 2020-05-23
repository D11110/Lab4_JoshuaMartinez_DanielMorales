package lab4_joshuamartinez_danielmorales;

import java.util.ArrayList;

public abstract class Transporte implements Comportamiento{
    protected int combustible =100, distancia;
    private double altitud;
    private ArrayList primates = new ArrayList();

    public Transporte() {
    }

    public Transporte(int distancia, double altitud, ArrayList primates) {
        setPrimates(primates);
        this.distancia = distancia;
        this.altitud = altitud;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public ArrayList getPrimates() {
        return primates;
    }

    public void setPrimates(ArrayList primates) {
        this.primates = primates;
    }

    @Override
    public String toString() {
        return "Transporte{" + "combustible=" + combustible + ", distancia=" + distancia + ", altitud=" + altitud + ", primates=" + primates + '}';
    }
    
   public void Viajar(){
   
   }
}
