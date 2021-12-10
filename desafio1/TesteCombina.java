package desafio1;

import java.io.IOException;
import java.util.Scanner;

public class TesteCombina {

    public static void main(String[] args) throws IOException {

        String resp = "N";
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("++ Dimensões Colchão ++");
        System.out.println("Expessura:");
        int A = leitor.nextInt();
        
        System.out.println("Largura:");
        int B = leitor.nextInt();

        System.out.println("Comprimento:");
        int C = leitor.nextInt();

        System.out.println("++ Dimensões da Porta ++");
        System.out.println("Altura:");
        int H = leitor.nextInt();
        System.out.println("Largura:");
        int L = leitor.nextInt();

        if((H>B)||(L>C)){
            resp = "S";
        }

        leitor.close();
              
        System.out.println (resp);
    
    }
}
