package principaispacotes.javaio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
    public static void main(String[] args) throws IOException{
        OutputStream fos = new FileOutputStream(
            "src/main/resources/output.txt");
        Writer  osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Oi");
        bw.newLine();
        bw.write("Tudo bom?");
        bw.close();
    }
}
