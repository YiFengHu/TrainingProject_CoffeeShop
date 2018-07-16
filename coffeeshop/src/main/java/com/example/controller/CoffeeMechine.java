package com.example.controller;

import com.example.model.Coffee;
import com.example.model.SourcePacket;
import com.example.model.Water;

/**
 * Created by roder.hu on 2017/8/21.
 */

public interface CoffeeMechine {

    Coffee makeCoffee(SourcePacket sourcePacket, Water water) throws IllegalStateException;
}
