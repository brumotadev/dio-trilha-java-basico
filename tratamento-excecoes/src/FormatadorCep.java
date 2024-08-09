public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException exception) {
            System.out.println("O cep não corresponde com as regras de negocio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8) {
            throw new CepInvalidoException();
        }
            // simulacao de cep formatado
            return "23.765-064";
        
    }
}
