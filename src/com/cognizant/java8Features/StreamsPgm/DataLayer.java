package com.cognizant.java8Features.StreamsPgm;

import java.util.Arrays;
import java.util.List;

public class DataLayer {
    static List<StudentInfo> studentInfos;
static List<StudentInfo> getStudentDetails()
{
    StudentInfo s1=new StudentInfo( 120, "Vinothkumar", "vinchi.frnds@gmail.com", 30);
    StudentInfo s2=new StudentInfo( 121, "Ashokkumar", "ashokkumar@gmail.com", 28);
    StudentInfo s3=new StudentInfo( 122, "Roshan", "roshan@gmail.com", 8);

    studentInfos= Arrays.asList(s1,s2,s3);
    return studentInfos;
}


}
