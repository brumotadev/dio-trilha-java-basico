public class SistemaCadastro {

    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa bruno = new Pessoa("123", "BRUNO");

        // definimos o endereço de Bruno
        bruno.setEndereco("Rua do Java");


        System.out.println(bruno.getNome() + " - " + bruno.getCpf());
    }
}
