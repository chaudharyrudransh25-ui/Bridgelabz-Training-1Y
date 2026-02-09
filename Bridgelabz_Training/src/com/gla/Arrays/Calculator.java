package com.gla.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public int add(int num1, int num2)
    {
        return num1+num2;
    }

    public int sub(int num1, int num2)
    {
        return num1-num2;
    }
    public int mult(int num1, int num2)
    {
        return num1*num2;
    }
    public int div(int num1, int num2)
    {
        return num2/num1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        Calculator c1 = new Calculator();
        int addition = c1.add(a,b);
        System.out.println("Addition of two numbers : " +a+b);

        Calculator c2 = new Calculator();
        int subtraction = c2.sub(a,b);
        System.out.println("Subtraction of two numbers : "  );

        Calculator c3 = new Calculator();
        int multiplication = c3.mult(a,b);
        System.out.println("Multiplication of two numbers : "+a*b );

        Calculator c4 = new Calculator();
        int division = c4.div(a,b);
        System.out.println("Division of two numbers : "+ b/a);
    }
}
