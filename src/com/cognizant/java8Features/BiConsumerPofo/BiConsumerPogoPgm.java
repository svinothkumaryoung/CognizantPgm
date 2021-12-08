package com.cognizant.java8Features.BiConsumerPofo;

import com.cognizant.java8Features.DataAccessLayer.DataLayer;
import com.cognizant.java8Features.modelClass.StudentInfo;

import javax.xml.crypto.Data;
import java.util.function.BiConsumer;

public class BiConsumerPogoPgm {

    static  BiConsumer<String,Integer> bic=(n,a)->{
        System.out.println("Name is "+n+" Age "+a);
    };

    public static void main(String[] args) {
        StudentInfo si=DataLayer.getStudent();
        bic.accept(si.getName(),si.getAge());

    }
}
