package com.mycompany.week4_demo1;

public class NewClass {
    int age = 10;
    public static void main(String[] args) {
        Helper h1 = new Helper();
        Helper h2 = new Helper();
        Helper h3 = new Helper();
        h1.age = 5;
        h2.age=15;
        
        System.out.println("The age is " + h1.getAge());
        System.out.println("The age is " + h2.getAge());
        System.out.println("The age is " + h3.getAge());
    }
}

    class Helper{
        public int age;
    
    public int getAge()
    {
        return age;
    }
     
    public static int cube(int side)
    {
        return side*side*side;
    }
}