import java.util.Scanner;

public class Uni06Exe02 {
    /*
     
Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
12 posições do tipo real.
Imprima quais valores desses informados são maiores que a média dos valores.
Faça um método para ler os valores, outro para calcular a média e outro para
informar os valores maiores que a média.*/

    public static double[] lerNumeros() {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[12];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite numeros " + (i + 1) + ": ");
            vetor[i] = sc.nextDouble();
        }
        return vetor;

    }

    public static double calcularMedia(double[] vetor){
        double soma = 0;
        for (double num : vetor){
            soma += num;
        }
        return soma / vetor.length;
    }

    public static void mostrarQuantidade (double[] vetor, double media){
    System.out.printf("Valores maiores que a média (%.2f):\n", media);
        for(double num : vetor){
            if (num > media) {
                System.out.printf("%.2f\n",num);
            }
        }
    }

    public static void main(String[] args) {
        double[] numeros = lerNumeros();
        double media = calcularMedia(numeros);
        mostrarQuantidade(numeros, media);
    }

}