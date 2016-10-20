/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesoft.desarrollo.vista.gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import co.edu.eam.desarrollo.proyectoFinal.gui.controladores.ControladorVentanaEmpresas;

/**
 *
 * @author Carlos Alfredo Martinez Villada
 */
public class Empresas extends javax.swing.JFrame {

	private ControladorVentanaEmpresas controlador;
    /**
     * Creates new form Empresas
     */
    private int selec = 0; // indicara cual es la pesta�a seleccionada inicialmente
    public Empresas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        this.setTitle("Registro de Empresas");
        jTabbedPane1.setEnabledAt(1, false);
        jBAnterior.setVisible(false);
        controlador = new ControladorVentanaEmpresas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCDepartamento = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jCTipoEmpresa = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jCCiudad = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTRazon = new javax.swing.JTextField();
        jTPais = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jTNit = new javax.swing.JTextField();
        jTDireccion = new javax.swing.JTextField();
        jTSectorL = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLnombreCompleto = new javax.swing.JLabel();
        jLCorreo = new javax.swing.JLabel();
        jLCargo = new javax.swing.JLabel();
        jLTelefono = new javax.swing.JLabel();
        jTNombreC = new javax.swing.JTextField();
        jTCorreoC = new javax.swing.JTextField();
        jTCargoC = new javax.swing.JTextField();
        jTTelefonoC = new javax.swing.JTextField();
        jBSiguiente = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBAgregarPalabra = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(242, 242, 249));
        jPanel3.setPreferredSize(new java.awt.Dimension(522, 569));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(522, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(48, 43, 43));
        jLabel1.setText("Informacion de la Empresa");

        jLnombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLnombre.setForeground(new java.awt.Color(51, 51, 51));
        jLnombre.setText("Razon social");

        jLApellido.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLApellido.setForeground(new java.awt.Color(51, 51, 51));
        jLApellido.setText("Pais");

        jLabel2.setText("Telefono");

        jLabel3.setText("Nit");

        jLabel4.setText("Departamento");

        jLabel5.setText("Tipo Empresa");

        jLabel6.setText("Ciudad");

        jLabel7.setText("Direccion sitio web");

        jLabel8.setText("Sector laboral");

        jTRazon.setBackground(new java.awt.Color(242, 242, 249));
        jTRazon.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTRazon.setForeground(new java.awt.Color(43, 43, 74));
        jTRazon.setToolTipText("");
        jTRazon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 232, 240)));

        jTPais.setBackground(new java.awt.Color(242, 242, 249));
        jTPais.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTPais.setForeground(new java.awt.Color(43, 43, 74));
        jTPais.setToolTipText("");
        jTPais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 232, 240)));
        jTPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPaisKeyTyped(evt);
            }
        });

        jTTelefono.setBackground(new java.awt.Color(242, 242, 249));
        jTTelefono.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTTelefono.setForeground(new java.awt.Color(43, 43, 74));
        jTTelefono.setToolTipText("");
        jTTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 232, 240)));
        jTTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTelefonoKeyTyped(evt);
            }
        });

        jTNit.setBackground(new java.awt.Color(242, 242, 249));
        jTNit.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTNit.setForeground(new java.awt.Color(43, 43, 74));
        jTNit.setToolTipText("");
        jTNit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 232, 240)));
        jTNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNitKeyTyped(evt);
            }
        });

        jTDireccion.setBackground(new java.awt.Color(242, 242, 249));
        jTDireccion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTDireccion.setForeground(new java.awt.Color(43, 43, 74));
        jTDireccion.setToolTipText("");
        jTDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 232, 240)));

        jTSectorL.setBackground(new java.awt.Color(242, 242, 249));
        jTSectorL.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTSectorL.setForeground(new java.awt.Color(43, 43, 74));
        jTSectorL.setToolTipText("");
        jTSectorL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 232, 240)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLnombre)
                            .addComponent(jLApellido)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTRazon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jTPais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jTTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jTNit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jCDepartamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCTipoEmpresa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jTSectorL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                    .addComponent(jLabel1))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCTipoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTSectorL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(72, 72, 72))
        );

        jTabbedPane1.addTab("Datos de la Empresa", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLnombreCompleto.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLnombreCompleto.setForeground(new java.awt.Color(51, 51, 51));
        jLnombreCompleto.setText("Nombre completo");

        jLCorreo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLCorreo.setForeground(new java.awt.Color(51, 51, 51));
        jLCorreo.setText("Correo Electronico");

        jLCargo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLCargo.setForeground(new java.awt.Color(51, 51, 51));
        jLCargo.setText("Cargo en la Empresa");

        jLTelefono.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLTelefono.setForeground(new java.awt.Color(51, 51, 51));
        jLTelefono.setText("Telefono");

        jTNombreC.setBackground(new java.awt.Color(242, 242, 249));
        jTNombreC.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTNombreC.setForeground(new java.awt.Color(43, 43, 74));
        jTNombreC.setToolTipText("");
        jTNombreC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 232, 240)));
        jTNombreC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombreCKeyTyped(evt);
            }
        });

        jTCorreoC.setBackground(new java.awt.Color(242, 242, 249));
        jTCorreoC.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTCorreoC.setForeground(new java.awt.Color(43, 43, 74));
        jTCorreoC.setToolTipText("");
        jTCorreoC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 232, 240)));

        jTCargoC.setBackground(new java.awt.Color(242, 242, 249));
        jTCargoC.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTCargoC.setForeground(new java.awt.Color(43, 43, 74));
        jTCargoC.setToolTipText("");
        jTCargoC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 232, 240)));

        jTTelefonoC.setBackground(new java.awt.Color(242, 242, 249));
        jTTelefonoC.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTTelefonoC.setForeground(new java.awt.Color(43, 43, 74));
        jTTelefonoC.setToolTipText("");
        jTTelefonoC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 232, 240)));
        jTTelefonoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTelefonoCKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLnombreCompleto)
                    .addComponent(jLCorreo)
                    .addComponent(jLCargo)
                    .addComponent(jLTelefono))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTNombreC, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(jTCargoC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTCorreoC, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(jTTelefonoC))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLnombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCorreoC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCargoC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos de Contacto", jPanel1);

        jBSiguiente.setBackground(new java.awt.Color(66, 103, 178));
        jBSiguiente.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jBSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        jBSiguiente.setText("Siguiente");
        jBSiguiente.setToolTipText("Siguiente");
        jBSiguiente.setBorder(null);
        jBSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiguienteActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(175, 178, 184));
        jBEliminar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        jBEliminar.setToolTipText("Eliminar");
        jBEliminar.setBorder(null);
        jBEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBEditar.setBackground(new java.awt.Color(175, 178, 184));
        jBEditar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jBEditar.setForeground(new java.awt.Color(255, 255, 255));
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        jBEditar.setToolTipText("Editar Informacion");
        jBEditar.setBorder(null);
        jBEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBBuscar.setBackground(new java.awt.Color(175, 178, 184));
        jBBuscar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jBBuscar.setToolTipText("Buscar");
        jBBuscar.setBorder(null);
        jBBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBCancelar.setBackground(new java.awt.Color(66, 103, 178));
        jBCancelar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBCancelar.setText("Cancelar");
        jBCancelar.setToolTipText("Cancelar Registro");
        jBCancelar.setBorder(null);
        jBCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBAgregarPalabra.setBackground(new java.awt.Color(66, 183, 42));
        jBAgregarPalabra.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jBAgregarPalabra.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregarPalabra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio.png"))); // NOI18N
        jBAgregarPalabra.setToolTipText("Ir al inicio");
        jBAgregarPalabra.setBorder(null);
        jBAgregarPalabra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAgregarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarPalabraActionPerformed(evt);
            }
        });

        jBAnterior.setBackground(new java.awt.Color(66, 103, 178));
        jBAnterior.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jBAnterior.setForeground(new java.awt.Color(255, 255, 255));
        jBAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        jBAnterior.setToolTipText("Anterior");
        jBAnterior.setBorder(null);
        jBAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jBAgregarPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBAgregarPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jBSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jBEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jBAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiguienteActionPerformed
    	if(selec < 1 ){
            jTabbedPane1.setEnabledAt(selec, false);
            selec = selec + 1;
            jTabbedPane1.setEnabledAt(selec, true);
            jTabbedPane1.setSelectedIndex(selec); 
        	if(selec > 0){
        		jBAnterior.setVisible(true);
        	}else{
        		jBAnterior.setVisible(false);
        	}
            if(selec == 1){
                jBSiguiente.setText("Registrar");
                jBSiguiente.setToolTipText("Registrar Empresa");
                jBSiguiente.setBackground(new Color(66,183,42));
            }
        }else{
            jBSiguiente.setText("Registrado");
            JOptionPane.showMessageDialog(null, "Se ha Registrado la Empresa.", "Administrador de Empresas", JOptionPane.INFORMATION_MESSAGE); 
            jTabbedPane1.setEnabledAt(selec, false);
            selec = 0;
            jTabbedPane1.setEnabledAt(selec, true);
            jTabbedPane1.setSelectedIndex(selec);     
            jBSiguiente.setText("Siguiente");
            jBSiguiente.setToolTipText("Siguiente");
            jBSiguiente.setBackground(new Color(66,103,178));
            jBAnterior.setVisible(false);
        }
    }

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        int op = JOptionPane.showConfirmDialog(null, "Seguro que desea cancelar el registro", "Cancelar Registro", JOptionPane.INFORMATION_MESSAGE); 
        if(op == 0){
            jTabbedPane1.setEnabledAt(selec, false);
            selec = 0;
            jTabbedPane1.setEnabledAt(selec, true);
            jTabbedPane1.setSelectedIndex(0); 
            jBSiguiente.setText("Siguiente");
            jBSiguiente.setToolTipText("Siguiente");
            jBSiguiente.setBackground(new Color(66,103,178));
        }
    }

    private void jBAgregarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarPalabraActionPerformed
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBAgregarPalabraActionPerformed

    private void jTPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPaisKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && ( c!=' ')){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Por favor, solo letras", "Informacion", JOptionPane.INFORMATION_MESSAGE);   
        }
    }//GEN-LAST:event_jTPaisKeyTyped

    private void jTTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTelefonoKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9'){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Por favor, solo numeros", "Informacion", JOptionPane.INFORMATION_MESSAGE);   
        }
    }//GEN-LAST:event_jTTelefonoKeyTyped

    private void jTNitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNitKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9'){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Por favor, solo numeros", "Informacion", JOptionPane.INFORMATION_MESSAGE);   
        }
    }//GEN-LAST:event_jTNitKeyTyped

    private void jTNombreCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreCKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && ( c!=' ')){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Por favor, solo letras", "Informacion", JOptionPane.INFORMATION_MESSAGE);   
        }
    }//GEN-LAST:event_jTNombreCKeyTyped

    private void jTTelefonoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTelefonoCKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9'){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Por favor, solo numeros", "Informacion", JOptionPane.INFORMATION_MESSAGE);   
        }
    }//GEN-LAST:event_jTTelefonoCKeyTyped

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {
	        jTabbedPane1.setEnabledAt(selec, false);
	        selec = selec - 1;
	        jTabbedPane1.setEnabledAt(selec, true);
	        jTabbedPane1.setSelectedIndex(selec);
	        jBSiguiente.setText("Siguiente");
	        jBSiguiente.setToolTipText("Siguiente");
	        jBSiguiente.setBackground(new Color(66,103,178));
		if(selec == 0){
			jBAnterior.setVisible(false);
		}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarPalabra;
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBSiguiente;
    private javax.swing.JComboBox<String> jCCiudad;
    private javax.swing.JComboBox<String> jCDepartamento;
    private javax.swing.JComboBox<String> jCTipoEmpresa;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLCargo;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLnombreCompleto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTCargoC;
    private javax.swing.JTextField jTCorreoC;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTNit;
    private javax.swing.JTextField jTNombreC;
    private javax.swing.JTextField jTPais;
    private javax.swing.JTextField jTRazon;
    private javax.swing.JTextField jTSectorL;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTextField jTTelefonoC;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
