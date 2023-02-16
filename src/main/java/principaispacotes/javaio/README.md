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