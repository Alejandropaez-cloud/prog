package practica;

public class MétodosCalculadora {
    
    // Creamos los métodos, la idea es es hces cuatro métdoos uno correspondiente a cada operación aritmtica.
    // Sumar, Restar, Multiplicar, y Dividir.

    
    public static double Sumar (double num1, double num2) {
         
        double resultadoSuma = num1 + num2;
        return resultadoSuma;
    }
    public static double Restar (double num1, double num2) {

        double resultadoResta = num1 - num2;
        return resultadoResta;
    }
    public static double Multiplicar (double num1, double num2) {

        double resultadoMultiplicacion = num1 * num2;
        return resultadoMultiplicacion;
    }
    public static double Division (double num1, double num2) {
        
        double resultadoDivision = num1 / num2;        
        return resultadoDivision;
    }
}
