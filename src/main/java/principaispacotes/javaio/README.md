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