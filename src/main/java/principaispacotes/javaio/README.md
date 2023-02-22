#  Leitura e escrita de arquivos

Entrada pode ser:
- arquivo,
- rede,
- ou teclado.

A aplicação desktop, web ou mobile recebe a entrada e devolve informações. A saída pode ser em:

- arquivo,
- rede,
- exibida no console.

Caminho:

BufferedReader > InputStreamReader > FileInputStram > arquivo.txt

Stream para ler bytes, Reader é mais específico para ler textos. InputStreamReader e BufferedReader se diferenciam pelo agrupamento de caracteres que o BufferedReader faz.

Classes abstratas
- de leitura:
    - InputStream
    - Reader
- de escrita:
    - OutputStream
    - Writer

Alternativamente, podemos usar o FileWriter para escrita. Essa classe pode ser passada para outros Writers, como o BufferedWriter. É usada para estabelecer uma saída com um arquivo e para escrever caracteres.

# Serialização

- java.io.ObjectOutputStream = Objeto -> Bits e Bytes
- java.io.ObjectInputStream = Bits e Bytes -> Objeto

## Serializando composições

Para serializar um objeto, precisamos que ele e seus atributos pertençam a classes serializáveis, caso contrário, será lançada uma excessão do tipo NotSerializableException. O atributo de classe não serializável pode ser também marcado como "transient" para não gravá-lo no objeto. Isso significa que ele não faz parte da serialização.