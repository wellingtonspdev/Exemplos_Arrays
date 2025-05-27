# Coleção de Exemplos Java



Este repositório contém uma coleção de exemplos simples em Java, demonstrando diferentes conceitos e funcionalidades da linguagem.



## Conteúdo / Exemplos



Aqui está uma breve descrição de cada arquivo de exemplo incluído:



1.  **`Pessoa.java` e `Main.java`**

    * `Pessoa.java`: Define uma classe `Pessoa` simples com um atributo `nome` (privado) e métodos `getNome()` (getter) e `setNome()` (setter) públicos. Um exemplo básico de encapsulamento em Programação Orientada a Objetos.

    * `Main.java`: Classe principal que demonstra o uso da classe `Pessoa`. Cria um array de objetos `Pessoa`, instancia esses objetos, define nomes para alguns deles e, em seguida, imprime os nomes no console.



2.  **`Bidimensional0803.java`**

    * Demonstra o uso de arrays bidimensionais (matrizes) para armazenar notas de alunos.

    * Utiliza `javax.swing.JOptionPane` para entrada (solicitar notas e qual aluno consultar) e saída de dados (mostrar as notas e a média do aluno consultado) através de caixas de diálogo gráficas.

    * Calcula a média de duas notas para um aluno específico.



3.  **`Exemplo0801.java`**

    * Processa argumentos numéricos inteiros fornecidos via linha de comando ao executar o programa.

    * Armazena esses argumentos em um array.

    * Calcula e exibe a soma total e a média dos números fornecidos.

    * Imprime os números na ordem inversa em que foram digitados.

    * Inclui tratamento de exceção (`NumberFormatException`) para o caso de argumentos não numéricos serem fornecidos.



4.  **`Unidimensional0802.java`**

    * Demonstra a criação e manipulação de arrays de caracteres (`char[]`) e arrays de Strings (`String[]`).

    * Mostra como converter um array de caracteres para uma String usando `String.valueOf()`.

    * Mostra como extrair uma sub-string de um array de caracteres.

    * Concatena os elementos de um array de Strings em uma única String.

    * Exibe o tamanho dos arrays e acessa seus elementos (primeiro e último).



## Como Compilar e Executar



Para compilar e executar esses exemplos Java, você precisará ter o JDK (Java Development Kit) instalado em sua máquina.



### Compilação



Navegue até o diretório onde o arquivo `.java` está localizado e use o compilador Java:



```bash

javac NomeDoArquivo.java
