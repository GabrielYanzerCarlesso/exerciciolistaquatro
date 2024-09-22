//Questão 1 lista 4 
//1. (ExeVetor01) Preencher um vetor X de 10 elementos (índices de 0 a 9) em tempo de
//execução com o valor inteiro 30. Escrever o vetor X após seu total preenchimento.


public class Exerciciovetor01 {
    public static void main(String[] args) {
        int[] X = new int[10];  
        
        
        for (int i = 0; i < X.length; i++) {
            X[i] = 30;
        }

      
        System.out.println("Vetor X preenchido:");
        for (int i = 0; i < X.length; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }
    }
}
// obs, LEMBRAR O TEMPO TODO, IMPORTANTE !!

// lembrar do preenchimento após o vetor 
// Lembrar do valor de preenchimento do vetor = 30 