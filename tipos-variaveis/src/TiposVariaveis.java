public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos primitivos
        // classe String que representa texto na aplicação

        String meuNome = "BRUNO MOTA";


        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.print(numero);
        

        // final não permite a mudança de valor
        final double VALOR_DE_PI = 3.14;
        VALOR_DE_PI = 10.75;

    }
}
