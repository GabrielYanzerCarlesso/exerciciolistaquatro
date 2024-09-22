//4. (ExeVetor04) Escreva um programa que leia e mostre um vetor de 20 elementos inteiros
//(inicializado em tempo de compilação). A seguir, conte e diga quantos valores pares
//existem no vetor.


public class ExeVetor04 {
    public static void main(String[] args) {
        
        int[] vetor = {3, 8, 15, 22, 9, 4, 16, 7, 12, 10, 6, 11, 18, 20, 33, 14, 27, 36, 5, 2};
        int countPares = 0;  

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);
  
            if (vetor[i] % 2 == 0) {
                countPares++;
            }
        }
  
        System.out.println("\nQuantidade de valores pares no vetor: " + countPares);
    }
}
