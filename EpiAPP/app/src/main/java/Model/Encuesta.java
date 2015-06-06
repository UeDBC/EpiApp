package Model;

/**
 * Created by Guillermo on 06/06/2015.
 */
public class Encuesta
{
    private String id;
    private String fechaUnixTimestamp;


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
}
