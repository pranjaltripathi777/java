package com.practice;
import java.util.*;
class Student{
int id;String name;
Student(int id,String name){this.id=id;this.name=name;}
public String toString(){return id+" - "+name;}
}
public class StudentManagement{
public static void main(String[] args){
ArrayList<Student> list=new ArrayList<>();
list.add(new Student(1,"Aman"));
list.add(new Student(2,"Riya"));
list.forEach(System.out::println);
}}