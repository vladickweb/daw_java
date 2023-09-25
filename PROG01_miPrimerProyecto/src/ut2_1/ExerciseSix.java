package ut2_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Diseña un algoritmo que calcule los segundos en total que representan una
 * hora introducida por teclado (hora, minutos y segundos).
 */

/**
 * Pseudocódigo:
 * - Pedir hora
 * - Pedir minutos
 * - Pedir segundos
 * - Comprobar que hora, minutos y segundos son mayores que 0
 * - Calcular segundos totales
 * - Mostrar segundos totales
 * - Fin
 */

public class ExerciseSix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca la hora (formato 24 horas): ");
    try {
      int horas = sc.nextInt();

      System.out.println("Introduzca los minutos: ");
      int minutos = sc.nextInt();

      System.out.println("Introduzca los segundos: ");
      int segundos = sc.nextInt();

      int segundosTotales = horas * 3600 + minutos * 60 + segundos;
      System.out.println("Los segundos totales son: " + segundosTotales);

    } catch (InputMismatchException e) {
      System.out.println("Por favor, ingrese números enteros válidos.");
    } finally {
      sc.close();
    }
  }
}
