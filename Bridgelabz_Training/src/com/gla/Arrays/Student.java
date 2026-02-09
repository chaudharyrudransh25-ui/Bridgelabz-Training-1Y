package com.gla.Arrays;

public class Student {
    int age;
    int roll_no;
    String name;

    public void printInfo()
    {
        System.out.println("name :- "+name);
        System.out.println("age :- "+age);
        System.out.println("roll no. :- "+roll_no);

    }
    public static void main(String[] args) {
        Student s1 = new Student();
        int a1 = s1.age=12;
        int r1 = s1.roll_no=1;
        String name1 =s1.name="Ram";

        Student s2=new Student();
    }
}
