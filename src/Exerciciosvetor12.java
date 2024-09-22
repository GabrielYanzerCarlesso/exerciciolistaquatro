import java.util.Scanner;

public class ExeVetor12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        
        System.out.println("Digite 6 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        System.out.println("\nEscolha a opção que você deseja:");
        System.out.println("1 - Soma dos elementos");
        System.out.println("2 - Produto dos elementos");
        System.out.println("3 - Média dos elementos");
        System.out.println("4 - Mostrar o vetor");

        System.out.print("Opção escolhida: ");
        int opcao = scanner.nextInt();

       
        switch (opcao) {
            case 1: 
                int soma = 0;
                for (int numero : numeros) {
                    soma += numero;
                }
                System.out.println("A soma dos números é: " + soma);
                break;

            case 2: 
                int produto = 1;
                for (int numero : numeros) {
                    produto *= numero;
                }
                System.out.println("O produto dos números é: " + produto);
                break;

            case 3: 
                int somaMedia = 0;
                for (int numero : numeros) {
                    somaMedia += numero;
                }
                double media = somaMedia / 6.0;
                System.out.println("A média dos números é: " + media);
                break;

            case 4: 
                System.out.println("Os números que você digitou são:");
                for (int numero : numeros) {
                    System.out.print(numero + " ");
                }
                System.out.println(); 
                break;

            default:
                System.out.println("Opção inválida!!  por gentileza escolha uma opção de 1 a 4.");
                break;
        }

        scanner.close();
    }
}
