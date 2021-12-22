package desafio2;

import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class Impares {

    public static void main(String[] args) {
        
        System.out.println("++ Impares no Intervalo ++");
        System.out.println("Entre com dois valores inteiros:");
        
        Scanner leitor = new Scanner(System.in);
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();

        IntStream stream  = IntStream.rangeClosed(Math.min(num1, num2), Math.max(num1, num2));
         
        List<Integer> Odd = stream.filter(i -> i % 2 != 0).boxed().toList();
        
        int result = Odd.stream().reduce(0, (a, b) -> a + b );

        System.out.println(Odd);
        System.out.println(result);
    }
}