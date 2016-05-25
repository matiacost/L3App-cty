package py.edu.facitec.l3.formulario;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import py.edu.facitec.l3.dao.VendedorDao;
import py.edu.facitec.l3.model.Vendedor;

import javax.swing.JRadioButton;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;


public class FormularioVendedor extends JDialog {
	private JTextField tfCodigo;
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfCedula;
	private JTextField tfFR;
	private JRadioButton rdActivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioVendedor dialog = new FormularioVendedor();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public FormularioVendedor() {
		setBounds(100, 100, 612, 399);
		getContentPane().setLayout(null);

		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 31, 46, 14);
		getContentPane().add(lblCodigo);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 71, 46, 14);
		getContentPane().add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 106, 46, 14);
		getContentPane().add(lblApellido);

		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(10, 142, 46, 14);
		getContentPane().add(lblCedula);

		JLabel lblEstadoDeRegistro = new JLabel("Fecha de Registro:");
		lblEstadoDeRegistro.setBounds(10, 182, 108, 14);
		getContentPane().add(lblEstadoDeRegistro);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 220, 46, 14);
		getContentPane().add(lblEstado);

		tfCodigo = new JTextField();
		tfCodigo.setBounds(66, 28, 86, 20);
		getContentPane().add(tfCodigo);
		tfCodigo.setColumns(10);

		tfNombre = new JTextField();
		tfNombre.setBounds(66, 68, 181, 20);
		getContentPane().add(tfNombre);
		tfNombre.setColumns(10);

		tfApellido = new JTextField();
		tfApellido.setBounds(66, 103, 181, 20);
		getContentPane().add(tfApellido);
		tfApellido.setColumns(10);

		tfCedula = new JTextField();
		tfCedula.setBounds(66, 139, 108, 20);
		getContentPane().add(tfCedula);
		tfCedula.setColumns(10);

		tfFR = new JTextField();
		tfFR.setBounds(112, 179, 135, 20);
		getContentPane().add(tfFR);
		tfFR.setColumns(10);

		rdActivo = new JRadioButton("Activo");
		rdActivo.setBounds(62, 216, 109, 23);
		getContentPane().add(rdActivo);

		Panel panel = new Panel();
		panel.setBounds(10, 317, 576, 34);
		getContentPane().add(panel);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarVendedor();
			}
		});
		panel.add(btnGuardar);

	}

	private void guardarVendedor() {
		if (tfNombre.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Ingrese el nombre");
			tfNombre.requestFocus();
		} else if (tfApellido.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Ingrese el apellido");
			tfNombre.requestFocus();
		} else{
			Vendedor vendedor = new Vendedor();
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyy/mm/dd");
			String dateInString = tfFR.getText();
			Date date = null;
			
			try {
				date = (Date) formatter.parse(dateInString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			vendedor.setNombre(tfNombre.getText());		
			vendedor.setApellido(tfApellido.getText());
			vendedor.setCedula(Integer.parseInt(tfCedula.getText()));
			vendedor.setEstado(rdActivo.isSelected());
			vendedor.setFechaRegistro(date);
			
			
			VendedorDao.guardarVendedor(vendedor);
			
			//fecha no funciona
			
			
		}
		
	}


}
