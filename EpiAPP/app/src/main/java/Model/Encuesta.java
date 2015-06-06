package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Guillermo on 06/06/2015.
 */
public class Encuesta implements Serializable
{
    private String id;
    private String fechaUnixTimestamp;
    private Vivienda vivienda;
    private ArrayList<Individuo> individuos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaUnixTimestamp() {
        return fechaUnixTimestamp;
    }

    public void setFechaUnixTimestamp(String fechaUnixTimestamp) {
        this.fechaUnixTimestamp = fechaUnixTimestamp;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public ArrayList<Individuo> getIndividuos() {
        return individuos;
    }

    public void setIndividuos(ArrayList<Individuo> individuos) {
        this.individuos = individuos;
    }
}
