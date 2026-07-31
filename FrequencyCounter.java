package com.practice;
import java.util.*;
public class FrequencyCounter{
public static void main(String[] args){
String s="banana";
HashMap<Character,Integer> m=new HashMap<>();
for(char c:s.toCharArray())m.put(c,m.getOrDefault(c,0)+1);
System.out.println(m);
}}