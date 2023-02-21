package principaispacotes.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TesteProperties {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        //import deve ser java.util.Properties
    Properties props = new Properties(); 
    props.setProperty("login", "usuario"); //chave, valor
    props.setProperty("senha", "umasenha");
    props.setProperty("endereco", "www.umsite.com.br");

    //Properties props = new Properties();        
    props.load(new FileReader("src/main/resources/conf.properties"));

    String login = props.getProperty("login");
    String senha = props.getProperty("senha");
    String endereco = props.getProperty("endereco");

    System.out.println(login + ", " + senha  + ", " +  endereco);
    
    }
}
