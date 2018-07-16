package com.example.view;

import java.util.Scanner;

/**
 * Created by roder.hu on 2017/8/21.
 */

public class ShopMenu {

    public OrderListener listener;

    public ShopMenu(OrderListener listener) {
        this.listener = listener;
    }

    public void showMenu(){
        System.out.println("/========================================/");
        System.out.println("/== We have 3 different coffee in menu ==/");
        System.out.println("/========================================/");


        MenuItem[] items = MenuItem.values();
        for (int i = 0; i < items.length; i++) {
            System.out.println((i+1)+". "+items[i]);
        }
        System.out.println("Input 1-3 number key to order a coffee...");

        order();
    }

    private void order() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        while (isInvalid(string)){
            scanner = new Scanner(System.in);
            string = scanner.nextLine();
        }

        listener.onOrdered(MenuItem.values()[Integer.valueOf(string) - 1]);
    }

    private boolean isInvalid(String string) {
        if ("1".equals(string) || "2".equals(string) || "3".equals(string)){
            return false;

        }else{
            System.out.println("Input 1-3 number key to order a coffee...");
            return true;
        }
    }

    public enum MenuItem{
        BlackCoffee, Latte, Cappuccino
    }

    public interface OrderListener{
        void onOrdered(MenuItem item);
    }
}
