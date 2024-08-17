public class FacebookMessenger {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem Facebook Messenger");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se esta conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
