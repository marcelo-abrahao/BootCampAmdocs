package desafio2;

import java.util.Scanner;

public class FatorialSimples {
    
	public static void main(String[] args) {

        System.out.println("++ Fatorial Simples ++");
        System.out.println("Entre com um valor(0<N<13):");
        
        Scanner leitor = new Scanner(System.in);
        int num = leitor.nextInt();
        int fat = 1;
        
        if((num>0)&&(num<13)) {
            
            for(int i = 2; i<=num; i++){
                fat *=i;
            }

            System.out.printf("O fatorial de %d é %d", num, fat);

        }else System.out.println("Valor deve estar entre o range.");

        leitor.close();
	}
}