package loops;

import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do{
            System.out.println("Digite um numero: ");
            num = ler.nextInt();

            if(num > maior) maior = num;

            soma += num;

            count++;
        }while(count < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média dos números é: "+ (soma/5));
    }
}
