import java.util.Scanner;

public class ExeVetor10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pares = new int[10];
        int[] impares = new int[10];
        int contPares = 0;
        int contImpares = 0;

        System.out.println(" Digite  números inteiros ou digite 0 para encerrar):");

        while (true) {
            System.out.print("Por favor, insira um número: ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Encerrando o programa... por favor tenha paciência com a vida!!");
                break; // Finaliza o programa se o usuário digitar zero
            }

            // Verifica se o número é par ou ímpar
            if (numero % 2 == 0) {
                if (contPares < 10) {
                    pares[contPares] = numero;
                    contPares++;
                } else {
                    System.out.println("O vetor de números pares já está completo.");
                }
            } else {
                if (contImpares < 10) {
                    impares[contImpares] = numero;
                    contImpares++;
                } else {
                    System.out.println("O vetor de números ímpares já está cheio.");
                }
            }

            // Se um dos vetores atingir 10 elementos, encerra
            if (contPares == 10) {
                System.out.println("O vetor de pares atingiu o limite de 10 elementos.");
                break;
            } else if (contImpares == 10) {
                System.out.println("O vetor de ímpares atingiu seu limite de 10 elementos.");
                break;
            }
        }

        // Exibe os números coletados
        System.out.println("\nNúmeros pares coletados:");
        for (int i = 0; i < contPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\n\nNúmeros ímpares coletados:");
        for (int i = 0; i < contImpares; i++) {
            System.out.print(impares[i] + " ");
        }

        scanner.close();
    }
}
