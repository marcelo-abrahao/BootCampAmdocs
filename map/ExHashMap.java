package map;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {
    public static void main(String[] args) {
        Map<String,Integer> seleMund = new HashMap<>();

            //Adiciona elementos mapeado por dois valores
            seleMund.put("Brasil", 5);
            seleMund.put("Alemanha", 3);
            seleMund.put("China", 0);
            seleMund.put("Argentina", 4);

            // Atualiza os valores
            seleMund.put("Brasil", 6);
            System.out.println(seleMund);

            System.out.println(seleMund.remove("China"));

            System.out.println(seleMund.containsKey("Bélgica"));
            System.out.println(seleMund.containsKey("Argentina"));

            System.out.println(seleMund.containsValue(4));
            
            System.out.println(seleMund.size());
    }
    
}
