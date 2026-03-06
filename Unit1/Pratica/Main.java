public class Main {

    public static void main(String[] args) {

        Notify notify = new Notify();

        notify.add_service(new SMS());
        notify.add_service(new Email());
        notify.add_service(new Whatsapp());

        notify.send("Seu pedido foi aprovado!");

    }

}