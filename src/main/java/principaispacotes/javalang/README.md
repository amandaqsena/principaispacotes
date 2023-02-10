O package java.land é o único pacote que não precisa ser importado. Ele possui classes fundamentais como a String e System. Os objetos da classe String são imutáveis e usamos uma sintaxe literal para criar. Qualquer método de alteração da classe String devolve uma nova String. Essa classe é uma CharSequence. Se precisarmos concatenar muitos String, deveremos usar a classe StringBuilder.

Alguns métodos da classe String:
- trim
- charAt
- contains
- isEmpty
- length
- indexOf
- replace

System:
- é uma classe
- vem do pacote java.lang
- visibilidade pública (public)
    - out:
        - é um atributo
        - visibilidade pública
        - é uma referência
        - tipo PrintStream
        - tem println como método não estático, possui sobrecarga e não joga exceções do tipo checked