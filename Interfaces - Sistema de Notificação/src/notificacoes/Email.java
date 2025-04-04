// src/notificacoes/Email.java
package notificacoes;

public class Email implements Notificavel {
    @Override
    public void enviarNotificacao(String mensagem, String destinatario) {
        System.out.println("Enviando e-mail para " + destinatario + ": " + mensagem);
    }

    @Override
    public void receberNotificacao() {
        System.out.println("E-mail recebido.");
    }
}
