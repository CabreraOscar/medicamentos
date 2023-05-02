package modelo;
import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class MedicamentosModelo extends Medicamentos{
    
public ArrayList<Medicamentos> listmedic = new ArrayList<>();

    public MedicamentosModelo() {
    }

    
    public MedicamentosModelo(String nombre, String tipo_medicamento, int cantidad, String distribuidor, String sucursal) {
        super(nombre, tipo_medicamento, cantidad, distribuidor, sucursal);
    }
    
    public void setMed(String nombremedic, String tipomedic, int cantidadmedic, String distribuidormedic, String sucursalmedic){
        
        Medicamentos med = new Medicamentos();
        med.setNombremedic(nombremedic);
        med.setTipomedic(tipomedic);
        med.setCantidadmedic(cantidadmedic);
        med.setDistribuidormedic(distribuidormedic);
        med.setSucursalmedic(sucursalmedic);
        
        listmedic.add(med);
    }  
}
