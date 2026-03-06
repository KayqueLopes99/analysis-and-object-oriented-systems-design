public class Whatsapp implements InterfaceNotificacao {

    @Override
    public boolean send(String mensagem) {
        System.out.println("Enviando Whatsapp: " + mensagem);
        return true;
    }

    @Override
    public void confirm() {
        System.out.println("Mensagem visualizada no Whatsapp");
    }

}