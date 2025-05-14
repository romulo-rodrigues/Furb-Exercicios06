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

            // Declarando teclado para menu.
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
                    alterarValor(vetor, teclado);
                    break;
                case 4:
                    deletarValor(vetor, teclado, posicao);
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

    private int deletarValor(int[] vetor, Scanner teclado, int posicao) {
        int indice = pesquisarValor(vetor, teclado);
        if (indice >= 0) {
            for (int i = indice; i < posicao - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            System.out.println("Valor " + vetor[indice] + " será excluido da posição [" + indice + "] do vetor.");
            vetor[posicao - 1] = 0;
            System.out.println("VALOR EXCLUIDO!");
            return posicao -1;
        }else{
            System.out.println("Valor não encontrado, nada foi excluido.");
            return posicao;
        }
    }

    private void alterarValor(int[] vetor, Scanner teclado) {

        // Validação se o numero existe ou não.
        int indice = pesquisarValor(vetor, teclado);
        if (indice >= 0) {
            // Se existir, alterar valor

            System.out.println("Digite um novo numero");
            int novoNumero = teclado.nextInt();
            vetor[indice] = novoNumero;
        }
        // Se não existir, informar que não existe
        System.out.println("Não existe o numero informado.");
    }

    private int pesquisarValor(int[] vetor, Scanner teclado) {
        int numeroDigitado = teclado.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroDigitado) {
                System.out.println("Numero: " + numeroDigitado + " encontrado na posição vetor[" + i + "]"); // Informa
                                                                                                             // valores
                                                                                                             // inseridos
                                                                                                             // dentro
                                                                                                             // do
                                                                                                             // vetor.
                return i;
            } else {
            }
        }
        System.out.println("Não existe valor");
        return -1;
    }

    private int incluirValor(int[] vetor, Scanner teclado, int posicao) {
        System.out.println("Digite um número");
        int numero = teclado.nextInt();
        if (posicao < vetor.length) {
            vetor[posicao] = numero;

            System.out.println("Numero " + numero + " incluido na posição vetor[" + posicao + "]"); // Informa valores
                                                                                                    // inseridos dentro
                                                                                                    // do vetor.
        } else {
            System.out.println("Vetor cheio!");
        }
        return posicao + 1; // Apos inserir um valor, inseri 1 na posição do vetor.
    }

    public static void main(String[] args) {
        new Uni06Exe10();
    }
}
