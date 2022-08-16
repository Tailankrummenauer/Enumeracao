import java.util.Date;


public class App {
    public static void main(String[] args){

        Pedido pedido = new Pedido(1080, new Date(), orderStatus.pagamento_pendente);

        System.out.println("Pedido: " + pedido);
        
        orderStatus os1 = orderStatus.entregue;

        orderStatus os2 = orderStatus.valueOf("entregue");

        System.out.println(os1);
        System.out.println(os2);
    }
}
