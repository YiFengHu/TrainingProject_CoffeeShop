package com.example.model;

/**
 * Created by roder.hu on 2017/8/21.
 */

public interface Source {

    Type getType();

    enum Type{
        Bean, Milk, Sugar
    }
}
