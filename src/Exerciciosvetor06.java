//6. (ExeVetor06) Escreva um programa que leia um vetor de 30 posições de números inteiros
//(inicializado em tempo de compilação) e mostre somente os positivos com suas
//respectivas posições.


public class ExeVetor06 {
    public static void main(String[] args) {
        
        int[] vetor = {3, -8, 15, -22, 9, -4, 16, 7, 12, -10, 6, 11, 18, 20, -33, 14, 27, -36, 5, 2, -1, -12, 13, -6, 17, -14, 19, -5, 21, -9};

       
        System.out.println("Números positivos no vetor e suas posições:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                System.out.println("Posição: " + i + " | Valor: " + vetor[i]);
            }
        }
    }
}
