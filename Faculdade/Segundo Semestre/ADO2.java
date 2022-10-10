/**
 * 
 */
package exercicios;
import java.util.Scanner;
/**
 * @author mfm65
 *
 */
public class ADO2{
	static int []insereNumeros(int vetor[]){
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random()*100+1);
        }
        return vetor;
    }
    
    static int []ordena(int vetor[], int aux, int j){
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i - 1;
            
            while(j >= 0 && vetor[j] > aux){
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
        return vetor;
    }
    
    static int buscaRecursiva(int vetor[], int inicio, int fim, int numeroBuscado){
        int meio = (inicio + fim) /2;
        
        if(inicio > fim) {
        	return -1;
        } 
        
        if(vetor[meio] == numeroBuscado){
            return meio;
        } else if(vetor[meio] > numeroBuscado){
            fim = meio - 1;
            return buscaRecursiva(vetor, inicio, fim, numeroBuscado);
        } else {
            inicio = meio + 1;
            return buscaRecursiva(vetor, inicio, fim, numeroBuscado);
        }
        
    }
    
    static void impressao(int vetor[]){
        for(int elemento : vetor){
            System.out.printf(elemento + "\t");
        }
    }
    
	public static void main(String[] args) {
		System.out.printf("Informe a quantidade de numeros do vetor: ");
        int quant = new Scanner(System.in).nextInt();
        int vetor[] = new int [quant];
        
        int aux = 0;
        int j = 0;
        
        int fim = vetor.length - 1;
        int inicio = 0;
        
        vetor = insereNumeros(vetor);
        vetor = ordena(vetor, aux, j);
        System.out.println();
        impressao(vetor);
    
        System.out.print("\n\nInforme um numero para buscar no vetor: ");
        int numeroBuscado = new Scanner(System.in).nextInt();
        
        
        int resultado = buscaRecursiva(vetor, inicio, fim, numeroBuscado);
        if(resultado == -1){
            System.err.println("Numero nao encontrado");
        } else {
            System.out.println("Numero encontrado na posicao: " + (resultado + 1));
        }
	}
}
