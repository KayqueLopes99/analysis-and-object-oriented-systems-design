public class SMS implements InterfaceNotificacao {

    @Override
    public boolean send(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
        return true;
    }

    @Override
    public void confirm() {
        System.out.println("SMS entregue");
    }

}