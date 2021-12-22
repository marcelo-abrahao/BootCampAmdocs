package desafio2;

import java.util.List;
import java.util.stream.IntStream;
 
public class StreamStudy 
{
    public static void main(String[] args) 
    {
        IntStream stream = IntStream.range(1, 10); 
         
        List<Integer> Odd = stream.filter(i -> i % 2 != 0).boxed().toList();
        
        int result = Odd.stream().reduce(0, (a, b) -> a + b );

        System.out.println(Odd);
        System.out.println(result);
    }
     
}