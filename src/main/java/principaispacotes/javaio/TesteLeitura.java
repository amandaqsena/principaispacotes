package principaispacotes.javaio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
    public static void main(String[] args) throws IOException{

        // Fluxo de entrada com arquivo
        InputStream fis = new FileInputStream(
            "src/main/resources/lorem.txt");
        Reader  isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println(
            "O arquivo está pronto para ser lido? "
            + br.ready());

        String linha = br.readLine();
        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        
        br.close();
    }
}