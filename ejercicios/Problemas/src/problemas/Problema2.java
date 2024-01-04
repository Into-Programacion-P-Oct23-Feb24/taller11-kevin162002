/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double aCuadrado;
        double aTriangulo;
        double aRectangulo;

        System.out.println("Ingrese el numero 1 si desea calcular el area del "
                + "cuadrado");
        aCuadrado = entrada.nextDouble();
        System.out.println("Ingrese el numero 1 si desea calcular el area del "
                + "triangulo");
        aTriangulo = entrada.nextDouble();
        System.out.println("Ingrese el numero 1 si desea calcular el area del "
                + "rectangulo");
        aRectangulo = entrada.nextDouble();

        obtenerAreaCuadrado(aCuadrado);
        obtenerAreaTriangulo(aTriangulo);
        obtenerAreaRectangulo(aRectangulo);
    }

    public static double obtenerAreaCuadrado(double a) {
        double operacion = a + a + a + a;
        return operacion;
    }

    public static double obtenerAreaTriangulo(double b) {
        double operacion = b * b / 2;
        return operacion;
    }

    public static double obtenerAreaRectangulo(double c) {
        double operacion = c * c;
        return operacion;
    }
}
