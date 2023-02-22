package principaispacotes.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import principaispacotes.modelos.ClasseFilha;

public class TesteSerializacaoHeranca {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ClasseFilha objeto = new ClasseFilha();
        objeto.setAtributo1(0);
        objeto.setAtributo2("Dev");

        ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("src/main/resources/classemae.bin"));
        oos.writeObject(objeto);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream("src/main/resources/classemae.bin"));
        ClasseFilha objetoLido = (ClasseFilha) ois.readObject();
        ois.close();
        System.out.println(objetoLido.getAtributo1());
    }
    

}
