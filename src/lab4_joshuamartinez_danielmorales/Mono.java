/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_joshuamartinez_danielmorales;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author joshu
 */
public class Mono extends Primate{
    private Color color;

    public Mono() {
        super();
    }

    public Mono(Color color, Transporte transporte, int comida, int come_kilometro, String planeta, Date nacimiento, String Nombre, String sanguineo, String sexo, double altura, int peso) {
        super(transporte, comida, come_kilometro, planeta, nacimiento, Nombre, sanguineo, sexo, altura, peso);
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
