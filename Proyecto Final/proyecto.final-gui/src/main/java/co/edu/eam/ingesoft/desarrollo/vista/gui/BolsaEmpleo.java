/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesoft.desarrollo.vista.gui;

/**
 *
 * @author carlos
 */
public class BolsaEmpleo extends javax.swing.JFrame {

    /**
     * Creates new form BolsaEmpleo
     */
    public BolsaEmpleo() {
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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResumen = new javax.swing.JTextArea();
        jLnombre = new javax.swing.JLabel();
        jTAreaConocimiento = new javax.swing.JTextField();
        jLnombre1 = new javax.swing.JLabel();
        jLnombre2 = new javax.swing.JLabel();
        jTCargo = new javax.swing.JTextField();
        jLnombre3 = new javax.swing.JLabel();
        jTSalario = new javax.swing.JTextField();
        jLnombre4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTDescOferta = new javax.swing.JTextArea();
        jTRequerimientos = new javax.swing.JTextField();
        jDfechaApertura = new com.toedter.calendar.JDateChooser();
        jLnombre5 = new javax.swing.JLabel();
        jLnombre6 = new javax.swing.JLabel();
        jLnombre7 = new javax.swing.JLabel();
        jTSalario1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTResumen.setColumns(20);
        jTResumen.setRows(5);
        jScrollPane1.setViewportView(jTResumen);

        jLnombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLnombre.setForeground(new java.awt.Color(51, 51, 51));
        jLnombre.setText("Resumen");

        jTAreaConocimiento.setBackground(new java.awt.Color(241, 244, 252));
        jTAreaConocimiento.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTAreaConocimiento.setForeground(new java.awt.Color(43, 43, 74));
        jTAreaConocimiento.setToolTipText("por favor, ingresa una pregunta de seguridad");
        jTAreaConocimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 104, 113), 2));

        jLnombre1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLnombre1.setForeground(new java.awt.Color(51, 51, 51));
        jLnombre1.setText("Requerimientos de la oferta");

        jLnombre2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLnombre2.setForeground(new java.awt.Color(51, 51, 51));
        jLnombre2.setText("Cargo a ofrecer");

        jTCargo.setBackground(new java.awt.Color(241, 244, 252));
        jTCargo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTCargo.setForeground(new java.awt.Color(43, 43, 74));
        jTCargo.setToolTipText("por favor, ingresa una pregunta de seguridad");
        jTCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 104, 113), 2));

        jLnombre3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLnombre3.setForeground(new java.awt.Color(51, 51, 51));
        jLnombre3.setText("Salario");

        jTSalario.setBackground(new java.awt.Color(241, 244, 252));
        jTSalario.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTSalario.setForeground(new java.awt.Color(43, 43, 74));
        jTSalario.setToolTipText("por favor, ingresa una pregunta de seguridad");
        jTSalario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 104, 113), 2));

        jLnombre4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLnombre4.setForeground(new java.awt.Color(51, 51, 51));
        jLnombre4.setText("Descripcion de oferta");

        jTDescOferta.setColumns(20);
        jTDescOferta.setRows(5);
        jScrollPane2.setViewportView(jTDescOferta);

        jTRequerimientos.setBackground(new java.awt.Color(241, 244, 252));
        jTRequerimientos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTRequerimientos.setForeground(new java.awt.Color(43, 43, 74));
        jTRequerimientos.setToolTipText("por favor, ingresa una pregunta de seguridad");
        jTRequerimientos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 104, 113), 2));

        jLnombre5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLnombre5.setForeground(new java.awt.Color(51, 51, 51));
        jLnombre5.setText("Area del conocimiento");

        jLnombre6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLnombre6.setForeground(new java.awt.Color(51, 51, 51));
        jLnombre6.setText("fecha de Apertura");

        jLnombre7.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLnombre7.setForeground(new java.awt.Color(51, 51, 51));
        jLnombre7.setText("Ciudad de la Oferta");

        jTSalario1.setBackground(new java.awt.Color(241, 244, 252));
        jTSalario1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTSalario1.setForeground(new java.awt.Color(43, 43, 74));
        jTSalario1.setToolTipText("por favor, ingresa una pregunta de seguridad");
        jTSalario1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 104, 113), 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLnombre)
                    .addComponent(jLnombre1)
                    .addComponent(jLnombre2)
                    .addComponent(jLnombre3)
                    .addComponent(jLnombre4)
                    .addComponent(jLnombre7)
                    .addComponent(jLnombre6)
                    .addComponent(jLnombre5))
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDfechaApertura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTRequerimientos, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jTAreaConocimiento)
                            .addComponent(jTSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jTSalario1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTAreaConocimiento)
                    .addComponent(jLnombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCargo)
                    .addComponent(jLnombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnombre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTSalario))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLnombre4)
                        .addGap(37, 37, 37)
                        .addComponent(jLnombre7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTSalario1)
                        .addGap(27, 27, 27)
                        .addComponent(jTRequerimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLnombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDfechaApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        jTabbedPane1.addTab("Registrar Oferta", jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cerrar Oferta", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ofertas de Interes", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Aplicar a Ofertas", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDfechaApertura;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLnombre1;
    private javax.swing.JLabel jLnombre2;
    private javax.swing.JLabel jLnombre3;
    private javax.swing.JLabel jLnombre4;
    private javax.swing.JLabel jLnombre5;
    private javax.swing.JLabel jLnombre6;
    private javax.swing.JLabel jLnombre7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTAreaConocimiento;
    private javax.swing.JTextField jTCargo;
    private javax.swing.JTextArea jTDescOferta;
    private javax.swing.JTextField jTRequerimientos;
    private javax.swing.JTextArea jTResumen;
    private javax.swing.JTextField jTSalario;
    private javax.swing.JTextField jTSalario1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
