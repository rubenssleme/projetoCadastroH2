package br.com.bg.siscad.nucleo.comum.utils;

import javax.swing.JOptionPane;

public class Mensagem {
	public static void exibirMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	public static String exibirPergunta(String mensagem) {
		return JOptionPane.showInputDialog(null, mensagem);
	}
}
