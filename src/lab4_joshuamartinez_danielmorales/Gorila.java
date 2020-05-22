package lab4_joshuamartinez_danielmorales;

import java.util.Date;

public class Gorila extends Primate{
    private int IQ;

    public Gorila() {
        super();
    }

    public Gorila(int IQ, Transporte transporte, int comida, int come_kilometro, String planeta, Date nacimiento, String Nombre, String sanguineo, String sexo, double altura, int peso) {
        super(transporte, comida, come_kilometro, planeta, nacimiento, Nombre, sanguineo, sexo, altura, peso);
        this.IQ = IQ;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    @Override
    public String toString() {
        return "Gorila{" + "IQ=" + IQ + super.toString() +'}';
    }
    
    
    
    
}
