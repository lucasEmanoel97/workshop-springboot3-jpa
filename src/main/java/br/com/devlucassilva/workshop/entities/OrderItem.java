package br.com.devlucassilva.workshop.entities;

import br.com.devlucassilva.workshop.entities.pk.OrderItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemPK id;
    private Integer quantity;
    private Double parse;

    public OrderItem() {}

    public OrderItem(Order order, Product product, Integer quantity, Double parse) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.parse = parse;
    }

    public Order getOrder() {return id.getOrder(); }

    public void setOrder(Order order) {id.setOrder(order); }

    public Product getProduct() {return id.getProduct(); }

    public void setProduct(Product product) {id.setProduct(product); }

    public Integer getQuantity() {return quantity; }

    public void setQuantity(Integer quantity) {this.quantity = quantity; }

    public Double getParse() {return parse; }

    public void setParse(Double parse) {this.parse = parse; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
