package loops;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero, quantNumero;
        int par = 0, impar =0;

        System.out.println("Quantidade de numeros: ");
        quantNumero = ler.nextInt();

        int count = 0;
        do{
            System.out.println("Digite um numero: ");
            numero = ler.nextInt();

            if(numero%2 == 0) par++;
            else impar++;

            count++;
        }while(count < quantNumero);

        System.out.println(par+ " números pares e "+ impar+ " numeros impares");
    }
}
