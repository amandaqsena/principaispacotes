package principaispacotes.javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException{

        // Fluxo de entrada com arquivo
        InputStream fis = new FileInputStream(
            "src/main/resources/lorem.txt");
        Reader  isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);


        OutputStream fos = new FileOutputStream(
            "src/main/resources/output.txt");
        Writer  osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();
        while(linha != null) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }
        
        br.close();
        bw.close();
    }
}
