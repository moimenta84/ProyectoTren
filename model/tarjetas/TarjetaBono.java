package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.tarjetas;

public class TarjetaBono extends Tarjeta {
    private String zonaPermitida;
public TarjetaBono(){}
    public TarjetaBono(String id, String zonaPermitida) {
        super(id);
        this.zonaPermitida = zonaPermitida;
    }

    public String getZonaPermitida() {
        return zonaPermitida;
    }

    public void setZonaPermitida(String zonaPermitida) {
        this.zonaPermitida = zonaPermitida;
    }

    @Override
    public boolean esValidaParaZona(String zona) {
        return zonaPermitida.contains(zona);
    }

    @Override
    public String toString() {
        return "TarjetaBono{" +
                "zonaPermitida='" + zonaPermitida + '\'' +
                "} " + super.toString();
    }
}

