package edu.alexandre.TiposVariaveis;
public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
        /*Descrição: Um inteiro de 8 bits * Intervalo: -128 a 127*/
        byte idade = 25;

        /*Descrição: Um inteiro de 16 bits * Intervalo: -32.768 a 32.767*/
        short ano = 2025;

        /*Descrição: Um inteiro de 32 bits * Intervalo: -2^31 a 2^31-1*/
        int populacao = 1000000;

        /*Descrição: Um inteiro de 64 bits * Intervalo:  -2^63 a 2^63-1*/
        long distancia = 15000000000L; // Note o 'L' no final

        /*Descrição: Um número de ponto flutuante de precisão simples de 32 bits * Intervalo: Aproximadamente ±3.40282347E+38F (6-7 dígitos decimais de precisão)*/
        float preco = 19.99F; // Note o 'F' no final

        /*Descrição: Um número de ponto flutuante de precisão dupla de 64 bits * Intervalo: Aproximadamente ±1.79769313486231570E+308 (15 dígitos decimais de precisão).*/
        double pi = 3.141592653589793;

        /*Descrição: Um valor lógico que pode ser true ou false*/
        boolean ativo = true;

        /*Descrição: Um único caractere Unicode de 16 bits * Intervalo: '\u0000' a '\uffff'*/
        char letra = 'A';

        // Uma constante tem a palavra reservada final e por convensão deve ser criada em caixa alta
        final double VALOR_DE_PI = 3.14;
        
    }
}
