package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Diseña un algoritmo que calcule valor de la hipotenusa (real) de un triángulo
 * rectángulo, una vez introducidos por teclado el valor de los catetos
 * (enteros)
 */

/**
 * Pseudocódigo:
 * - Pedir cateto1
 * - Pedir cateto2
 * - Comprobar que cateto1 y cateto2 son mayores que 0
 * - Calcular hipotenusa
 * - Mostrar hipotenusa
 * - Fin
 */

public class ExerciseThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el valor del cateto 1: ");
    try {
      int cateto1 = sc.nextInt();

      System.out.println("Introduzca el valor del cateto 2: ");
      int cateto2 = sc.nextInt();

      double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
      System.out.println("El valor de la hipotenusa es: " + hipotenusa);

    } catch (InputMismatchException e) {
      System.out.println("Por favor, ingrese números enteros válidos.");
    } finally {
      sc.close();
    }
  }
}
