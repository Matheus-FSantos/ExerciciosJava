package ExerciciosLista01;

import javax.swing.JOptionPane;

public class Exercicio03_01 {
	public static void main(String[] args) {
		int quantidade = 2;
		String alunos[][] = new String[quantidade][4];
		String situacao[] = new String[quantidade];
		inserir(alunos);
		calculo(alunos, situacao);
		impressao(alunos);
		impressao(alunos, situacao);
	}

	private static void impressao(String[][] alunos, String[] vetor) {
		System.out.println("\nAlunos Aprovados");
		for(int i = 0; i < alunos.length; i++) {
			for(int j = 0; j < alunos[0].length; j++) {
				if(vetor[i].equals("Aprovado")) {
					System.out.printf(alunos[i][j] + "\t");
				}
			}
			System.out.println();
		}
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

	private static void calculo(String[][] matriz, String situacao[]) {
		double nota = 0;
		double soma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (j == 1) {
					nota = Double.parseDouble(matriz[i][j]);
					soma = soma + (nota / 2);
				} else if (j == 2) {
					nota = Double.parseDouble(matriz[i][j]);
					soma = soma + (nota * 0.4);
				} else if (j == 3) {
					nota = Double.parseDouble(matriz[i][j]);
					soma = soma + nota;
				}
			}
			
			if(soma >= 6)
				situacao[i] = "Aprovado";
			else 
				situacao[i] = "Reprovado";
			
			soma = 0;
			nota = 0;
		}
	}

	private static void inserir(String[][] matriz) {
		float numero = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (j == 0) {
					matriz[i][j] = JOptionPane.showInputDialog("Informe o nome do aluno");
				} else if (j == 1) {
					numero = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota do aluno"));
					while (numero < 0 || numero > 10) {
						numero = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota valida"));
					}
					matriz[i][j] = numero + "";
				} else if (j == 2) {
					numero = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota do aluno"));
					while (numero < 0 || numero > 10) {
						numero = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota valida"));
					}
					matriz[i][j] = numero + "";
				} else {
					numero = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do trabalho do aluno"));
					while (numero < 0 || numero > 1) {
						numero = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota valida"));
					}
					matriz[i][j] = numero + "";
				}
			}
		}
	}
}