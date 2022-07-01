package com.company.food;

import com.company.isSellable;

public class Dogfood implements isSellable {
    public String description() {
        return "Butternut box";
    }

    public double unitPrice() {
        return 49.95;
    }
}
