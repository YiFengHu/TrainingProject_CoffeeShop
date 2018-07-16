package com.example.controller;

import com.example.model.Bean;
import com.example.model.Coffee;
import com.example.model.Source;
import com.example.model.SourcePacket;
import com.example.model.Sugar;
import com.example.model.Water;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roder.hu on 2017/8/21.
 */

public class BlackCoffeeMechine implements CoffeeMechine{

    private List<Source> sources = new ArrayList<Source>();
    private List<Bean> beans = new ArrayList<Bean>();
    private List<Sugar> sugars = new ArrayList<Sugar>();

    @Override
    public Coffee makeCoffee(SourcePacket sourcePacket, Water water) throws IllegalStateException{
        sources = sourcePacket.getSources();

        pending("unpacking sources...");
        for (int i = 0; i < sourcePacket.getSources().size(); i++){
           if (sourcePacket.getSources().get(i) instanceof Bean){
               beans.add(((Bean) sourcePacket.getSources().get(i)));
           }
        }

        System.out.println("SourcePacket contains");
        System.out.println(beans.size()+" g beans, "+sugars.size()+" spoon of sugar");

        pending("pouring water: "+water.getAmount()+" ml");

        Coffee blackCoffee = new Coffee(sources, water);

        System.out.println("BlackCoffee made: \n water: "+water.getAmount()+" ml\n beans: "+beans.size()+" g\n sugars: "+sugars.size()+" spoon");

        return blackCoffee;
    }

    private void pending(String hint) {
        int counter = 5;
        System.out.println("\n");

        while (counter > 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(hint+", please wait for "+(counter--)+" seconds...");

        }

        System.out.println("\n");

    }
}
