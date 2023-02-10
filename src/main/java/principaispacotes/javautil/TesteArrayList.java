package principaispacotes.javautil;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args){

        ArrayList<String> lista = new ArrayList<>();

        String texto = new String();
        lista.add(texto);

        String texto2 = "Oi";
        lista.add(texto2);

        Object ref = lista.get(0);

        String ref2 = lista.get(0);

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        String texto3 = "Texto";
        lista.add(texto3);

        String texto4 = "Amanda";
        lista.add(texto4);

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        System.out.println("-----");

        for(String s :lista){
            System.out.println(s);
        }

        //estados

        ArrayList<String> estados = new ArrayList(26); //capacidade inicialCOPIAR CÓDIG
    
        estados.add("RJ");
        estados.add("SP");
        //outros estados
        ArrayList<String> nova = new ArrayList(estados); //criando baseado na primeira lista
        
        for(String s :estados){
            System.out.println(s);
        }

        System.out.println("-----");

        for(String s :nova){
            System.out.println(s);
        }
    }
}
