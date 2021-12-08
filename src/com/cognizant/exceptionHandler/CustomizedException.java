package com.cognizant.exceptionHandler;

import java.util.Scanner;

class validateQuans extends Exception
{
    validateQuans(String msgs)
    {
        super(msgs);
    }
}


public class CustomizedException {
    String ProductName;
    int Quantity;
    Scanner S1=new Scanner(System.in);
    void AddProduct()
    {
        System.out.println("Enter the Product Name ");
        ProductName=S1.next();
        System.out.println("Enter the  Quantity ");
        Quantity=S1.nextInt();
        try {
            this .vaildateProductQuantity(Quantity);
        } catch (validateQuans e) {
           System.out.println(e);
        }
    }
    void vaildateProductQuantity(int Quantity) throws validateQuans
    {

        if(Quantity>=5)
        {
            throw new validateQuans("Per user only one or less than 5 is allowed ");
        }
    }

    public static void main(String[] args) {
        CustomizedException ce=new CustomizedException();
                ce.AddProduct();
    }
}
