package elixir.grizzly.orderMicro.Entity.DTO;

import javax.validation.constraints.NotNull;

public class OrderLineDTO {
    @NotNull
    private int productId;

    @NotNull
    private double unitPrice;

    @NotNull
    private int qty;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
