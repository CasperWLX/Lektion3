package com.hampus.demo.models;

public class Student
{
    public int age;
    public String name;
    public Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public int doubleMyAge(int age)
    {
        return age * 2;
    }

    @Override
    public String toString()
    {
        return "Student " + name + " is " + age + " years old";
    }
}
