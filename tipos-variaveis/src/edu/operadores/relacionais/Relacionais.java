package edu.operadores.relacionais;

public class Relacionais {
    public static void main(String[] args) {

        String nomeUm = "BRUNO";
        String nomeDois = new String("BRUNO");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois)); // o equals compara se o conteudo da variavel é igual




        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2) { // true
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("Numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero1 é igual a numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero1 é igual a numero2? " + simNao);
    }
}
