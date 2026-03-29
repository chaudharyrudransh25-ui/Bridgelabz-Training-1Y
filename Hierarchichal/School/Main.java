package com.gla.Inheritance.Hierarchichal.School;

public class Main {
    public static void main(String[] args) {

        Teacher t = new Teacher("Rudransh", 30, "Mathematics");
        Student s = new Student("Rishabh", 20, "A");
        Staff st = new Staff("Akash", 35, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}