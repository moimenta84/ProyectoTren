package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.Utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncionesGenerales {

    public static int scanerNum() {
        Scanner scan = new Scanner(System.in);
        int num;
        while (true) {
            try {
                num = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Solo número enteros");
            }
        }
        return num;
    }

    public static int scannerLimArray( int limit) {

        int num;
        while (true) {
            System.out.print("Introduce un número entre 1 y " + limit + ": ");
            num = scanerNum();
            num--; // Ajustar para índice basado en 0
            if (num >= 0 && num < limit) {
                return num;
            } else {
                System.out.println("Número fuera de rango. Inténtalo de nuevo.");
            }
        }
    }
}
