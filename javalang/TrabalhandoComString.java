package principaispacotes.javalang;

public class TrabalhandoComString {
    public static void main(String[] args){
        String texto = "Socorram";
        texto = texto.concat("-");
        texto = texto.concat("me");
        texto = texto.concat(", ");
        texto = texto.concat("subi ");
        texto = texto.concat("no ");
        texto = texto.concat("ônibus ");
        texto = texto.concat("em ");
        texto = texto.concat("Marrocos");
        System.out.println(texto); 

        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String textoFromBuilder = builder.toString();
        System.out.println(textoFromBuilder);

        CharSequence cs = new StringBuilder("também é uma sequencia de caracteres");

        String nome = "AMANDA";
        CharSequence sb = new StringBuilder("am");
        nome = nome.replace("AM", sb);
        System.out.println(nome);
    }
}
