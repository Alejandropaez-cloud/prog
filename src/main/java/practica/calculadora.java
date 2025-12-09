package practica;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        // Creamos el Scanner que vamos a usar posteriormente.
        Scanner sc = new Scanner(System.in);

        // Creación de variables
        int operacion = 0;
        System.out.println("Elige la operación deseada: Sumar(1), Restar(2), Multiplicación(3) o División(4)");
        operacion = sc.nextInt();
        do {
                // Creamos el switch.
            switch (operacion) {
                case 1:
                    System.out.println("Has introducido la opción sumar.");
                    System.out.println("Introduce el primer dato.");
                    int num1 = sc.nextInt();
                    System.out.println("Introduce el segundo dato.");
                    int num2 = sc.nextInt();
                    System.out.println(MétodosCalculadora.Sumar(num1, num2));
                    break;

                case 2:
                    System.out.println("Has introducido la opción restar.");
                    System.out.println("Introduce el primer dato.");
                    num1 = sc.nextInt();
                    System.out.println("Introduce el segundo dato.");
                    num2 = sc.nextInt();
                    System.out.println(MétodosCalculadora.Restar(num1, num2));
                    break;
                
                case 3: 
                    System.out.println("Has introducido la opción multiplicación.");
                    System.out.println("Introduce el primer dato.");
                    num1 = sc.nextInt();
                    System.out.println("Introduce el segundo dato.");
                    num2 = sc.nextInt();
                    System.out.println(MétodosCalculadora.Multiplicar(num1, num2));
                    break;
                
                case 4:
                    System.out.println("Has introducido la opción división.");
                    System.out.println("Introduce el primer dato.");
                    num1 = sc.nextInt();
                    System.out.println("Introduce el segundo dato.");
                    num2 = sc.nextInt();
                    System.out.println(MétodosCalculadora.Division(num1, num2));

                
                } while (operacion == 0);

                /*
                Operacion = 0 --> SALIR.
                Operacion = 1 --> SUMAR.
                Operacion = 2 --> RESTAR.
                Operacion = 3 --> MULTIPLICACION.
                Operacion = 4 --> DIVISION.
                */
                    
            }
        }            
        
    }

    

