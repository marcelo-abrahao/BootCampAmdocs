package desafios;

import java.util.Scanner;
import java.io.IOException;

public class ViraTempo {    
    public static void main(String[] args) throws IOException {
          	
        Scanner leitor = new Scanner(System.in);
    	
        while (leitor.hasNext()){
            float graus = leitor.nextFloat();
            if ( graus >= 0 && graus < 90 || graus == 360 ) System.out.println("Bom dia!");
            if ( graus >= 90 && graus < 180 ) System.out.println("Boa Tarde!");
            if ( graus >= 180 && graus < 270 ) System.out.println("Boa Noite!");
            if ( graus >= 270 && graus < 360 ) System.out.println("De Madrugada!");
            if ( graus > 360 ){
                System.out.println ("Fim do Programa, número fora do range!");
                leitor.close();
            } 
        } 
    }
}
