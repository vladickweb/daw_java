package ut2_2.exercise6;

import java.util.Scanner;

public class PROG02_Ej6 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Número de alumnos matriculados en Programación: ");
    int programacionAlumnos = scanner.nextInt();

    System.out.print(
      "Número de alumnos matriculados en Entornos de Desarrollo: "
    );
    int entornosAlumnos = scanner.nextInt();

    System.out.print("Número de alumnos matriculados en Base de Datos: ");
    int baseDatosAlumnos = scanner.nextInt();

    int totalAlumnos = programacionAlumnos + entornosAlumnos + baseDatosAlumnos;

    imprimirPorcentaje("Programación", programacionAlumnos, totalAlumnos);
    imprimirPorcentaje("Entornos de Desarrollo", entornosAlumnos, totalAlumnos);
    imprimirPorcentaje("Base de Datos", baseDatosAlumnos, totalAlumnos);

    scanner.close();
  }

  public static void imprimirPorcentaje(
    String asignatura,
    int alumnos,
    int total
  ) {
    double porcentaje = (double) alumnos / total * 100;
    System.out.printf(
      "Porcentaje de alumnos en %s: %.1f%%\n",
      asignatura,
      porcentaje
    );
  }
}
