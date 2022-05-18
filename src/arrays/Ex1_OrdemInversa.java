package arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] array = {1, 5, 27, 18, 7, 0};

        for (int i = (array.length - 1); i >=0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
