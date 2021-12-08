package com.cognizant.java8Features.StreamsPgm;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamingPgm {
    static Predicate<StudentInfo> si1=(studentInfo)-> studentInfo.getAge()>8;
    static Predicate<StudentInfo> si2=(studentInfo)->studentInfo.getName().equals("Vinothkumar");

    public static void main(String[] args) {
        List<StudentInfo> si=DataLayer.getStudentDetails()
                .stream()
                .filter(si1)
                .filter(si2)
                .collect(Collectors.toList());
        System.out.println("Out put is "+si);
    }


}
