package arrays;

import java.util.Random;

public class Ex3_NumAleatorio {
    public static void main(String[] args) {
        Random r = new Random();

        int[] vetor = new int[20];

        for(int i= 0; i < vetor.length; i++ ){
            int numero = r.nextInt(100);
            vetor[i] = numero;
        }

        System.out.println("\nnumeros: ");
        for (int num: vetor) {
            System.out.print(num + " ");
        }

        System.out.println("\nnumeros sucessores: ");
        for (int num: vetor) {
            System.out.print(num+1 + " ");
        }

        System.out.println("\nnumeros antecessores: ");
        for (int num: vetor) {
            System.out.print(num-1 + " ");
        }
    }
}
