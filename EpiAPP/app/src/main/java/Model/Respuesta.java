package Model;

import java.io.Serializable;

/**
 * Created by agus on 18/07/15.
 */

public class Respuesta implements Serializable {

    private int id;
    private String respuesta;

    public Respuesta(int id, String respuesta)
    {
        this.id = id;
        this.respuesta = respuesta;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
