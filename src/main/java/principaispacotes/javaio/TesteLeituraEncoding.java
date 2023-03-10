package principaispacotes.javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraEncoding {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(
            new File("src/main/resources/contas.csv"),"UTF-8");
        while(scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                //System.out.println(linha);

                Scanner linhaScanner = new Scanner(linha);
                linhaScanner.useLocale(Locale.US);
                linhaScanner.useDelimiter(",");

                String tipoConta = linhaScanner.next();
                int agencia = linhaScanner.nextInt();
                int numero = linhaScanner.nextInt();
                String titular = linhaScanner.next();
                double saldo = linhaScanner.nextDouble();

                System.out.format(new Locale("pt","BR"), "%s - %04d0%08d, %20s: %08.2f %n",
                        tipoConta, agencia, numero, titular, saldo );

                linhaScanner.close();
        }
    }
    
        
}
