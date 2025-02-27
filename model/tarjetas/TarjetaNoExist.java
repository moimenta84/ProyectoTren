package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.tarjetas;

public class TarjetaNoExist extends Tarjeta{

    @Override
    public boolean esValidaParaZona(String zona) {
        return false;
    }
}
