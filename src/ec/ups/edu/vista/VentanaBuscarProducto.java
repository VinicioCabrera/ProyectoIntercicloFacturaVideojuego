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

/**
 *
 * @author USER
 */
public class VentanaBuscarProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaBuscarProducto
     */
    ControladorProducto controladorProducto;
    public VentanaBuscarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.controladorProducto=controladorProducto;
    }
    public void cambiaridioma(ResourceBundle mensajes){
        lblBuscarProducto.setText(mensajes.getString("BuscarProducto"));
        lblCantidadBuscarProducto.setText(mensajes.getString("CantidadCrearProducto"));
        lblCodigoBuscarProducto.setText(mensajes.getString("IngresarCodigo"));
        lblNombreBuscarProducto.setText(mensajes.getString("NombreCrearCliente"));
        lblFechaBuscarProducto.setText(mensajes.getString("FechaCrearProducto"));
        jlbTipoBuscarProducto1.setText(mensajes.getString("DescripcionCrearClase"));
        lblCostoBuscarProducto.setText(mensajes.getString("CostoCrearProducto"));
        jlbTipoBuscarProducto.setText(mensajes.getString("lblTipo"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        lblBuscarProducto = new javax.swing.JLabel();
        txtCodigoBuscarProducto = new javax.swing.JTextField();
        lblCodigoBuscarProducto = new javax.swing.JLabel();
        lblCantidadBuscarProducto = new javax.swing.JLabel();
        lblFechaBuscarProducto = new javax.swing.JLabel();
        lblCostoBuscarProducto = new javax.swing.JLabel();
        txtFechaBuscarProducto = new javax.swing.JTextField();
        txtCostoBuscarProducto = new javax.swing.JTextField();
        lblNombreBuscarProducto = new javax.swing.JLabel();
        txtNombreBuscarProducto = new javax.swing.JTextField();
        txtCantidadBuscarProducto = new javax.swing.JTextField();
        btnBuscarBuscarProducto = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        txtTipoBuscarProducto = new javax.swing.JTextField();
        jlbTipoBuscarProducto = new javax.swing.JLabel();
        jlbTipoBuscarProducto1 = new javax.swing.JLabel();
        txtDescripcionBuscarProducto = new javax.swing.JTextField();

        setClosable(true);

        lblBuscarProducto.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblBuscarProducto.setText("Buscar Producto");

        lblCodigoBuscarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCodigoBuscarProducto.setText("Codigo :");

        lblCantidadBuscarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCantidadBuscarProducto.setText("Cantidad :");

        lblFechaBuscarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblFechaBuscarProducto.setText("Fecha :");

        lblCostoBuscarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCostoBuscarProducto.setText("Costo :");

        lblNombreBuscarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblNombreBuscarProducto.setText("Nombre:");

        btnBuscarBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/buscar.png"))); // NOI18N
        btnBuscarBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBuscarProductoActionPerformed(evt);
            }
        });

        jlbTipoBuscarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jlbTipoBuscarProducto.setText("Tipo :");

        jlbTipoBuscarProducto1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jlbTipoBuscarProducto1.setText("Descripcion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(lblCodigoBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBuscarProducto)
                            .addComponent(txtCodigoBuscarProducto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblNombreBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCantidadBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCantidadBuscarProducto)
                                    .addComponent(txtNombreBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFechaBuscarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCostoBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jlbTipoBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jlbTipoBuscarProducto1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscarBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaBuscarProducto)
                                    .addComponent(txtCostoBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(txtTipoBuscarProducto)
                                    .addComponent(txtDescripcionBuscarProducto))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 60, Short.MAX_VALUE)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(95, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantidadBuscarProducto)
                            .addComponent(lblCantidadBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaBuscarProducto)
                            .addComponent(lblFechaBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCostoBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCostoBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbTipoBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcionBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbTipoBuscarProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBuscarProductoActionPerformed
        int codigo=Integer.parseInt(txtCodigoBuscarProducto.getText());
        Producto producto=controladorProducto.read(codigo);
        txtCantidadBuscarProducto.setText(String.valueOf(producto.getCantidad()));
        txtCostoBuscarProducto.setText(String.valueOf(producto.getCosto()));
        SimpleDateFormat formato=new SimpleDateFormat();
        String fecha=formato.format(producto.getFechaExpedicion());
        txtFechaBuscarProducto.setText(fecha);
        txtNombreBuscarProducto.setText(producto.getNombre());
        ImageIcon im=new ImageIcon(producto.getPath());
        ImageIcon imagen=new ImageIcon(im.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
        lblImagen.setIcon(imagen);
        txtTipoBuscarProducto.setText(producto.getClase().getTipo());
        txtDescripcionBuscarProducto.setText(producto.getClase().getDescripcion());
    }//GEN-LAST:event_btnBuscarBuscarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBuscarProducto;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jlbTipoBuscarProducto;
    private javax.swing.JLabel jlbTipoBuscarProducto1;
    private javax.swing.JLabel lblBuscarProducto;
    private javax.swing.JLabel lblCantidadBuscarProducto;
    private javax.swing.JLabel lblCodigoBuscarProducto;
    private javax.swing.JLabel lblCostoBuscarProducto;
    private javax.swing.JLabel lblFechaBuscarProducto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombreBuscarProducto;
    private javax.swing.JTextField txtCantidadBuscarProducto;
    private javax.swing.JTextField txtCodigoBuscarProducto;
    private javax.swing.JTextField txtCostoBuscarProducto;
    private javax.swing.JTextField txtDescripcionBuscarProducto;
    private javax.swing.JTextField txtFechaBuscarProducto;
    private javax.swing.JTextField txtNombreBuscarProducto;
    private javax.swing.JTextField txtTipoBuscarProducto;
    // End of variables declaration//GEN-END:variables
}
