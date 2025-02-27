package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.view;

import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.tarjetas.*;

import java.util.Scanner;

import static SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.Utilidades.FuncionesGenerales.scanerNum;

public class MenuTarjeta {
    public static Tarjeta menuTarjetas() {

        System.out.println("Visión Artificial seleccionando el tipo de tarjeta:");
        System.out.println("1. Tarjeta Bono");
        System.out.println("2. Tarjeta Joven");
        System.out.println("3. Tarjeta Jubilado");
        System.out.println("4. Se ha colado");
        int opcion = scanerNum();

        switch (opcion) {
            case 1:
                return menuTarjetaBono();
            case 2:
                return new TarjetaJoven(String.valueOf(count++));
            case 3:
                return new TarjetaJubilado(String.valueOf(count++));
            case 4:
                return new TarjetaNoExist();
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                return null;
        }
    }
    public static int count=1;
    public static Tarjeta menuTarjetaBono() {

        System.out.println("Seleccione el tipo de Bono:");
        System.out.println("1. Bono para A,B");
        System.out.println("2. Bono para B,C");
        System.out.println("3. Bono para A,B,C");

        int opcionBono = scanerNum();
        String zonaPermitida;

        switch (opcionBono) {
            case 1:
                zonaPermitida = "A,B";
                break;
            case 2:
                zonaPermitida = "B,C";
                break;
            case 3:
                zonaPermitida = "A,B,C";
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                return null;
        }
        return new TarjetaBono(String.valueOf(count++), zonaPermitida);
    }
}
