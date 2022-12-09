package Classes;

public class ProdutoComTamanho extends Produto {
	private double tamanho;

	public ProdutoComTamanho(String nome, double preco, int quantidade, double tamanho) {
		super(nome, preco, quantidade);
		this.tamanho = tamanho;
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof ProdutoComTamanho) {
			ProdutoComTamanho qualquer = (ProdutoComTamanho) object;
			if(this.getCodigo() == qualquer.getCodigo() && this.getTamanho() == qualquer.getTamanho())
				return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
			   "\nTamanho: " + getTamanho();
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
}