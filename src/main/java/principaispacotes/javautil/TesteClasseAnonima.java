package principaispacotes.javautil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import principaispacotes.modelos.ClasseMae;

public class TesteClasseAnonima {

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

        lista.sort(new Comparator<ClasseMae>() { // classe anonima
            public int compare(ClasseMae obj1, ClasseMae obj2){
                return Integer.compare(obj1.getAtributo1(), obj2.getAtributo1());
            }
        });

        lista.forEach(System.out::println);

        // outra forma de criar classe anonima

        Comparator<ClasseMae> comp = new Comparator<ClasseMae>() {
            public int compare(ClasseMae obj1, ClasseMae obj2){
                return obj1.getAtributo2().compareTo(obj2.getAtributo2());
            }
        };

        lista.sort(comp);

        lista.forEach(System.out::println);
    }

    
}
