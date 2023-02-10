package principaispacotes.javautil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.io.FileWriter;
import java.io.IOException;

/**
 * LinkedList e ArrayList implementam List
 */
public class TestaLinkedList {
    public static void main(String[] args){
        try{
            FileWriter myWriter = new FileWriter("src/main/resources/dados/dadosPerformance.txt");
            myWriter.write("Iteracoes,adicionarLL,adicionarAL,removerLL,removerAL\n");
            for (int n=100;n<100000000;n*=10){ //100 milhões foi o limite na minha máquina
                
                myWriter.write(String.valueOf(n));
                
                LinkedList<Integer> linkedList = new LinkedList<Integer>();
                
                long startTime = System.nanoTime();
                for(int i=0; i< n; i++){
                    linkedList.add(i);
                }
                long elapsedTime = System.nanoTime() - startTime;
                myWriter.write(",");
                myWriter.write(String.valueOf(elapsedTime));
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                startTime = System.nanoTime();
                for(int i=0; i< n; i++){
                    arrayList.add(i);
                }
                elapsedTime = System.nanoTime() - startTime;
                myWriter.write(",");
                myWriter.write(String.valueOf(elapsedTime));

                startTime = System.nanoTime();
                for(int i=n-1; i>=0; i--){
                    linkedList.remove(i);
                }
                elapsedTime = System.nanoTime() - startTime; //58098400

                myWriter.write(",");
                myWriter.write(String.valueOf(elapsedTime));

                startTime = System.nanoTime();
                for(int i=n-1; i>=0; i--){
                    arrayList.remove(i);
                }
                elapsedTime = System.nanoTime() - startTime;
                myWriter.write(",");
                myWriter.write(String.valueOf(elapsedTime));
                
                myWriter.write("\n");
            }
            
            myWriter.close();
        } catch(IOException e) {

        }
        
 }
}
