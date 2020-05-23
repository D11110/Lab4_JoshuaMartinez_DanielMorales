package lab4_joshuamartinez_danielmorales;

import java.util.ArrayList;
import static lab4_joshuamartinez_danielmorales.Helicoptero.input;
import java.util.Scanner;

public class Transporte implements Comportamiento {

    private int combustible = 100, distancia;
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

    @Override
    public void viajar() {
        int gasto, cantidad;
        int distan;
        int indice;
        boolean flag = true, flag2 = true;
        int comida, gasto_comida;
        System.out.print("Ingrese la distancia del viaje: ");
        distan = input.nextInt();

        if (primates == null) {
            System.out.println("No hay primates en la lista");
        } else {
            System.out.println(combustible);
            System.out.println(distancia);
//            cantidad = combustible;
//            indice = primates.size();
//            for (int i = 0; i < indice; i++) {
//                gasto = (cantidad / distancia) * distan;
//                comida = ((Primate) getPrimates().get(i)).getComida();
//                gasto_comida = (comida / ((Primate) getPrimates().get(i)).getCome_kilometro()) * distan;
//                try {
//                    validar(cantidad, gasto);
//                    flag = false;
//                } catch (MIException ex) {
//                    System.out.println(ex.getMessage());
//                    try {
//                        validar2(comida, gasto_comida);
//                        flag2 = false;
//                    } catch (MIException ew) {
//                        System.out.println(ew.getMessage());
//                    }
//                } finally {
//                    if (flag == true && flag2 == true) {
//
//                    } else {
//                        System.out.println("Viaje exitoso");
//                    }
//                }
//                cantidad = cantidad - gasto;
//                combustible = cantidad;
//                comida = comida - gasto_comida;
//                ((Primate) getPrimates().get(i)).setComida(comida);
            }
        }
    }
    
//    static void validar(int x, int y) throws MIException{
//        if (x<y) {
//            throw new MIException("No hay suficiente combustible");
//        }
//    }
//    
//    static void validar2(int x, int y) throws MIException{
//        if (x<y) {
//            throw new MIException("No hay suficiente comida para el viaje");
//        }
//    }

