/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.disenosoft.universidad.vista.gui;

import javax.persistence.Persistence;
import javax.swing.JDesktopPane;

import co.edu.eam.disenosoft.universidad.vista.util.ScrollDesktop;

/**
 *
 * @author dir_software
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private JDesktopPane desktoppanel;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        desktoppanel = new JDesktopPane();
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

        jToolBar1 = new javax.swing.JToolBar();
        btnGestionarEst = new javax.swing.JButton();
        btnRegistrarAsignatura = new javax.swing.JButton();
        btnVerRegistro = new javax.swing.JButton();
        btnGestionarDOcente = new javax.swing.JButton();
        btnIngresarCalificaciones = new javax.swing.JButton();
        btnCrearCalificaciones = new javax.swing.JButton();
        btnVerCalificaiones = new javax.swing.JButton();
        btnCrearAsignatura = new javax.swing.JButton();
        btnCrearCurso = new javax.swing.JButton();
        btnVerCurso = new javax.swing.JButton();
        scrollDesktop1 = new co.edu.eam.disenosoft.universidad.vista.util.ScrollDesktop(desktoppanel);
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuEstudiante = new javax.swing.JMenu();
        mnuItemGestionarEst = new javax.swing.JMenuItem();
        mnuItemRegistrarAsignatura = new javax.swing.JMenuItem();
        mnuItemVerRegistro = new javax.swing.JMenuItem();
        mnuDocente = new javax.swing.JMenu();
        mnuGestionarDocente = new javax.swing.JMenuItem();
        mnuItemIngresarCalificaciones = new javax.swing.JMenuItem();
        mnuCrearCalificacion = new javax.swing.JMenuItem();
        mnuItemVerCalificaciones = new javax.swing.JMenuItem();
        mnuCurso = new javax.swing.JMenu();
        mnuItemCrearAsignatura = new javax.swing.JMenuItem();
        mnuItemCrearCurso = new javax.swing.JMenuItem();
        mnuVerCurso = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnGestionarEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boy22.png"))); // NOI18N
        btnGestionarEst.setFocusable(false);
        btnGestionarEst.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGestionarEst.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGestionarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarEstActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGestionarEst);

        btnRegistrarAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abc1.png"))); // NOI18N
        btnRegistrarAsignatura.setFocusable(false);
        btnRegistrarAsignatura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarAsignatura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAsignaturaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRegistrarAsignatura);

        btnVerRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom37.png"))); // NOI18N
        btnVerRegistro.setFocusable(false);
        btnVerRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVerRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegistroActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVerRegistro);

        btnGestionarDOcente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/teacher4.png"))); // NOI18N
        btnGestionarDOcente.setFocusable(false);
        btnGestionarDOcente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGestionarDOcente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGestionarDOcente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarDOcenteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGestionarDOcente);

        btnIngresarCalificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calificar.png"))); // NOI18N
        btnIngresarCalificaciones.setFocusable(false);
        btnIngresarCalificaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresarCalificaciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIngresarCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarCalificacionesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnIngresarCalificaciones);

        btnCrearCalificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a10icono.png"))); // NOI18N
        btnCrearCalificaciones.setFocusable(false);
        btnCrearCalificaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearCalificaciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCrearCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCalificacionesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCrearCalificaciones);

        btnVerCalificaiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconovercurso.png"))); // NOI18N
        btnVerCalificaiones.setFocusable(false);
        btnVerCalificaiones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerCalificaiones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVerCalificaiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCalificaionesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVerCalificaiones);

        btnCrearAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/open161.png"))); // NOI18N
        btnCrearAsignatura.setFocusable(false);
        btnCrearAsignatura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearAsignatura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCrearAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAsignaturaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCrearAsignatura);

        btnCrearCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/class.png"))); // NOI18N
        btnCrearCurso.setFocusable(false);
        btnCrearCurso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearCurso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCrearCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCursoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCrearCurso);

        btnVerCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vercurso.png"))); // NOI18N
        btnVerCurso.setFocusable(false);
        btnVerCurso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerCurso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVerCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCursoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVerCurso);

        mnuEstudiante.setText("Estudiante");

        mnuItemGestionarEst.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuItemGestionarEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boy22.png"))); // NOI18N
        mnuItemGestionarEst.setText("Gestionar");
        mnuItemGestionarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemGestionarEstActionPerformed(evt);
            }
        });
        mnuEstudiante.add(mnuItemGestionarEst);

        mnuItemRegistrarAsignatura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnuItemRegistrarAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abc1.png"))); // NOI18N
        mnuItemRegistrarAsignatura.setText("Registrar Asignatura");
        mnuItemRegistrarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemRegistrarAsignaturaActionPerformed(evt);
            }
        });
        mnuEstudiante.add(mnuItemRegistrarAsignatura);

        mnuItemVerRegistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        mnuItemVerRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom37.png"))); // NOI18N
        mnuItemVerRegistro.setText("Ver Registro");
        mnuItemVerRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemVerRegistroActionPerformed(evt);
            }
        });
        mnuEstudiante.add(mnuItemVerRegistro);

        jMenuBar1.add(mnuEstudiante);

        mnuDocente.setText("Docente");

        mnuGestionarDocente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuGestionarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/teacher4.png"))); // NOI18N
        mnuGestionarDocente.setText("Gestionar Docente");
        mnuGestionarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGestionarDocenteActionPerformed(evt);
            }
        });
        mnuDocente.add(mnuGestionarDocente);

        mnuItemIngresarCalificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuItemIngresarCalificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calificar.png"))); // NOI18N
        mnuItemIngresarCalificaciones.setText("Ingresar Calificaciones");
        mnuItemIngresarCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemIngresarCalificacionesActionPerformed(evt);
            }
        });
        mnuDocente.add(mnuItemIngresarCalificaciones);

        mnuCrearCalificacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuCrearCalificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a10icono.png"))); // NOI18N
        mnuCrearCalificacion.setText("Crear Calificaciones");
        mnuCrearCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCrearCalificacionActionPerformed(evt);
            }
        });
        mnuDocente.add(mnuCrearCalificacion);

        mnuItemVerCalificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuItemVerCalificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconovercurso.png"))); // NOI18N
        mnuItemVerCalificaciones.setText("Ver Calificaiones");
        mnuItemVerCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemVerCalificacionesActionPerformed(evt);
            }
        });
        mnuDocente.add(mnuItemVerCalificaciones);

        jMenuBar1.add(mnuDocente);

        mnuCurso.setText("Cursos");

        mnuItemCrearAsignatura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuItemCrearAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/open161.png"))); // NOI18N
        mnuItemCrearAsignatura.setText("Crear Asignatura");
        mnuItemCrearAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemCrearAsignaturaActionPerformed(evt);
            }
        });
        mnuCurso.add(mnuItemCrearAsignatura);

        mnuItemCrearCurso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuItemCrearCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/class.png"))); // NOI18N
        mnuItemCrearCurso.setText("Crear Curso");
        mnuItemCrearCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemCrearCursoActionPerformed(evt);
            }
        });
        mnuCurso.add(mnuItemCrearCurso);

        mnuVerCurso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuVerCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vercurso.png"))); // NOI18N
        mnuVerCurso.setText("Ver Curso");
        mnuVerCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVerCursoActionPerformed(evt);
            }
        });
        mnuCurso.add(mnuVerCurso);

        jMenuBar1.add(mnuCurso);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
            .addComponent(scrollDesktop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollDesktop1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuGestionarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGestionarDocenteActionPerformed
        // TODO add your handling code here:
        btnGestionarDOcenteActionPerformed(evt);

    }//GEN-LAST:event_mnuGestionarDocenteActionPerformed

    private void mnuItemIngresarCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemIngresarCalificacionesActionPerformed
        // TODO add your handling code here:
        btnIngresarCalificacionesActionPerformed(evt);

    }//GEN-LAST:event_mnuItemIngresarCalificacionesActionPerformed

    private void mnuCrearCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCrearCalificacionActionPerformed
        // TODO add your handling code here:
        btnCrearCalificacionesActionPerformed(evt);


    }//GEN-LAST:event_mnuCrearCalificacionActionPerformed

    private void btnCrearCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCalificacionesActionPerformed
        // TODO add your handling code here:
        desktoppanel.add(new VentanaCrearCalificacion());

    }//GEN-LAST:event_btnCrearCalificacionesActionPerformed

    private void btnGestionarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarEstActionPerformed
        // TODO add your handling code here:
        desktoppanel.add(new VentanaAdminEstudiante());

    }//GEN-LAST:event_btnGestionarEstActionPerformed

    private void btnRegistrarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAsignaturaActionPerformed
        // TODO add your handling code here:
        desktoppanel.add(new VentanaRegistrarCurso());

    }//GEN-LAST:event_btnRegistrarAsignaturaActionPerformed

    private void btnGestionarDOcenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarDOcenteActionPerformed
        // TODO add your handling code here:
        desktoppanel.add(new VentanaProfesor());
    }//GEN-LAST:event_btnGestionarDOcenteActionPerformed

    private void btnIngresarCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarCalificacionesActionPerformed
        // TODO add your handling code here:
        desktoppanel.add(new VentanaIngresarCalificaciones());
    }//GEN-LAST:event_btnIngresarCalificacionesActionPerformed

    private void btnVerCalificaionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCalificaionesActionPerformed
        // TODO add your handling code here:
        desktoppanel.add(new VentanaVerCalificaciones());

    }//GEN-LAST:event_btnVerCalificaionesActionPerformed

    private void btnCrearAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAsignaturaActionPerformed
        // TODO add your handling code here:
        desktoppanel.add(new VentanaAsignatura());
    }//GEN-LAST:event_btnCrearAsignaturaActionPerformed

    private void btnCrearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCursoActionPerformed
        // TODO add your handling code here:
        desktoppanel.add(new VentanaCrearCurso());
    }//GEN-LAST:event_btnCrearCursoActionPerformed

    private void btnVerCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCursoActionPerformed
        // TODO add your handling code here:
        desktoppanel.add(new VentanaVerCurso());
    }//GEN-LAST:event_btnVerCursoActionPerformed

    private void mnuItemGestionarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemGestionarEstActionPerformed
        // TODO add your handling code here:
        btnGestionarDOcenteActionPerformed(evt);
    }//GEN-LAST:event_mnuItemGestionarEstActionPerformed

    private void mnuItemRegistrarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemRegistrarAsignaturaActionPerformed
        // TODO add your handling code here:
        btnRegistrarAsignaturaActionPerformed(evt);
    }//GEN-LAST:event_mnuItemRegistrarAsignaturaActionPerformed

    private void mnuItemVerCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemVerCalificacionesActionPerformed
        // TODO add your handling code here:
        btnVerCalificaionesActionPerformed(evt);
    }//GEN-LAST:event_mnuItemVerCalificacionesActionPerformed

    private void mnuItemCrearAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemCrearAsignaturaActionPerformed
        // TODO add your handling code here:
        btnCrearAsignaturaActionPerformed(evt);
    }//GEN-LAST:event_mnuItemCrearAsignaturaActionPerformed

    private void mnuItemCrearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemCrearCursoActionPerformed
        // TODO add your handling code here:
        btnCrearCursoActionPerformed(evt);
    }//GEN-LAST:event_mnuItemCrearCursoActionPerformed

    private void mnuVerCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVerCursoActionPerformed
        // TODO add your handling code here:
        btnVerCursoActionPerformed(evt);
    }//GEN-LAST:event_mnuVerCursoActionPerformed

    private void mnuItemVerRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemVerRegistroActionPerformed
        // TODO add your handling code here:
        btnVerRegistroActionPerformed(evt);
    }//GEN-LAST:event_mnuItemVerRegistroActionPerformed

    private void btnVerRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistroActionPerformed
        // TODO add your handling code here:
        desktoppanel.add(new VentanaVerRegistroEstudiante());
         
    }//GEN-LAST:event_btnVerRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    	

        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
        	
        	Class.forName("com.mysql.jdbc.Driver");
        	
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearAsignatura;
    private javax.swing.JButton btnCrearCalificaciones;
    private javax.swing.JButton btnCrearCurso;
    private javax.swing.JButton btnGestionarDOcente;
    private javax.swing.JButton btnGestionarEst;
    private javax.swing.JButton btnIngresarCalificaciones;
    private javax.swing.JButton btnRegistrarAsignatura;
    private javax.swing.JButton btnVerCalificaiones;
    private javax.swing.JButton btnVerCurso;
    private javax.swing.JButton btnVerRegistro;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnuCrearCalificacion;
    private javax.swing.JMenu mnuCurso;
    private javax.swing.JMenu mnuDocente;
    private javax.swing.JMenu mnuEstudiante;
    private javax.swing.JMenuItem mnuGestionarDocente;
    private javax.swing.JMenuItem mnuItemCrearAsignatura;
    private javax.swing.JMenuItem mnuItemCrearCurso;
    private javax.swing.JMenuItem mnuItemGestionarEst;
    private javax.swing.JMenuItem mnuItemIngresarCalificaciones;
    private javax.swing.JMenuItem mnuItemRegistrarAsignatura;
    private javax.swing.JMenuItem mnuItemVerCalificaciones;
    private javax.swing.JMenuItem mnuItemVerRegistro;
    private javax.swing.JMenuItem mnuVerCurso;
    private co.edu.eam.disenosoft.universidad.vista.util.ScrollDesktop scrollDesktop1;
    // End of variables declaration//GEN-END:variables
}
