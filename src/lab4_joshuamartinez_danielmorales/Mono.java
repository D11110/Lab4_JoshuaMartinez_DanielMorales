package lab4_joshuamartinez_danielmorales;

import java.awt.Color;
import java.util.Date;

public class Mono extends Primate{
    private Color color;

    public Mono() {
        super();
    }

    public Mono(Color color, Transporte transporte, int comida, int come_kilometro, String planeta, String lugar_nacimiento, String Nombre, String sanguineo, String sexo, double altura, int peso) {
        super(transporte, comida, come_kilometro, planeta, lugar_nacimiento, Nombre, sanguineo, sexo, altura, peso);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mono{" + "color=" + color + super.toString() + '}';
    }
    
    
    
}
