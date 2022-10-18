/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;
import java.util.Scanner;
/**
 *
 * @author matheus.fsantos52
 */
public class ADO03 {
    public static void main(String[] args) {
        int contador = 0;
        int quantidadeNumeros = 0;
        int quantidadeAcertos = 0;
        int quantidadeJogos = 0;
        double precoJogo = 4.50;
        boolean resultado = false;
        
        int jogo[] = new int [6];
        
        jogo = sorteioJogos(jogo);
        jogo = ordenaJogo(jogo);
        impressaoJogoSorteio(jogo);
        
        System.out.print("Informe a quantidade de jogos que deseja fazer: ");
        quantidadeJogos = new Scanner(System.in).nextInt();
        while(quantidadeJogos < 0) {
        	System.out.print("Informe um numero positivo: ");
        	quantidadeJogos = new Scanner(System.in).nextInt();
        	System.out.println();
        }
        
        
        System.out.printf("O preço do seu jogo é RS %.2f\n", (precoJogo * quantidadeJogos));
        
        
        do {
            System.out.print("Informe a quantidade de numeros que deseja fazer no " + (contador + 1) + "º jogo: ");
            quantidadeNumeros = new Scanner(System.in).nextInt();
            
            int vetor[] = new int [quantidadeNumeros];
            
            vetor = sorteioJogosUsuario(vetor); //Sorteia o jogo do usuário
            impressaoJogoUsuario(vetor, (contador + 1));
            
            for(int i = 0; i < quantidadeNumeros; i++){
                resultado = buscaNumero(jogo, vetor[i], quantidadeAcertos);
                if(resultado == true){
                    quantidadeAcertos = quantidadeAcertos + 1;
                    resultado = false;
                }
            }
            
            imprimeResultado(quantidadeAcertos);
            
            if(quantidadeAcertos == 6) {
            	contador = quantidadeJogos;
            } else {
            	contador = contador + 1;
            }
            
            System.out.println("\n");
            quantidadeAcertos = 0;
        
        } while(contador < quantidadeJogos);
    }
    
    //Imprime o jogo premiado
    private static void impressaoJogoSorteio(int jogo[]){
        System.out.println("Jogo:");
        for(int elemento : jogo){
            System.out.printf(elemento + "\t");
        }
        
        System.out.println("\n");
    }
    
    //Imprime os jogos do usuario
    private static void impressaoJogoUsuario(int vetor[], int numeroJogo){
        System.out.println("\n" + numeroJogo + "º Jogo");
        for(int elemento : vetor){
            System.out.printf(elemento + "\t");
        }
        System.out.println();
    }
    
    //Verifica a mensagem correta para cada ocasiao
    private static void imprimeResultado(int acertos) {
    	switch (acertos) {
    		case 4:
    			System.out.println("Você fez uma QUADRA");
    			break;
    		case 5:
    			System.out.println("Você fez uma QUINA");
    			break;
    		case 6:
    			System.out.println("Você GANHOU!!!");
    			break;
    		default:
    			System.out.println("A quantidade de numeros Acertados foi: " + acertos);
    			break;
    	}
    }
    
    //Algoritmo de Insertion S.
    private static int []ordenaJogo(int jogo[]) {
    	int j, aux;
        
    	for(int i = 1; i < jogo.length; i++){
            aux = jogo[i];
            j = i - 1;
            
            while(j >= 0 && jogo[j] > aux){
                jogo[j + 1] = jogo[j];
                j--;
            }
            jogo[j + 1] = aux;
        }
    	
    	return jogo;
    }
    
    private static int []sorteioJogos(int vetor[]){
    	int numero = 0;
    	
    	for(int i = 0; i < vetor.length; i++){
            
        	numero = (int)(Math.random()*60 + 1);
            numero = verificacao(vetor, numero);
            vetor[i] = numero;
        }
        return vetor;
    }
    
    private static int []sorteioJogosUsuario(int vetor[]){
        int numero = 0;
        
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Informe o " + (i + 1) + "º numero: ");
            numero = new Scanner(System.in).nextInt();
            while(numero < 0) {
            	System.out.print("Informe um numero positivo: ");
            	numero = new Scanner(System.in).nextInt();
            }
            numero = verificacaoJogoUsuario(vetor, numero);
            vetor[i] = numero;
        }
        return vetor;
    }
    
    //Verifica atravez de uma busca linear se existe numeros iguais em cada posicao do vetor
    private static int verificacao(int vetor[], int numeroInformado){
        for(int i = 0; i < vetor.length - 1; i++){
            while(vetor[i] == numeroInformado) {
            	numeroInformado = (int)(Math.random()*60+1);
            }
        }
        return numeroInformado;
    }
    
    private static int verificacaoJogoUsuario(int vetor[], int numeroInformado){
        for(int i = 0; i < vetor.length - 1; i++){
            while(vetor[i] == numeroInformado){
                System.out.print("Informe um numero nao repetido: ");
                numeroInformado = new Scanner(System.in).nextInt();
            }
        }
        
        return numeroInformado;
    }
    
    //Pega o primeiro numero do vetor e faz uma busca binaria recursiva
    private static boolean buscaNumero(int jogo[], int numeroBuscado, int quantidadeAcertada){
        int meio = 0;
        int inicio = 0;
        int fim = jogo.length - 1;
        
        while (inicio <= fim){
            meio = (inicio + fim)/2;
            
            if (jogo[meio] == numeroBuscado){
                return true;
            }
            if (jogo[meio] > numeroBuscado){
                fim = meio - 1;
            } else{
                inicio = meio + 1;
            }
        }
        return false;
    }
}