package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Diseña un algoritmo que calcule el valor de la longitud de la circunferencia
 * y
 * el área del círculo de radio introducido por teclado.
 */

/**
 * Pseudocódigo:
 * - Pedir radio
 * - Comprobar que radio es mayor que 0
 * - Calcular longitud de la circunferencia
 * - Calcular área del círculo
 * - Mostrar longitud de la circunferencia
 * - Mostrar área del círculo
 * - Fin
 */

public class ExerciseFive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el radio del círculo: ");
    try {
      double radio = sc.nextDouble();

      double longitudCircunferencia = 2 * Math.PI * radio;
      double areaCirculo = Math.PI * radio * radio;

      System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);
      System.out.println("El área del círculo es: " + areaCirculo);

    } catch (InputMismatchException e) {
      System.out.println("Por favor, ingrese un número válido.");
    } finally {
      sc.close();
    }
  }
}
