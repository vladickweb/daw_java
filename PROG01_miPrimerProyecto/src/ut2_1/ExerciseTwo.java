package ut2_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Diseña un algoritmo que calcule el doble de un número entero introducido
 * por teclado.
 */

/**
 * Pseudocódigo:
 * - Pedir número
 * - Comprobar que es un número entero
 * - Calcular doble
 * - Mostrar doble
 * - Fin
 */

public class ExerciseTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número entero: ");

    try {
      int numero = sc.nextInt();
      int resultado = numero * 2;
      System.out.println("El doble del número es: " + resultado);

    } catch (InputMismatchException e) {
      System.out.println("Por favor, ingrese un número entero válido.");
    } finally {
      sc.close();
    }
  }
}
