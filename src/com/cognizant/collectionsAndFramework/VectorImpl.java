package com.cognizant.collectionsAndFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorImpl {
    List<StudentBeanClass> al=new Vector<StudentBeanClass>();
    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    void AddUserData()
    {
        al.add(new StudentBeanClass(300,"Vin","vin@gmail.com"));
        al.add(new StudentBeanClass(201,"Ashok","ashok@yahoo.com"));
        al.add(new StudentBeanClass(702,"Roshan","roshan@gmail.com"));
        al.add(new StudentBeanClass(103,"Selvaarasan","selvaarasan@gmail.com"));
    }
    void removeRecord() throws IOException
    {
        System.out.println("Enter the Index value u want to Delete ");
        int n=Integer.parseInt(bufferedReader.readLine());
        al.remove(n);
    }

    void PrintUserData()
    {
        Collections.sort(al,new EmailComparator());
        for(StudentBeanClass sbc:al)
        {
            System.out.println("Register No is "+sbc.getRegisterNo()+" Name is "+sbc.getName()+" Email "+sbc.getEmailid());
        }
    }
    public static void main(String[] args) throws IOException{
        VectorImpl albi=new VectorImpl();
        albi.AddUserData();
        albi.PrintUserData();
        albi.removeRecord();
        albi.PrintUserData();
    }
}
