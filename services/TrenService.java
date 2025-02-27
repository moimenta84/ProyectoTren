package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.services;

import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.Main;
import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.traincompany.Tren;
import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.traincompany.TrenRepository;
import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.viajero.Viajero;

import java.util.ArrayList;
import java.util.List;

import static SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.Utilidades.FuncionesGenerales.scanerNum;

public class TrenService {
    private Tren tren;
    private TrenRepository trenRepository;

    public TrenService(Tren tren) {
        this.tren = tren;
        this.trenRepository = new TrenRepository(tren);
    }
public void mostrarPasajeros(){
        trenRepository.mostrarPasajeros();
}
    public void subirPasajero(Viajero viajero) {
        trenRepository.subirPasajero(viajero);
    }

    public void bajarPasajeros() {
        int eleccion;
        do {
            trenRepository.mostrarPasajeros();
            System.out.println("¿Qué pasajeros se bajan? (Pulsa 0 para salir)");
            eleccion = scanerNum() - 1;
            if (eleccion >= 0) {
                trenRepository.bajarPasajero(eleccion);
            }
        } while (eleccion != -1);
    }

    public void cambiarZona() {
        if (tren.getIndiceZonaFinal() < tren.getIndiceZonaActual()) {
            tren.setIndiceZonaActual(tren.getIndiceZonaActual() - 1);
        } else {
            tren.setIndiceZonaActual(tren.getIndiceZonaActual() + 1);
        }

        String zonaActual = tren.getZonas().get(tren.getIndiceZonaActual()).getName();
        String tipoActual = tren.getZonas().get(tren.getIndiceZonaActual()).getType();

        System.out.println("El tren ha cambiado a la zona: " + (tren.getIndiceZonaActual() + 1) + " " + zonaActual + " " + tipoActual);

        List<Viajero> pasajerosNoValidos = new ArrayList<>();
        for (Viajero viajero : tren.getPasajeros()) {
            if (!viajero.getTarjeta().esValidaParaZona(tipoActual)) {
                pasajerosNoValidos.add(viajero);
            }
        }

        tren.getPasajeros().removeAll(pasajerosNoValidos);
        for (Viajero viajero : pasajerosNoValidos) {
            System.out.println("Multa: El viajero " + viajero.getNombre() + " no puede viajar en la zona " + zonaActual + ", tarjeta no válida.");
        }

        if (tren.getIndiceZonaActual() == tren.getIndiceZonaFinal()) {
            Main.seguir = false;
            System.out.println("FIN DEL TRAYECTO / END OF THE LINE");
        }
    }


    /*
    private List<Viajero> pasajeros;
    private List<TramDestination> zonas;
    private int indiceZonaActual;
    private int indiceZonaFinal;
    private String zonaActual;
    TramDestination tramDestination = new TramDestination();

    public TrenService(TramDestination zonaInicial, TramDestination zonaFinal) {
        this.pasajeros = new ArrayList<>();
        this.zonas = tramDestination.getDestinations();  // Definimos las zonas
        this.indiceZonaActual = zonas.indexOf(zonaInicial);  // Empezamos en la zona que pasas
        this.indiceZonaFinal = zonas.indexOf(zonaFinal);
        //this.zonaActual = zonaActual;
    }

    public void subirPasajero(Viajero viajero) {
        //registramos los que se unen
        String zonaActual = zonas.get(indiceZonaActual).getType();  // Obtenemos la zona actual

        if (viajero.getTarjeta().esValidaParaZona(zonaActual)) {
            pasajeros.add(viajero);
            System.out.println("El viajero " + viajero.getNombre() + " ha subido al tren.");
        } else {
            System.out.println("Multa: La tarjeta de " + viajero.getNombre() + " no es válida para la zona " + zonaActual + ", o se ha colado" + "\n" + "DETENCIÓN INMINENTE"+viajero.getTarjeta());
        }
    }

    public void mostrarPasajeros() {
        System.out.println("Pasajeros a bordo:");
        for (int i=0;i< pasajeros.size();i++) {
            System.out.println("Codigo pasajero "+(i+1)+" - " + pasajeros.get(i).getNombre());
        }
    }
    public void bajarPasajeros(){
int eleccion;

        do {
            mostrarPasajeros();
            System.out.println("¿Qué pasajeros se bajan?");
            System.out.println("Pulsa 0 para salir");
             eleccion = scanerNum();
            eleccion--;
            if (eleccion > -1 && eleccion < pasajeros.size()) {
                pasajeros.remove(eleccion);
            }
        }while (eleccion!=-1);

    }

    // Cambiar a la siguiente zona inversamente
    public void cambiarZona() {
        if (indiceZonaFinal < indiceZonaActual) {
            indiceZonaActual--;
        } else {
            indiceZonaActual++;
        }
        // Decrementar el índice para cambiar a la zona anterior
        //indiceZonaActual = (indiceZonaActual + 1) % zonas.size();
        String zonaActual = zonas.get(indiceZonaActual).getName();
        String TYPEActual = zonas.get(indiceZonaActual).getType();
        System.out.println("El tren ha cambiado a la zona: " + (indiceZonaActual + 1) + " " + zonaActual+TYPEActual);
        //registramos los que están dentro
        // Verificar que los pasajeros tienen un billete válido para la nueva zona
        List<Viajero> pasajerosNoValidos = new ArrayList<>();
        for (int i=0;i<pasajeros.size();i++) {
            if (!pasajeros.get(i).getTarjeta().esValidaParaZona(TYPEActual)) {
                pasajerosNoValidos.add(pasajeros.get(i));
                System.out.println(pasajeros.get(i));
            }
        }

        // Eliminar a los pasajeros no válidos
        pasajeros.removeAll(pasajerosNoValidos);
        for (Viajero viajero : pasajerosNoValidos) {
            System.out.println("Multa: El viajero " + viajero.getNombre() + " no puede viajar en la zona " + zonaActual + ", tarjeta no válida.");
        }
        if (indiceZonaActual == indiceZonaFinal) {
            Main.seguir=false;
            System.out.println("FIN DEL TRAYECTO / END OF THE LINE");
        }
    }*/
}
