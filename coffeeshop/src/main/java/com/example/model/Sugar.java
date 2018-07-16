package com.example.model;

/**
 * Created by roder.hu on 2017/8/21.
 */

public class Sugar implements Source{
    @Override
    public Type getType() {
        return Type.Sugar;
    }
}
