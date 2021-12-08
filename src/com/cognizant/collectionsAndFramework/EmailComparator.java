package com.cognizant.collectionsAndFramework;

import java.util.Comparator;

public class EmailComparator implements Comparator<StudentBeanClass> {
    @Override
    public int compare(StudentBeanClass o1, StudentBeanClass o2) {
        return o1.emailid.compareTo(o2.emailid);
    }
}
