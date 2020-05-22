package lab4_joshuamartinez_danielmorales;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Lab4_JoshuaMartinez_DanielMorales {

    static Scanner input = new Scanner(System.in);
    static ArrayList usuarios = new ArrayList();
    static ArrayList contraseñas = new ArrayList();
    static ArrayList listaIngenieros = new ArrayList();
    static ArrayList listaMonos = new ArrayList();
    static ArrayList listaGorilas = new ArrayList();

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
                    if (usuarios.contains(userRecibido)) {
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
                                    + "3. Salir");
                            int opMe = input.nextInt();
                            char respB = 's';
                            while (respB == 's' || respB == 'S') {
                                switch (opMe) {
                                    case 1:
                                        System.out.println("1. Crear mono \n"
                                                + "2. Modificar mono \n"
                                                + "3. Eliminar mono \n"
                                                + "4. Crear gorila \n"
                                                + "5. Modificar gorila \n"
                                                + "6. Eliminar gorila \n"
                                                + "7. Salir \n");
                                        int opA = input.nextInt();
                                        char respCrudM = 's';
                                        while (respCrudM == 's' || respCrudM == 'S') {
                                            switch (opA) {
                                                case 1:
                                                    System.out.println("Ingrese el color del mono: 1. Negro 2. Gris");
                                                    Color color;
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
                                                    Mono m = new Mono(color, comidaMono, comidaPKMMono, planeta, lugNacimiento, nomMono, sexoM, alturaM, pesoM);
                                                    listaMonos.add(m);
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
                                                            ((Mono) listaMonos.get(indM)).setColor(c);
                                                            System.out.println("Color actualizado");

                                                            break;
                                                        case 2:
                                                            System.out.println("Ingrese la nueva cantidad de comida del mono: ");
                                                            int cantComMod = input.nextInt();
                                                            ((Mono) listaMonos.get(indM)).setComida(cantComMod);
                                                            System.out.println("Cantidad de comida actualizado");
                                                            break;
                                                        case 3:
                                                            System.out.println("Ingrese el nuevo dato de comida p/KM del mono: ");
                                                            int cantComPKM = input.nextInt();
                                                            ((Mono) listaMonos.get(indM)).setCome_kilometro(cantComPKM);
                                                            System.out.println("Cantidad de comida/KM actualizada");
                                                            break;
                                                        case 4:
                                                            System.out.println("Ingrese el nuevo planeta asignado del mono: ");
                                                            input = new Scanner(System.in);
                                                            String planetaAsigMod = input.nextLine();
                                                            ((Mono) listaMonos.get(indM)).setPlaneta(planetaAsigMod);
                                                            System.out.println("Planeta actualizado");
                                                            break;
                                                        case 5:
                                                            System.out.println("Ingrese el nuevo lugar de nacimiento: ");
                                                            input = new Scanner(System.in);
                                                            String lugNacimientoMod = input.nextLine();
                                                            ((Mono) listaMonos.get(indM)).setNacimiento(lugNacimientoMod);
                                                            System.out.println("Lugar de nacimiento actualizado");
                                                            break;
                                                        case 6:
                                                            System.out.println("Ingrese el nuevo nombre del mono: ");
                                                            input = new Scanner(System.in);
                                                            String nombreModM = input.nextLine();
                                                            ((Mono) listaMonos.get(indM)).setNombre(nombreModM);
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
                                                            ((Mono) listaMonos.get(indM)).setSexo(sexoModM);
                                                            System.out.println("Sexo actualizado");
                                                            break;
                                                        case 8:
                                                            System.out.println("Ingrese la nueva altura del mono: ");
                                                            double alturaModM = input.nextInt();
                                                            ((Mono) listaMonos.get(indM)).setAltura(alturaModM);
                                                            System.out.println("Altura actualizada");
                                                            break;
                                                        case 9:
                                                            System.out.println("Ingrese el nuevo peso del mono: ");
                                                            int pesoModM = input.nextInt();
                                                            ((Mono) listaMonos.get(indM)).setPeso(pesoModM);
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
                                                    listaMonos.remove(indElimM);
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
                                                            ((Gorila) listaGorilas.get(indG)).setIQ(iqModG);
                                                            System.out.println("IQ actualizado exitosamente");
                                                            break;
                                                        case 2:
                                                            System.out.println("Ingrese la nueva cantidad de comida: ");
                                                            int cantComModG = input.nextInt();
                                                            ((Gorila) listaGorilas.get(indG)).setComida(cantComModG);
                                                            System.out.println("Cantidad de comida actualizada");
                                                            break;
                                                        case 3:
                                                            System.out.println("Ingrese la nueva cantidad de comida/KM: ");
                                                            int cantComPKMModG = input.nextInt();
                                                            ((Gorila) listaGorilas.get(indG)).setCome_kilometro(cantComPKMModG);
                                                            System.out.println("Cantidad de comida/KM actualizada");
                                                            break;
                                                        case 4:
                                                            System.out.println("Ingrese el nuevo planeta asignado: ");
                                                            input = new Scanner(System.in);
                                                            String planModG = input.nextLine();
                                                            ((Gorila) listaGorilas.get(indG)).setPlaneta(planModG);
                                                            break;
                                                        case 5:
                                                            System.out.println("Ingrese el nuevo lugar de nacimiento: ");
                                                            input = new Scanner(System.in);
                                                            String lugNacimientoModG = input.nextLine();
                                                            ((Gorila) listaGorilas.get(indG)).setNacimiento(lugNacimientoModG);
                                                            System.out.println("Lugar de nacimiento actualizado exitosamente");
                                                            break;
                                                        case 6:
                                                            System.out.println("Ingrese el nuevo nombre del gorila: ");
                                                            input = new Scanner(System.in);
                                                            String nomModG = input.nextLine();
                                                            ((Gorila) listaGorilas.get(indG)).setNombre(nomModG);
                                                            break;
                                                        case 7:
                                                            System.out.println("Ingrese el nuevo tipo sanguineo: ");
                                                            String tipSangModG = input.next();
                                                            ((Gorila) listaGorilas.get(indG)).setSanguineo(tipSangModG);
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
                                                            ((Gorila) listaGorilas.get(indG)).setSexo(sexoModG);
                                                            System.out.println("Sexo modificado exitosamente");
                                                            break;
                                                        case 9:
                                                            System.out.println("Ingrese la nueva altura del gorila: ");
                                                            double alturaModG = input.nextDouble();
                                                            ((Gorila) listaGorilas.get(indG)).setAltura(alturaModG);
                                                            System.out.println("Altura actualizada exitosamente");
                                                            break;
                                                        case 10:
                                                            System.out.println("Ingrese el nuevo peso: ");
                                                            int pesoModG = input.nextInt();
                                                            ((Gorila) listaGorilas.get(indG)).setPeso(pesoModG);
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
                                                default:
                                                    System.out.println("Ingrese una opcion valida");
                                            }
                                        }

                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        respB = 'n';
                                        break;
                                    default:
                                        System.out.println("Ingrese una opcion valida");
                                }
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
                    throw new AssertionError();
            }
        }
    }

    public static void mostrarMonos() {
        for (int i = 0; i < listaMonos.size(); i++) {
            System.out.println(i + ". " + listaMonos.get(i));
        }
    }

    public static void mostrarGorilas() {
        for (int i = 0; i < listaGorilas.size(); i++) {
            System.out.println(i + ". " + listaGorilas.get(i));
        }
    }

}
