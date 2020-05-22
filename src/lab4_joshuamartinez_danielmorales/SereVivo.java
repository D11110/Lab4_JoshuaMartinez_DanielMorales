package lab4_joshuamartinez_danielmorales;

public class SereVivo {
    private String Nombre, sanguineo;
    private String sexo;
    private double altura;
    private int peso;

    public SereVivo() {
    }

    public SereVivo(String Nombre, String sanguineo, String sexo, double altura, int peso) {
        this.Nombre = Nombre;
        this.sanguineo = sanguineo;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSanguineo() {
        return sanguineo;
    }

    public void setSanguineo(String sanguineo) {
        this.sanguineo = sanguineo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SereVivo{" + "Nombre=" + Nombre + ", sanguineo=" + sanguineo + ", sexo=" + sexo + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
    
}
