/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

/**
 *
 * @author USER
 */
public class VentanaActualizarProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaActualizarProducto
     */
    public VentanaActualizarProducto() {
        initComponents();
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
        lblMarcaActualizarProducto = new javax.swing.JLabel();
        lblFechaActualizarProducto = new javax.swing.JLabel();
        txtCodigoActualizarProducto = new javax.swing.JTextField();
        lblCostoActualizarProducto = new javax.swing.JLabel();
        lblCodigoActualizarProducto = new javax.swing.JLabel();
        txtMarcaActualizarProducto = new javax.swing.JTextField();
        txtFechaActualizarProducto = new javax.swing.JTextField();
        txtCostoActualizarEmpleado = new javax.swing.JTextField();
        lblNombreActulizarProducto = new javax.swing.JLabel();
        txtNombreActualizarProducto = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Actualizar Producto");

        btnActualizarActualizarProducto.setText("ACTUALIZAR");

        btnBuscarActualizarProducto.setText("BUSCAR");

        lblCantidadActualizarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCantidadActualizarProducto.setText("Cantidad :");

        lblMarcaActualizarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblMarcaActualizarProducto.setText("Marca :");

        lblFechaActualizarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblFechaActualizarProducto.setText("Fecha :");

        lblCostoActualizarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCostoActualizarProducto.setText("Costo :");

        lblCodigoActualizarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblCodigoActualizarProducto.setText("Codigo:");

        lblNombreActulizarProducto.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lblNombreActulizarProducto.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnActualizarActualizarProducto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBuscarActualizarProducto)
                .addGap(59, 59, 59))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(152, 152, 152)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblNombreActulizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCantidadActualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCantidadActualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(txtNombreActualizarProducto)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCodigoActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtCodigoActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMarcaActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFechaActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCostoActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMarcaActualizarProducto)
                                .addComponent(txtFechaActualizarProducto)
                                .addComponent(txtCostoActualizarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                    .addContainerGap(152, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnBuscarActualizarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(btnActualizarActualizarProducto)
                .addGap(52, 52, 52))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigoActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodigoActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombreActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNombreActulizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCantidadActualizarProducto)
                        .addComponent(lblCantidadActualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMarcaActualizarProducto)
                        .addComponent(lblMarcaActualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFechaActualizarProducto)
                        .addComponent(lblFechaActualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCostoActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCostoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnActualizarActualizarProducto;
    private javax.swing.JButton btnBuscarActualizarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCantidadActualizarProducto;
    private javax.swing.JLabel lblCodigoActualizarProducto;
    private javax.swing.JLabel lblCostoActualizarProducto;
    private javax.swing.JLabel lblFechaActualizarProducto;
    private javax.swing.JLabel lblMarcaActualizarProducto;
    private javax.swing.JLabel lblNombreActulizarProducto;
    private javax.swing.JTextField txtCantidadActualizarProducto;
    private javax.swing.JTextField txtCodigoActualizarProducto;
    private javax.swing.JTextField txtCostoActualizarEmpleado;
    private javax.swing.JTextField txtFechaActualizarProducto;
    private javax.swing.JTextField txtMarcaActualizarProducto;
    private javax.swing.JTextField txtNombreActualizarProducto;
    // End of variables declaration//GEN-END:variables
}
