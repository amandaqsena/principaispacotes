package principaispacotes.javautil;

public class TesteArrayPrimitivos {
    public static void main(String[] args){
        int[]idades = new int[5]; //inicializa o array com os valores padroes

            idades[0] = 29;
            idades[1] = 39;
            idades[2] = 49;
            idades[3] = 59;
            idades[4] = 69;

            int idade1 = idades[4];

            System.out.println(idade1);

            System.out.println(idades.length);

            // Acessando o array

            for(int i = 0; i < idades.length; i++) {
                idades[i] = i * i;
                System.out.println(idades[i]);
            }

            // forma literal
            int[] refs = {1,2,3,4,5};
    }
}
