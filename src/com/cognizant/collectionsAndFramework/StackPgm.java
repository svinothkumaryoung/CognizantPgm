package com.cognizant.collectionsAndFramework;

import java.util.Iterator;
import java.util.Stack;

public class StackPgm {
    Stack<String> stack=new Stack<String>();
    void addVal()
    {
        stack.push("Vino");
        stack.push("Ashok");
        stack.push("Roshan");
        stack.push("Niranjan");
    }
    void RemoveRecords()
    {
       String n= stack.pop();
       System.out.println("Element is removed is "+n);
    }
    void topElement()
    {
        String n=stack.peek();
        System.out.println("Element in top is "+n);
    }
    void reteriveValue()
    {
        //Iterator<String> iterator=stack.iterator();
        for(String n:stack)
        {
            System.out.print(n);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        StackPgm sp=new StackPgm();
        sp.addVal();
        sp.RemoveRecords();
        sp.topElement();
        sp.reteriveValue();
    }
}
