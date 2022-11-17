package ExerciciosLista01;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
		int quantidade = 1;
		String alunos[][] = new String[quantidade][5];
		inserir(alunos);
		impressao(alunos);
	}

	private static void impressao(String[][] matriz) {
		System.out.println("Alunos Matriculados");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void inserir(String[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (j == 0) {
					matriz[i][j] = JOptionPane.showInputDialog("Informe o nome do aluno");
				} else if (j == 1) {
					matriz[i][j] = JOptionPane.showInputDialog("Informe o sexo");
				} else if (j == 2) {
					matriz[i][j] = JOptionPane.showInputDialog("Informe a primeira disciplina do aluno");
				} else if (j == 3) {
					matriz[i][j] = JOptionPane.showInputDialog("Informe a segunda disciplina do aluno");
				} else {
					matriz[i][j] = JOptionPane.showInputDialog("Informe a terceira disciplina do aluno");
				}
			}
		}
	}
}