package principaispacotes.javalang;

import principaispacotes.modelos.ClasseMae;
import principaispacotes.modelos.ClasseComToString;

public class TestaSysout {
    public static void main(String[] args) { 

        System.out.println("x");
        System.out.println(3);
        System.out.println(false);

        ClasseMae instancia = new ClasseMae();
        
        // Todas as classes estendem de Object
        // Usa toString padrão
        // Imprime pacote, nome da classe e hex de endereço na memória
        System.out.println(instancia);

        ClasseComToString instanciaToString = new ClasseComToString();
        
        // Se tiver sobrescrita de toString na classe, imprime o toString
        System.out.println(instanciaToString);

    }
}
