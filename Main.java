package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros;

import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.traincompany.TramDestination;
import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.traincompany.Tren;
import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.viajero.Viajero;
import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.services.Destinos;
import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.services.RegistroViajeros;
import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.services.TrenService;

import java.util.ArrayList;
import java.util.List;

import static SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.Utilidades.FuncionesGenerales.scanerNum;

public class Main {
    public static boolean seguir = true;

    public static void main(String[] args) {

        System.out.println("Control Ferroviario");

        int seleccion = 0;
        while (seleccion != 2) {
            System.out.println("1. Inicio del servicio");
            System.out.println("2. Salir");

            seleccion = scanerNum();

            switch (seleccion) {
                case 1:
                    RegistroViajeros registroViajeros=new RegistroViajeros();
                    Destinos destiny=new Destinos();
                    System.out.println("Seleccione el origen");
                    TramDestination origen = destiny.origen(null);
                    TramDestination destino = destiny.origen(origen);
                    destiny.origen_destino(origen, destino);
                    TramDestination tramDestination = new TramDestination();
                    List<TramDestination> zonas = tramDestination.getDestinations();
                    // Crear servicio de tren
                    //  Crear el tren antes de `TrenService`
                    Tren tren = new Tren(zonas, origen, destino);
                    TrenService trenService = new TrenService(tren);
                    //TrenService trenService = new TrenService(origen, destino);
                    System.out.println("Abriendo puertas del tren");
                    // Registro de viajeros
                    List<Viajero> viajeros = new ArrayList<>();
                    ///Menu

                    //inicio servicio-> origen y fin
                    //Detectamos viajeros
                    //Subimos viajeros
                    //mostramos pasajeros
                    //cambiamos de zona hasta llegar al destino

                    while (seguir) {
                        //Detectamos viajeros/as
                        viajeros = registroViajeros.registrarViajeros();

                        // Subir viajeros al tren Aquí se multan
                        System.out.println("SUBIR PASAJEROS");
                        for (Viajero viajero : viajeros) {
                            trenService.subirPasajero(viajero);
                        }
                        System.out.println("MOSTRAR PASAJEROS");
                        // Mostrar los pasajeros en el tren
                        System.out.println("Mostrar Pasajeros:");
                        trenService.mostrarPasajeros();


                        // Cambiar de zona
                        trenService.cambiarZona();  // Cambiar a la siguiente zona B
                        //bajar pasajeros
                        trenService.bajarPasajeros();
                    }
                    seguir=true;
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }
    }
}
