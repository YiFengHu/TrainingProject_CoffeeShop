package com.example.model;

import java.util.List;

/**
 * Created by roder.hu on 2017/8/21.
 */

public class Coffee{

    private List<Source> sources;
    private Water water;

    public Coffee(List<Source> source, Water water) {
        sources = source;
        this.water = water;
    }

    public List<Source> getSources() {
        return sources;
    }
}
