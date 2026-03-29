package com.gla.Inheritance.Hierarchichal.School;

public class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Staff: " + name + ", Department: " + department);
    }
}