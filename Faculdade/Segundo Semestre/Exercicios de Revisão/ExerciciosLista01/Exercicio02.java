/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.exercicios.revisao;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus.fsantos52
 */
public class Exercicio02Revisao {
    public static void main(String[] args) {
        String vendedor[] = new String [2];
        String pecas[] = {"Chave de fenda", "Tenis", "Camiseta", "Chapeu", "Faca", "Chicote"};
        
        int quantidadeVendida[] = new int[vendedor.length];
        float precoDaVenda[] = new float [vendedor.length];
        String pecaVendida[] = new String [vendedor.length];
        
        inserirNomes(vendedor);
        dadosDaVenda(vendedor, pecas, quantidadeVendida, precoDaVenda, pecaVendida);
        
        int quantidade = quantidadeTotalDePecasVendidas(quantidadeVendida);
        String texto = valorTotalDasPecas(vendedor, quantidadeVendida, pecaVendida, precoDaVenda);
        float total = valorDaVenda(precoDaVenda);
        
        System.out.println("Quantidade de pecas vendidas no total: " + quantidade +
                           "\nTotal de todas as vendas: " + total +
                           "\n\nDados Únicos" + texto);
                
    }

    private static void inserirNomes(String v[]) {
        for(int i = 0; i < v.length; i++){
            v[i] = JOptionPane.showInputDialog("Informe o nome do " + (i + 1) + "º vendedor").toUpperCase();
        }
    }
    
    private static void dadosDaVenda(String v[], String pecas[], int quantidade[], float preco[], String pecaVendida[]){
        int indexPeca = 0;
        
        for(int i = 0; i < v.length; i++){
            indexPeca = Integer.parseInt(JOptionPane.showInputDialog("Informe o indice da peça que o vendedor " + v[i].toUpperCase() + " vendeu"));
            pecaVendida[i] = pecas[indexPeca - 1];
            
            quantidade[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade vendida da peça " + pecas[indexPeca - 1])); 
            
            preco[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe o preco da venda"));
        }
    }

    private static int quantidadeTotalDePecasVendidas(int vetor[]) {
        int quantidade = 0;
        
        for(int i = 0; i < vetor.length; i++)
            quantidade = quantidade + vetor[i];
        
        return quantidade;
    }

    private static float valorDaVenda(float vetor[]) {
        float total = 0;
        
        for(int i = 0; i < vetor.length; i++){
            total = total + vetor[i];
        }
        
        return total;
    }

    private static String valorTotalDasPecas(String[] v, int[] quantidadeVendida, String peca[], float[] precoDaVenda) {
        String texto = "";
        float precoDaPeca = 0;
        
        for(int i = 0; i < v.length; i++){
            precoDaPeca = precoDaVenda[i] /quantidadeVendida[i];
            texto = texto + "\n\nVendedor: " + v[i] + "\nQuantidade vendida: " + quantidadeVendida[i] + "\nPeca Vendida: " + peca[i] + "\nPreco da peça: R$" + precoDaPeca;
        }
        
        return texto;
    }
}