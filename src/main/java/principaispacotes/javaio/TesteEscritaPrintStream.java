package principaispacotes.javaio;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {
    public static void main(String[] args) throws IOException{
        
        PrintStream ps = new PrintStream("src/main/resources/output.txt");

        ps.println("Oi");
        ps.println();
        ps.println("Tudo bom?");
        ps.close();
    }
}
