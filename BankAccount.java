package com.practice;
class Account{
private double balance=1000;
void deposit(double a){balance+=a;}
void withdraw(double a){if(balance>=a) balance-=a;}
double getBalance(){return balance;}
}
public class BankAccount{
public static void main(String[] args){
Account a=new Account();
a.deposit(500);
a.withdraw(300);
System.out.println(a.getBalance());
}}