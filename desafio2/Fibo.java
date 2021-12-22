package desafio2;

import java.util.Scanner;

public class Fibo {
    
	public static void main(String[] args) {

        System.out.println("++ Fibonacci ++");
        System.out.println("Entre com um valor(0<N<=50):");
        
        Scanner leitor = new Scanner(System.in);
        Double num = leitor.nextDouble();
        Double result;

        result = (Math.pow((1+Math.pow(5, 0.5))/2,num) - Math.pow((1-Math.pow(5, 0.5)) / 2,num)) / Math.pow(5,0.5);
        
        System.out.printf("%.1f", result);

        leitor.close();
	}
}   