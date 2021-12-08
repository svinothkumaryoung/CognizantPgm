package com.cognizant.exceptionHandler;

import java.util.Scanner;

public class BasicsExceptionHandler {
    int a;
    int b;
    int c;
    int a1[]=new int[5];
    Scanner s1=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the Value for A");
        a=s1.nextInt();
        System.out.println("Enter the Value for B");
        b=s1.nextInt();
        try
        {
            a1[0]=1320;
            a1[1]=110;
            a1[2]=120;
            a1[3]=130;
            a1[4]=140;
            //a1[5]=150;
            c=a/b;
            System.out.println("The value of c is "+c);
            System.out.println("A1[0]"+a1[0]);
            //System.out.println("A1[5]"+a1[5]);
        }

        finally
        {
         System.out.println("Hi i am Finally Block");
         //finally Block is used to close database connection for finish the task
            // or close io file after finish the task
        }
        System.out.println("Hai How are you");
    }

    public static void main(String[] args) {
        BasicsExceptionHandler beh=new BasicsExceptionHandler();
        beh.getData();
    }
}
