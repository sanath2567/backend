package com.product.product;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Component
// @Primary

public class vegpizza implements pizza {
    @Override()
    public String pizza() {
        String veg = "Veg Pizza";
        return veg;
    }
}
