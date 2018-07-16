package com.example;

import com.example.controller.BlackCoffeeMechine;
import com.example.model.BlackCoffeeSourcePacket;
import com.example.model.Coffee;
import com.example.model.Water;
import com.example.view.ShopMenu;

import java.util.Observable;
import java.util.Scanner;

public class MyCoffeeShop {


    private static BlackCoffeeMechine blackCoffeeMechine;
    private static ShopMenu shopMenu;

    public static void main(String args[]){
        showWelcomeWords();

        initCoffeeMechine();

        showMenu();
    }

    private static void initCoffeeMechine() {
        blackCoffeeMechine = new BlackCoffeeMechine();
    }

    private static void showMenu() {
        shopMenu = new ShopMenu(new ShopMenu.OrderListener(){

            @Override
            public void onOrdered(ShopMenu.MenuItem item) {
                switch (item) {
                    case BlackCoffee:
                        System.out.println("\n"+item+" coffee ordered, making coffee...");

                        Coffee blackCoffee = blackCoffeeMechine.makeCoffee(
                                new BlackCoffeeSourcePacket(10),
                                new Water(200));
                        System.out.println("\nCoffee delivered...");
                        break;

                    default:
                        System.out.println("Not provide for now, sorry...");
                        shopMenu.showMenu();

                }
            }
        });

        shopMenu.showMenu();
    }

    private static void showWelcomeWords() {
        System.out.println("/======================================/");
        System.out.println("/=== Welcome to Roder's Coffee Shop! ===/");
        System.out.println("/======================================/");
        System.out.println("\n\n");

        System.out.println("please input \"Enter\" key to show menu...");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
