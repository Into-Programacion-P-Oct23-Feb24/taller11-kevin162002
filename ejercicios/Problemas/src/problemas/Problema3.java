/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String resultado;
        double nota1;
        double nota2;
        double nota3;
        double nota4;

        System.out.print("Ingrese la nota 1:\n");
        nota1 = entrada.nextDouble();
        System.out.print("Ingrese la nota 2:\n");
        nota2 = entrada.nextDouble();
        System.out.print("Ingrese la nota 3:\n");
        nota3 = entrada.nextDouble();
        System.out.print("Ingrese la nota 4 :\n");
        nota4 = entrada.nextDouble();

        resultado = obtenerParametros(nota1, nota2, nota3, nota4);
        System.out.println("El promedio de las notas: "
                + nota1 + " / " + nota2 + " / " + nota3 + " / " + nota4 + " es: "
                        + "" + resultado);
    }

    public static String obtenerParametros(double a, double b, double c, double d) {
        double promedio = (a + b + c + d) / 4;

        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio >= 5.1 && promedio <= 8) {
            return "Bueno";
        } else if (promedio >= 8.1 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio >= 9.1 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Promedio fuera de rango";
        }
    }

}
