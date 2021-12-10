package desafio1;

import java.io.*;

public class teste {
        public static void main(String[] args) throws IOException{

            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //StringTokenizer st = new StringTokenizer(br.readLine()); // Lê a linha de entrada

            File f1 = new File("/teste.txt");
            File f2 = new File("/teste2.txt");

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f1.getName()));

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f2.getName()));

            int line = 0;
            while((line = bis.read()) != -1){
                bos.write((char)line);
                bos.flush();
            }
            bis.close();
            bos.close();

            //int a = Integer.parseInt(st.nextToken());
       
            //System.out.println(a + 10); // Imprime o dado
            
        }
    
}
