package principaispacotes.javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {
    public static void main(String[] args) throws FileNotFoundException{

        Scanner scanner = new Scanner(new File("src/main/resources/contas.csv"));

        while(scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);

            //String[] valores = linha.split(",");
            //System.out.println(Arrays.toString(valores));

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useDelimiter(",");

            linhaScanner.useLocale(Locale.US);

            String tipoConta = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();

            String valorFormatado = String.format("%s - %04d-%d, %s: %f", tipoConta, valor2, valor3, valor4, valor5);
            
            System.out.println(valorFormatado);

            linhaScanner.close();

        }

        scanner.close();

}
}
