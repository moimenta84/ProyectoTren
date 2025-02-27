package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.services;

import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.traincompany.TramDestination;

import java.util.Scanner;

public class Destinos {
    public  TramDestination origen(TramDestination origen) {
        TramDestination tramDestination = new TramDestination();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            for (int i = 0; i < tramDestination.getDestinations().size(); i++) {
                if(tramDestination.getDestinations().get(i).equals(origen)){

                }else {
                    System.out.println((i + 1) + ". " + tramDestination.getDestinations().get(i).getName() + " Zona: " + tramDestination.getDestinations().get(i).getType());
                }
            }
            int eleccion = scanner.nextInt();
            eleccion--;
            if ((eleccion < tramDestination.getDestinations().size() && eleccion > -1)&&!(tramDestination.getDestinations().get(eleccion).equals(origen))) {
                return tramDestination.getDestinations().get(eleccion);
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }

    public  void origen_destino(TramDestination origen, TramDestination destination){
        System.out.println("Origen-> "+origen.getName()+"Destino-> "+destination.getName());
    }
}
