package controller;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ThreadSapo extends Thread  {

	private JLabel lblSapo;
	private JButton btnIniciar;
	
	public ThreadSapo(JLabel lblSapo, JButton btnIniciar) {
		this.lblSapo = lblSapo;
		this.btnIniciar = btnIniciar;
	}
	
	private void mexeBolinha() {
		btnIniciar.setEnabled(false);
		
		Rectangle posicao;
		posicao = lblSapo.getBounds();
		lblSapo.setBounds(posicao);
		for (int i = 0; i < 5; i++) {
			posicao.x = posicao.x + (int)(Math.random()*50);
			lblSapo.setBounds(posicao);
			try {
			Thread.sleep(500);
			} catch (InterruptedException ex) {
			ex.printStackTrace();
			}
		}
		btnIniciar.setEnabled(true);
	}
	public void run() {
	mexeBolinha();
	}
	
}
