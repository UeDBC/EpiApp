package Model;

/**
 * Created by Guillermo on 06/06/2015.
 */
public class Vivienda
{
    private int antiguedad;
    private int individuos;
    private long latitud;
    private long longitud;
    private int pueblo;
    private int cantidad_muertes;
    private int fuentes_contaminacion;
    private String calle;
    private int nro;
    private int manzana;
    private int lote;
    private int agua;
    private int tipo_calle;
    private RiesgoAmbiental1 r1;
    private RiesgoAmbiental2 r2;
    private RiesgoAmbiental3 r3;


    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getIndividuos() {
        return individuos;
    }

    public void setIndividuos(int individuos) {
        this.individuos = individuos;
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

    public int getPueblo() {
        return pueblo;
    }

    public void setPueblo(int pueblo) {
        this.pueblo = pueblo;
    }

    public int getCantidad_muertes() {
        return cantidad_muertes;
    }

    public void setCantidad_muertes(int cantidad_muertes) {
        this.cantidad_muertes = cantidad_muertes;
    }

    public int getFuentes_contaminacion() {
        return fuentes_contaminacion;
    }

    public void setFuentes_contaminacion(int fuentes_contaminacion) {
        this.fuentes_contaminacion = fuentes_contaminacion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
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

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getTipo_calle() {
        return tipo_calle;
    }

    public void setTipo_calle(int tipo_calle) {
        this.tipo_calle = tipo_calle;
    }

    public RiesgoAmbiental1 getR1() {
        return r1;
    }

    public void setR1(RiesgoAmbiental1 r1) {
        this.r1 = r1;
    }

    public RiesgoAmbiental2 getR2() {
        return r2;
    }

    public void setR2(RiesgoAmbiental2 r2) {
        this.r2 = r2;
    }

    public RiesgoAmbiental3 getR3() {
        return r3;
    }

    public void setR3(RiesgoAmbiental3 r3) {
        this.r3 = r3;
    }
}
