package lab4_joshuamartinez_danielmorales;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Lab4_JoshuaMartinez_DanielMorales {

    static Scanner input = new Scanner(System.in);
    static boolean auth = true;
    static ArrayList usuarios = new ArrayList();
    static ArrayList contraseñas = new ArrayList();
    static ArrayList listaIngenieros = new ArrayList();
    static ArrayList listaMonos = new ArrayList();
    static ArrayList listaGorilas = new ArrayList();
    static ArrayList<Transporte> listaMediosTransporte = new ArrayList();
    static ArrayList<SereVivo> listaPrimates = new ArrayList();
    static ArrayList listaHelicopteros = new ArrayList();
    static ArrayList listaAvionComercial = new ArrayList();
    static ArrayList listaCohete = new ArrayList();
    static ArrayList listaNaveEspacial = new ArrayList();

    public static void main(String[] args) throws ParseException {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("Bienvenido");
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            int op = input.nextInt();
            switch (op) {
                case 1:
                    boolean authenticated = false;
                    System.out.println("Ingrese el usuario: ");
                    String userRecibido = input.next();
                    System.out.println("Ingrese la contraseña: ");
                    String passRecibida = input.next();
                    autenticar(userRecibido);
                    if (auth) {
                        if (contraseñas.contains(passRecibida)) {
                            authenticated = true;
                        } else {
                            System.out.println("Contraseña incorrecta");
                        }
                    } else {
                        System.out.println("Usuario incorrecto");
                    }

                    while (authenticated) {
                        char respA = 's';
                        while (respA == 's' || respA == 'S') {
                            System.out.println("1. CRUD Monos y gorilas \n"
                                    + "2. CRUD Medios de transporte \n"
                                    + "3. Viajar\n"
                                    + "4. Salir\n");
                            int opMe = input.nextInt();
                            char respB = 's';

                            switch (opMe) {
                                case 1:
                                    char respCrudM = 's';
                                    System.out.println("1. Crear mono \n"
                                            + "2. Modificar mono \n"
                                            + "3. Eliminar mono \n"
                                            + "4. Crear gorila \n"
                                            + "5. Modificar gorila \n"
                                            + "6. Eliminar gorila \n"
                                            + "7. Salir \n");
                                    int opA = input.nextInt();

                                    switch (opA) {
                                        case 1:
                                            System.out.println("Ingrese el color del mono: 1. Negro 2. Gris");
                                            Color color = Color.BLACK;
                                            int colorOp = input.nextInt();
                                            switch (colorOp) {
                                                case 1:
                                                    color = Color.BLACK;
                                                    break;
                                                case 2:
                                                    color = Color.GRAY;
                                                    break;
                                                default:
                                                    System.out.println("Ingrese una opcion valida");
                                            }
                                            System.out.println("Cuanta comida tendra el mono: ");
                                            int comidaMono = input.nextInt();
                                            while (comidaMono < 1 || comidaMono > 100) {
                                                System.out.println("Cuanta comida tendra el mono: ");
                                                comidaMono = input.nextInt();
                                            }
                                            System.out.println("Cuanta comida come por km: ");
                                            int comidaPKMMono = input.nextInt();
                                            System.out.println("Ingrese el planeta asignado: ");
                                            input = new Scanner(System.in);
                                            String planeta = input.nextLine();
                                            System.out.println("Ingrese el lugar de nacimiento: ");
                                            input = new Scanner(System.in);
                                            String lugNacimiento = input.nextLine();
                                            System.out.println("Ingrese el nombre del mono: ");
                                            input = new Scanner(System.in);
                                            String nomMono = input.nextLine();
                                            System.out.println("Ingrese el tipo sanguineo del mono: ");
                                            String tipSangM = input.next();
                                            System.out.println("Ingrese el sexo: 1. Macho 2. Hembra");
                                            int opSexoM = input.nextInt();
                                            String sexoM = "";
                                            switch (opSexoM) {
                                                case 1:
                                                    sexoM = "Macho";
                                                    break;
                                                case 2:
                                                    sexoM = "Hembra";
                                                    break;
                                                default:
                                                    System.out.println("Ingrese una opcion valida");
                                            }
                                            System.out.println("Ingrese la altura del mono: ");
                                            double alturaM = input.nextDouble();
                                            System.out.println("Ingrese el peso del mono: ");
                                            int pesoM = input.nextInt();
                                            Mono m = new Mono(color, comidaMono, comidaPKMMono, planeta, lugNacimiento, nomMono, tipSangM, sexoM, alturaM, pesoM);
                                            listaMonos.add(m);
                                            listaPrimates.add(m);
                                            break;
                                        case 2:
                                            mostrarMonos();
                                            System.out.println("Ingrese el indice del mono que desea modificar: ");
                                            int indM = input.nextInt();
                                            System.out.println("Que desea modificar del mono? \n"
                                                    + "1. Color \n"
                                                    + "2. Cantidad de comida del mono \n"
                                                    + "3. Comida p/KM del mono \n"
                                                    + "4. Planeta asignado \n"
                                                    + "5. Lugar de nacimiento \n"
                                                    + "6. Nombre del mono \n"
                                                    + "7. Sexo del mono \n"
                                                    + "8. Altura del mono \n"
                                                    + "9. Peso del mono \n"
                                                    + "10. Salir \n");
                                            int opModMono = input.nextInt();
                                            switch (opModMono) {
                                                case 1:
                                                    System.out.println("Ingrese el nuevo color del mono: 1. Negro 2. Gris");
                                                    int opModColorM = input.nextInt();
                                                    Color c = Color.BLACK;
                                                    switch (opModColorM) {
                                                        case 1:
                                                            c = Color.BLACK;
                                                            break;
                                                        case 2:
                                                            c = Color.GRAY;
                                                            break;
                                                        default:
                                                            System.out.println("Ingrese una opcion valida");
                                                    }
                                                    ((Mono) listaPrimates.get(indM)).setColor(c);
                                                    System.out.println("Color actualizado");

                                                    break;
                                                case 2:
                                                    System.out.println("Ingrese la nueva cantidad de comida del mono: ");
                                                    int cantComMod = input.nextInt();
                                                    while (cantComMod < 1 || cantComMod > 100) {
                                                        System.out.println("Ingrese la nueva cantidad de comida del mono: ");
                                                        cantComMod = input.nextInt();
                                                    }
                                                    ((Mono) listaPrimates.get(indM)).setComida(cantComMod);
                                                    System.out.println("Cantidad de comida actualizado");
                                                    break;
                                                case 3:
                                                    System.out.println("Ingrese el nuevo dato de comida p/KM del mono: ");
                                                    int cantComPKM = input.nextInt();
                                                    ((Mono) listaPrimates.get(indM)).setCome_kilometro(cantComPKM);
                                                    System.out.println("Cantidad de comida/KM actualizada");
                                                    break;
                                                case 4:
                                                    System.out.println("Ingrese el nuevo planeta asignado del mono: ");
                                                    input = new Scanner(System.in);
                                                    String planetaAsigMod = input.nextLine();
                                                    ((Mono) listaPrimates.get(indM)).setPlaneta(planetaAsigMod);
                                                    System.out.println("Planeta actualizado");
                                                    break;
                                                case 5:
                                                    System.out.println("Ingrese el nuevo lugar de nacimiento: ");
                                                    input = new Scanner(System.in);
                                                    String lugNacimientoMod = input.nextLine();
                                                    ((Mono) listaPrimates.get(indM)).setNacimiento(lugNacimientoMod);
                                                    System.out.println("Lugar de nacimiento actualizado");
                                                    break;
                                                case 6:
                                                    System.out.println("Ingrese el nuevo nombre del mono: ");
                                                    input = new Scanner(System.in);
                                                    String nombreModM = input.nextLine();
                                                    ((Mono) listaPrimates.get(indM)).setNombre(nombreModM);
                                                    System.out.println("Nombre actualizado");
                                                    break;
                                                case 7:
                                                    System.out.println("Ingrese el nuevo sexo del mono: 1. Macho 2. Hembra");
                                                    int indModSexM = input.nextInt();
                                                    String sexoModM = "";
                                                    switch (indModSexM) {
                                                        case 1:
                                                            sexoModM = "Macho";
                                                            break;
                                                        case 2:
                                                            sexoModM = "Hembra";
                                                            break;
                                                        default:
                                                            System.out.println("Ingrese una opcion valida");
                                                    }
                                                    ((Mono) listaPrimates.get(indM)).setSexo(sexoModM);
                                                    System.out.println("Sexo actualizado");
                                                    break;
                                                case 8:
                                                    System.out.println("Ingrese la nueva altura del mono: ");
                                                    double alturaModM = input.nextInt();
                                                    ((Mono) listaPrimates.get(indM)).setAltura(alturaModM);
                                                    System.out.println("Altura actualizada");
                                                    break;
                                                case 9:
                                                    System.out.println("Ingrese el nuevo peso del mono: ");
                                                    int pesoModM = input.nextInt();
                                                    ((Mono) listaPrimates.get(indM)).setPeso(pesoModM);
                                                    System.out.println("Peso actualizado. ");
                                                    break;
                                                case 10:
                                                    respCrudM = 'n';
                                                    break;
                                                default:
                                                    System.out.println("Ingrese una opcion valida");
                                            }
                                            break;
                                        case 3:
                                            mostrarMonos();
                                            System.out.println("Seleccione el indice del mono que desea eliminar: ");
                                            int indElimM = input.nextInt();
                                            listaPrimates.remove(indElimM);
                                            break;
                                        case 4: //creacion de gorilas 
                                            System.out.println("Ingrese el IQ del gorila: (130-139) ");
                                            int iqG = input.nextInt();
                                            while (iqG < 130 || iqG > 139) {
                                                System.out.println("Ingrese el IQ del gorila:  (130-139) ");
                                                iqG = input.nextInt();
                                            }
                                            System.out.println("Ingrese cantidad de comida para gorila: ");
                                            int cantComGor = input.nextInt();
                                            while (cantComGor < 1 || cantComGor > 100) {
                                                System.out.println("Ingrese cantidad de comida para gorila: ");
                                                cantComGor = input.nextInt();
                                            }
                                            System.out.println("Ingrese cantidad de comida/km para gorila: ");
                                            int cantComGorPKM = input.nextInt();
                                            System.out.println("Ingrese el planeta de origen: ");
                                            input = new Scanner(System.in);
                                            String planetaGor = input.nextLine();
                                            System.out.println("Ingrese el lugar de nacimiento: ");
                                            input = new Scanner(System.in);
                                            String lugarNacimientoG = input.nextLine();
                                            System.out.println("Ingrese el nombre del gorila: ");
                                            input = new Scanner(System.in);
                                            String nomGorila = input.nextLine();
                                            System.out.println("Ingrese el tipo sanguineo: ");
                                            String tipSang = input.next();
                                            System.out.println("Ingrese el sexo del gorila: 1. Macho 2. Hembra");
                                            int indSexG = input.nextInt();
                                            String sexoG = "";
                                            switch (indSexG) {
                                                case 1:
                                                    sexoG = "Macho";
                                                    break;
                                                case 2:
                                                    sexoG = "Hembra";
                                                    break;
                                                default:
                                                    System.out.println("Ingrese una opcion valida");
                                            }
                                            System.out.println("Ingrese la altura del gorila:");
                                            double alturaG = input.nextDouble();
                                            System.out.println("Ingrese el peso del gorila: ");
                                            int pesoG = input.nextInt();
                                            Gorila g = new Gorila(iqG, cantComGor, cantComGorPKM, planetaGor, lugarNacimientoG, nomGorila, tipSang, sexoG, alturaG, pesoG);
                                            listaGorilas.add(g);
                                            listaPrimates.add(g);
                                            System.out.println("Gorila creado exitosamente");
                                            break;
                                        case 5:
                                            mostrarGorilas();
                                            System.out.println("Seleccione el indice del gorila que desea modificar: ");
                                            int indG = input.nextInt();
                                            System.out.println("Que desea modificar del gorila? \n"
                                                    + "1. IQ \n"
                                                    + "2. Cantidad de comida \n"
                                                    + "3. Cantidad de comida/KM\n"
                                                    + "4. Planeta de origen \n"
                                                    + "5. Lugar de nacimiento\n"
                                                    + "6. Nombre del gorila \n"
                                                    + "7. Tipo sanguineo del gorila \n"
                                                    + "8. Sexo del gorila \n"
                                                    + "9. Altura del gorila \n"
                                                    + "10. Peso del gorila \n"
                                                    + "11. Salir");
                                            int indModG = input.nextInt();
                                            switch (indModG) {
                                                case 1:
                                                    System.out.println("Ingrese el nuevo IQ del gorila: ");
                                                    int iqModG = input.nextInt();
                                                    while (iqModG < 130 || iqModG > 139) {
                                                        System.out.println("Ingrese el nuevo IQ del gorila: ");
                                                        iqModG = input.nextInt();
                                                    }
                                                    ((Gorila) listaPrimates.get(indG)).setIQ(iqModG);
                                                    System.out.println("IQ actualizado exitosamente");
                                                    break;
                                                case 2:
                                                    System.out.println("Ingrese la nueva cantidad de comida: ");
                                                    int cantComModG = input.nextInt();
                                                    while (cantComModG < 1 || cantComModG > 100) {
                                                        System.out.println("Ingrese la nueva cantidad de comida: ");
                                                        cantComModG = input.nextInt();
                                                    }
                                                    ((Gorila) listaPrimates.get(indG)).setComida(cantComModG);
                                                    System.out.println("Cantidad de comida actualizada");
                                                    break;
                                                case 3:
                                                    System.out.println("Ingrese la nueva cantidad de comida/KM: ");
                                                    int cantComPKMModG = input.nextInt();
                                                    ((Gorila) listaPrimates.get(indG)).setCome_kilometro(cantComPKMModG);
                                                    System.out.println("Cantidad de comida/KM actualizada");
                                                    break;
                                                case 4:
                                                    System.out.println("Ingrese el nuevo planeta asignado: ");
                                                    input = new Scanner(System.in);
                                                    String planModG = input.nextLine();
                                                    ((Gorila) listaPrimates.get(indG)).setPlaneta(planModG);
                                                    break;
                                                case 5:
                                                    System.out.println("Ingrese el nuevo lugar de nacimiento: ");
                                                    input = new Scanner(System.in);
                                                    String lugNacimientoModG = input.nextLine();
                                                    ((Gorila) listaPrimates.get(indG)).setNacimiento(lugNacimientoModG);
                                                    System.out.println("Lugar de nacimiento actualizado exitosamente");
                                                    break;
                                                case 6:
                                                    System.out.println("Ingrese el nuevo nombre del gorila: ");
                                                    input = new Scanner(System.in);
                                                    String nomModG = input.nextLine();
                                                    ((Gorila) listaPrimates.get(indG)).setNombre(nomModG);
                                                    break;
                                                case 7:
                                                    System.out.println("Ingrese el nuevo tipo sanguineo: ");
                                                    String tipSangModG = input.next();
                                                    ((Gorila) listaPrimates.get(indG)).setSanguineo(tipSangModG);
                                                    break;
                                                case 8:
                                                    System.out.println("Ingrese el nuevo sexo del gorila: 1. Macho 2. Hembra");
                                                    int indModSexG = input.nextInt();
                                                    String sexoModG = "";
                                                    switch (indModSexG) {
                                                        case 1:
                                                            sexoModG = "Macho";
                                                            break;
                                                        case 2:
                                                            sexoModG = "Hembra";
                                                            break;
                                                        default:
                                                            System.out.println("Ingrese una opcion valida");
                                                    }
                                                    ((Gorila) listaPrimates.get(indG)).setSexo(sexoModG);
                                                    System.out.println("Sexo modificado exitosamente");
                                                    break;
                                                case 9:
                                                    System.out.println("Ingrese la nueva altura del gorila: ");
                                                    double alturaModG = input.nextDouble();
                                                    ((Gorila) listaPrimates.get(indG)).setAltura(alturaModG);
                                                    System.out.println("Altura actualizada exitosamente");
                                                    break;
                                                case 10:
                                                    System.out.println("Ingrese el nuevo peso: ");
                                                    int pesoModG = input.nextInt();
                                                    ((Gorila) listaPrimates.get(indG)).setPeso(pesoModG);
                                                    System.out.println("Peso actualizado exitosamente");
                                                    break;
                                                case 11:
                                                    respCrudM = 'n';
                                                    break;
                                                default:
                                                    throw new AssertionError();
                                            }
                                            break;
                                        case 6:
                                            mostrarGorilas();
                                            System.out.println("Ingrese el indice del gorila que desea eliminar: ");
                                            int indElimG = input.nextInt();
                                            listaGorilas.remove(indElimG);
                                            break;
                                        case 7:
                                            respB = 'n';
                                            break;
                                        default:
                                            System.out.println("Ingrese una opcion valida");
                                    }

                                    break;
                                case 2:
                                    System.out.println("1. Crear metodos de transporte \n"
                                            + "2. Modificar helicoptero \n"
                                            + "3. Modificar avion comercial \n"
                                            + "4. Modificar nave espacial \n"
                                            + "5. Modificar cohete \n"
                                            + "6. Eliminar metodo de transporte \n");
                                    int opCruMT = input.nextInt();
                                    char crudMTresp = 's';
                                    switch (opCruMT) {
                                        case 1:
                                            int opcion,
                                             pos,
                                             pos1;
                                            System.out.println("1. Aereo Normal");
                                            System.out.println("2. Espacial");
                                            System.out.print("Ingrese la opcon que desee creear: ");
                                            opcion = input.nextInt();
                                            switch (opcion) {
                                                case 1:
                                                    System.out.println("1. Helicoptero");
                                                    System.out.println("2. Avion comercial");
                                                    System.out.print("Ingrese la opcion que desee agregar: ");
                                                    pos = input.nextInt();
                                                    switch (pos) {
                                                        case 1:
                                                            int helices,
                                                             patas,
                                                             distancia;
                                                            double altitud;
                                                            String pais_partida,
                                                             pais_llegada;
                                                            System.out.print("Ingrese numero de helices: ");
                                                            helices = input.nextInt();
                                                            System.out.print("Ingrese numero de patas: ");
                                                            patas = input.nextInt();

                                                            System.out.print("Ingrese la distancia en km que puede recorrer: ");
                                                            distancia = input.nextInt();
                                                            System.out.print("Ingrese la altitud: ");
                                                            altitud = input.nextDouble();
                                                            System.out.println("Cuantos primates va a asignar? ");
                                                            int cantPrimAsig = input.nextInt();
                                                            ArrayList primates = new ArrayList();
                                                            for (int i = 0; i < cantPrimAsig; i++) {
                                                                mostrarPrimates();
                                                                System.out.println("Seleccione el indice del primate que desea agregar: ");
                                                                int indPrimAAgre = input.nextInt();
                                                                primates.add(indPrimAAgre);
                                                            }
                                                            System.out.println("Ingrese el tipo de gasolina: 1. super \n 2. Regular \n 3. Diesel");
                                                            int ind = input.nextInt();
                                                            String tipo_gasolina = "";
                                                            switch (ind) {
                                                                case 1:
                                                                    tipo_gasolina = "Super";
                                                                    break;
                                                                case 2:
                                                                    tipo_gasolina = "Regular";
                                                                    break;

                                                                case 3:
                                                                    tipo_gasolina = "Diesel";
                                                                    break;

                                                                default:
                                                                    System.out.println("Ingrese una opcion valida");
                                                            }
                                                            System.out.print("Ingrese el pais de partida: ");
                                                            input = new Scanner(System.in);
                                                            pais_partida = input.nextLine();
                                                            System.out.print("Ingrese el pais de llegada: ");
                                                            input = new Scanner(System.in);
                                                            pais_llegada = input.nextLine();
                                                            Helicoptero h = new Helicoptero(helices, patas, tipo_gasolina, pais_partida, pais_llegada, distancia, altitud, primates);
                                                            listaMediosTransporte.add(h);
                                                            listaHelicopteros.add(h);
                                                            break;

                                                        case 2:
                                                            int pasajeros,
                                                             poss;
                                                            boolean automatico = false;
                                                            System.out.print("Ingrese numero de pasajeros: ");
                                                            pasajeros = input.nextInt();
                                                            System.out.println("Ingrese 1. si funciona el piloto automatico");
                                                            System.out.print("Ingrese 2. si, no funciona el piloto automatico: ");
                                                            poss = input.nextInt();
                                                            if (poss == 1) {
                                                                automatico = true;
                                                            } else if (poss == 2) {
                                                                automatico = false;
                                                            }

                                                            System.out.println("Ingrese el tipo de gasolina: 1. super \n 2. Regular \n 3. Diesel");
                                                            int indi = input.nextInt();
                                                            String tipo_combustible = "";
                                                            switch (indi) {
                                                                case 1:
                                                                    tipo_combustible = "Super";
                                                                    break;
                                                                case 2:
                                                                    tipo_combustible = "Regular";
                                                                    break;

                                                                case 3:
                                                                    tipo_combustible = "Diesel";
                                                                    break;

                                                                default:
                                                                    System.out.println("Ingrese una opcion valida");
                                                            }

                                                            System.out.print("Ingrese la distancia en km que puede recorrer: ");
                                                            distancia = input.nextInt();
                                                            System.out.print("Ingrese la altitud: ");
                                                            altitud = input.nextDouble();
                                                            System.out.println("Cuantos primates va a asignar? ");
                                                            int cantPrimAsigAv = input.nextInt();
                                                            ArrayList primatesAv = new ArrayList();
                                                            for (int i = 0; i < cantPrimAsigAv; i++) {
                                                                mostrarPrimates();
                                                                System.out.println("Seleccione el indice del primate que desea agregar: ");
                                                                int indPrimAAgre = input.nextInt();
                                                                primatesAv.add(indPrimAAgre);
                                                            }
                                                            System.out.println("Ingrese el tipo de gasolina: 1. super \n 2. Regular \n 3. Diesel");
                                                            int indice = input.nextInt();
                                                            String gasolina = "";
                                                            switch (indice) {
                                                                case 1:
                                                                    gasolina = "Super";
                                                                    break;
                                                                case 2:
                                                                    gasolina = "Regular";
                                                                    break;

                                                                case 3:
                                                                    gasolina = "Diesel";
                                                                    break;

                                                                default:
                                                                    System.out.println("Ingrese una opcion valida");
                                                            }
                                                            System.out.print("Ingrese el pais de partida: ");
                                                            input = new Scanner(System.in);
                                                            pais_partida = input.nextLine();
                                                            System.out.print("Ingrese el pais de llegada: ");
                                                            input = new Scanner(System.in);
                                                            pais_llegada = input.nextLine();
                                                            AvionComercial a = new AvionComercial(pasajeros, automatico, gasolina, pais_partida, pais_llegada, distancia, altitud, primatesAv);
                                                            listaMediosTransporte.add(a);
                                                            listaAvionComercial.add(a);
                                                            break;

                                                        default:
                                                            throw new AssertionError();
                                                    }
                                                    //fin agregar
                                                    break;

                                                case 2:
                                                    int pos3;
                                                    System.out.println("1. Nave espacial");
                                                    System.out.println("2. Cohete");
                                                    System.out.print("Ingrese la opcion para agregar: ");
                                                    pos3 = input.nextInt();
                                                    switch (pos3) {
                                                        case 1:
                                                            int dis,
                                                             propulsores;
                                                            double alti;
                                                            String planeta_partida,
                                                             planeta_llegada;
                                                            System.out.print("Ingrese el numero de propulsores: ");
                                                            propulsores = input.nextInt();
                                                            System.out.println("Cuantos primates va a asignar? ");
                                                            int cantPrimAsigNav = input.nextInt();
                                                            ArrayList primatesNav = new ArrayList();
                                                            for (int i = 0; i < cantPrimAsigNav; i++) {
                                                                mostrarPrimates();
                                                                System.out.println("Seleccione el indice del primate que desea agregar: ");
                                                                int indPrimAAgre = input.nextInt();
                                                                primatesNav.add(indPrimAAgre);
                                                            }

                                                            System.out.println("Ingrese el tipo de combustible: 1. quimico solido \n 2. propelente liquido");
                                                            int indice = input.nextInt();
                                                            String tipo_combustible = "";
                                                            switch (indice) {
                                                                case 1:
                                                                    tipo_combustible = "quimico solido";
                                                                    break;
                                                                case 2:
                                                                    tipo_combustible = "propelente liquido";
                                                                    break;

                                                                default:
                                                                    System.out.println("Ingrese una opcion valida");
                                                            }
                                                            System.out.print("Ingrese el planeta de partida: ");
                                                            planeta_partida = input.next();
                                                            System.out.print("Ingrese el planeta de llegada: ");
                                                            planeta_llegada = input.next();

                                                            System.out.print("Ingrese la distancia en km que puede recorrer: ");
                                                            dis = input.nextInt();
                                                            System.out.print("Ingrese la altitud: ");
                                                            alti = input.nextDouble();
                                                            NaveEspacial n = new NaveEspacial(propulsores, tipo_combustible, planeta_partida, planeta_llegada, dis, alti, primatesNav);
                                                            listaMediosTransporte.add(n);
                                                            listaNaveEspacial.add(n);
                                                            break;

                                                        case 2:
                                                            int separaciones;
                                                            System.out.print("Ingrese el numero de separciones: ");
                                                            separaciones = input.nextInt();
                                                            System.out.println("Cuantos primates va a asignar? ");
                                                            int cantPrimAsigCo = input.nextInt();
                                                            ArrayList primatesCo = new ArrayList();
                                                            for (int i = 0; i < cantPrimAsigCo; i++) {
                                                                mostrarPrimates();
                                                                System.out.println("Seleccione el indice del primate que desea agregar: ");
                                                                int indPrimAAgre = input.nextInt();
                                                                primatesCo.add(indPrimAAgre);
                                                            }
                                                            System.out.println("Ingrese el tipo de combustible: 1. quimico solido \n 2. propelente liquido");
                                                            int indic = input.nextInt();
                                                            String tip_combustible = "";
                                                            switch (indic) {
                                                                case 1:
                                                                    tip_combustible = "quimico solido";
                                                                    break;
                                                                case 2:
                                                                    tip_combustible = "propelente liquido";
                                                                    break;

                                                                default:
                                                                    System.out.println("Ingrese una opcion valida");
                                                            }
                                                            System.out.print("Ingrese el planeta de partida: ");
                                                            planeta_partida = input.next();
                                                            System.out.print("Ingrese el planeta de llegada: ");
                                                            planeta_llegada = input.next();

                                                            System.out.print("Ingrese la distancia en km que puede recorrer: ");
                                                            dis = input.nextInt();
                                                            System.out.print("Ingrese la altitud: ");
                                                            alti = input.nextDouble();
                                                            Cohete c = new Cohete(separaciones, tip_combustible, planeta_partida, planeta_llegada, dis, alti, primatesCo);
                                                            listaMediosTransporte.add(c);
                                                            listaCohete.add(c);
                                                            break;
                                                        default:
                                                            throw new AssertionError();
                                                    }
                                                    break;
                                                default:
                                                    System.out.print("opcion invalida");
                                            }
                                            break;
                                        case 2:
                                            mostrarHelicopteros();
                                            System.out.println("Que helicoptero desea modificar? \n");
                                            int indH = input.nextInt();
                                            System.out.println("Que desea modificar del helicoptero? \n"
                                                    + "1. Helices\n"
                                                    + "2. Patas\n"
                                                    + "3. Tipo de gasolina\n"
                                                    + "4. Pais de partida\n"
                                                    + "5. Pais de llegada\n"
                                                    + "6. Distancia\n"
                                                    + "7. Altitud\n"
                                                    + "8. Salir\n");
                                            int opModH = input.nextInt();
                                            char respModH = 's';
                                            switch (opModH) {
                                                case 1:
                                                    System.out.println("Ingrese la nueva cantidad de helices: ");
                                                    int modHel = input.nextInt();
                                                    ((Helicoptero) listaMediosTransporte.get(indH)).setHelices(modHel);
                                                    break;
                                                case 2:
                                                    System.out.println("Ingrese la nueva cantidad de patas: ");
                                                    int modPat = input.nextInt();
                                                    ((Helicoptero) listaMediosTransporte.get(indH)).setPatas(modPat);
                                                    break;
                                                case 3:
                                                    System.out.println("Ingrese el nuevo tipo de gasolina: 1. Super 2. Regular 3. Diesel");
                                                    int indModGas = input.nextInt();
                                                    String tipGasModH = "";
                                                    switch (indModGas) {
                                                        case 1:
                                                            tipGasModH = "Super";
                                                            break;
                                                        case 2:
                                                            tipGasModH = "Regular";
                                                            break;
                                                        case 3:
                                                            tipGasModH = "Diesel";
                                                            break;
                                                        default:
                                                            System.out.println("Ingrese una opcion valida");
                                                    }
                                                    ((Helicoptero) listaMediosTransporte.get(indH)).setGasolina(tipGasModH);
                                                    break;
                                                case 4:
                                                    System.out.println("Ingrese el nuevo pais de partida: ");
                                                    input = new Scanner(System.in);
                                                    String paisPartH = input.nextLine();
                                                    ((Helicoptero) listaMediosTransporte.get(indH)).setPais_partida(paisPartH);
                                                    break;
                                                case 5:
                                                    System.out.println("Ingrese el nuevo pais de llegada: ");
                                                    input = new Scanner(System.in);
                                                    String paisLlegH = input.nextLine();
                                                    ((Helicoptero) listaMediosTransporte.get(indH)).setPais_llegada(paisLlegH);
                                                    break;
                                                case 6:
                                                    System.out.println("Ingrese la nueva distancia: ");
                                                    int distModH = input.nextInt();
                                                    ((Helicoptero) listaMediosTransporte.get(indH)).setDistancia(distModH);
                                                    break;
                                                case 7:
                                                    System.out.println("Ingrese la nueva altitud:");
                                                    int altModH = input.nextInt();
                                                    ((Helicoptero) listaMediosTransporte.get(indH)).setAltitud(altModH);
                                                    break;
                                                case 8:
                                                    respModH = 'n';
                                                    break;
                                                default:
                                                    System.out.println("Ingrese una opcion valida");
                                            }

                                            break;
                                        case 3:
                                            mostrarAviones();
                                            System.out.println("Ingrese el indice del avion que desea modificar: \n");
                                            int indAv = input.nextInt();
                                            System.out.println("Que desea modificar del avion comercial?\n"
                                                    + "1. Pasajeros\n"
                                                    + "2. Automatico o no\n"
                                                    + "3. Tipo de gasolina\n"
                                                    + "4. Pais de partida\n"
                                                    + "5. Pais de llegada\n"
                                                    + "6. Distancia\n"
                                                    + "7. Altitud\n"
                                                    + "8. Salir\n");
                                            int opModA = input.nextInt();
                                            char respModA = 's';
                                            switch (opModA) {
                                                case 1:
                                                    System.out.println("Ingrese la nueva cantidad de pasajeros: ");
                                                    int pasajModA = input.nextInt();
                                                    ((AvionComercial) listaMediosTransporte.get(indAv)).setPasajeros(pasajModA);
                                                    break;
                                                case 2:
                                                    System.out.println("Ingrese si es automatico: 1. Automatico 2. No automatico");
                                                    int indAut = input.nextInt();
                                                    boolean autModA = false;
                                                    switch (indAut) {
                                                        case 1:
                                                            autModA = true;
                                                            break;
                                                        case 2:
                                                            autModA = false;
                                                            break;
                                                        default:
                                                            System.out.println("Ingrese una opcion valida");
                                                    }
                                                    ((AvionComercial) listaMediosTransporte.get(indAv)).setAutomatico(autModA);
                                                    break;
                                                case 3:
                                                    System.out.println("Ingrese el nuevo tipo de gasolina: 1. Super 2. Regular 3. Diesel");
                                                    int indModGas = input.nextInt();
                                                    String tipGasModA = "";
                                                    switch (indModGas) {
                                                        case 1:
                                                            tipGasModA = "Super";
                                                            break;
                                                        case 2:
                                                            tipGasModA = "Regular";
                                                            break;
                                                        case 3:
                                                            tipGasModA = "Diesel";
                                                            break;
                                                        default:
                                                            System.out.println("Ingrese una opcion valida");
                                                    }
                                                    ((AvionComercial) listaMediosTransporte.get(indAv)).setGasolina(tipGasModA);
                                                    break;
                                                case 4:
                                                    System.out.println("Ingrese pais de partida: ");
                                                    input = new Scanner(System.in);
                                                    String paisParModA = input.nextLine();
                                                    ((AvionComercial) listaMediosTransporte.get(indAv)).setPais_partida(paisParModA);
                                                    break;
                                                case 5:
                                                    System.out.println("Ingrese pais de llegada: ");
                                                    input = new Scanner(System.in);
                                                    String paisLlegModA = input.nextLine();
                                                    ((AvionComercial) listaMediosTransporte.get(indAv)).setPais_llegada(paisLlegModA);
                                                    break;
                                                case 6:
                                                    System.out.println("Ingrese la distancia: ");
                                                    int distModA = input.nextInt();
                                                    ((AvionComercial) listaMediosTransporte.get(indAv)).setDistancia(distModA);
                                                    break;
                                                case 7:
                                                    System.out.println("Ingrese la altitud: ");
                                                    double altModA = input.nextInt();
                                                    ((AvionComercial) listaMediosTransporte.get(indAv)).setAltitud(altModA);
                                                    break;
                                                case 8:
                                                    respModA = 'n';
                                                    break;
                                                default:
                                                    System.out.println("Ingrese una opcion valida: ");
                                            }

                                            break;
                                        case 4:
                                            mostrarNave();
                                            System.out.println("Que nave espacial desea modificar? ");
                                            int indN = input.nextInt();
                                            System.out.println("Que desea modificar de la nave? \n"
                                                    + "1. Propulsores \n"
                                                    + "2. Tipo combustible\n"
                                                    + "3. Planeta partida\n"
                                                    + "4. Planeta llegada\n"
                                                    + "5. Distancia\n"
                                                    + "6. Altitud\n"
                                                    + "7. Salir\n");
                                            int indModN = input.nextInt();
                                            char respModN = 's';
                                            while (respModN == 's') {
                                                switch (indModN) {
                                                    case 1:
                                                        System.out.println("Ingrese la nueva cantidad de propulsores: ");
                                                        int propModN = input.nextInt();
                                                        ((NaveEspacial) listaMediosTransporte.get(indN)).setPropulsores(propModN);
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese el nuevo tipo de combustible: 1. Quimico 2. Propelente");
                                                        int indModGas = input.nextInt();
                                                        String tipGasModN = "";
                                                        switch (indModGas) {
                                                            case 1:
                                                                tipGasModN = "Quimico solido";
                                                                break;
                                                            case 2:
                                                                tipGasModN = "Propelente liquido";
                                                                break;
                                                            default:
                                                                System.out.println("Ingrese una opcion valida");
                                                        }
                                                        ((NaveEspacial) listaMediosTransporte.get(indN)).setTipo_combustible(tipGasModN);
                                                        break;
                                                    case 3:
                                                        System.out.println("Ingrese el nuevo planeta de partida: ");
                                                        input = new Scanner(System.in);
                                                        String planPartN = input.nextLine();
                                                        ((NaveEspacial) listaMediosTransporte.get(indN)).setPlaneta_partidad(planPartN);
                                                        break;
                                                    case 4:
                                                        System.out.println("Ingrese nuevo planeta de llegada: ");
                                                        input = new Scanner(System.in);
                                                        String planLlegN = input.nextLine();
                                                        ((NaveEspacial) listaMediosTransporte.get(indN)).setPlaneta_llegada(planLlegN);
                                                        break;
                                                    case 5:
                                                        System.out.println("Ingrese la distancia: ");
                                                        int distModN = input.nextInt();
                                                        ((NaveEspacial) listaMediosTransporte.get(indN)).setDistancia(distModN);
                                                        break;
                                                    case 6:
                                                        System.out.println("Ingrese la altitud: ");
                                                        int altModN = input.nextInt();
                                                        ((NaveEspacial) listaMediosTransporte.get(indN)).setAltitud(altModN);
                                                        break;
                                                    case 7:
                                                        respModN = 'n';
                                                        break;
                                                    default:
                                                        throw new AssertionError();
                                                }
                                            }

                                            break;
                                        case 5:
                                            mostrarCo();
                                            System.out.println("Seleccione el indice del cohete que desea modificar");
                                            int indC = input.nextInt();
                                            System.out.println("Que desea modificar del cohete? \n"
                                                    + "1. Separaciones\n"
                                                    + "2. Combustible\n"
                                                    + "3. Planeta partida\n"
                                                    + "4. Planeta llegada\n"
                                                    + "5. Distancia\n"
                                                    + "6. Altitud\n");
                                            int opModCo = input.nextInt();
                                            switch (opModCo) {
                                                case 1:
                                                    System.out.println("Ingrese la nueva cantidad de separaciones: ");
                                                    int sepCoMod = input.nextInt();
                                                    ((Cohete) listaMediosTransporte.get(indC)).setSeparaciones(sepCoMod);
                                                    break;
                                                case 2:
                                                    System.out.println("Ingrese el nuevo tipo de combustible: 1. Quimico 2. Propelente");
                                                    int indModGas = input.nextInt();
                                                    String tipGasModC = "";
                                                    switch (indModGas) {
                                                        case 1:
                                                            tipGasModC = "Quimico solido";
                                                            break;
                                                        case 2:
                                                            tipGasModC = "Propelente liquido";
                                                            break;
                                                        default:
                                                            System.out.println("Ingrese una opcion valida");
                                                    }
                                                    ((Cohete) listaMediosTransporte.get(indC)).setTipo_combustible(tipGasModC);
                                                    break;
                                                case 3:
                                                    System.out.println("Ingrese el planeta de partida: ");
                                                    input = new Scanner(System.in);
                                                    String planPaC = input.nextLine();
                                                    ((Cohete) listaMediosTransporte.get(indC)).setPlaneta_partidad(planPaC);

                                                    break;
                                                case 4:
                                                    System.out.println("Ingrese el planeta de llegada: ");
                                                    input = new Scanner(System.in);
                                                    String planLlegC = input.nextLine();
                                                    ((Cohete) listaMediosTransporte.get(indC)).setPlaneta_llegada(planLlegC);
                                                    break;
                                                case 5:
                                                    System.out.println("Ingrese la nueva distancia: ");
                                                    int distModC = input.nextInt();
                                                    ((Cohete) listaMediosTransporte.get(indC)).setDistancia(distModC);
                                                    break;
                                                case 6:
                                                    System.out.println("Ingrese la nueva altura: ");
                                                    int altModC = input.nextInt();
                                                    ((Cohete) listaMediosTransporte.get(indC)).setAltitud(altModC);
                                                    break;
                                                default:
                                                    System.out.println("Ingrese una opcion valida");
                                            }
                                            break;
                                        case 6:
                                            mostrarT();
                                            System.out.println("Ingrese el indice del metodo de transporte que desea eliminar: ");
                                            int indElimT = input.nextInt();
                                            listaMediosTransporte.remove(indElimT);
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }

                                    break;
                                case 3:
                                    Transporte tr = new Transporte();
                                    tr.viajar();
                                    break;
                                case 4:
                                    respA='n';
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion valida");

                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Bienvenido a la creacion de usuario");
                    System.out.println("Ingrese su nombre:");
                    input = new Scanner(System.in);
                    String nombre = input.nextLine();
                    System.out.println("Ingrese su grupo sanguineo: ");
                    input = new Scanner(System.in);
                    String grupoSang = input.nextLine();
                    System.out.println("Ingrese el sexo: 1. Masculino 2. Femenino");
                    String sexo = "";
                    int opSexo = input.nextInt();
                    switch (opSexo) {
                        case 1:
                            sexo = "Masculino";
                            break;
                        case 2:
                            sexo = "Femenino";
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                    }
                    System.out.println("Ingrese altura: ");
                    double altura = input.nextDouble();
                    System.out.println("Ingrese peso: ");
                    int peso = input.nextInt();
                    System.out.println("Ingrese su correo electronico: ");
                    input = new Scanner(System.in);
                    String correo = input.nextLine();
                    System.out.println("Ingrese su usuario: ");
                    String usuario = input.next();
                    boolean userOrigCheck = false;
                    if (usuarios.contains(usuario)) {
                        System.out.println("Usuario ya existente");
                        while (userOrigCheck == false) {
                            System.out.println("Ingrese un usuario: ");
                            usuario = input.next();
                            if (usuarios.contains(usuario)) {
                                System.out.println("Usuario ya existente");
                            } else {
                                userOrigCheck = true;
                                usuarios.add(usuario);
                            }
                        }
                    }
                    System.out.println("Cuantos idiomas habla? ");
                    int cantIdiomas = input.nextInt();
                    ArrayList idiomas = new ArrayList();
                    for (int i = 0; i < cantIdiomas; i++) {
                        System.out.println("Ingrese el " + (i + 1) + " idioma:");
                        String idioma = input.next();
                        idiomas.add(idioma);
                    }
                    System.out.println("Ingrese su contraseña: ");
                    String contraseña = input.next();
                    contraseñas.add(contraseña);
                    System.out.println("Ingrese su fecha de nacimiento: (dd/MM/yyyy)");
                    input = new Scanner(System.in);
                    String fecha = input.nextLine();
                    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha_nacimiento = sd.parse(fecha);
                    Ingeniero i = new Ingeniero(correo, usuario, idiomas, contraseña, fecha_nacimiento, nombre, grupoSang, sexo, altura, peso);
                    listaIngenieros.add(i);
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    public static void mostrarMonos() {
        for (Object oh : listaPrimates) {
            if (oh instanceof Mono) {
                System.out.println("(" + listaPrimates.indexOf(oh) + ") " + oh);
            }
        }
    }

    public static void mostrarGorilas() {
        for (Object oh : listaPrimates) {
            if (oh instanceof Gorila) {
                System.out.println("(" + listaPrimates.indexOf(oh) + ")" + oh);
            }
        }
    }

    public static void mostrarPrimates() {
        for (Object oh : listaPrimates) {
            if (oh instanceof Primate) {
                System.out.println("(" + listaPrimates.indexOf(oh) + ") " + oh);
            }
        }
    }

    public static void mostrarHelicopteros() {
        for (Object oh : listaMediosTransporte) {
            if (oh instanceof Helicoptero) {
                System.out.println("(" + listaMediosTransporte.indexOf(oh) + ") " + oh);
            }
        }
    }

    public static void mostrarAviones() {
        for (Object oh : listaMediosTransporte) {
            if (oh instanceof AvionComercial) {
                System.out.println("(" + listaMediosTransporte.indexOf(oh) + ") " + oh);
            }
        }
    }

    public static void mostrarNave() {
        for (Object oh : listaMediosTransporte) {
            if (oh instanceof NaveEspacial) {
                System.out.println("(" + listaMediosTransporte.indexOf(oh) + ") " + oh);
            }
        }
    }

    public static void mostrarCo() {
        for (Object oh : listaMediosTransporte) {
            if (oh instanceof Cohete) {
                System.out.println("(" + listaMediosTransporte.indexOf(oh) + ") " + oh);
            }
        }
    }

    public static void mostrarT() {
        for (int i = 0; i < listaMediosTransporte.size(); i++) {
            System.out.println(i + ". " + listaMediosTransporte.get(i));
        }
    }

    public static void autenticar(String usuario) {
        for (Object u : usuarios) {
            String a = ((Ingeniero) usuarios.get(usuarios.indexOf(u))).getUsuario();
            if (a.equalsIgnoreCase(usuario)) {
                auth = true;
            }

        }
    }

}
