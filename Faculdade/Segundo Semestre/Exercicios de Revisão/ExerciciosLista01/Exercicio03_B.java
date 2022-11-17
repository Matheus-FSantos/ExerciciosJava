package ExerciciosLista01;
import javax.swing.JOptionPane;

public class Exercicio03_B {
	public static void main(String[] args) {
		int quantidade = 2;
		String nomes[] = new String[quantidade];
		String sexo[] = new String[quantidade];
		float disciplina1[] = new float[quantidade];
		float disciplina2[] = new float[quantidade];
		float disciplina3[] = new float[quantidade];
		
		insere(nomes, sexo, disciplina1, disciplina2, disciplina3);
		float media = calculaMediaTurma(disciplina1, disciplina2, disciplina3, quantidade);
		System.out.println("A media da turma é igua a: " + media);
	}

	private static void insere(String[] nomes, String[] sexo, float[] disciplina1, float[] disciplina2, float[] disciplina3) {
		for(int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Informe o nome do " + (i + 1) + "º aluno");
			sexo[i] = JOptionPane.showInputDialog("Informe o sexo do " + (i + 1) + "º aluno");
			disciplina1[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota do " + (i + 1) + "º aluno"));
			disciplina2[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota do " + (i + 1) + "º aluno"));
			disciplina3[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota do " + (i + 1) + "º aluno"));
		}
	}
	
	private static float calculaMediaTurma(float[] disciplina1, float[] disciplina2, float[] disciplina3, int quantidade) {
		float soma = 0;
		
		for(int i = 0; i < quantidade; i++) {
			soma = soma + ((disciplina1[i] + disciplina2[i] + disciplina3[i])/3);
		}
		
		soma = soma /quantidade;
		
		return soma;
	}
}