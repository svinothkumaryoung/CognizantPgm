package com.cognizant.java8Features.modelClass;

public class StudentInfo {
    private int RegisterNo;
    private String name;
    private String emailid;
    private int age;


    @Override
    public String toString() {
        return "StudentInfo{" +
                "RegisterNo=" + RegisterNo +
                ", name='" + name + '\'' +
                ", emailid='" + emailid + '\'' +
                ", age=" + age +
                '}';
    }

    public StudentInfo()
    {

    }
    public StudentInfo(int registerNo, String name, String emailid, int age) {
        RegisterNo = registerNo;
        this.name = name;
        this.emailid = emailid;
        this.age = age;
    }

    public int getRegisterNo() {
        return RegisterNo;
    }

    public void setRegisterNo(int registerNo) {
        RegisterNo = registerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
