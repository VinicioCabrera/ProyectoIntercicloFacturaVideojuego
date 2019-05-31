/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.controlador.ControladorCliente;
import ec.ups.edu.controlador.ControladorCliente;
import ec.ups.edu.controlador.ControladorEmpleado;
import ec.ups.edu.controlador.ControladorFactura;
import ec.ups.edu.controlador.ControladorProducto;
import java.util.Locale;
import java.util.ResourceBundle;
import java.awt.Dimension;

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
 private VentanaListarfactura listarFactura;

 

 
 private ControladorCliente controladorCliente;
 private ControladorProducto controladorProducto;
 private ControladorEmpleado controladorEmpleado;
 private ControladorCliente controladorClase;
 private ControladorFactura controladorFactura;
 
 private VentanaPrincipalLogin principalLogin;
 private Locale localizacion;
 private ResourceBundle mensajes;
 private Dimension d;
 
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
        controladorClase=new ControladorCliente();
        controladorFactura=new ControladorFactura();
        controladorEmpleado= new ControladorEmpleado();
        
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        mensajes = ResourceBundle.getBundle("ec.ups.edu.Idiomas.mensajes", Locale.getDefault());
        System.out.println("Mensajes");
        this.setExtendedState(6);
        d=this.getSize(d);
       
    }
    public void cambiarIdioma() {
        mensajes = ResourceBundle.getBundle("ec.ups.edu.Idiomas.mensajes", Locale.getDefault());
        menuCliente.setText(mensajes.getString("MenuCliente"));
        eliminarMenuCliente.setText(mensajes.getString("EliminarEliminarCliente"));
        actualizarMenuCliente.setText(mensajes.getString("ActualizarMenuCliente"));
        buscarMenuCliente.setText(mensajes.getString("BuscarMenuCliente"));
        listarMenuCliente.setText(mensajes.getString("AreaCreaEmpleado"));
        crearMenuCliente.setText(mensajes.getString("CrearMenuCliente"));
        
        menuEmpleado.setText(mensajes.getString("MenuEmpleado"));
        eliminarMenuEmpleado.setText(mensajes.getString("EliminarEliminarCliente"));
        actualizarMenuEmpleado.setText(mensajes.getString("ActualizarMenuCliente"));
        buscarMenuEmpleado.setText(mensajes.getString("BuscarMenuCliente"));
        listarMenuEmpleado.setText(mensajes.getString("AreaCreaEmpleado"));
        crearMenuEmpleado.setText(mensajes.getString("CrearMenuCliente"));
        
        menuProducto.setText(mensajes.getString("MenuProducto"));
        eliminarMenuProducto.setText(mensajes.getString("EliminarEliminarCliente"));
        actulizarMenuProducto.setText(mensajes.getString("ActualizarMenuCliente"));
        buscarMenuProducto.setText(mensajes.getString("BuscarMenuCliente"));
        listarMenuProducto.setText(mensajes.getString("AreaCreaEmpleado"));
        crearMenuProducto.setText(mensajes.getString("CrearMenuCliente"));
        
        menuFactura.setText(mensajes.getString("MenuFactura"));
        itemBuscarEliminar.setText(mensajes.getString("BucarEliminarMenuFactura"));
        itemCrear.setText(mensajes.getString("CrearMenuCliente"));
        
        menuIdioma.setText(mensajes.getString("MenuIdioma"));
        itemEspañol.setText(mensajes.getString("EspañolMenuIdiomas"));
        itemIngles.setText(mensajes.getString("InglesMenuIdiomas"));

        if (ventanaactualizarcliente != null) {
            ventanaactualizarcliente.cambiaridioma(mensajes);
        }
        if (ventanacrearcliente != null) {
            ventanacrearcliente.cambiaridioma(mensajes);
        }
        if (ventanabuscarcliente != null) {
            ventanabuscarcliente.cambiaridioma(mensajes);
        }
        if (ventanalistarcliente != null) {
            ventanalistarcliente.cambiaridioma(mensajes);
        }
        if (ventanaeliminarcliente != null) {
            ventanaeliminarcliente.cambiaridioma(mensajes);
        }
        if (ventanaactualizarempleado != null) {
            ventanaactualizarempleado.cambiaridioma(mensajes);
        }
        if (ventanabuscarempleado != null) {
            ventanabuscarempleado.cambiaridioma(mensajes);
        }
        if (ventanaeliminarempleado != null) {
            ventanaeliminarempleado.cambiaridioma(mensajes);
        }
        if (ventanacrearempleado != null) {
            ventanacrearempleado.cambiaridioma(mensajes);
        }
        if (ventanalistarempleado != null) {
            ventanalistarempleado.cambiaridioma(mensajes);
        }
        if (actualizarProducto != null) {
            actualizarProducto.cambiaridioma(mensajes);
        }
        if (eliminarProducto != null) {
            eliminarProducto.cambiaridioma(mensajes);
        }
        if (buscarProducto != null) {
            buscarProducto.cambiaridioma(mensajes);
        }
        if (crearProducto != null) {
            crearProducto.cambiaridioma(mensajes);
        }
        if (listarProducto != null) {
            listarProducto.cambiaridioma(mensajes);
        }
        if (crearFactura != null) {
            crearFactura.cambiaridioma(mensajes);
        }
        if (buscarFactura != null) {
            buscarFactura.cambiaridioma(mensajes);
        }
        
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

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
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
        menuFactura = new javax.swing.JMenu();
        itemCrear = new javax.swing.JMenuItem();
        itemBuscarEliminar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuIdioma = new javax.swing.JMenu();
        itemEspañol = new javax.swing.JMenuItem();
        itemIngles = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/cliente.png"))); // NOI18N
        menuCliente.setMnemonic('f');
        menuCliente.setText("Cliente");

        crearMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/crearitem.png"))); // NOI18N
        crearMenuCliente.setMnemonic('o');
        crearMenuCliente.setText("Crear");
        crearMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMenuClienteActionPerformed(evt);
            }
        });
        menuCliente.add(crearMenuCliente);

        buscarMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/buscaritem.png"))); // NOI18N
        buscarMenuCliente.setMnemonic('s');
        buscarMenuCliente.setText("Buscar");
        buscarMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMenuClienteActionPerformed(evt);
            }
        });
        menuCliente.add(buscarMenuCliente);

        actualizarMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/actualizaritem.png"))); // NOI18N
        actualizarMenuCliente.setMnemonic('a');
        actualizarMenuCliente.setText("Actualizar");
        actualizarMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarMenuClienteActionPerformed(evt);
            }
        });
        menuCliente.add(actualizarMenuCliente);

        eliminarMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/eliminaritem.jpg"))); // NOI18N
        eliminarMenuCliente.setMnemonic('x');
        eliminarMenuCliente.setText("Eliminar");
        eliminarMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuClienteActionPerformed(evt);
            }
        });
        menuCliente.add(eliminarMenuCliente);

        listarMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/listaitem.png"))); // NOI18N
        listarMenuCliente.setText("Listar");
        listarMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMenuClienteActionPerformed(evt);
            }
        });
        menuCliente.add(listarMenuCliente);

        menuBar.add(menuCliente);

        menuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/empleado.png"))); // NOI18N
        menuEmpleado.setMnemonic('e');
        menuEmpleado.setText("Empleado");

        crearMenuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/crearitem.png"))); // NOI18N
        crearMenuEmpleado.setMnemonic('t');
        crearMenuEmpleado.setText("Crear");
        crearMenuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMenuEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(crearMenuEmpleado);

        buscarMenuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/buscaritem.png"))); // NOI18N
        buscarMenuEmpleado.setMnemonic('y');
        buscarMenuEmpleado.setText("Buscar");
        buscarMenuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMenuEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(buscarMenuEmpleado);

        actualizarMenuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/actualizaritem.png"))); // NOI18N
        actualizarMenuEmpleado.setMnemonic('p');
        actualizarMenuEmpleado.setText("Actuallizar");
        actualizarMenuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarMenuEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(actualizarMenuEmpleado);

        eliminarMenuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/eliminaritem.jpg"))); // NOI18N
        eliminarMenuEmpleado.setMnemonic('d');
        eliminarMenuEmpleado.setText("Eliminar");
        eliminarMenuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(eliminarMenuEmpleado);

        listarMenuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/listaitem.png"))); // NOI18N
        listarMenuEmpleado.setText("Listar");
        listarMenuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMenuEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(listarMenuEmpleado);

        menuBar.add(menuEmpleado);

        menuProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/producto.png"))); // NOI18N
        menuProducto.setMnemonic('h');
        menuProducto.setText("Producto");

        crearMenuProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/crearitem.png"))); // NOI18N
        crearMenuProducto.setMnemonic('c');
        crearMenuProducto.setText("Crear");
        crearMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMenuProductoActionPerformed(evt);
            }
        });
        menuProducto.add(crearMenuProducto);

        buscarMenuProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/buscaritem.png"))); // NOI18N
        buscarMenuProducto.setMnemonic('a');
        buscarMenuProducto.setText("Buscar");
        buscarMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMenuProductoActionPerformed(evt);
            }
        });
        menuProducto.add(buscarMenuProducto);

        actulizarMenuProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/actualizaritem.png"))); // NOI18N
        actulizarMenuProducto.setText("Actualizar");
        actulizarMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizarMenuProductoActionPerformed(evt);
            }
        });
        menuProducto.add(actulizarMenuProducto);

        eliminarMenuProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/eliminaritem.jpg"))); // NOI18N
        eliminarMenuProducto.setText("Eliminar");
        eliminarMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuProductoActionPerformed(evt);
            }
        });
        menuProducto.add(eliminarMenuProducto);

        listarMenuProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/listaitem.png"))); // NOI18N
        listarMenuProducto.setText("Stock");
        listarMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMenuProductoActionPerformed(evt);
            }
        });
        menuProducto.add(listarMenuProducto);

        menuBar.add(menuProducto);

        menuFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/factura.png"))); // NOI18N
        menuFactura.setText("Factura");

        itemCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/crearitem.png"))); // NOI18N
        itemCrear.setText("Crear");
        itemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearActionPerformed(evt);
            }
        });
        menuFactura.add(itemCrear);

        itemBuscarEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/buscaritem.png"))); // NOI18N
        itemBuscarEliminar.setText("Buscar/Eliminar");
        itemBuscarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarEliminarActionPerformed(evt);
            }
        });
        menuFactura.add(itemBuscarEliminar);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/listaitem.png"))); // NOI18N
        jMenuItem1.setText("listar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuFactura.add(jMenuItem1);

        menuBar.add(menuFactura);

        menuIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/idioma.jpg"))); // NOI18N
        menuIdioma.setText("Idiomas   ");

        itemEspañol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/español.png"))); // NOI18N
        itemEspañol.setText("Español");
        itemEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEspañolActionPerformed(evt);
            }
        });
        menuIdioma.add(itemEspañol);

        itemIngles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/ups/edu/imagenes/ingles.png"))); // NOI18N
        itemIngles.setText("Inglés");
        itemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInglesActionPerformed(evt);
            }
        });
        menuIdioma.add(itemIngles);

        menuBar.add(menuIdioma);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuClienteActionPerformed
       ventanaeliminarcliente = new VentanaEliminarCliente(controladorCliente);
       this.desktopPane.removeAll();
       this.desktopPane.repaint();
       ventanaeliminarcliente.cambiaridioma(mensajes);
       ventanaeliminarcliente.setVisible(true);
       desktopPane.add(ventanaeliminarcliente);
      //  setSize(ventanaeliminarcliente.getWidth()+15,ventanaeliminarcliente.getHeight()+60);
    }//GEN-LAST:event_eliminarMenuClienteActionPerformed

    private void actulizarMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizarMenuProductoActionPerformed
       actualizarProducto = new VentanaActualizarProducto(controladorProducto);
       this.desktopPane.removeAll();
       this.desktopPane.repaint();
       actualizarProducto.cambiaridioma(mensajes);
       actualizarProducto.setVisible(true);
       desktopPane.add(actualizarProducto);
       //setSize(actualizarProducto.getWidth()+15,actualizarProducto.getHeight()+60);
    }//GEN-LAST:event_actulizarMenuProductoActionPerformed

    private void crearMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMenuClienteActionPerformed
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanacrearcliente=new VentanaCrearCliente(controladorCliente);
        ventanacrearcliente.cambiaridioma(mensajes);
        ventanacrearcliente.setVisible(true);
        desktopPane.add(ventanacrearcliente);
        //setSize(ventanacrearcliente.getWidth()+15,ventanacrearcliente.getHeight()+60);
    }//GEN-LAST:event_crearMenuClienteActionPerformed

    private void buscarMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMenuClienteActionPerformed
        ventanabuscarcliente =new VentanaBuscarCliente(controladorCliente);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanabuscarcliente.cambiaridioma(mensajes);
        ventanabuscarcliente.setVisible(true);
        desktopPane.add(ventanabuscarcliente);
       // setSize(ventanabuscarcliente.getWidth()+15,ventanabuscarcliente.getHeight()+60);
    }//GEN-LAST:event_buscarMenuClienteActionPerformed

    private void listarMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMenuClienteActionPerformed
        ventanalistarcliente =new VentanaListarCliente(controladorCliente);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanalistarcliente.cambiaridioma(mensajes);
        ventanalistarcliente.setVisible(true);
        desktopPane.add(ventanalistarcliente);
        //setSize(ventanalistarcliente.getWidth()+15,ventanalistarcliente.getHeight()+60);
    }//GEN-LAST:event_listarMenuClienteActionPerformed

    private void actualizarMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarMenuClienteActionPerformed
        ventanaactualizarcliente =new VentanaActualizarCliente(controladorCliente);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanaactualizarcliente.cambiaridioma(mensajes);
        ventanaactualizarcliente.setVisible(true);
        desktopPane.add(ventanaactualizarcliente);
        //setSize(ventanaactualizarcliente.getWidth()+15,ventanaactualizarcliente.getHeight()+60);
    }//GEN-LAST:event_actualizarMenuClienteActionPerformed

    private void crearMenuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMenuEmpleadoActionPerformed
      ventanacrearempleado = new VentanaCrearEmpleado(controladorEmpleado);
      this.desktopPane.removeAll();
      this.desktopPane.repaint();
      ventanacrearempleado.cambiaridioma(mensajes);
      ventanacrearempleado.setVisible(true);
      desktopPane.add(ventanacrearempleado);
      //setSize(ventanacrearempleado.getWidth()+15,ventanacrearempleado.getHeight()+60);
    }//GEN-LAST:event_crearMenuEmpleadoActionPerformed

    private void buscarMenuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMenuEmpleadoActionPerformed
        ventanabuscarempleado = new VentanaBuscarEmpleado(controladorEmpleado);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanabuscarempleado.cambiaridioma(mensajes);
        ventanabuscarempleado.setVisible(true);
        desktopPane.add(ventanabuscarempleado);
       // setSize(ventanabuscarempleado.getWidth()+15,ventanabuscarempleado.getHeight()+60);
    }//GEN-LAST:event_buscarMenuEmpleadoActionPerformed

    private void actualizarMenuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarMenuEmpleadoActionPerformed
        ventanaactualizarempleado = new VentanaActualizarEmpleado(controladorEmpleado);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanaactualizarempleado.cambiaridioma(mensajes);
        ventanaactualizarempleado.setVisible(true);
        desktopPane.add(ventanaactualizarempleado);
        //setSize(ventanaactualizarempleado.getWidth()+15,ventanaactualizarempleado.getHeight()+60);
    }//GEN-LAST:event_actualizarMenuEmpleadoActionPerformed

    private void eliminarMenuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuEmpleadoActionPerformed
        ventanaeliminarempleado = new VentanaEliminarEmpleado(controladorEmpleado);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanaeliminarempleado.cambiaridioma(mensajes);
        ventanaeliminarempleado.setVisible(true);
        desktopPane.add(ventanaeliminarempleado);
        //setSize(ventanaeliminarempleado.getWidth()+15,ventanaeliminarempleado.getHeight()+60);
    }//GEN-LAST:event_eliminarMenuEmpleadoActionPerformed

    private void listarMenuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMenuEmpleadoActionPerformed
        ventanalistarempleado = new VentanaListarEmpleado(controladorEmpleado);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        ventanalistarempleado.cambiaridioma(mensajes);
        ventanalistarempleado.setVisible(true);
        desktopPane.add(ventanalistarempleado);
        //setSize(ventanalistarempleado.getWidth()+15,ventanalistarempleado.getHeight()+60);
    }//GEN-LAST:event_listarMenuEmpleadoActionPerformed

    private void crearMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMenuProductoActionPerformed
        crearProducto = new VentanaCrearProducto(controladorProducto);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        crearProducto.cambiaridioma(mensajes);
        crearProducto.setVisible(true);
        desktopPane.add(crearProducto);
        //setSize(crearProducto.getWidth()+15,crearProducto.getHeight()+60);
    }//GEN-LAST:event_crearMenuProductoActionPerformed

    private void buscarMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMenuProductoActionPerformed
        buscarProducto = new VentanaBuscarProducto(controladorProducto);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        buscarProducto.cambiaridioma(mensajes);
        buscarProducto.setVisible(true);
        desktopPane.add(buscarProducto);
        //setSize(buscarProducto.getWidth()+15,buscarProducto.getHeight()+60);
    }//GEN-LAST:event_buscarMenuProductoActionPerformed

    private void eliminarMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuProductoActionPerformed
        eliminarProducto =new VentanaEliminarProducto(controladorProducto);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        eliminarProducto.cambiaridioma(mensajes);
        eliminarProducto.setVisible(true);
        desktopPane.add(eliminarProducto);
        //setSize(eliminarProducto.getWidth()+15,eliminarProducto.getHeight()+60);
    }//GEN-LAST:event_eliminarMenuProductoActionPerformed

    private void listarMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMenuProductoActionPerformed
        listarProducto = new VentanaListarProducto(controladorProducto);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        listarProducto.cambiaridioma(mensajes);
        listarProducto.setVisible(true);
        desktopPane.add(listarProducto);
       // setSize(listarProducto.getWidth()+15,listarProducto.getHeight()+60);
    }//GEN-LAST:event_listarMenuProductoActionPerformed

    private void itemBuscarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarEliminarActionPerformed
        buscarFactura = new VentanaBuscarFactura(controladorFactura);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        buscarFactura.cambiaridioma(mensajes);
        buscarFactura.setVisible(true);
        desktopPane.add(buscarFactura);
       // setSize(buscarFactura.getWidth()+15,buscarFactura.getHeight()+60);
    }//GEN-LAST:event_itemBuscarEliminarActionPerformed

    private void itemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearActionPerformed
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        crearFactura = new VentanaCrearFactura(controladorFactura,controladorCliente, controladorEmpleado, controladorClase, controladorProducto);
        crearFactura.cambiaridioma(mensajes);
        crearFactura.setVisible(true);
        desktopPane.add(crearFactura);
       // setSize(crearFactura.getWidth()+15,crearFactura.getHeight()+60);
        
    }//GEN-LAST:event_itemCrearActionPerformed

    private void itemEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEspañolActionPerformed
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_itemEspañolActionPerformed

    private void itemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInglesActionPerformed
        localizacion = new Locale("en", "US");
        Locale.setDefault(localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_itemInglesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         listarFactura = new VentanaListarfactura(controladorFactura);
        this.desktopPane.removeAll();
        this.desktopPane.repaint();
        //listarProducto.cambiaridioma(mensajes);
        listarFactura.setVisible(true);
        desktopPane.add(listarFactura);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

        public void restricciones(){
            if (acceso==false){
                menuEmpleado.setEnabled(false);
                crearMenuProducto.setEnabled(false);
                actulizarMenuProducto.setEnabled(false);
                eliminarMenuProducto.setEnabled(false);
                
            }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarMenuCliente;
    private javax.swing.JMenuItem actualizarMenuEmpleado;
    private javax.swing.JMenuItem actulizarMenuProducto;
    private javax.swing.JMenuItem buscarMenuCliente;
    private javax.swing.JMenuItem buscarMenuEmpleado;
    private javax.swing.JMenuItem buscarMenuProducto;
    private javax.swing.JMenuItem crearMenuCliente;
    private javax.swing.JMenuItem crearMenuEmpleado;
    private javax.swing.JMenuItem crearMenuProducto;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem eliminarMenuCliente;
    private javax.swing.JMenuItem eliminarMenuEmpleado;
    private javax.swing.JMenuItem eliminarMenuProducto;
    private javax.swing.JMenuItem itemBuscarEliminar;
    private javax.swing.JMenuItem itemCrear;
    private javax.swing.JMenuItem itemEspañol;
    private javax.swing.JMenuItem itemIngles;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem listarMenuCliente;
    private javax.swing.JMenuItem listarMenuEmpleado;
    private javax.swing.JMenuItem listarMenuProducto;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuEmpleado;
    private javax.swing.JMenu menuFactura;
    private javax.swing.JMenu menuIdioma;
    private javax.swing.JMenu menuProducto;
    // End of variables declaration//GEN-END:variables

}
