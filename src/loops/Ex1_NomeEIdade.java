package loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Digite seu nome: ");
            nome = ler.next();
            if(nome.equals("0")) break;

            System.out.println("Digite sua idade: ");
            idade = ler.nextInt();
        };
    }
}
