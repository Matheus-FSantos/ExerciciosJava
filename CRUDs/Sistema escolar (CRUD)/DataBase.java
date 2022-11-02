package br.com.crud.connector;
import javax.swing.JOptionPane;

public class DataBase {
    public static void main(String[] args) {
        ControllerDB controller = new ControllerDB();
        
        int opcao = 0;
        
        String id = "";
        String nome = "";
        String matricula = "";
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção\n\n1. Inserir Registro\n2. Alterar Registro\n3. Buscar Registro Unico\n4. Buscar Todos os Registros\n5. Eliminar Registro\n6. Encerrar aplicação\n\nInforme a opção", "Menu", JOptionPane.QUESTION_MESSAGE));
            
            switch(opcao){
                case 1:
                    nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno", "Registrar Aluno", JOptionPane.QUESTION_MESSAGE);
                    matricula = (int)(Math.random()*100000000+1) + "";
                    controller.inserir(nome, matricula);
                    break;
                case 2:
                    id = JOptionPane.showInputDialog(null, "Informe o ID do aluno", "Alterar Registro do Aluno", JOptionPane.QUESTION_MESSAGE);
                    nome = JOptionPane.showInputDialog(null, "Informe o novo nome do aluno com ID: " + id, "Alterar Registro do Aluno", JOptionPane.QUESTION_MESSAGE);
                    matricula = (int)(Math.random()*100000000+1) + "";
                    controller.alterar(id, nome, matricula);
                    break;
                case 3:
                    id = JOptionPane.showInputDialog(null, "Informe o ID do aluno", "Buscar Aluno Único", JOptionPane.QUESTION_MESSAGE);
                    controller.buscar(id);
                    break;
                case 4:
                    controller.mostrarTodos();
                    break;
                case 5:
                    id = JOptionPane.showInputDialog(null, "Informe o ID do aluno", "Deletar Aluno", JOptionPane.WARNING_MESSAGE);
                    controller.deletar(id);
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        } while(opcao != 6);
    }
}
