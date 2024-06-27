package com.product.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Main {
    @Autowired
    pizza pizza;

    public Main(pizza pizza) {
        this.pizza = pizza;
    }

    void main() {
        String demo = pizza.pizza();
        System.out.println(demo);
        System.out.println("demo");
    }
}
