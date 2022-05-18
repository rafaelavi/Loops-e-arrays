package arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] consoante = new String[6];
        int quantConsoante =0 ;

        int count = 0;
        do{
            System.out.println("Digite uma letra ");
            String letra = ler.next();

            if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ){
                consoante[count] = letra;
                quantConsoante++;
            }

            count++;
        }while (count < consoante.length);

        System.out.println("Consoantes: ");
        for (String consoantes : consoante) {
            System.out.print(consoantes + " ");
        }
        System.out.println("Quantidade de consoante: " + quantConsoante);
    }
}
