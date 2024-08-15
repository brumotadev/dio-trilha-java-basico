package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno bruno = new Aluno();
        bruno.setNome("Bruno");
        bruno.setIdade(23);

        System.out.println("O Aluno " + bruno.nome + " tem " + bruno.idade + " anos ");
    }
}
