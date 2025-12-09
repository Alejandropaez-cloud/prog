package practica;

import java.util.Scanner;

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a
        // 18).
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        System.out.println("Cuantos años tienes chaval?");

        System.out.println("El chaval tiene " + edad + " años.");
        if (edad >= 18) {
            System.out.println("El chaval tiene que votar ");
            sc.nextLine();
        } else {
            System.out.println("Es un niño chico.");
        }

        sc.close();

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        // 4. Crea un programa que diga si un número es par o impar.

        // 5. Verifica si un número está en el rango de 1 a 100.

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con
        // switch.

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        // "Suspenso" según la nota (0-100).

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al
        // menos 15 años o ir acompañado.

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

    }
}