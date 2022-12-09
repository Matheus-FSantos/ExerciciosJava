package Classes;

public class Produto {
	private String nome;
	private	int codigo;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.codigo = hashCode();
	}
	
	@Override
	public int hashCode() {
		String numeros = "123455678987654321";
		String codigoStr = "";
		int codigo = 0;
		
		for(int i = 0; i < 5; i++) {
			int random = (int)(Math.random() * numeros.length() + 0);
			codigoStr += numeros.charAt(random);
		}
		
		codigo = Integer.parseInt(codigoStr);	
		return codigo;
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof Produto) {
			Produto qualquer = (Produto) object;
			if(this.getCodigo() == qualquer.getCodigo())
				return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "Produto: " + this.getNome() +
			   "\nCódigo: " + this.getCodigo() +
			   "\nPreço: " + this.getPreco() +
			   "\nQuantidade: " + this.getQuantidade();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}