/**
 * 
 */
package br.com.senacsp.algoritmos2.exercicioponto;
/**
 * @author matheus.fsantos52
 *
 */
public class Ponto {
	int x;
	int y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int distancia(Ponto ponto){
		int calculoPonto1 = ponto.x + ponto.y;
		int calculoPonto2 = this.x + this.y;
		
		return (calculoPonto1 -  calculoPonto2);
	}
	
	public boolean igual(Ponto ponto) {
		if(ponto.x == this.x && ponto.y == this.y) {
			return true; 
		} else {
			return false;
		}
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
}