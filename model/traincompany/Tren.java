package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.traincompany;


import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.viajero.Viajero;

import java.util.ArrayList;
import java.util.List;

public class Tren {
    private List<Viajero> pasajeros;
    private List<TramDestination> zonas;
    private int indiceZonaActual;
    private int indiceZonaFinal;

    public Tren(List<TramDestination> zonas, TramDestination zonaInicial, TramDestination zonaFinal) {
        this.pasajeros = new ArrayList<>();
        this.zonas = zonas;
        this.indiceZonaActual = zonas.indexOf(zonaInicial);
        this.indiceZonaFinal = zonas.indexOf(zonaFinal);
    }

    public List<Viajero> getPasajeros() {
        return pasajeros;
    }

    public List<TramDestination> getZonas() {
        return zonas;
    }

    public int getIndiceZonaActual() {
        return indiceZonaActual;
    }

    public int getIndiceZonaFinal() {
        return indiceZonaFinal;
    }

    public void setIndiceZonaActual(int indiceZonaActual) {
        this.indiceZonaActual = indiceZonaActual;
    }
}
