package ExerciciosLista01;

import javax.swing.JOptionPane;

public class Exercicio03_E {
	public static void main(String[] args) {
		int quantidade = 2;
		String nomes[] = new String[quantidade];
		String sexo[] = new String[quantidade];
		float disciplina1[] = new float[quantidade];
		float disciplina2[] = new float[quantidade];
		float disciplina3[] = new float[quantidade];
		
		insere(nomes, sexo, disciplina1, disciplina2, disciplina3);
		float media = calculaMediaTurma(sexo, disciplina2);
		System.out.print("A media das mulheres na disciplina 2 é: " + media);
	}

	private static void insere(String[] nomes, String[] sexo, float[] disciplina1, float[] disciplina2, float[] disciplina3) {
		int opcao = 0;
		
		for(int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Informe o nome do " + (i + 1) + "º aluno");
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o sexo do " + (i + 1) + "º aluno\n1. Feminino\n2. Masculino"));
			while(opcao < 1 || opcao > 2) {
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe uma opção valida\n1. Feminino\n2. Masculino"));
			}
			if(opcao == 1)
				sexo[i] = "Feminino";
			else 
				sexo[i] = "Masculino";
			disciplina1[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota do " + (i + 1) + "º aluno"));
			disciplina2[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota do " + (i + 1) + "º aluno"));
			disciplina3[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota do " + (i + 1) + "º aluno"));
		}
	}
	
	private static float calculaMediaTurma(String[] sexo,float[] disciplina2) {
		float soma = 0;
		 int quantidade = 0;
		
		for(int i = 0; i < disciplina2.length; i++) {
			if(sexo[i].equals("Feminino")) {
				quantidade = quantidade + 1;
				soma = soma + disciplina2[i];
			}
		}
		
		soma = soma /quantidade;
		
		return soma;
	}
}