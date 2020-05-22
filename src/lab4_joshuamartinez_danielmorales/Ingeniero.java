package lab4_joshuamartinez_danielmorales;

import java.util.ArrayList;
import java.util.Date;

public class Ingeniero extends SereVivo{
    
    private String correo, usuario;
    private ArrayList idiomas = new ArrayList();
    private String contraseña;
    private Date nacimiento;

    public Ingeniero() {
    super();
    }

    public Ingeniero(String correo, String usuario, ArrayList idiomas, String contraseña, Date nacimiento, String Nombre, String sanguineo, String sexo, double altura, int peso) {
        super(Nombre, sanguineo, sexo, altura, peso);
        setIdiomas(idiomas);
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nacimiento = nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public ArrayList getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Ingeniero{" + "correo=" + correo + ", usuario=" + usuario + ", idiomas=" + idiomas + ", contrasena=" + contraseña + ", nacimiento=" + nacimiento + super.toString() +'}';
    }
    
    
    
}
