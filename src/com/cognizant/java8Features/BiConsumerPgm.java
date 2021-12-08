package com.cognizant.java8Features;

import java.util.function.BiConsumer;

public class BiConsumerPgm {
    public static void main(String[] args) {
        BiConsumer<String,String> bc=(n,m)->
        {
            System.out.println(n+m);
        };
        BiConsumer<String,String> bc1=(n,m)->
        {
            System.out.println(n+m);
        };
        bc.andThen(bc1).accept("Cognizant"," Employee");
    }
}
