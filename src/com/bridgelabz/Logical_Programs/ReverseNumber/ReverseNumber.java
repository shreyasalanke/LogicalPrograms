package com.bridgelabz.Logical_Programs.ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
	
	
	public static void main(String[] arg)
	{
	int a,revers=0,num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	num=sc.nextInt();
	while(num!=0)
	{
	a=num%10;
	revers=(revers*10)+a;
	num=num/10;
	}
	System.out.println("reverse of a number is "+revers);
	}
	}


