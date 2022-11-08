package br.com.ITA.avaliação;
import javax.swing.JOptionPane;


public class Pizzaria {
	public static void main(String[] args) {
		int index = 0;
		boolean teste = false;
		
		do {
			try {
				index = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas pizzas deseja comprar?", "Informe um número", JOptionPane.QUESTION_MESSAGE));
				teste = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Informe um NÚMERO", "Erro", JOptionPane.ERROR_MESSAGE);
				teste = false;
			}
		} while(teste == false);
		
		
		Pizza pizzas[] = new Pizza[index];
		for(int i = 0; i < index; i++) {
			Pizza pizza = new Pizza(JOptionPane.showInputDialog("Informe o nome da " + (i + 1) + "ª pizza"));
			
			int opcao = 0;
			
			do {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja fazer?\n1. Adicionar um ingrediente\n2. Ver os ingredientes\n3. Ver o preço da pizza\n4. Quantidade total de ingredientes\n5. Mostrar carrinho\n6. Adicionar no carrinho\n7 . Finalizar compra"));
				
				switch(opcao) {
					case 1:
						pizza.adicionaIngrediente();
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Ingredientes usado em todas as pizzas\n" + Pizza.listaDeIngredientes(), "Todos os Ingredientes", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 3:
						pizza.atualizaPrecoDaPizza();
						JOptionPane.showMessageDialog(null, "O preço total da pizza é: R$ " + pizza.getPreco(), "Preço total", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "Ingredientes da pizza\n\n" + pizza.toString(), "Ingredientes", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "Carrinho de compras\n\n" + CarrinhoDeCompra.mostrarCarrinho() + "\n\nPreço total: " + CarrinhoDeCompra.getPrecoDaCompra(), "Carrinho", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 6:
						if(pizza.getIngredientes() == 0) {
							JOptionPane.showMessageDialog(null, "Não é possivel salvar uma pizza sem ingredientes", "Erro", JOptionPane.ERROR_MESSAGE);
							opcao = opcao - 1;
						}
						else {
							CarrinhoDeCompra.atualizaCarrinho(pizza, pizza.getPreco());
							JOptionPane.showMessageDialog(null, "Adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 7:
						index = i + 1;
						break;
					default:
						JOptionPane.showMessageDialog(null, "Essa opção não existe", "Erro", JOptionPane.ERROR_MESSAGE);
						break;
				}
			} while (!(opcao > 5 && opcao < 9));
		}
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar a compra?\n" + CarrinhoDeCompra.mostrarCarrinho() + "\n\nPreço total: " + CarrinhoDeCompra.getPrecoDaCompra(), "Deseja finalizar o pedido?", JOptionPane.YES_NO_OPTION);
		if(resposta == 0) {
			CarrinhoDeCompra.limparCarrinho();
			JOptionPane.showConfirmDialog(null, "Compra realizada com sucesso!", "Sucesso", JOptionPane.OK_OPTION);
		} else {
			JOptionPane.showConfirmDialog(null, "Ok, até breve", "Você não quis fazer a compra", JOptionPane.YES_OPTION);
		}	
	}
}