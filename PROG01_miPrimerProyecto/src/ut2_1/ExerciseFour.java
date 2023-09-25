package ut2_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Diseña un algoritmo que calcule el valor del índice de la masa corporal de
 * una persona, una vez introducido su peso (en Kgr -real-), su altura (en
 * metros -real-). imc=peso/(altura*altura)
 */

/**
 * Pseudocódigo:
 * - Pedir peso
 * - Pedir altura
 * - Comprobar que peso y altura son mayores que 0
 * - Calcular imc
 * - Mostrar imc
 * - Fin
 */

public class ExerciseFour {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca su peso en kilogramos: ");
    try {
      double peso = sc.nextDouble();

      System.out.println("Introduzca su altura en metros: ");
      double altura = sc.nextDouble();

      double imc = peso / (altura * altura);
      System.out.println("Su índice de masa corporal (IMC) es: " + imc);

    } catch (InputMismatchException e) {
      System.out.println("Por favor, ingrese números válidos.");
    } finally {
      sc.close();
    }
  }
}
