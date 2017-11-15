package com.example.ist.mylibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ist on 14/11/17.
 */

public class ItemProvider {

    public static List<Item> parse() {
        List<Item> list = new ArrayList<>();
        Random r = new Random();
        // random number of item but at least 5
        Integer number = r.nextInt(10) + 5;
        for (int i = 0; i < number; i++) {
            // create sample data
            String s = String.valueOf(r.nextInt(1000));
            Item item = new Item("Summary " + s, "Description " + s);
            list.add(item);
        }
        return list;
    }

}
