public class Email implements InterfaceNotificacao {

    @Override
    public boolean send(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
        return true;
    }

    @Override
    public void confirm() {
        System.out.println("Email recebido");
    }

}