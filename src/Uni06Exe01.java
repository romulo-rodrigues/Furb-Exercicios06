import java.util.Scanner;

/*
 Uni6Exe01.java - Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. 
 Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever.
*/

public class Uni06Exe01 {
    private static int[] lerNumeros(){
        Scanner sc = new Scanner(System.in);
        int[] vetor =  new int[10]; //Criaçaõ do vetor.

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero " + (i + 1) + ": ");
            vetor[i] =  sc.nextInt();
        }
        return vetor;
    }

    private static void escreverInverso(int[] Vetor){
        System.out.println("Números na ordem inversa: "); //Realizando a inverção dos numeros
        for (int i = 9; i >= 0; i--) {
            System.out.println("Digite o numero " + (i + 1) + ": " + Vetor[i]);
        }
    }
    public static void main(String[] args) {
        int[] numeros = lerNumeros();
        escreverInverso(numeros);
    }
}