package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.tarjetas;

abstract public class Tarjeta {
    private String id;
public Tarjeta(){}
    public Tarjeta(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public abstract boolean esValidaParaZona(String zona);
   // public abstract boolean esValidaParaZona34(String zona);

public  void sleep() { // Método no abstracto
        System.out.println("Zzz");
    }
    @Override
    public String toString() {
        return "Tarjeta{" +
                "id='" + id + '\'' +
                '}';
    }
}
