package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class SapoController implements ActionListener{
	
	private JLabel lblSapo1;
	private JLabel lblSapo2;
	private JLabel lblSapo3;
	private JLabel lblSapo4;
	private JLabel lblSapo5;
	private JButton btnIniciar;
	
	public SapoController(JLabel lblSapo1, JLabel lblSapo2, JLabel lblSapo3, JLabel lblSapo4, JLabel lblSapo5, JButton btnIniciar) {
		this.lblSapo1 = lblSapo1;
		this.lblSapo2 = lblSapo2;
		this.lblSapo3 = lblSapo3;
		this.lblSapo4 = lblSapo4;
		this.lblSapo5 = lblSapo5;
		this.btnIniciar = btnIniciar;
	}
	
	private void botaoBolinha(){
		Thread t1 = new ThreadSapo(lblSapo1, btnIniciar);
		Thread t2 = new ThreadSapo(lblSapo2, btnIniciar);
		Thread t3 = new ThreadSapo(lblSapo3, btnIniciar);
		Thread t4 = new ThreadSapo(lblSapo4, btnIniciar);
		Thread t5 = new ThreadSapo(lblSapo5, btnIniciar);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	botaoBolinha();
	}

}
