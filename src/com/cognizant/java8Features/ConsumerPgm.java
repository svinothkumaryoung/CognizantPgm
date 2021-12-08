package com.cognizant.java8Features;

import java.util.function.Consumer;

public class ConsumerPgm {
    public static void main(String[] args) {
        Consumer<String> consumer1=(t)->{
            System.out.println(t);
        };
        Consumer<String> consumer2=(t)->
        {
            System.out.println(t);
        };
        consumer1.andThen(consumer2).accept("Hai Welcome to java8");
    }
}
