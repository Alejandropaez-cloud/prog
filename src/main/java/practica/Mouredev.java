package practica;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Mouredev {
    public static void main(String[] args) {
        // Creacion de la variable nombre.
        String name = "Alejandro";
        // Impresión de la cantidad de caracteres.
        System.out.println(name.length());
        // Impresión de un caracter de una posción especifica de la cadena de texto
        System.out.println(name.charAt(name.length() - 1));
        // Mayusculas.
        System.out.println(name.toUpperCase());
        // Minusculas.
        System.out.println(name.toLowerCase());

        // Comprobare si contiene.
        System.out.println("Hola Java".contains("Alejandro"));
        System.out.println("Hola Java".contains("ava"));

        // Comparación.
        System.out.println(name.equals("Alejandro"));
        System.out.println(name.equals("alejandro"));
        System.out.println(name.equalsIgnoreCase("alejandro"));

        // Replace
        System.out.println("Hola, me llamo Alejandro Páez Milán".replace("Alejandro", "Antonio José"));


    }
}