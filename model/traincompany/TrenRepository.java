package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.traincompany;



import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.viajero.Viajero;

public class TrenRepository {
    private Tren tren;

    public TrenRepository(Tren tren) {
        this.tren = tren;
    }

    public void subirPasajero(Viajero viajero) {
        String zonaActual = tren.getZonas().get(tren.getIndiceZonaActual()).getType();

        if (viajero.getTarjeta().esValidaParaZona(zonaActual)) {
            tren.getPasajeros().add(viajero);
            System.out.println("El viajero " + viajero.getNombre() + " ha subido al tren.");
        } else {
            System.out.println("Multa: La tarjeta de " + viajero.getNombre() + " no es válida para la zona " + zonaActual);
        }
    }

    public void bajarPasajero(int indice) {
        if (indice >= 0 && indice < tren.getPasajeros().size()) {
            tren.getPasajeros().remove(indice);
        }
    }

    public void mostrarPasajeros() {
        System.out.println("Pasajeros a bordo:");
        for (int i = 0; i < tren.getPasajeros().size(); i++) {
            System.out.println("Codigo pasajero " + (i + 1) + " - " + tren.getPasajeros().get(i).getNombre());
        }
    }
}
