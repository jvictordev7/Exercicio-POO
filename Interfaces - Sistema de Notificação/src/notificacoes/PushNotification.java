// src/notificacoes/PushNotification.java
package notificacoes;

public class PushNotification implements Notificavel {
    @Override
    public void enviarNotificacao(String mensagem, String destinatario) {
        System.out.println("Enviando Push Notification para " + destinatario + ": " + mensagem);
    }

    @Override
    public void receberNotificacao() {
        System.out.println("Push Notification recebida.");
    }
}
