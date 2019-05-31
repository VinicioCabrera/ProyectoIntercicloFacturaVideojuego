/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.controlador.ControladorFactura;
import ec.ups.edu.modelo.DetalleFactura;
import ec.ups.edu.modelo.Factura;
import ec.ups.edu.modelo.ImagenTabla;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author one
 */
public class VentanaBuscarFactura extends javax.swing.JInternalFrame {

    private ControladorFactura controladorFactura;
    private DetalleFactura detalleFactura;
    private DefaultTableModel model;
    int c;
    private int codigoe;
    private SimpleDateFormat formato;
    /**
     * Creates new form CrearFactura
     */
    public VentanaBuscarFactura(ControladorFactura controladorFactura) {
        initComponents();
        this.controladorFactura= controladorFactura;
        this.setSize(1000,1000);
        formato= new SimpleDateFormat("dd/MM/yyyy");
    }
    
    public void cambiaridioma(ResourceBundle mensajes) {
        lblFactura.setText(mensajes.getString("MenuFactura"));
        lblCedula.setText(mensajes.getString("CedulaCrearCliente"));
        lblCodigos.setText(mensajes.getString("IngresarCodigo"));
        lblNombre.setText(mensajes.getString("NombreCrearCliente"));
        lblEmail.setText(mensajes.getString("EmailCrearCliente"));
        lblDireccion.setText(mensajes.getString("DireccionCrearCliente"));
        lblTelefono.setText(mensajes.getString("TelefonoCrearCliente"));
        lblFechas.setText(mensajes.getString("FechaCrearProducto"));
        lblEmpleado.setText(mensajes.getString("MenuEmpleado"));
        
        JTableHeader th = tblFactura.getTableHeader();
        TableColumnModel tm = th.getColumnModel();
        TableColumn tc;
        tc = tm.getColumn(0);
        tc.setHeaderValue(mensajes.getString("IngresarCodigo"));
        tc = tm.getColumn(1);
        tc.setHeaderValue(mensajes.getString("tblImagen"));
        tc = tm.getColumn(2);
        tc.setHeaderValue(mensajes.getString("MenuProducto"));
        tc = tm.getColumn(3);
        tc.setHeaderValue(mensajes.getString("CantidadCrearProducto"));
        tc = tm.getColumn(4);
        tc.setHeaderValue(mensajes.getString("tblPreciaoU"));
        tc = tm.getColumn(5);
        tc.setHeaderValue(mensajes.getString("tblPrecioT"));
        th.repaint();
        

    }

    public VentanaBuscarFactura(int cod) {
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEmpleado = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNonbre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmpleado = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblFactura = new javax.swing.JLabel();
        lblFechas = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblCodigos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();
        txtSubTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();

        jLabel14.setText("jLabel14");

        setClosable(true);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        lblNombre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        lblCedula.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblCedula.setText("Cedula:");

        lblDireccion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblDireccion.setText("Direccion:");

        lblTelefono.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblTelefono.setText("Telefono:");

        lblEmpleado.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblEmpleado.setText("Empleado:");

        lblEmail.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblEmail.setText("e-mail:");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        txtNonbre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNonbreActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpleadoActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNonbre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCedula)
                        .addComponent(lblTelefono)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblEmpleado)
                    .addComponent(txtNonbre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(lblEmail)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 710, 138);

        lblFactura.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblFactura.setText("FACTURA");
        getContentPane().add(lblFactura);
        lblFactura.setBounds(240, 0, 136, 39);

        lblFechas.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblFechas.setText("Fecha");
        getContentPane().add(lblFechas);
        lblFechas.setBounds(450, 60, 44, 17);
        getContentPane().add(lblFecha);
        lblFecha.setBounds(530, 60, 147, 23);

        lblCodigos.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblCodigos.setText("Codigo");
        getContentPane().add(lblCodigos);
        lblCodigos.setBounds(580, 10, 51, 17);

        tblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Imagen", "Producto", "Cantidad", "Precio U.", "Precio T."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFactura.setRowHeight(35);
        jScrollPane1.setViewportView(tblFactura);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 220, 710, 340);

        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtSubTotal);
        txtSubTotal.setBounds(600, 560, 83, 22);

        jLabel8.setText("SubTotal");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(540, 560, 51, 16);
        getContentPane().add(txtIva);
        txtIva.setBounds(600, 590, 83, 22);

        jLabel13.setText("Iva");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(576, 590, 20, 16);

        jLabel15.setText("Total");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(565, 620, 30, 16);

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal);
        txtTotal.setBounds(600, 620, 83, 22);

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(350, 610, 100, 40);

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(40, 610, 90, 40);

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(190, 610, 100, 40);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(204, 0, 51));
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(640, 0, 60, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtNonbreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNonbreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNonbreActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpleadoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controladorFactura.remove(Integer.parseInt(txtCodigo.getText()));
        JOptionPane.showMessageDialog(this, "Factura Eliminada", "Eliminar Factura", JOptionPane.OK_OPTION);
        txtCodigo.setText("");
        txtCedula.setText("");
        txtDireccion.setText("");
        txtIva.setText("");
        txtNonbre.setText("");
        txtSubTotal.setText("");
        txtTotal.setText("");
        txtTelefono.setText("");
        model.setColumnCount(6);
        model.setRowCount(0);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Factura factura = new Factura();
        
        tblFactura.setDefaultRenderer(Object.class, new ImagenTabla());
        factura = controladorFactura.read(Integer.parseInt(txtCodigo.getText()));
        if (factura != null) {
            model = (DefaultTableModel) tblFactura.getModel();
            model.setColumnCount(6);
            model.setRowCount(0);
            txtCedula.setText(factura.getCliente().getCedula());
            txtNonbre.setText(factura.getCliente().getNombre());
            txtDireccion.setText(factura.getCliente().getDireccion());
            txtTelefono.setText(factura.getCliente().getTelefono());
            txtSubTotal.setText(String.valueOf(factura.getSubtotal()));
            txtIva.setText(String.valueOf(factura.getIva()));
            txtTotal.setText(String.valueOf(factura.getTotal()));
            txtEmpleado.setText(factura.getEmpleado().getNombre());
            txtEmail.setText(factura.getCliente().getEmail());
            lblFecha.setText(formato.format(factura.getFecha()));
            Set<DetalleFactura> lista = factura.getDetalleFactura();
            for (DetalleFactura facturaDetalle : lista) {
                Object[] datos = {facturaDetalle.getCodigo(), new JLabel(new ImageIcon(facturaDetalle.getProducto().getPath())), facturaDetalle.getProducto().getNombre(),facturaDetalle.getCosto(), facturaDetalle.getPrecio(), facturaDetalle.getSubTotal()};
                model.addRow(datos);
            }
            btnCancelar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "No exite la Factura", "Buscar Facrura", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCodigos;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tblFactura;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNonbre;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
