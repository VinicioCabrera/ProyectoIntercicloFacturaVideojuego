/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.controlador.ControladorEmpleado;
import ec.ups.edu.modelo.Empleado;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class VentanaListarEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaListarEmpleado
     */
    ControladorEmpleado controladorEmpleado;
    public VentanaListarEmpleado(ControladorEmpleado controladorEmpleado) {
        initComponents();
        this.controladorEmpleado=controladorEmpleado;
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarEmpledo = new javax.swing.JTable();
        lblListar = new javax.swing.JLabel();

        tblListarEmpledo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cedula", "Direccion", "Telefono", "E-mail", "Sueldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListarEmpledo.setRowHeight(30);
        jScrollPane1.setViewportView(tblListarEmpledo);

        lblListar.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblListar.setText("Listar Empleados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblListar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTabla(){
        Set<Empleado> lista=controladorEmpleado.getLista();
        DefaultTableModel modelo=(DefaultTableModel) tblListarEmpledo.getModel();
        for (Empleado empleado : lista) {
            
            Object[] datos={
              
                empleado.getCodigo(),
                empleado.getNombre(),
                empleado.getCedula(),
                empleado.getDireccion(),
                empleado.getTelefono(),
                empleado.getEmail(),
                empleado.getSueldo()
            };
            modelo.addRow(datos);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListar;
    private javax.swing.JTable tblListarEmpledo;
    // End of variables declaration//GEN-END:variables
}
