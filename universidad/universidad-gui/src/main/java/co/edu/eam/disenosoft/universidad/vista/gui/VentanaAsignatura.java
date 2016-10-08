/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.disenosoft.universidad.vista.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.eam.disenosof.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.disenosoft.universidad.contrloadores.ControladorVentanaAsignatura;
import co.edu.eam.disenosoft.universidad.modelo.enumeraciones.TipoAsignaturaEnum;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOAsignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOAsignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;

/**
 *
 * @author dir_software
 */
public class VentanaAsignatura extends javax.swing.JInternalFrame implements ActionListener {

	private ControladorVentanaAsignatura controladorAsign;

	/**
	 * Creates new form VentanaAsignatura
	 */
	public VentanaAsignatura() {
		controladorAsign = new ControladorVentanaAsignatura();
		initComponents();
		setVisible(true);
		setMaximizable(false);
		setIconifiable(true);
		setResizable(false);
		setClosable(true);
		btnCrear.addActionListener(this);
		btnBuscar.addActionListener(this);
		brtnEditar.addActionListener(this);
		jBEliminar.addActionListener(this);

		comboTipoAsignatura.addItem(TipoAsignaturaEnum.PRACTICA);
		comboTipoAsignatura.addItem(TipoAsignaturaEnum.TEORICO_PRACTICA);
		comboTipoAsignatura.addItem(TipoAsignaturaEnum.TEORICA);

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

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		comboTipoAsignatura = new javax.swing.JComboBox();
		tfcodigo = new javax.swing.JTextField();
		tfnombre = new javax.swing.JTextField();
		tfcreditos = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jTSemestreAsig = new javax.swing.JTextField();
		jPanel2 = new javax.swing.JPanel();
		btnCrear = new javax.swing.JButton();
		btnBuscar = new javax.swing.JButton();
		brtnEditar = new javax.swing.JButton();
		jBEliminar = new javax.swing.JButton();

		setTitle("Administrar Asignaturas");
		setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/open161.png"))); // NOI18N

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Basicos"));

		jLabel1.setText("Codigo");

		jLabel2.setText("Nombre");

		jLabel3.setText("Creditos");

		jLabel4.setText("Tipo");

		jLabel5.setText("semestre asignatura");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(
										jPanel1Layout.createSequentialGroup().addGap(23, 23, 23)
												.addGroup(
														jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel4).addComponent(jLabel1)
																.addComponent(jLabel2).addComponent(jLabel3))
												.addGap(68, 68, 68)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(comboTipoAsignatura,
																javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(tfnombre, javax.swing.GroupLayout.PREFERRED_SIZE,
																268, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(tfcreditos,
																javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE,
																268, javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(15, 15, 15).addComponent(jLabel5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jTSemestreAsig)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(17, 17, 17)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(tfnombre, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(tfcreditos, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(jTSemestreAsig,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel4).addComponent(comboTipoAsignatura,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(22, 22, 22)));

		jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculation1.png"))); // NOI18N

		btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom37.png"))); // NOI18N

		brtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pen38.png"))); // NOI18N

		jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1470620439_delete.png"))); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(
						jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
										.addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(10, 10, 10)
										.addComponent(brtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(11, 11, 11)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
								.addComponent(brtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
								.addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
								.addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
						.addContainerGap(22, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(28, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(18, 18, 18)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(26, 26, 26)));

		pack();
	}// </editor-fold>//GEN-END:initComponents
		// Variables declaration - do not modify//GEN-BEGIN:variables

	private javax.swing.JButton brtnEditar;
	private javax.swing.JButton btnBuscar;
	private javax.swing.JButton btnCrear;
	private javax.swing.JComboBox comboTipoAsignatura;
	private javax.swing.JButton jBEliminar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JTextField jTSemestreAsig;
	private javax.swing.JTextField tfcodigo;
	private javax.swing.JTextField tfcreditos;
	private javax.swing.JTextField tfnombre;

	// End of variables declaration//GEN-END:variables
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (arg0.getSource() == btnCrear) {
			try {

				if (tfnombre.getText().isEmpty() || tfcodigo.getText().isEmpty() || tfcreditos.getText().isEmpty()
						|| jTSemestreAsig.getText().isEmpty()) {

					JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
				} else {
					TipoAsignaturaEnum tipoAsignatura = (TipoAsignaturaEnum) comboTipoAsignatura.getSelectedItem();

					String nombre = tfnombre.getText();
					String codigo = tfcodigo.getText();
					int numeroCreditos = Integer.parseInt(tfcreditos.getText());
					int SemestreAsig = Integer.parseInt(jTSemestreAsig.getText());

					Asignatura asignatura = new Asignatura(nombre, codigo, tipoAsignatura, numeroCreditos,
							SemestreAsig);

					controladorAsign.crearAsignatura(asignatura);
					JOptionPane.showMessageDialog(null, "se ha creado la asignatura");
					limpiarCampos();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if (arg0.getSource() == btnBuscar) {

			if (tfcodigo.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "por favor ingrese un numero de codigo");
			} else {

				String cod = tfcodigo.getText();
				try {
					Asignatura asig = controladorAsign.buscarAsignatura(cod);

					if (asig != null) {

						tfnombre.setText(asig.getNombre());
						tfcodigo.setText(asig.getCodigo());
						tfcreditos.setText(asig.getNumeroCreditos() + "");
						jTSemestreAsig.setText(asig.getSemestreAsig() + "");
						comboTipoAsignatura.setSelectedItem(asig.getTipo());
					} else {
						JOptionPane.showMessageDialog(null, "no existe");

					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		if (arg0.getSource() == brtnEditar) {

			if (tfcodigo.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "debe buscar una asignatura prebia mente");
			} else {
				try {
					TipoAsignaturaEnum tipoAsignatura = (TipoAsignaturaEnum) comboTipoAsignatura.getSelectedItem();
					String nombre = tfnombre.getText();
					String codigo = tfcodigo.getText();
					int numeroCreditos = Integer.parseInt(tfcreditos.getText());
					int SemestreAsig = Integer.parseInt(jTSemestreAsig.getText());

					Asignatura asignatura = new Asignatura(nombre, codigo, tipoAsignatura, numeroCreditos,
							SemestreAsig);
					controladorAsign.editarEstudiante(asignatura);
					JOptionPane.showMessageDialog(null, "se ha editado la asignatura correctamente");
					limpiarCampos();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
		if (arg0.getSource() == jBEliminar) {

			if (tfcodigo.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "debe buscar una asignatura prebia mente");
			} else {

				try {
					TipoAsignaturaEnum tipoAsignatura = (TipoAsignaturaEnum) comboTipoAsignatura.getSelectedItem();
					String nombre = tfnombre.getText();
					String codigo = tfcodigo.getText();
					int numeroCreditos = Integer.parseInt(tfcreditos.getText());
					int SemestreAsig = Integer.parseInt(jTSemestreAsig.getText());
					Asignatura asignatura = new Asignatura(nombre, codigo, tipoAsignatura, numeroCreditos,
							SemestreAsig);

					controladorAsign.eliminarAsignatura(asignatura);
					JOptionPane.showMessageDialog(null, "se ha eliminado la asignatura correctamente");
					limpiarCampos();
				} catch (ExcepcionNegocio ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

	/**
	 * limpia los campos de la ventana Asignatura
	 */
	public void limpiarCampos() {
		tfcodigo.setText(null);
		tfcreditos.setText(null);
		tfnombre.setText(null);
		jTSemestreAsig.setText(null);
	}
}
