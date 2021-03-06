/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.controlador.ControladorProducto;
import ec.ups.edu.modelo.Producto;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class VentanaEliminarProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaEliminarProducto
     */
    ControladorProducto controladorProducto;
    private String palabra;
    public VentanaEliminarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.controladorProducto=controladorProducto;
        this.setSize(900,500);
    }
    public void cambiaridioma(ResourceBundle mensajes){
        lblEliminarProducto.setText(mensajes.getString("EliminarProducto"));
        lblCantidadEliminarProducto.setText(mensajes.getString("CantidadCrearProducto"));
        lblCodigoEliminarProducto.setText(mensajes.getString("IngresarCodigo"));
        lblNombreEliminarProducto.setText(mensajes.getString("NombreCrearCliente"));
        lblFechaEliminarProducto.setText(mensajes.getString("FechaCrearProducto"));
        lblDescripcionEliminarProducto1.setText(mensajes.getString("DescripcionCrearClase"));
        lblCostoEliminarProducto.setText(mensajes.getString("CostoCrearProducto"));
        lblTipoEliminarProducto.setText(mensajes.getString("lblTipo"));
        btnBuscarEliminarProducto.setText(mensajes.getString("BuscarActualizarCliente"));
        btnEliminarEliminarProducto.setText(mensajes.getString("EliminarEliminarCliente"));
        btnCancelar.setText(mensajes.getString("CancelarCrearCliente"));
        palabra=mensajes.getString("productoeliminado");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCantidadEliminarProducto = new javax.swing.JTextField();
        lblCantidadEliminarProducto = new javax.swing.JLabel();
        lblMarcaEliminarProducto = new javax.swing.JLabel();
        lblFechaEliminarProducto = new javax.swing.JLabel();
        txtCodigoEliminarProducto = new javax.swing.JTextField();
        lblCostoEliminarProducto = new javax.swing.JLabel();
        lblCodigoEliminarProducto = new javax.swing.JLabel();
        txtMarcaEliminarProducto = new javax.swing.JTextField();
        txtFechaEliminarProducto = new javax.swing.JTextField();
        txtCostoEliminarProducto = new javax.swing.JTextField();
        lblNombreEliminarProducto = new javax.swing.JLabel();
        txtNombreEliminarProducto = new javax.swing.JTextField();
        btnEliminarEliminarProducto = new javax.swing.JButton();
        btnBuscarEliminarProducto = new javax.swing.JButton();
        lblEliminarProducto = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        txtTipoEliminarProducto = new javax.swing.JTextField();
        lblTipoEliminarProducto = new javax.swing.JLabel();
        txtDescripcionEliminarProducto = new javax.swing.JTextField();
        lblDescripcionEliminarProducto1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        getContentPane().setLayout(null);
        getContentPane().add(txtCantidadEliminarProducto);
        txtCantidadEliminarProducto.setBounds(202, 154, 220, 38);

        lblCantidadEliminarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCantidadEliminarProducto.setText("Cantidad :");
        getContentPane().add(lblCantidadEliminarProducto);
        lblCantidadEliminarProducto.setBounds(74, 154, 110, 38);

        lblMarcaEliminarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblMarcaEliminarProducto.setText("Marca :");
        getContentPane().add(lblMarcaEliminarProducto);
        lblMarcaEliminarProducto.setBounds(74, 198, 110, 34);

        lblFechaEliminarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblFechaEliminarProducto.setText("Fecha :");
        getContentPane().add(lblFechaEliminarProducto);
        lblFechaEliminarProducto.setBounds(74, 238, 102, 31);
        getContentPane().add(txtCodigoEliminarProducto);
        txtCodigoEliminarProducto.setBounds(202, 62, 220, 40);

        lblCostoEliminarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCostoEliminarProducto.setText("Costo :");
        getContentPane().add(lblCostoEliminarProducto);
        lblCostoEliminarProducto.setBounds(70, 280, 102, 30);

        lblCodigoEliminarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCodigoEliminarProducto.setText("Codigo:");
        getContentPane().add(lblCodigoEliminarProducto);
        lblCodigoEliminarProducto.setBounds(74, 56, 110, 40);
        getContentPane().add(txtMarcaEliminarProducto);
        txtMarcaEliminarProducto.setBounds(202, 198, 220, 34);
        getContentPane().add(txtFechaEliminarProducto);
        txtFechaEliminarProducto.setBounds(202, 238, 220, 31);
        getContentPane().add(txtCostoEliminarProducto);
        txtCostoEliminarProducto.setBounds(202, 275, 220, 38);

        lblNombreEliminarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblNombreEliminarProducto.setText("Nombre:");
        getContentPane().add(lblNombreEliminarProducto);
        lblNombreEliminarProducto.setBounds(74, 108, 110, 40);
        getContentPane().add(txtNombreEliminarProducto);
        txtNombreEliminarProducto.setBounds(202, 108, 220, 40);

        btnEliminarEliminarProducto.setText("ELIMINAR");
        btnEliminarEliminarProducto.setEnabled(false);
        btnEliminarEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEliminarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarEliminarProducto);
        btnEliminarEliminarProducto.setBounds(490, 260, 100, 50);

        btnBuscarEliminarProducto.setText("BUSCAR");
        btnBuscarEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEliminarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarEliminarProducto);
        btnBuscarEliminarProducto.setBounds(490, 130, 100, 40);

        lblEliminarProducto.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblEliminarProducto.setText("Eliminar Producto");
        getContentPane().add(lblEliminarProducto);
        lblEliminarProducto.setBounds(228, 11, 222, 39);
        getContentPane().add(lblImagen);
        lblImagen.setBounds(170, 460, 290, 140);
        getContentPane().add(txtTipoEliminarProducto);
        txtTipoEliminarProducto.setBounds(200, 320, 220, 40);

        lblTipoEliminarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblTipoEliminarProducto.setText("Tipo :");
        getContentPane().add(lblTipoEliminarProducto);
        lblTipoEliminarProducto.setBounds(80, 330, 102, 30);
        getContentPane().add(txtDescripcionEliminarProducto);
        txtDescripcionEliminarProducto.setBounds(200, 380, 220, 40);

        lblDescripcionEliminarProducto1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblDescripcionEliminarProducto1.setText("Descripcion:");
        getContentPane().add(lblDescripcionEliminarProducto1);
        lblDescripcionEliminarProducto1.setBounds(32, 390, 140, 30);

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(490, 340, 100, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEliminarProductoActionPerformed
        int codigo=Integer.parseInt(txtCodigoEliminarProducto.getText());
        controladorProducto.read(codigo);
        JOptionPane.showMessageDialog(this, palabra);
        txtCantidadEliminarProducto.setText("");
        txtCostoEliminarProducto.setText("");
        txtFechaEliminarProducto.setText("");
        txtNombreEliminarProducto.setText("");
        txtTipoEliminarProducto.setText("");
        txtDescripcionEliminarProducto.setText("");
        lblImagen.setIcon(null);
    }//GEN-LAST:event_btnEliminarEliminarProductoActionPerformed

    private void btnBuscarEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEliminarProductoActionPerformed
        int codigo=Integer.parseInt(txtCodigoEliminarProducto.getText());
        Producto producto=controladorProducto.read(codigo);
        txtCantidadEliminarProducto.setText(String.valueOf(producto.getCantidad()));
        txtCostoEliminarProducto.setText(String.valueOf(producto.getCosto()));
        txtTipoEliminarProducto.setText(producto.getTipo());
        txtDescripcionEliminarProducto.setText(producto.getDescripcion());
        SimpleDateFormat formato=new SimpleDateFormat();
        String fecha=formato.format(producto.getFechaExpedicion());
        txtFechaEliminarProducto.setText(fecha);
        txtNombreEliminarProducto.setText(producto.getNombre());
        ImageIcon im=new ImageIcon(producto.getPath());
        ImageIcon imagen=new ImageIcon(im.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
        lblImagen.setIcon(imagen);
        btnEliminarEliminarProducto.setEnabled(true);
        
    }//GEN-LAST:event_btnBuscarEliminarProductoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEliminarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarEliminarProducto;
    private javax.swing.JLabel lblCantidadEliminarProducto;
    private javax.swing.JLabel lblCodigoEliminarProducto;
    private javax.swing.JLabel lblCostoEliminarProducto;
    private javax.swing.JLabel lblDescripcionEliminarProducto1;
    private javax.swing.JLabel lblEliminarProducto;
    private javax.swing.JLabel lblFechaEliminarProducto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMarcaEliminarProducto;
    private javax.swing.JLabel lblNombreEliminarProducto;
    private javax.swing.JLabel lblTipoEliminarProducto;
    private javax.swing.JTextField txtCantidadEliminarProducto;
    private javax.swing.JTextField txtCodigoEliminarProducto;
    private javax.swing.JTextField txtCostoEliminarProducto;
    private javax.swing.JTextField txtDescripcionEliminarProducto;
    private javax.swing.JTextField txtFechaEliminarProducto;
    private javax.swing.JTextField txtMarcaEliminarProducto;
    private javax.swing.JTextField txtNombreEliminarProducto;
    private javax.swing.JTextField txtTipoEliminarProducto;
    // End of variables declaration//GEN-END:variables
}
