import java.util.Scanner;

public class Uni06Exe10 {
    private Uni06Exe10() {
        int opcao = 0;
        int vetor[] = new int[50];
        int posicao = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma opção abaixo: ");
        // Ira aparecer enquanto a função "opcao" for diferente de 8.
        do {
            System.out.println("-----MENU-----"); // Criação MENU.
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");

            //Declarando teclado para menu.
            opcao = teclado.nextInt();
            System.out.println("Opção digitada: " + opcao);

            switch (opcao) {
                case 1:
                    posicao = incluirValor(vetor, teclado, posicao);
                    break;
                case 2:
                    pesquisarValor(vetor, teclado);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                default:
                    break;
            }
        } while (opcao != 8); // Enquanto a funcao "opcao" for 8, faça isso.

    }

    private void pesquisarValor(int[] vetor, Scanner teclado) {
        int numeroDigitado = teclado.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroDigitado) {
                System.out.println("Numero: " + numeroDigitado + " encontrado na posição vetor[" + vetor + "]"); // Informa valores inseridos dentro do vetor.
                return;
            }else{
            }
        }
        System.out.println("Não existe valor");
    }

    private int incluirValor(int[] vetor, Scanner teclado, int posicao) {
        System.out.println("Digite um número");
        int numero = teclado.nextInt();
        if (posicao < vetor.length) {
            vetor[posicao] = numero;

            System.out.println("Numero " + numero + " incluido na posição vetor[" + posicao + "]"); // Informa valores inseridos dentro do vetor.
        } else {
            System.out.println("Vetor cheio!");
        }
        return posicao + 1; // Apos inserir um valor, inseri 1 na posição do vetor.
    }

    public static void main(String[] args) {
        new Uni06Exe10();
    }
}
