package ExerciciosLista02.POO;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		int quantidade = Integer
				.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos que deseja cadastrar"));
		Aluno alunos[] = new Aluno[quantidade];
		String alunosReprovados[] = new String[quantidade];
		String alunosAprovados[] = new String[quantidade];

		for (int i = 0; i < quantidade; i++) {
			double media = 0.0;

			String nome = JOptionPane.showInputDialog("Informe o nome do " + (i + 1) + "º aluno");
			int cep = Integer.parseInt(JOptionPane.showInputDialog("Informe o CEP do aluno " + nome));
			String logradouro = JOptionPane.showInputDialog("Informe o logradouro do CEP " + cep);
			String bairro = JOptionPane.showInputDialog("Informe o bairro");
			String cidade = JOptionPane.showInputDialog("Informe a cidade");
			String UF = JOptionPane.showInputDialog("Informe a UF da cidade " + cidade);
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota do aluno " + nome));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota do aluno " + nome));

			Endereco endereco = new Endereco(cep, logradouro, bairro, cidade, UF);
			Aluno aluno = new Aluno(nome, nota1, nota2, endereco);
			alunos[i] = aluno;

			media = aluno.calculaMedia();
			if (media >= 6)
				alunosAprovados[i] = aluno.getNome();
			else
				alunosReprovados[i] = aluno.getNome();

			media = 0;
		}

		int opcao = 0;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Informe o que deseja verificar\n\n1. Alunos matriculados\n2. Alunos aprovados\n3. Alunos reprovados\n4. Sair"));

			switch (opcao) {
			case 1:
				System.out.println("\nAlunos matriculados");
				imprimeAlunos(alunos);
				break;
			case 2:
				System.out.println("\nAprovados");
				imprimeAlunos(alunosAprovados);
				break;
			case 3:
				System.out.println("\nReprovados");
				imprimeAlunos(alunosReprovados);
				break;
			case 4:
				System.exit(0);
			}
		} while (opcao != 4);
	}

	private static void imprimeAlunos(Aluno[] alunos) {
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i]);
			System.out.println();
		}
	}
	
	private static void imprimeAlunos(String[] alunos) {
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null) {
				System.out.println(alunos[i]);
				System.out.println();
			}
		}
	}
}