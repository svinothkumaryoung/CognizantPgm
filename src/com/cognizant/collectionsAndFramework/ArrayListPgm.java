package com.cognizant.collectionsAndFramework;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListPgm {
    String name;
    ArrayList<String> arrayList=new ArrayList<String>();
    InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    void ProcessData() throws IOException {
        System.out.println("Enter the No of Student u want to add");
        int n=Integer.parseInt(bufferedReader.readLine());
        for(int i=0;i<=n;i++) {
            System.out.println("Enter the Name of Student " + (i + 1));
            name = bufferedReader.readLine();
            arrayList.add(name);
        }
    }
    void ViewData() {
        Iterator<String> iterator=arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(" Student Name is "+iterator.next());
        }
    }
    void sortData()
    {
        Collections.sort(arrayList);
    }
    public static void main(String[] args) throws IOException{
        ArrayListPgm alp=new ArrayListPgm();
        alp.ProcessData();
        alp.sortData();
        alp.ViewData();
    }
}
