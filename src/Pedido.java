import java.util.Date;

public class Pedido {
    private Integer id;
    private Date momento;
    private orderStatus status;

    public Pedido() {

    }

    public Pedido(Integer id, Date momento, orderStatus status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public orderStatus getStatus() {
        return status;
    }

    public void setStatus(orderStatus status) {
        this.status = status;
    }

   
    public String toString() {
        return "[id=" + id + ", momento=" + momento + ", status=" + status + "]";
    }


    
}