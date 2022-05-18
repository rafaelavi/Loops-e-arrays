package loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.println("tabuada: ");
        numero = ler.nextInt();

        System.out.println("Tabuada de "+ numero);
        for(int i=0; i <= 10; i++){
            System.out.println(numero + " x " + i + " = "+ (numero*i));
        }
    }
}
