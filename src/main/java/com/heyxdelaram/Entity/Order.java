package com.heyxdelaram.Entity;

import com.heyxdelaram.Enums.OrderStatus;

public class Order {
    private int id;
    private Product product;
    private int numOfProduct;
    private int deadline;
    private OrderStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNumOfProduct() {
        return numOfProduct;
    }

    public void setNumOfProduct(int numOfProduct) {
        this.numOfProduct = numOfProduct;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product=" + product.getName() +
                ", numOfProduct=" + numOfProduct +
                ", deadline=" + deadline +
                ", status=" + status +
                '}';
    }

    public void setStatus(int status){
        switch (status){
            case 1:
                this.status = OrderStatus.InProduction;
                break;
            case 2:
                this.status = OrderStatus.Done;
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}
