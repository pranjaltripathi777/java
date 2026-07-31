package com.practice;
import java.io.*;
public class FileWriteDemo{
public static void main(String[] args)throws Exception{
FileWriter fw=new FileWriter("output.txt");
fw.write("Hello Java"); fw.close();
}}