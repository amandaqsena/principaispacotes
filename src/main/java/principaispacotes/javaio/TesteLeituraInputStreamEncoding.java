package principaispacotes.javaio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeituraInputStreamEncoding {
    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
        InputStream fis = new FileInputStream(
            "src/main/resources/lorem.txt");
        Reader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while(linha != null) {

                System.out.println(linha);
                linha = br.readLine();
        }

        br.close();

}
}