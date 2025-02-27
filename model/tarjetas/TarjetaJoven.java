package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.tarjetas;


public class TarjetaJoven extends Tarjeta {
    public TarjetaJoven(String id) {
        super(id);
    }

    @Override
    public boolean esValidaParaZona(String zona) {
        return true; // Tarjeta joven cubre todas las zonas.
    }
}
