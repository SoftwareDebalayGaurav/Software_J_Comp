package uml.to.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import java.awt.Label;

public class Guidee extends JFrame {

	private JPanel contentPane;
	private JButton btnReturn;
	private JLabel lblNewLabel;
	private Label label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guidee frame = new Guidee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Guidee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.EAST);
		
		btnReturn = new JButton("RETURN");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnReturn.setFont(new Font("Verdana", Font.BOLD, 15));
		contentPane.add(btnReturn, BorderLayout.SOUTH);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Webdings", Font.PLAIN, 15));
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
		label = new Label("GUIDE");
		label.setBackground(Color.ORANGE);
		label.setFont(new Font("Arial Black", Font.BOLD, 14));
		label.setAlignment(Label.CENTER);
		contentPane.add(label, BorderLayout.NORTH);
	}

}
