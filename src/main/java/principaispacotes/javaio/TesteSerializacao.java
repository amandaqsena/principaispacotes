package principaispacotes.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * Faz serialização e desserialização de objeto, nessa ordem.
 */
public class TesteSerializacao {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        String nome = "Amanda Queiroz";

        ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("src/main/resources/objeto.bin")
        );

        oos.writeObject(nome);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream("src/main/resources/objeto.bin"));
        String nomelido = (String) ois.readObject();
        ois.close();
        System.out.println(nomelido);
    }
}
