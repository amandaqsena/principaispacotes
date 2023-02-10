package principaispacotes.javautil;

public class TesteGuardador {
    public static void main(String[] args) {
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        String texto = new String();
        guardador.adiciona(texto);

        String texto2 = "Oi";
        guardador.adiciona(texto2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        String ref = (String) guardador.getReferencia(1);
        System.out.println(ref);
    }
}
