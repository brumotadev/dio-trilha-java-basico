public class ResultadoEscolarTernaria {

    public static void main(String[] args) {
        int nota = 7;

        // se nota for >= maior ou igual a 7 "Aprovado" se não "Reprovado"
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
    }
}
