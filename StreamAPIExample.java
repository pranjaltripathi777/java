package com.practice;
import java.util.*;
public class StreamAPIExample{
public static void main(String[] args){
List<Integer> list=Arrays.asList(5,2,8,1,9);
list.stream().filter(x->x>4).sorted().forEach(System.out::println);
}}