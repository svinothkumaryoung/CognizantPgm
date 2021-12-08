package com.cognizant.collectionsAndFramework;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentBeanClass> {
    @Override
    public int compare(StudentBeanClass o1, StudentBeanClass o2) {
      return o1.Name.compareTo(o2.Name);
    }
}
