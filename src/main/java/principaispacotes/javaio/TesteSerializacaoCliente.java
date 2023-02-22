package principaispacotes.javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import principaispacotes.modelos.Cliente;

//Código omitido

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

            Cliente cliente = new Cliente();
            cliente.setNome("Amanda");
            cliente.setProfissao("Dev");
            cliente.setCpf("23413131");

            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/main/resources/cliente.bin"));
            oos.writeObject(cliente);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("src/main/resources/cliente.bin"));
            Cliente clienteLido = (Cliente) ois.readObject();
            ois.close();
            System.out.println(clienteLido.getNome());

    }
}
