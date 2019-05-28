/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.controlador.ControladorClase;
import ec.ups.edu.controlador.ControladorCliente;
import ec.ups.edu.controlador.ControladorEmpleado;
import ec.ups.edu.controlador.ControladorFactura;
import ec.ups.edu.controlador.ControladorProducto;

/**
 *
 * @author USER
 
 */

public class VentanaSecundaria extends javax.swing.JFrame {
 private VentanaCrearCliente ventanacrearcliente;
 private VentanaBuscarCliente ventanabuscarcliente;
 private VentanaActualizarCliente ventanaactualizarcliente;
 private VentanaListarCliente ventanalistarcliente;
 private VentanaEliminarCliente ventanaeliminarcliente;
 
 private VentanaCrearEmpleado ventanacrearempleado;
 private VentanaBuscarEmpleado ventanabuscarempleado;
 private VentanaActualizarEmpleado ventanaactualizarempleado;
 private VentanaListarEmpleado ventanalistarempleado;
 private VentanaEliminarEmpleado ventanaeliminarempleado;
 
 private VentanaActualizarProducto actualizarProducto;
 private VentanaCrearProducto crearProducto;
 private VentanaEliminarProducto eliminarProducto;
 private VentanaListarProducto listarProducto;
 private VentanaBuscarProducto buscarProducto;
 
 private VentanaCrearFactura crearFactura;
 private VentanaBuscarFactura buscarFactura;
 private VentanaStock stock;
 
 private VentanaActualizarClase actualizarClase;
 private VentanaCrearClase crearClase;
 private VentanaBuscarClase buscarClase;
 private VentanaEliminarClase eliminarClase;
 private VentanaListarClase listarClase;
 
 private ControladorCliente controladorCliente;
 private ControladorProducto controladorProducto;
 private ControladorEmpleado controladorEmpleado;
 private ControladorClase controladorClase;
 private ControladorFactura controladorFactura;
 
    /**
     * Creates new form VentanaSecundaria
     */
    private boolean acceso;
    public VentanaSecundaria(boolean acceso) {
        initComponents();
        this.acceso=acceso;
        restricciones();
        controladorCliente=new ControladorCliente();
        controladorProducto=new ControladorProducto();
    }

