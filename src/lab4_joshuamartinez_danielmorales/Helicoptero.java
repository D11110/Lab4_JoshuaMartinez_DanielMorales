package lab4_joshuamartinez_danielmorales;

import java.util.ArrayList;
import java.util.Scanner;

public class Helicoptero extends AereoNormal{
    
    static Scanner input = new Scanner(System.in);
    
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

    @Override
    public void viajar() {
        int gasto, cantidad;
        int distan;
        int indice;
        boolean flag = true, flag2=true;
        int comida, gasto_comida;
        System.out.print("Ingrese la distancia del viaje: ");
        distan = input.nextInt();
        
        if (super.getPrimates() == null) {
            System.out.println("No hay primates en la lista");
        }else{
            cantidad=super.getCombustible();
            indice=super.getPrimates().size();
            gasto = (cantidad/super.getDistancia())*distan;
            comida = ((Primate)super.getPrimates().get(indice)).getComida();
            gasto_comida = (comida/((Primate)super.getPrimates().get(indice)).getCome_kilometro())*distan;
            try {
                validar(cantidad,gasto);
                flag = false;
            } catch (MIException ex) {
                System.out.println(ex.getMessage());
                try {
                    validar2(comida,gasto_comida);
                    flag2 = false;
                } catch (MIException ew) {
                    System.out.println(ew.getMessage());
                }
            }finally{
                if (flag==true && flag2==true) {
                    
                }else{
                    System.out.println("Viaje exitoso");
                }
            }
            cantidad=cantidad-gasto;
            super.setCombustible(cantidad);;
            comida = comida-gasto_comida;
            ((Primate)super.getPrimates().get(indice)).setComida(comida);
            
        }
    }
    
    static void validar(int x, int y) throws MIException{
        if (x<y) {
            throw new MIException("No hay suficiente combustible");
        }
    }
    
    static void validar2(int x, int y) throws MIException{
        if (x<y) {
            throw new MIException("No hay suficiente comida para el viaje");
        }
    }
    
    
    
    
}
