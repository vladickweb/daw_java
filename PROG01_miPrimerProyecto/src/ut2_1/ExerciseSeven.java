package ut2_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Diseña un algoritmo que lea una cantidad en euros y la cotización del Euro
 * en dólares, calcula y muestra la equivalencia de dicha cantidad en Euros y
 * dólares.
 */

/**
 * Pseudocódigo:
 * - Pedir cantidad en euros
 * - Pedir cotización del Euro en dólares
 * - Comprobar que cantidad y cotización son mayores que 0
 * - Calcular equivalencia en dólares
 * - Mostrar equivalencia en dólares
 * - Fin
 */

public class ExerciseSeven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca la cantidad en euros: ");
    try {
      double euros = sc.nextDouble();

      System.out.println("Introduzca la cotización del Euro en dólares: ");
      double cotizacionDolar = sc.nextDouble();

      double equivalenciaDolares = euros * cotizacionDolar;
      System.out.println("La equivalencia en dólares es: " + equivalenciaDolares);

    } catch (InputMismatchException e) {
      System.out.println("Por favor, ingrese números válidos.");
    } finally {
      sc.close();
    }
  }
}
