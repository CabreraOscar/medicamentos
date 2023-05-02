package modelo;

/**
 *
 * @author Oscar
 */
public class Medicamentos {
   
    private String nombremedic;
    private String tipomedic;
    private int cantidadmedic;
    private String distribuidormedic;
    private String sucursalmedic;

    
    public Medicamentos() {
    }

    public Medicamentos(String nombremedic, String tipomedic, int cantidadmedic, String distribuidormedic, String sucursalmedic) {
        ;
        this.nombremedic = nombremedic;
        this.tipomedic = tipomedic;
        this.cantidadmedic = cantidadmedic;
        this.distribuidormedic = distribuidormedic;
        this.sucursalmedic = sucursalmedic;
    }

    public String getNombremedic() {
        return nombremedic;
    }

    public void setNombremedic(String nombremedic) {
        this.nombremedic = nombremedic;
    }

    public String getTipomedic() {
        return tipomedic;
    }

    public void setTipomedic(String tipomedic) {
        this.tipomedic = tipomedic;
    }

    public int getCantidadmedic() {
        return cantidadmedic;
    }

    public void setCantidadmedic(int cantidadmedic) {
        this.cantidadmedic = cantidadmedic;
    }

    public String getDistribuidormedic() {
        return distribuidormedic;
    }

    public void setDistribuidormedic(String distribuidormedic) {
        this.distribuidormedic = distribuidormedic;
    }

    public String getSucursalmedic() {
        return sucursalmedic;
    }

    public void setSucursalmedic(String sucursalmedic) {
        this.sucursalmedic = sucursalmedic;
    }

   
    
}
