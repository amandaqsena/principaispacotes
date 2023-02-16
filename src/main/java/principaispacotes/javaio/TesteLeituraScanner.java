package principaispacotes.javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeituraScanner {
    public static void main(String[] args) throws FileNotFoundException{

        Scanner scanner = new Scanner(new File("src/main/resources/contas.csv"));

        while(scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
        }

        scanner.close();

}
}
