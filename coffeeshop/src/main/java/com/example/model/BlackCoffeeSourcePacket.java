package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roder.hu on 2017/8/21.
 */

public class BlackCoffeeSourcePacket implements SourcePacket{

    private int beaconAmount = 0;

    public BlackCoffeeSourcePacket(int beaconAmount){
        this.beaconAmount = beaconAmount;
    }

    @Override
    public List<Source> getSources() {
        List<Source> sources = new ArrayList<>();

        for (int i = 0; i < beaconAmount; i++) {
            sources.add(new Bean());
        }
        return sources;
    }
}
