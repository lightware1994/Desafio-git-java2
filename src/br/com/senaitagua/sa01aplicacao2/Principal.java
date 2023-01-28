package br.com.senaitagua.sa01aplicacao2;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1app2.calculoBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1,valor2;
		
		JOptionPane.showMessageDialog(null, "Empresa Voe, Grupo Empresarial!");
		
		valor1=Double.parseDouble(JOptionPane.showInputDialog("Informe o ano de lançamento: "));
		valor2=Double.parseDouble(JOptionPane.showInputDialog("Informe o ano atual: "));
		
		calculoBO cbo = new calculoBO();
		
		
		JOptionPane.showMessageDialog(null,cbo.subtrai(valor1, valor2));
		
	}

}
