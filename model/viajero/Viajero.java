package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.viajero;

import SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.tarjetas.Tarjeta;

public class Viajero {
    private String nombre;
    private Tarjeta tarjeta;

    public Viajero(String nombre, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    @Override
    public String toString() {
        return "Viajero{" +
                "nombre='" + nombre + '\'' +
                ", tarjeta=" + tarjeta +
                '}';
    }
}
