package br.com.ado.exercicio01;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Exercicio01 obj = new Exercicio01();
		int opcao;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o que deseja fazer\n1. Adicionar\n2. Excluir\n3. Mostrar a pilha normal\n4. Mostrar a pilha invertida\n5. Encerrar aplicacao"));
			
			switch(opcao) {
				case 1:
					String palavraParametro = JOptionPane.showInputDialog("Informe uma palavra");
					while(palavraParametro.equals("")) {
						palavraParametro = JOptionPane.showInputDialog("Informe uma palavra");
					}
					obj.push(palavraParametro);
					break;
				case 2:
					String elemento;
					elemento = obj.pop();
					if(elemento != "") {
						JOptionPane.showMessageDialog(null, "Elemento removido: " + elemento, "Remoção", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 3:
					String caracteres;
					caracteres = obj.getPilha();
					if(caracteres == "") {
						JOptionPane.showMessageDialog(null, "A Pilha está vazia", "Pilha", JOptionPane.ERROR_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Pilha completa: \n" + caracteres, "Impressao", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 4:
					String palavra;
					palavra = obj.getPilhaInvertida();
					if(palavra == "") {
						JOptionPane.showMessageDialog(null, "A Pilha está vazia", "Pilha", JOptionPane.ERROR_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Pilha completa: \n" + palavra, "Impressao", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 5:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
					break;
			}
		} while(opcao != 5);
	}
}