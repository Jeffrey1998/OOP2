package com.company.food;

import com.company.isSellable;

public class Catfood implements isSellable {
    public String description() {
        return "Felix catfood";
    }

    public double unitPrice() {
        return 19.95;
    }
}
