package com.cognizant.java8Features;

import java.util.function.Predicate;

public class PredicatePgm {


    public static void main(String[] args) {
        Predicate<Integer> predicate1=(i)->( 20 >=i);

        boolean y=predicate1.test(20);
        System.out.println(y);
    }
}
