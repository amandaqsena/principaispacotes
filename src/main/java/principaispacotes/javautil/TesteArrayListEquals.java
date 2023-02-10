package principaispacotes.javautil;

import java.util.ArrayList;

import principaispacotes.modelos.ClasseMae;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<String> estados = new ArrayList<String>();
        estados.add("RJ");
        estados.add("SP");

        boolean contem = estados.contains("RJ");

        System.out.println(contem);

        ArrayList<ClasseMae> lista = new ArrayList<ClasseMae>();
        ClasseMae objeto = new ClasseMae(1,"A",true);
        lista.add(objeto);
        
        ClasseMae outroObjeto = new ClasseMae(1,"A",true);

        boolean contemClasse = lista.contains(outroObjeto);

        System.out.println(contemClasse);
    }
}
