package messenger;

import messenger.apps.FacebookMessenger;
import messenger.apps.MSNMessenger;
import messenger.apps.ServicoMensagemInstantanea;
import messenger.apps.Telegram;

public class ComputadorUsuario {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;


        String appEscolhido = "msn";

        if(appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if(appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if(appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }


        smi.enviarMensagem();
        smi. receberMensagem();
    }


}
