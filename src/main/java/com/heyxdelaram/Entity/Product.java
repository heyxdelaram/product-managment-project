package com.heyxdelaram.Entity;

import com.heyxdelaram.Enums.TypeOfProduct;

public class Product {
    private String name;
    private String code;
    private double price;
    private String address;
    private TypeOfProduct type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TypeOfProduct getType() {
        return type;
    }

    public void setType(TypeOfProduct type) {
        this.type = type;
    }

    public void setType(int type) {
        switch (type) {
            case 1:
                this.type = TypeOfProduct.Canned;
                break;
            case 2:
                this.type = TypeOfProduct.HomeHygienics;
                break;
            case 3:
                this.type = TypeOfProduct.Dairy;
                break;
            case 4:
                this.type = TypeOfProduct.Snacks;
                break;
            case 5:
                this.type = TypeOfProduct.Protein;
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }
    }
}
