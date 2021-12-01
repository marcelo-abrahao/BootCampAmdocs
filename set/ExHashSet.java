package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExHashSet{

    public static void main(String[] args) {
        
        Set<Double> notaAlunos = new HashSet<>();
        
        //Add nalores no set
        notaAlunos.add(5.7);
        notaAlunos.add(7.5);
        notaAlunos.add(8.4);
        notaAlunos.add(6.1);
        notaAlunos.add(9.2);
        notaAlunos.add(10.0);

        System.out.println(notaAlunos);

        //Remove um elemento
        notaAlunos.remove(8.4);
        System.out.println(notaAlunos);

        //Retorna quantidade de elements
        System.out.println("Tamanho da lista:"+notaAlunos.size());

        //Navega em todos os elementos
        Iterator<Double> iter = notaAlunos.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        for (double nota: notaAlunos){
            System.out.println(nota);
        }

        //verifica se está vazio
        System.out.println("Está Vazia:"+notaAlunos.isEmpty());

    }

}
