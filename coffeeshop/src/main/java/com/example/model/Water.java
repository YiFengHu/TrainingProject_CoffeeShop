package com.example.model;

/**
 * Created by roder.hu on 2017/8/21.
 */

public class Water implements Liquid{

    protected int amount;

    public Water(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }
}
