package com.heyxdelaram;

import com.heyxdelaram.Entity.Imperishable;
import com.heyxdelaram.Entity.Order;
import com.heyxdelaram.Entity.Perishable;
import com.heyxdelaram.Entity.Product;
import com.heyxdelaram.Enums.OrderStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Order> orders = new ArrayList<>();
    static List<Product> products = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n---MENU---");
            System.out.println("1- Add Product");
            System.out.println("2- Place an Order");
            System.out.println("3- Change Order Status");
            System.out.println("0- Exit Program");

            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    placeOrder();
                    break;
                case 3:
                    if (orders.size() == 0){
                        System.out.println("No orders have been placed yet.");
                        break;
                    }
                    showOrders();
                    changeStatus();
                    break;
                case 0:
                    System.out.println("Have a nice day!");
                    return;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }

    private static void showOrders() {

        for (Order o: orders){
            System.out.println(o.toString());
        }
    }

    private static void addProduct() {

        Product product = null;

        System.out.println("Chose a type: ");
        System.out.println("1- Canned\n2- Home Hygienics\n3- Dairy\n4- Snacks\n5-Protein");
        int type = input.nextInt();

        switch (type) {
            case 1:
            case 2:
            case 4:
                product = new Imperishable();
                product.setType(type);

                System.out.println("maximum day of storage: ");
                ((Imperishable) product).setMaxDay(input.nextInt());

                products.add(product);
                break;
            case 3:
            case 5:
                product = new Perishable();
                product.setType(type);

                System.out.println("maximum temperature: ");
                ((Perishable) product).setMaxTemp(input.nextInt());

                System.out.println("minimum temperature: ");
                ((Perishable) product).setMinTemp(input.nextInt());

                products.add(product);
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }

        System.out.println("name: ");
        product.setName(input.next());

        System.out.println("code: ");
        product.setCode(input.next());

        System.out.println("price: ");
        product.setPrice(input.nextDouble());

        System.out.println("address: ");
        product.setAddress(input.next());



        System.out.println("Product added successfully!");

    }

    private static void changeStatus() {
        System.out.println("Order ID: ");
        int id = input.nextInt();

        for (Order o: orders){
            if (o.getId() == id){
                System.out.println("Change to: \n1- In Production\n2- Done and Delivered");
                o.setStatus(input.nextInt());
                System.out.println("Order changed to " + o.getStatus());
            }
        }
    }

    private static void placeOrder() {
        System.out.println("Product code: ");
        String code = input.next();
        Product product = null;
        for (Product item : products) {
            if (item.getCode().toLowerCase().equals(code.toLowerCase())) {
                product = item;
                break;
            }
        }
        if (product == null){
            System.out.println("Product not found.");
            return;
        }

        Order order = new Order();
        order.setProduct(product);
        order.setStatus(OrderStatus.InQueue);

        System.out.println("How many orders? ");
        order.setNumOfProduct(input.nextInt());

        System.out.println("How many days from now?");
        order.setDeadline(input.nextInt());

        order.setId(orders.size()+1);
        orders.add(order);
        System.out.println("Order placed successfully!");

    }

}