package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno bruno = new Aluno();
        bruno.nome = "Bruno";
        bruno.idade = 21;

        System.out.println("O Aluno " + bruno.nome + " tem " + bruno.idade + " anos ");
    }
}
