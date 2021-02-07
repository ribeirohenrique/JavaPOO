package com.aula03ex;

public class Supermercado {
    public String product;
    public int price;
    private int valueToGive;
    protected int valueReceived;

    public void cart(){
        System.out.println("The product is: " + this.product);
        System.out.println("The price is: " + this.price);
    }

    public void money(){
        this.valueToGive = this.valueReceived - this.price;
        System.out.println("The money back is: " + this.valueToGive);
    }

}
