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
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class VentanaActualizarProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaActualizarProducto
     */
    private ControladorProducto controladorProducto;
    private String ruta;
    public VentanaActualizarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.controladorProducto=controladorProducto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnActualizarActualizarProducto = new javax.swing.JToggleButton();
        btnBuscarActualizarProducto = new javax.swing.JButton();
        txtCantidadActualizarProducto = new javax.swing.JTextField();
        lblCantidadActualizarProducto = new javax.swing.JLabel();
        lblFechaActualizarProducto = new javax.swing.JLabel();
        txtCodigoActualizarProducto = new javax.swing.JTextField();
        lblCostoActualizarProducto = new javax.swing.JLabel();
        lblCodigoActualizarProducto = new javax.swing.JLabel();
        txtFechaActualizarProducto = new javax.swing.JTextField();
        txtCostoActualizarEmpleado = new javax.swing.JTextField();
        lblNombreActulizarProducto = new javax.swing.JLabel();
        txtNombreActualizarProducto = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        btnExaminar = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Actualizar Producto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(358, 0, 217, 51);

        btnActualizarActualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/actualizar.png"))); // NOI18N
        btnActualizarActualizarProducto.setEnabled(false);
        btnActualizarActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActualizarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarActualizarProducto);
        btnActualizarActualizarProducto.setBounds(810, 190, 110, 100);

        btnBuscarActualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/buscar.png"))); // NOI18N
        btnBuscarActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActualizarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarActualizarProducto);
        btnBuscarActualizarProducto.setBounds(810, 60, 100, 100);
        getContentPane().add(txtCantidadActualizarProducto);
        txtCantidadActualizarProducto.setBounds(529, 181, 220, 38);

        lblCantidadActualizarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCantidadActualizarProducto.setText("Cantidad :");
        getContentPane().add(lblCantidadActualizarProducto);
        lblCantidadActualizarProducto.setBounds(401, 181, 110, 38);

        lblFechaActualizarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblFechaActualizarProducto.setText("Fecha :");
        getContentPane().add(lblFechaActualizarProducto);
        lblFechaActualizarProducto.setBounds(410, 230, 102, 31);
        getContentPane().add(txtCodigoActualizarProducto);
        txtCodigoActualizarProducto.setBounds(529, 87, 220, 40);

        lblCostoActualizarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCostoActualizarProducto.setText("Costo :");
        getContentPane().add(lblCostoActualizarProducto);
        lblCostoActualizarProducto.setBounds(410, 280, 102, 30);

        lblCodigoActualizarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCodigoActualizarProducto.setText("Codigo:");
        getContentPane().add(lblCodigoActualizarProducto);
        lblCodigoActualizarProducto.setBounds(401, 82, 110, 40);
        getContentPane().add(txtFechaActualizarProducto);
        txtFechaActualizarProducto.setBounds(530, 230, 220, 37);
        getContentPane().add(txtCostoActualizarEmpleado);
        txtCostoActualizarEmpleado.setBounds(530, 280, 220, 38);

        lblNombreActulizarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblNombreActulizarProducto.setText("Nombre:");
        getContentPane().add(lblNombreActulizarProducto);
        lblNombreActulizarProducto.setBounds(401, 134, 110, 40);
        getContentPane().add(txtNombreActualizarProducto);
        txtNombreActualizarProducto.setBounds(529, 134, 220, 40);
        getContentPane().add(lblImagen);
        lblImagen.setBounds(30, 70, 350, 430);

        btnExaminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/LUPA.png"))); // NOI18N
        btnExaminar.setEnabled(false);
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnExaminar);
        btnExaminar.setBounds(410, 370, 110, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActualizarProductoActionPerformed
        int codigo=Integer.parseInt(txtCodigoActualizarProducto.getText());
        Producto producto=controladorProducto.read(codigo);
        txtCantidadActualizarProducto.setText(String.valueOf(producto.getCantidad()));
        txtCostoActualizarEmpleado.setText(String.valueOf(producto.getCosto()));
        SimpleDateFormat formato=new SimpleDateFormat();
        String fecha=formato.format(producto.getFechaExpedicion());
        txtFechaActualizarProducto.setText(fecha);
        txtNombreActualizarProducto.setText(producto.getNombre());
        ImageIcon im=new ImageIcon(producto.getPath());
        ImageIcon imagen=new ImageIcon(im.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
        lblImagen.setIcon(imagen);
        btnActualizarActualizarProducto.setEnabled(true);
        btnExaminar.setEnabled(true);
    }//GEN-LAST:event_btnBuscarActualizarProductoActionPerformed

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
        JFileChooser Explorador = new JFileChooser();
        int option=Explorador.showOpenDialog(this);
        if(option==Explorador.APPROVE_OPTION){
            ruta = Explorador.getSelectedFile().getPath();
            //lblImagen.setIcon(new ImageIcon(ruta));
        ImageIcon im=new ImageIcon(ruta);
        ImageIcon imagen=new ImageIcon(im.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
        lblImagen.setIcon(imagen);
        }
    }//GEN-LAST:event_btnExaminarActionPerformed

    private void btnActualizarActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActualizarProductoActionPerformed
        Producto producto= new Producto();
        try {
        Date fecha=new SimpleDateFormat("dd/MM/yyyy").parse(txtFechaActualizarProducto.getText());
        producto.setFechaExpedicion(fecha);
        }
        catch (Exception e){
            
        }
        producto.setCodigo(Integer.parseInt(txtCodigoActualizarProducto.getText()));
        producto.setCosto(Double.parseDouble(txtCostoActualizarEmpleado.getText()));
        producto.setCantidad(Integer.parseInt(txtCantidadActualizarProducto.getText()));
        producto.setNombre(txtNombreActualizarProducto.getText());
        producto.setPath(ruta);
        controladorProducto.update(producto);
        JOptionPane.showMessageDialog(this, "Producto actualizado correctamente");
        txtCantidadActualizarProducto.setText("");
        txtCostoActualizarEmpleado.setText("");
        txtFechaActualizarProducto.setText("");
        txtNombreActualizarProducto.setText("");
        lblImagen.setIcon(null);
    }//GEN-LAST:event_btnActualizarActualizarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnActualizarActualizarProducto;
    private javax.swing.JButton btnBuscarActualizarProducto;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCantidadActualizarProducto;
    private javax.swing.JLabel lblCodigoActualizarProducto;
    private javax.swing.JLabel lblCostoActualizarProducto;
    private javax.swing.JLabel lblFechaActualizarProducto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombreActulizarProducto;
    private javax.swing.JTextField txtCantidadActualizarProducto;
    private javax.swing.JTextField txtCodigoActualizarProducto;
    private javax.swing.JTextField txtCostoActualizarEmpleado;
    private javax.swing.JTextField txtFechaActualizarProducto;
    private javax.swing.JTextField txtNombreActualizarProducto;
    // End of variables declaration//GEN-END:variables
}
