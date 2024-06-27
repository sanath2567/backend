package com.product.product;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class Demo {
    @GetMapping("/path")
    public String pra() {
        System.out.println("Hello");
        return "Hello World";
    }

    // @RequestMapping("/paths")
    // public Book getBook() {
    // Book book = new Book(101, "core", "learn");
    // return book;
    // }

}
