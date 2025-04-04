// src/MainNotificacoes.java
import notificacoes.Email;
import notificacoes.SMS;
import notificacoes.PushNotification;
import notificacoes.Notificavel;

public class MainNotificacoes {
    public static void main(String[] args) {
        Notificavel email = new Email();
        Notificavel sms = new SMS();
        Notificavel push = new PushNotification();

        email.enviarNotificacao("Olá João, seu pedido foi enviado!", "joao@email.com");
        email.receberNotificacao();
        email.exibirDestinatario("joao@email.com");

        System.out.println();

        sms.enviarNotificacao("Código de verificação: 123456", "+55 35 91234-5678");
        sms.receberNotificacao();
        sms.exibirDestinatario("+55 35 91234-5678");

        System.out.println();

        push.enviarNotificacao("Você tem uma nova mensagem no app!", "Usuário João");
        push.receberNotificacao();
        push.exibirDestinatario("Usuário João");
    }
}
