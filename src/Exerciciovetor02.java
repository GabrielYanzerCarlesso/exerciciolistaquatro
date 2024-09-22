//2. (ExeVetor02) Preencher um vetor A de 10 elementos (índices de 0 a 9) em tempo de
//execução com os números inteiros 10, 20, 30, 40, 50, ..., 100. Escrever o vetor A após o
//seu total preenchimento.

public class ExeVetor02 {
    public static void main(String[] args) {
        int[] A = new int[10]; 
        
       
        for (int i = 0; i < A.length; i++) {
            A[i] = (i + 1) * 10;
        }

       
        System.out.println("Vetor AA :");
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}
//Lembrar de preencher o vetor com números de 10 a 100
