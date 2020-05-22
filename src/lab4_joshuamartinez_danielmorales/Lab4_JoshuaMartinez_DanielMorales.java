package lab4_joshuamartinez_danielmorales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Lab4_JoshuaMartinez_DanielMorales {
    
    static Scanner input =  new Scanner(System.in);
    static ArrayList usuarios = new ArrayList();
    static ArrayList contraseñas = new ArrayList();

    public static void main(String[] args) throws ParseException {
        char resp = 's';
        while (resp=='s'||resp=='S') {
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
                        } else{
                            System.out.println("Contraseña incorrecta");
                        }
                    } else{
                        System.out.println("Usuario incorrecto");
                    }
                    
                    while (authenticated) {
                        char respA = 's';
                        while (respA=='s'||respA=='S') {
                            
                        }
                    }
                    break;
                case 2:
                    System.out.println("Bienvenido a la creacion de usuario");
                    System.out.println("Ingrese su nombre:");
                    String nombre = input.nextLine();
                    input = new Scanner(System.in);
                    System.out.println("Ingrese su grupo sanguineo: ");
                    String grupoSang = input.nextLine();
                    input = new Scanner(System.in);
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
                    String correo = input.nextLine();
                    input = new Scanner(System.in);
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
                        System.out.println("Ingrese el " + i+1 + " idioma:" );
                        String idioma = input.next();
                        idiomas.add(idioma);
                    }
                    System.out.println("Ingrese su contraseña: ");
                    String contraseña = input.next();
                    contraseñas.add(contraseña);
                    System.out.println("Ingrese su fecha de nacimiento: (dd/MM/yyyy)");
                    String fecha = input.nextLine();
                    input = new Scanner(System.in);
                    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha_nacimiento = sd.parse(fecha);
                    Ingeniero i =  new Ingeniero(correo, usuario, idiomas, contraseña, fecha_nacimiento, nombre, grupoSang, sexo, altura, peso);
                    
                    
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
}
