public class ResultadoEscolarTernaria2 {
    public static void main(String[] args) {
        int nota = 6;

        // se nota maior ou igual a 7, "Aprovado". Se não se, nota maior ou igual a 5 e menor que 7, "recuperação". Se não "Reprovado"
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
    }
}
