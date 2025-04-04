// src/notificacoes/Notificavel.java
package notificacoes;

public interface Notificavel {
    void enviarNotificacao(String mensagem, String destinatario);
    void receberNotificacao();

    default void exibirDestinatario(String destinatario) {
        System.out.println("Destinatário: " + destinatario);
    }
}
