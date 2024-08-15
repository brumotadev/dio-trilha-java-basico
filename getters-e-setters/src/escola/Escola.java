package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno bruno = new Aluno();
        bruno.setNome("Bruno");
        bruno.setIdade(25);

        System.out.println("O Aluno " + bruno.getNome() + " tem " + bruno.getIdade() + " anos ");
    }
}
