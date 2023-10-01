package ut2_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
    Diseña un algoritmo que calcule el área de un rectángulo, una vez introducidos por teclado la base y la altura.
 */

/**
 * Pseudocódigo:
 * - Pedir base
 * - Pedir altura
 * - Comprobar que base y altura son mayores que 0
 * - Calcular área
 * - Mostrar área
 * - Fin
 */

public class ExerciseOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la base del rectángulo: ");

        try {
            int baseRectangulo = sc.nextInt();

            System.out.println("Introduzca la altura del rectángulo: ");
            int alturaRectangulo = sc.nextInt();

            if (baseRectangulo <= 0 || alturaRectangulo <= 0) {
                System.out.println("La base y la altura deben ser mayores que 0");
                return;
            }

            int area = baseRectangulo * alturaRectangulo;
            System.out.println("El área del rectángulo es: " + area);

        } catch (InputMismatchException e) {
            System.out.println("Por favor, ingrese números válidos.");
        } finally {
            sc.close();
        }
    }
}
