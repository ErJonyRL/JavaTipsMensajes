package javaTipsMensajes;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaTipsMensajes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaTipsMensajes window = new JavaTipsMensajes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaTipsMensajes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton btnNewButton = new JButton("hola");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("HOLAAAAAAAAAAAAAAA");
			}
		});
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton, 65, SpringLayout.WEST, panel);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("este boton te saludara en consola");
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -195, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 24, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, panel);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("aviso");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "No toques el boton que te veo", "has pulsado el aviso", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_1, -63, SpringLayout.EAST, panel);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("este boton te sacara un aviso");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, -10, SpringLayout.EAST, panel);
		panel.add(lblNewLabel_1);
	}
}
