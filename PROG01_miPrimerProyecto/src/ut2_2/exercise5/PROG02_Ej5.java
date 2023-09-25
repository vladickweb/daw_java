package ut2_2.exercise5;

import java.util.Scanner;

public class PROG02_Ej5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el valor de C1: ");
    double C1 = scanner.nextDouble();

    System.out.print("Ingrese el valor de C2: ");
    double C2 = scanner.nextDouble();

    double x;

    if (C1 != 0) {
      x = -C2 / C1;
      System.out.printf("El valor de x es: %.4f%n", x);
    } else {
      if (C2 == 0) {
        System.out.println(
          "La ecuación es una identidad (0x = 0) y tiene infinitas soluciones."
        );
      } else {
        System.out.println("La ecuación no tiene solución.");
      }
    }

    scanner.close();
  }
}
