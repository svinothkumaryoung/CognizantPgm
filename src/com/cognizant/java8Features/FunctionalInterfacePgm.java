package com.cognizant.java8Features;

@FunctionalInterface
interface StudentInfo{
    void getData();

}

public class FunctionalInterfacePgm {
    public static void main(String[] args) {
        StudentInfo si=()->
        {
            System.out.println("Hi welcome to Java 8");
        };
        si.getData();
    }
}
