package edu.alexandre.TipoStrings;

public class TipoStrings {
    /* Em Java as strings são objetos da classe String */

    /* Declaração e inicialização */
    String saudacao = "Olá, Mundo";
    String vazio = new String(); // Cria uma string vazia
    String nome = new String("Alexandre");
    
    /* Concatenação utilizando operador '+' ou o método 'concat' */
    String parte1 = "Olá, ";
    String parte2 = "mundo!";
    String saudacao = parte1 + parte2; // Utilizando o operador +
    String saudacao2 = parte1.concat(parte2); // utilizando o método concat

    /*Comprimento da String utilizando o método 'length' */
    String texto = "Java";
    int comprimento = texto.length(); //Retorna 4

    /* Acesso a Caracteres com o método 'charAt' */
    String texto = "Java";
    char primeiroCaratere = texto.charAt(0);// Retorna 'J'

    /* Substrings para obter uma string espefica método 'substring' */
    String texto = "Olá, mundo!";
    String parte = texto.substring(0, 5); // Retorna "Olá, "

    /* Comparação de Strings, para comparar strings utilize os métodos 'equals' ou 'compareTo' */
    String texto1 = "Java";
    String texto2 = "java";
    boolean iguais = texto1.equals(texto2); //Retorna false
    int comparacao = texto1.compareTo(texto2); // retorna um valor um negativo

    /* Imutabilidade, Strings em java são imutáveis, o que significa que uma vez criada,
     * a string não pode ser alterada. Qualquer operação que pareça modificar uma string
     * na verdade cria uma nova string */
    String original = "Java";
    String modificada = original.toUpperCase(); // Cria uma nova string "JAVA"

    /* Métodos comuns, alguns métodos comuns da classe String incluem toLowerCase, toUpperCase, trim,
     * replace, entre outros */
    String texto = " Java ";
    String minusculo = texto.toLowerCase(); // " java "
    String maiusculo = texto.toUpperCase(); // " JAVA "
    String semEspacos = texto.trim(); // "Java"
    String substituido = texto.replace('a', 'o'); // " Jovo "

}
