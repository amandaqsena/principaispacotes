package principaispacotes.javautil;

import principaispacotes.modelos.ClasseFilha;
import principaispacotes.modelos.ClasseMae;
import principaispacotes.modelos.OutraClasseFilha;

public class TesteArrayReferencias {
    public static void main(String[] args){
        // array de tipos não primitivos
        // nenhuma instancia é criada
        // São colocados nulls
        ClasseMae[] arrayClasses = new ClasseMae[5]; 
        for(int i = 0; i < arrayClasses.length; i++) {
            System.out.println(arrayClasses[i]);
        }

        ClasseMae instancia0 = new ClasseMae();
        
        arrayClasses[0] = instancia0;

        // exibem mesmos resultados

        System.out.println(instancia0);
        System.out.println(arrayClasses[0]);

        instancia0.setAtributo1(15);

        System.out.println(instancia0.getAtributo1());
        System.out.println(arrayClasses[0].getAtributo1());


        // Mesma referência (agora 3x), apenas um objeto criado

        ClasseMae instancia1 = arrayClasses[0];

        System.out.println(instancia0);
        System.out.println(instancia1);
        System.out.println(arrayClasses[0]);

        ClasseMae[] arrayMisto = new ClasseMae[2];
        ClasseFilha tipo1 = new ClasseFilha();
        OutraClasseFilha tipo2 = new OutraClasseFilha();

        arrayMisto[0] = tipo1;
        arrayMisto[1] = tipo2;

        // Não pode:
        //ClasseFilha ref = arrayMisto[0];
        // ou
        //ClasseFilha ref = arrayMisto[1];

        // pode:

        ClasseMae ref = arrayMisto[0];
        ClasseFilha refCast = (ClasseFilha) arrayMisto[0];

        //Compilador deixa, mas dá excessão ClassCastException
        try{
            OutraClasseFilha refCastTrocado = (OutraClasseFilha) arrayMisto[0];
        } catch(ClassCastException e){
            System.out.println("Deu ClassCastException");
        }

        int numero = 3;
        double valor = numero; //cast implícito

        double valor2 = (double) numero; //cast explícito

        double decimal = 3.56;
        int inteiro = (int) decimal; //cast explicito é exigido pelo compilador

        // cast impossível, compilador não deixa:
        //ClasseFilha impossivel = (ClasseFilha) decimal;
    }
}
