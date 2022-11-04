package br.com.ado.exercicio02;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Exercicio02 obj = new Exercicio02();
		int opcao;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o que deseja fazer\n1. Adicionar\n2. Excluir\n3. Mostrar a pilha inteira\n4. Encerrar aplicacao"));
			
			switch(opcao) {
				case 1:
					int numero = 0;
					numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero em base decimal", "Informe o numero", JOptionPane.QUESTION_MESSAGE));
					obj.push(numero);
					break;
				case 2:
					numero = 0;
					numero = obj.pop();
					if(numero != 0) {
						JOptionPane.showMessageDialog(null, "Numero removido: " + numero, "Remoção de numero binario", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 3:
					String numeros;
					numeros = obj.getPilha();
					if(numeros == "") {
						JOptionPane.showMessageDialog(null, "A Pilha está vazia", "Pilha de numero binario", JOptionPane.ERROR_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Pilha completa: \n" + numeros, "Impressao", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 4:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
					break;
			}
		} while(opcao != 4);
	}
}