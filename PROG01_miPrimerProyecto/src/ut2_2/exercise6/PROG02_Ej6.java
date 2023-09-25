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
    double porcentajeProgramacion = (double) programacionAlumnos /
    totalAlumnos *
    100;
    double porcentajeEntornos = (double) entornosAlumnos / totalAlumnos * 100;
    double porcentajeBaseDatos = (double) baseDatosAlumnos / totalAlumnos * 100;

    System.out.printf(
      "Porcentaje de alumnos en Programación: %.1f%%\n",
      porcentajeProgramacion
    );
    System.out.printf(
      "Porcentaje de alumnos en Entornos de Desarrollo: %.1f%%\n",
      porcentajeEntornos
    );
    System.out.printf(
      "Porcentaje de alumnos en Base de Datos: %.1f%%\n",
      porcentajeBaseDatos
    );

    scanner.close();
  }
}
