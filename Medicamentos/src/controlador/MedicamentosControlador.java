package controlador;

import javax.swing.JOptionPane;
import modelo.MedicamentosModelo;
import vista.MedicamentosFrame;

/**
 *
 * @author Oscar
 */
public class MedicamentosControlador {
    private MedicamentosModelo modelo;
    private MedicamentosFrame vista;

    public MedicamentosControlador(MedicamentosModelo modelo, MedicamentosFrame vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    
    public void inicioControl(){
        vista.getBtnCancelar().addActionListener(l -> cerrar());
        vista.getBtnOk().addActionListener(l -> abrir());
        vista.getBtnEnviar().addActionListener(l -> crear() );
        vista.getBtnEnviar().addActionListener(l -> cerrar() );
    }
    public void crear(){
    String nombre = vista.getTxtNombre().getText();
    String tipo = vista.getCmbTipo().getSelectedItem().toString();
    int cantidad = Integer.parseInt(vista.getTxtCantidad().getText());
    String distribuidor = "";
    if(vista.getRbtCemefar().isSelected()){
        distribuidor = "Cemefar";
    }else if(vista.getRbtCofarma().isSelected()){
        distribuidor = "Coforma";
    }else{
        distribuidor = "Empsephar";
    }

    String sucursal = vista.getCheckPrincipal().isSelected() ? "Calle de la Rosa n. 28" : "Calle Alcazabilla n. 3";

    try {
        MedicamentosModelo med = new MedicamentosModelo(nombre, tipo, cantidad, distribuidor, sucursal);
        JOptionPane.showMessageDialog(null, "Enviado");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}


    public boolean validar() {
    boolean valido = true;
    
    if (vista.getTxtNombre().getText().isEmpty() ||
        vista.getCmbTipo().getSelectedIndex() == 0 ||
        vista.getTxtCantidad().getText().isEmpty() ||
        !vista.getRbtCemefar().isSelected() &&
        !vista.getRbtCofarma().isSelected() &&
        !vista.getRbtEmpsephar().isSelected()) {
        
        JOptionPane.showMessageDialog(null, "La informacion es incorrecta o incompleta","ERROR_MESSAGE" ,JOptionPane.ERROR_MESSAGE /*INFORMATION_MESSAGE*/);
        valido = false;
    }
    
    return valido;
}

    
    private void abrir() {
    if (validar()) {
        
        String titulo = vista.getRbtCemefar().isSelected() ? "Cemefar" : vista.getRbtCofarma().isSelected() ? "Coforma" : "Empsephar";
        String tit = "Pedido";
        vista.getDlgPedido().setName("P");
        vista.getjLabel7().setText(tit);
        vista.getDlgPedido().setVisible(true);
        vista.getDlgPedido().setTitle("Solicitud al Proveedor: " + titulo);
        vista.getDlgPedido().setSize(700, 500);
        vista.getDlgPedido().setLocationRelativeTo(vista);

        EnviarDatos();
        limpiarDatos();

    } else {
        JOptionPane.showMessageDialog(null, "La informacion es incorrecta o incompleta", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
    }
}
    
    
    public void cerrar(){
        limpiarDatos();
        vista.getDlgPedido().dispose();
    }
    private void limpiarDatos(){
        vista.getTxtNombre().getText().equals("");
        vista.getCmbTipo().equals(0);
        vista.getTxtCantidad().getText().equals("");
    }   
    
    public void EnviarDatos() {
    String nombre = vista.getTxtNombre().getText();
    String tipo = vista.getCmbTipo().getSelectedItem().toString();
    String cantidad = vista.getTxtCantidad().getText();
    String distri = vista.getRbtCemefar().isSelected() ? "Cemefar" : 
                   (vista.getRbtCofarma().isSelected() ? "Coforma" : "Empsephar");
    String sucursal = vista.getCheckPrincipal().isSelected() ? "Calle de la Rosa n. 28" : "Calle Alcazabilla n. 3";
    
    vista.getLblUnidades().setText(cantidad);
    vista.getLblTipo().setText(tipo);
    vista.getLblMedicamento().setText(nombre);
    vista.getLblDireccion().setText(sucursal);
}


}
   
    
