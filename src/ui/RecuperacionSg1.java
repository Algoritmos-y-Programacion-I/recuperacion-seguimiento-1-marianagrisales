import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;

public class RecuperacionSg1 {

    private Scanner escaner;

    private RecuperacionSg1() {
        escaner = new Scanner(System.in); 
    }

    public static void main(String[] args) {
    
        RecuperacionSg1 mainApp = new RecuperacionSg1();
		mainApp.run();

    }

    public void run(){
        
        System.out.println("Para el primer ejercicio vamos a ingresar 3 valores");
        System.out.println("Ingresa el primer valor:");
        int valor1 = escaner.nextInt(); 
        System.out.println("Ingresa el segundo valor:");
        int valor2 = escaner.nextInt();
        System.out.println("Ingresa el tercer valor:");
        int valor3 = escaner.nextInt();

        System.out.println("La cantidad de números que se repiten son: " + contarIguales(valor1, valor2, valor3));

        System.out.println("-----------------------------------------------------------------------");


        System.out.println("Ahora pasaremos al segundo ejercicio");
        System.out.println("Cual es tu nombre:");
        escaner.nextLine();
        String nombre = escaner.nextLine();  
        System.out.println("Ingresa la opcion 1 o 0:");
        int opcion = escaner.nextInt();

        System.out.println(saludaOpcion(nombre, opcion));

        System.out.println("-----------------------------------------------------------------------");
       
        System.out.println("Ahora pasaremos al tercer ejercicio");
        System.out.println("Dame 3 palabras");
        System.out.println("Cual es la primera ?");
        escaner.nextLine();
        String palabra31 = escaner.nextLine();  
        System.out.println("Cual es la segunda ?");
        String palabra32 = escaner.nextLine(); 
        System.out.println("Cual es la tercera ?");
        String palabra33 = escaner.nextLine(); 

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Ahora harmeos el 4 ejercicio");
        System.out.println("Dame una palabra ?");
        escaner.nextLine();
        String palabra41 = escaner.nextLine(); 
        System.out.println("Dame otra palabra ?");
        String palabra42 = escaner.nextLine(); 

        System.out.println(letraIgual(palabra41, palabra42));
        
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("Para el quinto ejercicio vamos a ingresar 3 valores");
        System.out.println("Ingresa valor a:");
        int a = escaner.nextInt(); 
        System.out.println("Ingresa valor b:");
        int b = escaner.nextInt();
        System.out.println("Ingresa valor c:");
        int c = escaner.nextInt();
    }


    // Metodo que cumple el primer ejercicio

    public static int contarIguales(int valor1, int valor2, int valor3) {
        int contador = 1;
       
        if (valor1 == valor2) {
            contador++;
        }
        if (valor1 == valor3) {
            contador++;
        }

        if (valor2 == valor3 && valor1 != valor2) {
            contador++;
        }

        if (valor1 == valor2 && valor2 == valor3) {
            contador = 3;
        }

        if(valor1 != valor3 && valor3 != valor2){
            contador = 0;
        }

        return contador;
    }

    //Metodo que cumple el segundo ejercicio

    public static String saludaOpcion(String nombre, int opcion) {
        if (opcion == 1) {
            return "Hola " + nombre;
        } else if (opcion == 0) {
            return "Adios " + nombre;
        } else {
            return "Opción no válida"; 
        }
    }

    // Metodo que cumple el tercer ejercicio
    
    // Metodo que cumple el cuarto ejercicio
    public static boolean letraIgual(String palabra41, String palabra42) {
        if(palabra41.length() >= 2 || palabra42.length() >= 2){
            System.out.println("Error de cantidad de caracteres");
            return false;
        }

        char charpalabra41 = palabra41.charAt(1);
        char charpalabra42 = palabra42.charAt(1);

        return charpalabra41 == charpalabra42;

    }
}