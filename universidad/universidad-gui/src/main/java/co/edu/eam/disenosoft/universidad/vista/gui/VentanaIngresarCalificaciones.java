/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.disenosoft.universidad.vista.gui;

import java.awt.color.CMMException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import co.edu.eam.disenosof.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.disenosoft.universidad.contrloadores.ControladorIngresarCalificaciones;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

/**
 *
 * @author dir_software
 */
public class VentanaIngresarCalificaciones extends javax.swing.JInternalFrame {

	private Profesor profActual;
	private ControladorIngresarCalificaciones controlador;

	/**
	 * Creates new form VentanaIngresarCalificaciones
	 */
	public VentanaIngresarCalificaciones() {
		initComponents();
		controlador = new ControladorIngresarCalificaciones();
		profActual = null;
		setVisible(true);
		setMaximizable(false);
		setIconifiable(true);
		setResizable(false);
		setClosable(true);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		tfceduladocente = new javax.swing.JTextField();
		btnBuscarDocente = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		tfnombredocente = new javax.swing.JTextField();
		jPanel1 = new javax.swing.JPanel();
		comboCurso = new javax.swing.JComboBox();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		combocalificacion = new javax.swing.JComboBox();
		jLabel1 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tablaCalificaicon = new javax.swing.JTable();
		btnCalificar = new javax.swing.JButton();

		setTitle("Ingresar Calificaiones");
		setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check44.png"))); // NOI18N

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Docente"));

		jLabel3.setText("Cedula");

		btnBuscarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom37.png"))); // NOI18N
		btnBuscarDocente.setToolTipText("Buscar Docente");
		btnBuscarDocente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnBuscarDocenteActionPerformed(evt);
			}
		});

		jLabel4.setText("Nombre");

		tfnombredocente.setEditable(false);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel3).addComponent(jLabel4))
						.addGap(25, 25, 25)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(tfceduladocente, javax.swing.GroupLayout.DEFAULT_SIZE, 230,
										Short.MAX_VALUE)
								.addComponent(tfnombredocente))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnBuscarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 77,
								javax.swing.GroupLayout.PREFERRED_SIZE)));
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout
						.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(btnBuscarDocente, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(tfceduladocente, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(tfnombredocente, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel4))))
						.addGap(5, 5, 5)));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calificaciones"));

		comboCurso.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				comboCursoItemStateChanged(evt);
			}
		});

		jLabel5.setText("Curso");

		jLabel6.setText("Calificacion");

		combocalificacion.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				combocalificacionItemStateChanged(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(31, 31, 31)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
								.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(comboCurso, 0, 240, Short.MAX_VALUE).addComponent(combocalificacion, 0,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(74, 74, 74)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(comboCurso, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(combocalificacion,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check44.png"))); // NOI18N
		jLabel1.setText("jLabel1");

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado Estudiantes"));

		tablaCalificaicon
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Cedula", "Nombre", "Apellido", "Calificacion" }));
		jScrollPane1.setViewportView(tablaCalificaicon);

		btnCalificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pen41.png"))); // NOI18N
		btnCalificar.setToolTipText("Calificar Estudiante Seleccionado de la Tabla");
		btnCalificar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCalificarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCalificar))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(btnCalificar)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
						.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnBuscarDocenteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBuscarDocenteActionPerformed
		try {
			String ced = tfceduladocente.getText();
			Profesor prof = controlador.buscar(ced);
			if (prof != null) {
				tfnombredocente.setText(prof.getNombre());
				profActual = prof;
				cargarComboCurso();
			} else {
				JOptionPane.showMessageDialog(null, "El profesor no existe");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// GEN-LAST:event_btnBuscarDocenteActionPerformed

	private void comboCursoItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_comboCursoItemStateChanged

		if (comboCurso.getSelectedIndex() != 0) {
			Curso cur = (Curso) comboCurso.getSelectedItem();
			cargarComboCalificacion(cur);
			
		}

	}// GEN-LAST:event_comboCursoItemStateChanged

	private void combocalificacionItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_combocalificacionItemStateChanged

		Curso cur = (Curso) comboCurso.getSelectedItem();
		Evaluacion e = (Evaluacion) combocalificacion.getSelectedItem();
		listarTabla(cur,e);

	}// GEN-LAST:event_combocalificacionItemStateChanged

	private void btnCalificarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCalificarActionPerformed

		
		try {
			int fila = tablaCalificaicon.getSelectedRow();
			if (comboCurso.getSelectedIndex() != 0) {
				if (fila >= 0) {
					String columna = (String) tablaCalificaicon.getValueAt(fila, 3);
					double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "por favor ingrese la calificacion"));
					Curso c = (Curso) comboCurso.getSelectedItem();
					List<Estudiante> estudiantes = controlador.estudiantes(c);
					Estudiante e = estudiantes.get(fila);
					RegistroCurso r = controlador.registroEstudiante(e, c);
					Evaluacion eval = (Evaluacion) combocalificacion.getSelectedItem();
					Nota n = new Nota(r, eval, valor, false);
					controlador.agregarNota(n, columna);
					listarTabla(c, eval);
				} else {
					JOptionPane.showMessageDialog(null, "Debe seleccionar un estudiante de la tabla");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Debe seleccionar un curso");
			}
		} catch (ExcepcionNegocio exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public void cargarComboCurso() {

		try {
			List<Curso> lista = controlador.listarCombo(profActual);
			comboCurso.removeAllItems();
			comboCurso.addItem("seleccione una opcion");
			for (int i = 0; i < lista.size(); i++) {
				comboCurso.addItem(lista.get(i));
			}
		}catch(NullPointerException n){
			JOptionPane.showMessageDialog(null, "el docente no ha realizado calificaciones");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void cargarComboCalificacion(Curso c) {

		
		combocalificacion.removeAllItems();
		if (!c.getEvaluaciones().isEmpty()) {
			List<Evaluacion> lista = c.getEvaluaciones();
			for (int i = 0; i < lista.size(); i++) {
				combocalificacion.addItem(lista.get(i));
			}
		}
		

	}

	private void listarTabla(Curso c, Evaluacion a) {
		try {
			DefaultTableModel dftm = (DefaultTableModel) tablaCalificaicon.getModel();
			dftm.setRowCount(0);
			List<Estudiante> estudiantes = controlador.estudiantes(c);

			for (Estudiante estudiante : estudiantes) {
				String calificacion = controlador.calificacionEstudiante(estudiante, a);

				dftm.addRow(new Object[] { estudiante.getCedula(), estudiante.getNombre(), estudiante.getApellido(),
						calificacion });
			}

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnBuscarDocente;
	private javax.swing.JButton btnCalificar;
	private javax.swing.JComboBox comboCurso;
	private javax.swing.JComboBox combocalificacion;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tablaCalificaicon;
	private javax.swing.JTextField tfceduladocente;
	private javax.swing.JTextField tfnombredocente;
	// End of variables declaration//GEN-END:variables
}
