package principaispacotes.javautil;

import java.util.ArrayList;
import java.util.List;

import principaispacotes.modelos.ClasseMae;

public class TesteLambdaConsumer {
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

        lista.forEach((obj) ->
            System.out.println(obj));
    }
}
