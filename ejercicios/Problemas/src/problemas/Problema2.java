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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner entrada = new Scanner(System.in);
        int valorIngresado;
        System.out.print("Escoja el numeral para la operacion que desea realizar\n"
                + "1) Calcular area del cuadrado\n"
                + "2) Calcular area del triangulo\n"
                + "3) Calcular area del rectangulo\n");
        valorIngresado = entrada.nextInt();
        if (valorIngresado == 1) {
            obtenerAreaCuadrado();
        } else {
            if (valorIngresado == 2) {
                obtenerAreaTriangulo();
            } else {
                if (valorIngresado == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("Dato no valido");
                }
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double l1;
        System.out.println("Escribir L1");
        l1 = entrada.nextDouble();
        l1 = l1 * 4;
        System.out.printf("El area del cuadrado es:%.2f\n",l1);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese base");
        base = entrada.nextDouble();
        System.out.println("Ingrese altura");
        altura = entrada.nextDouble();
        area = base * altura / 2;
        System.out.printf("El area del triangulo es:%.2f\n",area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese base");
        base = entrada.nextDouble();
        System.out.println("Ingrese altura");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.printf("El area del rectangulo es:%.2f\n",area);
    }
}
