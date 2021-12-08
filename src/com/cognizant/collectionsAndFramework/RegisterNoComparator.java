package com.cognizant.collectionsAndFramework;

import java.util.Comparator;

public class RegisterNoComparator implements Comparator<StudentBeanClass> {
    @Override
    public int compare(StudentBeanClass o1, StudentBeanClass o2) {
        if(o1.RegisterNo==o2.RegisterNo)
            return 0;
        else if(o1.RegisterNo>o2.RegisterNo)
            return 1;
        else
            return -1;
    }
    }

