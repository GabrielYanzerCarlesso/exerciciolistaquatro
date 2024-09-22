//9. (ExeVetor09) Escreva um programa que leia pelo teclado 2 vetores (A e B) de 10 elementos
//inteiros. Crie um terceiro vetor (C) que seja a união dos dois primeiros (10 + 10). Mostre o
//vetor resultante.




import java.util.Scanner;

public class ExeVetor09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int tamanho = 10;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho * 2];

        
        System.out.println("Digite os 10 elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        
        System.out.println("\nDigite os 10 elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }

       
        for (int i = 0; i < tamanho; i++) {
            vetorC[i] = vetorA[i];
            vetorC[i + tamanho] = vetorB[i];
        }

        
        System.out.println("\nVetor C (união de A e B):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

        scanner.close();
    }
}
