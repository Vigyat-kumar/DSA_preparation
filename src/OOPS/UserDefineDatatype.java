package OOPS;

import java.util.Scanner;

public class UserDefineDatatype {
    public static class Student{
        String name;
        int rno;
        double cgpa;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();
        s1.name="Vigyat";
        s1.rno=46;
        s1.cgpa=6.4;

        Student s2=new Student();
        s2.name="Saumya";
        s2.rno=46;
        s2.cgpa=7.9;
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
