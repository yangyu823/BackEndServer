package elixir.grizzly.orderMicro.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table
public class OrderSum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Order_Id")
    private int orderId;

    @NotNull
    @Column(name = "Email")
    private String email;

    @Column(name = "Status", columnDefinition = "VARCHAR(255) default 'pending'")
    private String status;

    @Column(name = "Total_Price", columnDefinition = "DOUBLE default '0.0'")
    private double totalPrice;

    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER, orphanRemoval = true)
    private List<OrderLine> orderline;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<OrderLine> getOrderline() {
        return orderline;
    }

    public void setOrderline(List<OrderLine> orderline) {
        this.orderline = orderline;
    }
}
