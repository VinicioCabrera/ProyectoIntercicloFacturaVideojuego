/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.controlador.ControladorProducto;
import ec.ups.edu.modelo.Clase;
import ec.ups.edu.modelo.Producto;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class VentanaCrearProducto extends javax.swing.JInternalFrame {
 private ControladorProducto controladorProducto;
 private String ruta;   
 /**
     * Creates new form VentanaCrearEmpleado
     */
    public VentanaCrearProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.controladorProducto=controladorProducto;
        txtCodigoCrearProducto.setText(String.valueOf(this.controladorProducto.getCodigo()));
        this.setSize(1000,600);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigoCrearProducto = new javax.swing.JTextField();
        lblCodigoCrearProducto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGuardarCrearProducto = new javax.swing.JButton();
        lblNombreCrearProducto = new javax.swing.JLabel();
        txtNombreCrearProducto = new javax.swing.JTextField();
        btnCancelarCrearProducto = new javax.swing.JButton();
        txtCantidadCrearProducto = new javax.swing.JTextField();
        lblCantidadCrearProducto = new javax.swing.JLabel();
        lblFechaCrearProducto = new javax.swing.JLabel();
        lblCostoCrearProducto = new javax.swing.JLabel();
        txtFechaCrearProducto = new javax.swing.JTextField();
        txtCostoCrearProducto = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtTipoCrearProducto = new javax.swing.JTextField();
        lblTipoCrearProducto = new javax.swing.JLabel();
        txtDescripcionCrearProducto = new javax.swing.JTextField();
        lblDescripcionCrearProducto = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(null);

        txtCodigoCrearProducto.setEditable(false);
        getContentPane().add(txtCodigoCrearProducto);
        txtCodigoCrearProducto.setBounds(468, 89, 220, 40);

        lblCodigoCrearProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCodigoCrearProducto.setText("Codigo:");
        getContentPane().add(lblCodigoCrearProducto);
        lblCodigoCrearProducto.setBounds(340, 84, 110, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("Crear Producto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(468, 0, 196, 50);

        btnGuardarCrearProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/guardar.jpg"))); // NOI18N
        btnGuardarCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCrearProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarCrearProducto);
        btnGuardarCrearProducto.setBounds(710, 90, 90, 99);

        lblNombreCrearProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblNombreCrearProducto.setText("Nombre:");
        getContentPane().add(lblNombreCrearProducto);
        lblNombreCrearProducto.setBounds(340, 136, 110, 40);
        getContentPane().add(txtNombreCrearProducto);
        txtNombreCrearProducto.setBounds(468, 136, 220, 40);

        btnCancelarCrearProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/cancelar.png"))); // NOI18N
        btnCancelarCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCrearProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarCrearProducto);
        btnCancelarCrearProducto.setBounds(650, 440, 110, 90);
        getContentPane().add(txtCantidadCrearProducto);
        txtCantidadCrearProducto.setBounds(468, 183, 220, 38);

        lblCantidadCrearProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCantidadCrearProducto.setText("Cantidad :");
        getContentPane().add(lblCantidadCrearProducto);
        lblCantidadCrearProducto.setBounds(340, 183, 110, 38);

        lblFechaCrearProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblFechaCrearProducto.setText("Fecha :");
        getContentPane().add(lblFechaCrearProducto);
        lblFechaCrearProducto.setBounds(350, 230, 102, 31);

        lblCostoCrearProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCostoCrearProducto.setText("Costo :");
        getContentPane().add(lblCostoCrearProducto);
        lblCostoCrearProducto.setBounds(350, 270, 102, 30);

        txtFechaCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaCrearProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaCrearProducto);
        txtFechaCrearProducto.setBounds(470, 230, 220, 31);
        getContentPane().add(txtCostoCrearProducto);
        txtCostoCrearProducto.setBounds(470, 270, 220, 38);
        getContentPane().add(lblImagen);
        lblImagen.setBounds(10, 80, 310, 365);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/LUPA.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 440, 108, 100);
        getContentPane().add(txtTipoCrearProducto);
        txtTipoCrearProducto.setBounds(470, 320, 220, 40);

        lblTipoCrearProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblTipoCrearProducto.setText("Tipo :");
        getContentPane().add(lblTipoCrearProducto);
        lblTipoCrearProducto.setBounds(350, 320, 102, 30);
        getContentPane().add(txtDescripcionCrearProducto);
        txtDescripcionCrearProducto.setBounds(470, 370, 220, 40);

        lblDescripcionCrearProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblDescripcionCrearProducto.setText("Descripcion :");
        getContentPane().add(lblDescripcionCrearProducto);
        lblDescripcionCrearProducto.setBounds(330, 380, 140, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCrearProductoActionPerformed
       Producto producto= new Producto();
       Clase clase=new Clase();
        try {
        Date fecha=new SimpleDateFormat("dd/MM/yyyy").parse(txtFechaCrearProducto.getText());
        producto.setFechaExpedicion(fecha);
        }
        catch (Exception e){
            
        }
        producto.setCodigo(Integer.parseInt(txtCodigoCrearProducto.getText()));
        producto.setCosto(Double.parseDouble(txtCostoCrearProducto.getText()));
        producto.setCantidad(Integer.parseInt(txtCantidadCrearProducto.getText()));
        producto.setNombre(txtNombreCrearProducto.getText());
        clase.setTipo(txtTipoCrearProducto.getText());
        clase.setDescripcion(txtDescripcionCrearProducto.getText());
        producto.setPath(ruta);
        controladorProducto.create(producto);
        JOptionPane.showMessageDialog(this, "Producto creado Exitosamente");
        txtCodigoCrearProducto.setText(Integer.toString(this.controladorProducto.getCodigo()));
        txtCantidadCrearProducto.setText("");
        txtCostoCrearProducto.setText("");
        txtFechaCrearProducto.setText("");
        txtNombreCrearProducto.setText("");
        txtTipoCrearProducto.setText("");
        txtDescripcionCrearProducto.setText("");
        lblImagen.setIcon(null);
        
        
    }//GEN-LAST:event_btnGuardarCrearProductoActionPerformed

    private void btnCancelarCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCrearProductoActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCancelarCrearProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser Explorador = new JFileChooser();
        int option=Explorador.showOpenDialog(this);
        if(option==Explorador.APPROVE_OPTION){
            ruta = Explorador.getSelectedFile().getPath();
            //lblImagen.setIcon(new ImageIcon(ruta));
        ImageIcon im=new ImageIcon(ruta);
        ImageIcon imagen=new ImageIcon(im.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
        lblImagen.setIcon(imagen);

        }      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFechaCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaCrearProductoActionPerformed
//SimpleDateFormat fecha = new SimpleDateFormat();
    }//GEN-LAST:event_txtFechaCrearProductoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCrearProducto;
    private javax.swing.JButton btnGuardarCrearProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCantidadCrearProducto;
    private javax.swing.JLabel lblCodigoCrearProducto;
    private javax.swing.JLabel lblCostoCrearProducto;
    private javax.swing.JLabel lblDescripcionCrearProducto;
    private javax.swing.JLabel lblFechaCrearProducto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombreCrearProducto;
    private javax.swing.JLabel lblTipoCrearProducto;
    private javax.swing.JTextField txtCantidadCrearProducto;
    private javax.swing.JTextField txtCodigoCrearProducto;
    private javax.swing.JTextField txtCostoCrearProducto;
    private javax.swing.JTextField txtDescripcionCrearProducto;
    private javax.swing.JTextField txtFechaCrearProducto;
    private javax.swing.JTextField txtNombreCrearProducto;
    private javax.swing.JTextField txtTipoCrearProducto;
    // End of variables declaration//GEN-END:variables
}
