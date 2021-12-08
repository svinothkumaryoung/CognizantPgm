package com.cognizant.collectionsAndFramework;

import java.util.Objects;

//Comparable ->Is an Interface
public class StudentBeanClass implements Comparable<StudentBeanClass>{
    int RegisterNo;
    String Name;
    String emailid;
    public StudentBeanClass()
    {

    }

    public StudentBeanClass(int registerNo, String name, String emailid) {
        RegisterNo = registerNo;
        Name = name;
        this.emailid = emailid;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public int getRegisterNo() {
        return RegisterNo;
    }

    public void setRegisterNo(int registerNo) {
        RegisterNo = registerNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public int compareTo(StudentBeanClass sbc) {
       if(RegisterNo==sbc.RegisterNo)
           return 0;
       else if(RegisterNo>sbc.RegisterNo)
           return 1;
       else
          return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentBeanClass that = (StudentBeanClass) o;
        return RegisterNo == that.RegisterNo && Name.equals(that.Name) && emailid.equals(that.emailid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RegisterNo, Name, emailid);
    }
}
