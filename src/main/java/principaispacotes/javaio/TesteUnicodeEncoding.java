package principaispacotes.javaio;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {


        String s = "C";
        System.out.println(s.codePointAt(0));//67

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes("windows-1252");
        System.out.println(bytes.length + ", windows-1252");//1
        String sNovo = new String(bytes, "windows-1252");
        System.out.println(sNovo);

        bytes = s.getBytes("UTF-16");
        System.out.println(bytes.length + ", UTF-16");//4
        sNovo = new String(bytes, "windows-1252");//pega errado
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + ", US-ASCII");//1
        sNovo = new String(bytes, "windows-1252");
        System.out.println(sNovo);

        String cedilha = "ç";
        bytes = cedilha.getBytes(StandardCharsets.US_ASCII);
        sNovo = new String(bytes, "US-ASCII");
        System.out.println(sNovo);// ascii não tem cedilha

    }
}
