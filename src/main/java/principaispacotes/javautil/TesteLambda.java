package principaispacotes.javautil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import principaispacotes.modelos.ClasseMae;

public class TesteLambda {
    public static void main(String[] args){
        ClasseMae obj1 = new ClasseMae(0,"D",true);
        ClasseMae obj2 = new ClasseMae(1,"C",false);
        ClasseMae obj3 = new ClasseMae(2,"B",true);
        ClasseMae obj4 = new ClasseMae(3,"A",false);

        List<ClasseMae> lista = new ArrayList<>();

        lista.add(obj4);
        lista.add(obj2);
        lista.add(obj1);
        lista.add(obj3);

        lista.sort((a, b) 
            -> Integer.compare(a.getAtributo1(), b.getAtributo1())
        );

        lista.forEach(System.out::println);
        Comparator<ClasseMae> comp = (ClasseMae a,ClasseMae  b) 
        -> a.getAtributo2().compareTo(b.getAtributo2());
        
        lista.sort(comp);

        lista.forEach(System.out::println);
    }
}
