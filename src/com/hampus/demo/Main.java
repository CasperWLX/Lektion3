package com.hampus.demo;

import com.hampus.demo.models.Student;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //Lista för objekt
        ArrayList<Student> studentList = new ArrayList<>();

        //Skapar 5 objekt med namn och ålder
        int randomNumber;
        for (int i = 0; i < 5; i++)
        {
            String studentName = "person" + i;
            randomNumber = randomAge();
            Student newStudent = new Student(randomNumber,studentName);
            studentList.add(newStudent);
        }
        for (Student student : studentList)
        {
            System.out.println(student);
        }

        for (int i = 0; i < 5 ; i++){
            System.out.println(studentList.get(i).doubleMyAge(studentList.get(i).age));
        }

        //Printar student nummer 2 dubbla ålder
        System.out.println(studentList.get(2).doubleMyAge(studentList.get(2).age));

        Student benny = new Student(20,"Benny");
        System.out.println(benny);

        boolean gameIsRunning = true;
        int counter = 0;
    }
    public static int randomAge()
    {
        return (int) (Math.random() * 20 + 18);
    }
}
