//3. (ExeVetor03) Preencher um vetor B de 10 elementos em tempo de execução com o
//número 10 se o índice do elemento for ímpar, e com o número 20 se for par. Escrever o
//vetor B após o seu total preenchimento.

public class ExeVetor03 {
    public static void main(String[] args) {
        int[] B = new int[10];  
        
        for (int i = 0; i < B.length; i++) {
            if (i % 2 == 0) {
                B[i] = 20;  
            } else {
                B[i] = 10;  
            }
        }

        
        for (int i = 0; i < B.length; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}
//Lembrar que índices pares = 20 e índices ímpares = 10 (muito importante)
