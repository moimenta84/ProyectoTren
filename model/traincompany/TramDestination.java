package SegundaEvaluacionEjercicios.Clases_POO.ejerViajeros.model.traincompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TramDestination {

    private List<TramDestination> destinations = new ArrayList<>();
    private String name;
    private String type;

    // Constructor
    public TramDestination() {
    }

    public TramDestination(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<TramDestination> getDestinations(){destinations = List.of(
                new TramDestination("Luceros", "A"),
                new TramDestination("Mercado", "A"),
                new TramDestination("MARQ-Castillo", "A"),
                new TramDestination("Sangueta", "A"),
                new TramDestination("La Isleta", "A"),
                new TramDestination("Lucentum", "A"),
                new TramDestination("El Campello", "A"),
                new TramDestination("Poble Espanyol", "A"),
                new TramDestination("Amerador", "A"),
                new TramDestination("Coveta Fumà", "A"),
                new TramDestination("Cala Piteres", "A"),
                new TramDestination("Venta Lanuza", "A"),
                new TramDestination("Paradís", "A"),
                new TramDestination("La Vila Joiosa", "B"),
                new TramDestination("Creueta", "B"),
                new TramDestination("Costera Pastor", "B"),
                new TramDestination("Hospital Vila", "B"),
                new TramDestination("Cala Finestrat", "B"),
                new TramDestination("Terra Mítica", "B"),
                new TramDestination("Benidorm", "B"),
                new TramDestination("Benidorm Intermodal", "B"),
                new TramDestination("Cami Coves", "B"),
                new TramDestination("L'Alfàs del Pi", "B"),
                new TramDestination("El Albir", "B"),
                new TramDestination("Altea", "B"),
                new TramDestination("Garganes", "B"),
                new TramDestination("Cap Negret", "B"),
                new TramDestination("Olla Altea", "B"),
                new TramDestination("Calp", "C"),
                new TramDestination("Benissa", "C"),
                new TramDestination("Teulada", "C"),
                new TramDestination("Gata", "C"),
                new TramDestination("La Xara", "C"),
                new TramDestination("La Pedrera - Vessanes", "C"),
                new TramDestination("Bosc de Diana", "C"),
                new TramDestination("Dénia", "C"));
        return destinations;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TramDestination that = (TramDestination) o;
        return Objects.equals(destinations, that.destinations) && Objects.equals(name, that.name) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinations, name, type);
    }
}
