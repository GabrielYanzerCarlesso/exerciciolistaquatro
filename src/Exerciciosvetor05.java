//5. (ExeVetor05) Escreva um programa que leia dois vetores (A e B) de 10 posições e faça a
//multiplicação dos elementos de mesmo índice em ambos os vetores colocando o resultado
//em um terceiro vetor (C). Mostre o vetor resultante.

import java.util.Scanner;

public class ExeVetor05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];  
        int[] B = new int[10];  
        int[] C = new int[10];  

        
        System.out.println("Digite os 10 elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }

        
        System.out.println("Digite os 10 elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = input.nextInt();
        }

       
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] * B[i];
        }

        
        System.out.println("Vetor resultante C (multiplicação de A e B):");
        for (int i = 0; i < C.length; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
        
        input.close();
    }
}
//Lembrar Vetor C fica armazenando resultado 