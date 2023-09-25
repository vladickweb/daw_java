package ut2_2.exercise4;

import java.util.Scanner;

public class PROG02_Ej4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el número de segundos: ");
    long segundos = scanner.nextLong();

    long minutos = segundos / 60;
    long horas = minutos / 60;
    long dias = horas / 24;

    minutos = minutos % 60;
    horas = horas % 24;

    System.out.println("Días: " + dias);
    System.out.println("Horas: " + horas);
    System.out.println("Minutos: " + minutos);

    scanner.close();
  }
}
