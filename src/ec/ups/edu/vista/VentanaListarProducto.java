/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.controlador.ControladorProducto;
import ec.ups.edu.modelo.ImagenTabla;
import ec.ups.edu.modelo.Producto;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author USER
 */
public class VentanaListarProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaListarProducto
     */
    ControladorProducto controladorProducto;
    public VentanaListarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.controladorProducto=controladorProducto;
        listarProducto();
    }
    public void cambiaridioma(ResourceBundle mensajes) {
        lblListar.setText(mensajes.getString("ListarProducto"));
        
        JTableHeader th = tblListarProducto.getTableHeader();
        TableColumnModel tm = th.getColumnModel();
        TableColumn tc;
        tc = tm.getColumn(0);
        tc.setHeaderValue(mensajes.getString("IngresarCodigo"));
        tc = tm.getColumn(1);
        tc.setHeaderValue(mensajes.getString("NombreCrearCliente"));
        tc = tm.getColumn(2);
        tc.setHeaderValue(mensajes.getString("CantidadCrearProducto"));
        tc = tm.getColumn(3);
        tc.setHeaderValue(mensajes.getString("FechaCrearProducto"));
        tc = tm.getColumn(4);
        tc.setHeaderValue(mensajes.getString("CostoCrearProducto"));
        tc = tm.getColumn(5);
        tc.setHeaderValue(mensajes.getString("tblImagen"));
        tc = tm.getColumn(6);
        tc.setHeaderValue(mensajes.getString("lblTipo"));
        tc = tm.getColumn(7);
        tc.setHeaderValue(mensajes.getString("DescripcionCrearClase"));
        th.repaint();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblListar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarProducto = new javax.swing.JTable();

        setClosable(true);

        lblListar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblListar.setText("Listar Producto");

        tblListarProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "CANTIDAD", "FECHA", "COSTO", "IMAGEN", "Tipo", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListarProducto.setRowHeight(100);
        jScrollPane1.setViewportView(tblListarProducto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addComponent(lblListar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblListar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 395, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void listarProducto(){
  
    tblListarProducto.setDefaultRenderer(Object.class, new ImagenTabla());
    DefaultTableModel modelo= (DefaultTableModel) tblListarProducto.getModel();
    Set<Producto> lista=controladorProducto.getLista();
    for (Producto producto : lista) {
        Object[] datos={
            producto.getCodigo(),
            producto.getNombre(),
            producto.getCantidad(),
            producto.getFechaExpedicion(),
            producto.getCosto(),
            new JLabel(new ImageIcon(producto.getPath())),
            producto.getTipo(),
            producto.getDescripcion()
        };
        modelo.addRow(datos);
    }
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListar;
    private javax.swing.JTable tblListarProducto;
    // End of variables declaration//GEN-END:variables
}
