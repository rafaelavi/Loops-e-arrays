package loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int fatorial, multiplica = 1;

        System.out.println("Digite um numero: ");
        fatorial = ler.nextInt();

        for (int i = fatorial; i <= 1; i--){
            multiplica = multiplica * i;
        }

        System.out.println(fatorial + "! = "+multiplica);
    }
}
