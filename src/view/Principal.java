package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.SapoController;

public class Principal extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
	
			public void run() {
	
				try {
	
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}

			}

		});

	}
	
	public Principal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSapo1 = new JLabel("Sapo1");
		lblSapo1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSapo1.setBounds(58, 64, 68, 54);
		contentPane.add(lblSapo1);
		
		JLabel lblSapo2 = new JLabel("Sapo2");
		lblSapo2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSapo2.setBounds(58, 64, 68, 114);
		contentPane.add(lblSapo2);
		
		JLabel lblSapo3 = new JLabel("Sapo3");
		lblSapo3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSapo3.setBounds(58, 64, 68, 174);
		contentPane.add(lblSapo3);
		
		JLabel lblSapo4 = new JLabel("Sapo4");
		lblSapo4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSapo4.setBounds(58, 64, 68, 234);
		contentPane.add(lblSapo4);
		
		JLabel lblSapo5 = new JLabel("Sapo5");
		lblSapo5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSapo5.setBounds(58, 64, 68, 294);
		contentPane.add(lblSapo5);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(0, 0, 89, 23);
		contentPane.add(btnIniciar);
		
		SapoController sapoController = new SapoController(lblSapo1, lblSapo2, lblSapo3, lblSapo4, lblSapo5, btnIniciar);
		btnIniciar.addActionListener(sapoController);
		
		if(lblSapo1.getX() > lblSapo2.getX() && lblSapo1.getX() > lblSapo3.getX() && lblSapo1.getX() > lblSapo4.getX() && lblSapo1.getX() > lblSapo5.getX()) {
			System.out.println("o sapo 1 ganhou");
		}else if(lblSapo2.getX() > lblSapo1.getX() && lblSapo2.getX() > lblSapo3.getX() && lblSapo2.getX() > lblSapo4.getX() && lblSapo2.getX() > lblSapo5.getX()) {
			System.out.println("o sapo 2 ganhou");
		}else if(lblSapo3.getX() > lblSapo1.getX() && lblSapo3.getX() > lblSapo2.getX() && lblSapo3.getX() > lblSapo4.getX() && lblSapo3.getX() > lblSapo5.getX()) {
			System.out.println("o sapo 3 ganhou");
		}else if(lblSapo4.getX() > lblSapo1.getX() && lblSapo4.getX() > lblSapo2.getX() && lblSapo4.getX() > lblSapo3.getX() && lblSapo4.getX() > lblSapo5.getX()) {
			System.out.println("o sapo 4 ganhou");
		}else {
			System.out.println("o sapo 5 ganhou");
		}
	}
	
}
