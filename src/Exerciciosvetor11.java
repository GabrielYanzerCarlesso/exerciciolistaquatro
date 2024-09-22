import java.util.Scanner;
import java.util.Arrays;

public class ExeVetor11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];

        System.out.println("Digite 20 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

       
        Arrays.sort(numeros);

       
        System.out.println("\nAqui estão os números em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        System.out.println(); 
        scanner.close();
    }
}
// lembrar que arrays.sort(numeros) é utilizado para ordenar!! no caso de agora o vetor numeros