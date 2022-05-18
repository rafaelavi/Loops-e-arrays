package loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor entre 0 e 10");
        valor = ler.nextInt();

        while(valor < 0 || valor > 10){
            System.out.println("Valor inválido. Digite novamente: ");
            valor = ler.nextInt();
        }
    }
}
