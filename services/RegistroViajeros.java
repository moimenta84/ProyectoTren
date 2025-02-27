package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.services;

import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.tarjetas.Tarjeta;
import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.viajero.Viajero;
import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.view.MenuTarjeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//introduces los pasajeros que quieren viajar
public class RegistroViajeros {
    public  List<Viajero> registrarViajeros() {
        Scanner scanner = new Scanner(System.in);
        List<Viajero> viajeros = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese el nombre del viajero (o '0' para terminar):");
            String nombre = scanner.nextLine();

            if (nombre.equals("0")) {
                System.out.println("Finalizando registro de viajeros...");
                break;
            }

            // Asignar tarjeta al viajero
            Tarjeta tarjeta = MenuTarjeta.menuTarjetas();

            // Crear viajero y agregarlo a la lista
            Viajero viajero = new Viajero(nombre, tarjeta);
            viajeros.add(viajero);
        }

        return viajeros;
    }
}
