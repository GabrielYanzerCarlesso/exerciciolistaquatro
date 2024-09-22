import java.util.Scanner;
import java.util.HashSet;

public class ExeVetor13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[30];
        int[] B = new int[30];
        HashSet<Integer> intersecao = new HashSet<>();

        
        System.out.println(" Digite 30 números inteiros para preencher o vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        
        System.out.println(" Digite 30 números inteiros para preencher o vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }

       
        for (int numeroA : A) {
            for (int numeroB : B) {
                if (numeroA == numeroB) {
                    intersecao.add(numeroA); 
                }
            }
        }

        
        int[] C = new int[intersecao.size()];
        int index = 0;
        for (int numero : intersecao) {
            C[index] = numero;
            index++;
        }

        
        System.out.println("Os números que estão em ambos os vetores (vetor C) são:");
        for (int numero : C) {
            System.out.print(numero + " ");
        }

        System.out.println(); 
        scanner.close();
    }
}
