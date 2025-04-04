// src/notificacoes/SMS.java
package notificacoes;

public class SMS implements Notificavel {
    @Override
    public void enviarNotificacao(String mensagem, String destinatario) {
        System.out.println("Enviando SMS para " + destinatario + ": " + mensagem);
    }

    @Override
    public void receberNotificacao() {
        System.out.println("SMS recebido.");
    }
}
