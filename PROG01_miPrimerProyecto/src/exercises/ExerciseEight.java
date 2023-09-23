package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
Diseña un algoritmo que calcule el salario neto de un trabajador a partir de
la lectura del nombre, horas trabajadas, precio de la hora, y sabiendo que
los impuestos aplicables son el 10% sobre el salario bruto.
 */

/**
 * Pseudocódigo:
 * - Pedir nombre
 * - Pedir horas trabajadas
 * - Pedir precio por hora
 * - Comprobar que horas trabajadas y precio por hora son mayores que 0
 * - Calcular salario bruto
 * - Calcular impuestos
 * - Calcular salario neto
 * - Mostrar salario neto
 * - Fin
 */

public class ExerciseEight {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el nombre del trabajador: ");
    String nombre = sc.nextLine();

    System.out.println("Introduzca las horas trabajadas: ");
    try {
      double horasTrabajadas = sc.nextDouble();

      System.out.println("Introduzca el precio por hora: ");
      double precioHora = sc.nextDouble();

      double salarioBruto = horasTrabajadas * precioHora;
      double impuestos = 0.10 * salarioBruto;
      double salarioNeto = salarioBruto - impuestos;

      System.out.println("Nombre del trabajador: " + nombre);
      System.out.println("Salario neto: " + salarioNeto);

    } catch (InputMismatchException e) {
      System.out.println("Por favor, ingrese números válidos.");
    } finally {
      sc.close();
    }
  }
}
