package principaispacotes.javaio;

import java.io.File;
import java.io.FileNotFoundException;
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
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.format(new Locale("pt","BR"),"%s - %04d-%d, %s: %.2f",
                                tipoConta, agencia, numero, titular, saldo);

            linhaScanner.close();

        }

        scanner.close();

}
}
