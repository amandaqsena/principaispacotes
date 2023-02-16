package principaispacotes.javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException{
        
        BufferedWriter bw = new BufferedWriter(
            new FileWriter("src/main/resources/output.txt"));

        bw.write("Oi");
        bw.newLine();
        bw.write("Tudo bom?");
        bw.close();
    }
}
