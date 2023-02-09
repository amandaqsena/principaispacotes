package principaispacotes.javautil;

import java.util.ArrayList;
import java.util.List;

public class TestaAutoBoxingUnboxing {
    public static void main(String[] args) {
        int[] idades = new int[5]; // array de primitivo
        String[] nomes = new String[5]; // array de referências

        int idade = 29;
        List numeros = new ArrayList();

        // idade não é referência, 
        // não é compatível com o tipo object
        
        numeros.add(idade); //Autoboxing
        System.out.println(numeros.get(0).getClass()); //Integer

        // Java fez:

        Integer idadeRef = new Integer(29);
        Integer idadeRefAutoboxing = Integer.valueOf(29);

        System.out.println(idadeRef.doubleValue());
        //unboxing
        int valor = idadeRef.intValue();
        String s = "10";

        Integer numero = Integer.valueOf(s);
        System.out.println(numero);

        int numeroint = Integer.parseInt(s);
        System.out.println(numeroint);
        List<Integer> numerosInteiros = new ArrayList<Integer>();
        numerosInteiros.add(29);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
    }
    
}