    private VentanaSecundaria() {
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        crearMenuCliente = new javax.swing.JMenuItem();
        buscarMenuCliente = new javax.swing.JMenuItem();
        actualizarMenuCliente = new javax.swing.JMenuItem();
        eliminarMenuCliente = new javax.swing.JMenuItem();
        listarMenuCliente = new javax.swing.JMenuItem();
        menuEmpleado = new javax.swing.JMenu();
        crearMenuEmpleado = new javax.swing.JMenuItem();
        buscarMenuEmpleado = new javax.swing.JMenuItem();
        actualizarMenuEmpleado = new javax.swing.JMenuItem();
        eliminarMenuEmpleado = new javax.swing.JMenuItem();
        listarMenuEmpleado = new javax.swing.JMenuItem();
        menuProducto = new javax.swing.JMenu();
        crearMenuProducto = new javax.swing.JMenuItem();
        buscarMenuProducto = new javax.swing.JMenuItem();
        actulizarMenuProducto = new javax.swing.JMenuItem();
        eliminarMenuProducto = new javax.swing.JMenuItem();
        listarMenuProducto = new javax.swing.JMenuItem();
        menuClases = new javax.swing.JMenu();
        crearMenuClases = new javax.swing.JMenuItem();
        buscarMenuClases = new javax.swing.JMenuItem();
        actualizarMenuClases = new javax.swing.JMenuItem();
        eliminarMenuClases = new javax.swing.JMenuItem();
        listarMenuClases = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemCrear = new javax.swing.JMenuItem();
        itemBuscarEliminar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCliente.setMnemonic('f');
        menuCliente.setText("Cliente");

        crearMenuCliente.setMnemonic('o');
        crearMenuCliente.setText("Crear");
        crearMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMenuClienteActionPerformed(evt);
            }
        });
        menuCliente.add(crearMenuCliente);

        buscarMenuCliente.setMnemonic('s');
        buscarMenuCliente.setText("Buscar");
        buscarMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMenuClienteActionPerformed(evt);
            }
        });
        menuCliente.add(buscarMenuCliente);

        actualizarMenuCliente.setMnemonic('a');
        actualizarMenuCliente.setText("Actualizar");
        actualizarMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarMenuClienteActionPerformed(evt);
            }
        });
        menuCliente.add(actualizarMenuCliente);

        eliminarMenuCliente.setMnemonic('x');
        eliminarMenuCliente.setText("Eliminar");
        eliminarMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuClienteActionPerformed(evt);
            }
        });
        menuCliente.add(eliminarMenuCliente);

        listarMenuCliente.setText("Listar");
        listarMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMenuClienteActionPerformed(evt);
            }
        });
        menuCliente.add(listarMenuCliente);

        menuBar.add(menuCliente);

        menuEmpleado.setMnemonic('e');
        menuEmpleado.setText("Empleado");

        crearMenuEmpleado.setMnemonic('t');
        crearMenuEmpleado.setText("Crear");
        crearMenuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMenuEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(crearMenuEmpleado);

        buscarMenuEmpleado.setMnemonic('y');
        buscarMenuEmpleado.setText("Buscar");
        buscarMenuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMenuEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(buscarMenuEmpleado);

        actualizarMenuEmpleado.setMnemonic('p');
        actualizarMenuEmpleado.setText("Actuallizar");
        actualizarMenuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarMenuEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(actualizarMenuEmpleado);

        eliminarMenuEmpleado.setMnemonic('d');
        eliminarMenuEmpleado.setText("Eliminar");
        eliminarMenuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(eliminarMenuEmpleado);

        listarMenuEmpleado.setText("Listar");
        listarMenuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMenuEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(listarMenuEmpleado);

        menuBar.add(menuEmpleado);

        menuProducto.setMnemonic('h');
        menuProducto.setText("Producto");

        crearMenuProducto.setMnemonic('c');
        crearMenuProducto.setText("Crear");
        crearMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMenuProductoActionPerformed(evt);
            }
        });
        menuProducto.add(crearMenuProducto);

        buscarMenuProducto.setMnemonic('a');
        buscarMenuProducto.setText("Buscar");
        buscarMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMenuProductoActionPerformed(evt);
            }
        });
        menuProducto.add(buscarMenuProducto);

        actulizarMenuProducto.setText("Actualizar");
        actulizarMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizarMenuProductoActionPerformed(evt);
            }
        });
        menuProducto.add(actulizarMenuProducto);

        eliminarMenuProducto.setText("Eliminar");
        eliminarMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuProductoActionPerformed(evt);
            }
        });
        menuProducto.add(eliminarMenuProducto);

        listarMenuProducto.setText("Listar");
        listarMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMenuProductoActionPerformed(evt);
            }
        });
        menuProducto.add(listarMenuProducto);

        menuBar.add(menuProducto);

        menuClases.setText("Clases");

        crearMenuClases.setText("Crear");
        crearMenuClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMenuClasesActionPerformed(evt);
            }
        });
        menuClases.add(crearMenuClases);

        buscarMenuClases.setText("Buscar");
        buscarMenuClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMenuClasesActionPerformed(evt);
            }
        });
        menuClases.add(buscarMenuClases);

        actualizarMenuClases.setText("Actualizar");
        actualizarMenuClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarMenuClasesActionPerformed(evt);
            }
        });
        menuClases.add(actualizarMenuClases);

        eliminarMenuClases.setText("Eliminar");
        eliminarMenuClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuClasesActionPerformed(evt);
            }
        });
        menuClases.add(eliminarMenuClases);

        listarMenuClases.setText("Listar");
        listarMenuClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMenuClasesActionPerformed(evt);
            }
        });
        menuClases.add(listarMenuClases);

        menuBar.add(menuClases);

        jMenu2.setText("Factura");

        itemCrear.setText("Crear");
        itemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearActionPerformed(evt);
            }
        });
        jMenu2.add(itemCrear);

        itemBuscarEliminar.setText("Buscar/Eliminar");
        itemBuscarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarEliminarActionPerformed(evt);
            }
        });
        jMenu2.add(itemBuscarEliminar);

        menuBar.add(jMenu2);

        jMenu1.setText("Idiomas   ");

        jMenuItem1.setText("Español");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Inglés");
        jMenu1.add(jMenuItem2);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuClienteActionPerformed
       ventanaeliminarcliente = new VentanaEliminarCliente(controladorCliente);
       this.desktopPane.removeAll();
        this.desktopPane.repaint();
       ventanaeliminarcliente.setVisible(true);
       desktopPane.add(ventanaeliminarcliente);
    }//GEN-LAST:event_eliminarMenuClienteActionPerformed

    private void actulizarMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizarMenuProductoActionPerformed
       actualizarProducto = new VentanaActualizarProducto();
       this.desktopPane.removeAll();
        this.desktopPane.repaint();
       actualizarProducto.setVisible(true);
       desktopPane.add(actualizarProducto);
    }//GEN-LAST:event_actulizarMenuProductoActionPerformed

    private void crearMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMenuClienteActionPerformed
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
       
        ventanacrearcliente=new VentanaCrearCliente(controladorCliente);
        ventanacrearcliente.setVisible(true);
        desktopPane.add(ventanacrearcliente);
    }//GEN-LAST:event_crearMenuClienteActionPerformed

    private void buscarMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMenuClienteActionPerformed
        ventanabuscarcliente =new VentanaBuscarCliente(controladorCliente);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanabuscarcliente.setVisible(true);
        desktopPane.add(ventanabuscarcliente);
    }//GEN-LAST:event_buscarMenuClienteActionPerformed

    private void listarMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMenuClienteActionPerformed
        ventanalistarcliente =new VentanaListarCliente();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanalistarcliente.setVisible(true);
        desktopPane.add(ventanalistarcliente);
    }//GEN-LAST:event_listarMenuClienteActionPerformed

    private void actualizarMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarMenuClienteActionPerformed
        ventanaactualizarcliente =new VentanaActualizarCliente(controladorCliente);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanaactualizarcliente.setVisible(true);
        desktopPane.add(ventanaactualizarcliente);
    }//GEN-LAST:event_actualizarMenuClienteActionPerformed

    private void crearMenuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMenuEmpleadoActionPerformed
      ventanacrearempleado = new VentanaCrearEmpleado();
      this.desktopPane.removeAll();
        this.desktopPane.repaint();
      ventanacrearempleado.setVisible(true);
      desktopPane.add(ventanacrearempleado);
    }//GEN-LAST:event_crearMenuEmpleadoActionPerformed

    private void buscarMenuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMenuEmpleadoActionPerformed
        ventanabuscarempleado = new VentanaBuscarEmpleado();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanabuscarempleado.setVisible(true);
        desktopPane.add(ventanabuscarempleado);
    }//GEN-LAST:event_buscarMenuEmpleadoActionPerformed

    private void actualizarMenuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarMenuEmpleadoActionPerformed
        ventanaactualizarempleado = new VentanaActualizarEmpleado();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanaactualizarempleado.setVisible(true);
        desktopPane.add(ventanaactualizarempleado);
    }//GEN-LAST:event_actualizarMenuEmpleadoActionPerformed

    private void eliminarMenuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuEmpleadoActionPerformed
        ventanaeliminarempleado = new VentanaEliminarEmpleado();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanaeliminarempleado.setVisible(true);
        desktopPane.add(ventanaeliminarempleado);
    }//GEN-LAST:event_eliminarMenuEmpleadoActionPerformed

    private void listarMenuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMenuEmpleadoActionPerformed
        ventanalistarempleado = new VentanaListarEmpleado();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanalistarempleado.setVisible(true);
        desktopPane.add(ventanalistarempleado);
    }//GEN-LAST:event_listarMenuEmpleadoActionPerformed

    private void crearMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMenuProductoActionPerformed
        crearProducto = new VentanaCrearProducto(controladorProducto);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        crearProducto.setVisible(true);
        desktopPane.add(crearProducto);
    }//GEN-LAST:event_crearMenuProductoActionPerformed

    private void buscarMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMenuProductoActionPerformed
        buscarProducto = new VentanaBuscarProducto(controladorProducto);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        buscarProducto.setVisible(true);
        desktopPane.add(buscarProducto);
    }//GEN-LAST:event_buscarMenuProductoActionPerformed

    private void eliminarMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuProductoActionPerformed
        eliminarProducto =new VentanaEliminarProducto();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        eliminarProducto.setVisible(true);
        desktopPane.add(eliminarProducto);
    }//GEN-LAST:event_eliminarMenuProductoActionPerformed

    private void listarMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMenuProductoActionPerformed
        listarProducto = new VentanaListarProducto();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        listarProducto.setVisible(true);
        desktopPane.add(listarProducto);
    }//GEN-LAST:event_listarMenuProductoActionPerformed

    private void crearMenuClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMenuClasesActionPerformed
        crearClase = new VentanaCrearClase();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        crearClase.setVisible(true);
        desktopPane.add(crearClase);
    }//GEN-LAST:event_crearMenuClasesActionPerformed

    private void buscarMenuClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMenuClasesActionPerformed
        buscarClase = new VentanaBuscarClase();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        buscarClase.setVisible(true);
        desktopPane.add(buscarClase);
    }//GEN-LAST:event_buscarMenuClasesActionPerformed

    private void actualizarMenuClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarMenuClasesActionPerformed
        actualizarClase = new VentanaActualizarClase();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        actualizarClase.setVisible(true);
        desktopPane.add(actualizarClase);
    }//GEN-LAST:event_actualizarMenuClasesActionPerformed

    private void eliminarMenuClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuClasesActionPerformed
        eliminarClase = new VentanaEliminarClase();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        eliminarClase.setVisible(true);
        desktopPane.add(eliminarClase);
    }//GEN-LAST:event_eliminarMenuClasesActionPerformed

    private void listarMenuClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMenuClasesActionPerformed
        listarClase = new VentanaListarClase();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        listarClase.setVisible(true);
        desktopPane.add(listarClase);
    }//GEN-LAST:event_listarMenuClasesActionPerformed

    private void itemBuscarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarEliminarActionPerformed
        buscarFactura = new VentanaBuscarFactura();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        buscarFactura.setVisible(true);
        desktopPane.add(buscarFactura);
    }//GEN-LAST:event_itemBuscarEliminarActionPerformed

    private void itemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearActionPerformed
        crearFactura = new VentanaCrearFactura();
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        crearFactura.setVisible(true);
        desktopPane.add(crearFactura);
        
    }//GEN-LAST:event_itemCrearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSecundaria().setVisible(true);
            }
        });
        
        
    }
        public void restricciones(){
            if (acceso==false){
                menuEmpleado.setEnabled(false);
                crearMenuProducto.setEnabled(false);
                actulizarMenuProducto.setEnabled(false);
                eliminarMenuProducto.setEnabled(false);
                crearMenuClases.setEnabled(false);
                actualizarMenuClases.setEnabled(false);
                eliminarMenuClases.setEnabled(false);
            }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarMenuClases;
    private javax.swing.JMenuItem actualizarMenuCliente;
    private javax.swing.JMenuItem actualizarMenuEmpleado;
    private javax.swing.JMenuItem actulizarMenuProducto;
    private javax.swing.JMenuItem buscarMenuClases;
    private javax.swing.JMenuItem buscarMenuCliente;
    private javax.swing.JMenuItem buscarMenuEmpleado;
    private javax.swing.JMenuItem buscarMenuProducto;
    private javax.swing.JMenuItem crearMenuClases;
    private javax.swing.JMenuItem crearMenuCliente;
    private javax.swing.JMenuItem crearMenuEmpleado;
    private javax.swing.JMenuItem crearMenuProducto;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem eliminarMenuClases;
    private javax.swing.JMenuItem eliminarMenuCliente;
    private javax.swing.JMenuItem eliminarMenuEmpleado;
    private javax.swing.JMenuItem eliminarMenuProducto;
    private javax.swing.JMenuItem itemBuscarEliminar;
    private javax.swing.JMenuItem itemCrear;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem listarMenuClases;
    private javax.swing.JMenuItem listarMenuCliente;
    private javax.swing.JMenuItem listarMenuEmpleado;
    private javax.swing.JMenuItem listarMenuProducto;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuClases;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuEmpleado;
    private javax.swing.JMenu menuProducto;
    // End of variables declaration//GEN-END:variables

}
