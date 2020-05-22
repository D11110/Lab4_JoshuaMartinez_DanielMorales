package lab4_joshuamartinez_danielmorales;

import java.util.Date;


public class Primate extends SereVivo{
    private int comida, come_kilometro;
    private String planeta;
    private String lugar_nacimiento;

    public Primate() {
        super();
    }

    public Primate( int comida, int come_kilometro, String planeta, String lugar_nacimiento, String Nombre, String sanguineo, String sexo, double altura, int peso) {
        super(Nombre, sanguineo, sexo, altura, peso);
        this.comida = comida;
        this.come_kilometro = come_kilometro;
        this.planeta = planeta;
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public int getCome_kilometro() {
        return come_kilometro;
    }

    public void setCome_kilometro(int come_kilometro) {
        this.come_kilometro = come_kilometro;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getNacimiento() {
        return lugar_nacimiento;
    }

    public void setNacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    @Override
    public String toString() {
        return "Primate{" + ", comida=" + comida + ", come_kilometro=" + come_kilometro + ", planeta=" + planeta + ", nacimiento=" + lugar_nacimiento + super.toString() +'}';
    }

    
    
    
    
}
