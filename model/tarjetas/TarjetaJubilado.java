package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.tarjetas;

public class TarjetaJubilado extends Tarjeta {
    public TarjetaJubilado(String id) {
        super(id);
    }

    @Override
    public boolean esValidaParaZona(String zona) {
        return true; // Tarjeta jubilado cubre todas las zonas.
    }
}