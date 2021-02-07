package com.aula03ex;

public class Aula03ex {
    public static void main(String[] args) {
        Supermercado s1 = new Supermercado();
        s1.product = "Pizza";
        s1.price = 10;
        s1.valueReceived = 50;

        s1.cart();
        s1.money();
    }
}
