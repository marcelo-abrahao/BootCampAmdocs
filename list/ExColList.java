package list;
import java.util.*;
import java.util.List;

public class ExColList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Marcelo");
        nomes.add("Zilma");
        nomes.add("Gabriel");
        nomes.add("Tiago");
        System.out.println(nomes);
        
        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.remove(3);
        System.out.println(nomes);

        for(String nomeDoItem: nomes){
            System.out.println("-->>" + nomeDoItem); 
        }

    }
}