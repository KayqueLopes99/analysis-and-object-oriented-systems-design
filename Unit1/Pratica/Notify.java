import java.util.ArrayList;
import java.util.List;

public class Notify {

    private List<InterfaceNotificacao> servicos = new ArrayList<>();

    public void add_service(InterfaceNotificacao servico){
        servicos.add(servico);
    }

    public void send(String mensagem){

        for(InterfaceNotificacao servico : servicos){
            boolean enviada = servico.send(mensagem);

            if(enviada){
                servico.confirm();
            }
        }

    }

}