package medicamentos;

import controlador.MedicamentosControlador;
import modelo.MedicamentosModelo;
import vista.MedicamentosFrame;

/**
 *
 * @author Oscar
 */
public class Medicamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MedicamentosFrame vista = new MedicamentosFrame();
        MedicamentosModelo modelo = new MedicamentosModelo();
        MedicamentosControlador controlador=new MedicamentosControlador(modelo, vista);
        controlador.inicioControl();
    }
    
}
