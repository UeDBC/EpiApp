package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Guillermo on 06/06/2015.
 */
public class Vivienda implements Serializable
{
    private long latitud;
    private long longitud;
    private String calle;
    private int nroCalle;
    private int manzana;
    private int lote;


    private ArrayList<Respuesta> respuestasVivienda;

    public Vivienda(){
        setRespuestas(new ArrayList());
    }


    public long getLatitud() {
        return latitud;
    }

    public void setLatitud(long latitud) {
        this.latitud = latitud;
    }

    public long getLongitud() {
        return longitud;
    }

    public void setLongitud(long longitud) {
        this.longitud = longitud;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNro() {
        return nroCalle;
    }

    public void setNro(int nro) {
        this.nroCalle = nro;
    }

    public int getManzana() {
        return manzana;
    }

    public void setManzana(int manzana) {
        this.manzana = manzana;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }


    public ArrayList<Respuesta> getRespuestas() {
        return respuestasVivienda;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestasVivienda = respuestas;
    }
}
