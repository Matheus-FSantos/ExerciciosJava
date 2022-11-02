package br.com.ITA.IMC;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		int quantidadeDePacientes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pacientes que deseja cadastrar"));
		Paciente pacientes[] = new Paciente[quantidadeDePacientes];
		String resultado [] = new String[quantidadeDePacientes];
		
		int resposta;
		int codigo;
		
		
		for(int i = 0; i < quantidadeDePacientes; i++) {
			Paciente newPaciente = new Paciente((i + 1), JOptionPane.showInputDialog("Informe o nome do paciente " + (i + 1)).toUpperCase(), Double.parseDouble(JOptionPane.showInputDialog("Informe a peso do paciente " + (i + 1))), Double.parseDouble(JOptionPane.showInputDialog("Informe o altura do paciente " + (i + 1))));
			newPaciente.calcularIMC();
			resultado[i] = newPaciente.diagnostico();
			pacientes[i] = newPaciente;
		}
		
		do {
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo de um paciente"));
			JOptionPane.showMessageDialog(null, pacientes[codigo - 1].toString());
			JOptionPane.showMessageDialog(null, resultado[codigo - 1]);
			resposta = JOptionPane.showConfirmDialog(null, "Deseja verificar outro paciente?");
		} while(resposta == 0);
	}
}