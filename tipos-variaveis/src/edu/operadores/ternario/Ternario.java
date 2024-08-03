package edu.operadores.ternario;

public class Ternario {

    public static void main(String[] args) {
        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

         // utilizando ternario


         // <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>
         int resultadoNumero = a == b ? 1 : 0;

         resultado = a == b ? "verdadeiro" : "falso";

         System.out.println(resultado);

    }
}
