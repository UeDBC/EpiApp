package Model;

import java.io.Serializable;

/**
 * Created by Guillermo on 06/06/2015.
 */
public class Individuo implements Serializable{

    private String nombre;
    private String añoNac;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAñoNac() {
        return añoNac;
    }

    public void setAñoNac(String añoNac) {
        this.añoNac = añoNac;
    }
}
