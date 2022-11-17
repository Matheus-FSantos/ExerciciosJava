/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.com.exercicios.revisao;
import javax.swing.JOptionPane;
/**
 *
 * @author matheus.fsantos52
 */
public class Exercicio01Revisao {
    private static String impressao(float salarioMedio, float salarioMaior, int quantidade){
        return "Salario medio: " + salarioMedio + 
                "\nMaior salario: " + salarioMaior +
                "\nQuantidade de salario maior que 850: " + quantidade;
    }
    
    public static void main(String[] args) {
        String nomes[] = new String[10];
        float salario[] = new float[10];
        
        inserirNomes(nomes);
        inserirSalarios(salario);
        float salarioMedio = calcularMedia(salario);
        float salarioMaior = maiorSalario(salario);
        int quantidade = maioresQue850(salario);
        
        System.out.println(impressao(salarioMedio, salarioMaior, quantidade));
    }
    
    private static void inserirNomes(String vetor[]){
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = JOptionPane.showInputDialog("Informe o nome do " + (i + 1) + "º trabalhador");
        }
    }

    private static void inserirSalarios(float vetor[]) {
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe o salario do " + (i + 1) + "º trabalhador"));
        }
    }

    private static float calcularMedia(float vetor[]) {
        float salario = 0;
        
        for(int i = 0; i < vetor.length; i++){
            salario = salario + vetor[i];
        }
        return salario/10;
    }

    private static float maiorSalario(float vetor[]) {
        float maior = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if(i == 0){
                maior = vetor[i];
            } else {
                if(maior < vetor[i]){
                    maior = vetor[i];
                }
            }
        }
        
        return maior;
    }

    private static int maioresQue850(float vetor[]) {
        int quantidade = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] <= 850.00){
                quantidade = quantidade + 1;
            }
        }
        
        return quantidade;
    }
}
