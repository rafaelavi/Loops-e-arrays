package arrays;

import java.util.Random;

public class Ex4_Multidimensionais {
    public static void main(String[] args) {
        int[][] M = new int[4][4];

        Random r = new Random();

        for(int i = 0; i < M.length; i++){
            for (int b = 0; b < M[i].length; b++){
                M[i][b] = r.nextInt(9);;
            }
        }

        for (int[] linha: M) {
            for (int coluna: linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
