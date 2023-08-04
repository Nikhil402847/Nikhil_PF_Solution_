package com.gradedproject2;

import java.util.Scanner;

public class Powerofbase {

public int power(int base, int n) {
	if(n==0) {
		return 1;
	}else {
		return(base*power(base,n-1));
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Powerofbase Powerofbase=new Powerofbase();
	System.out.print("Enter the Base number X:");
	int X=sc.nextInt();
	System.out.print("Enter the Power N =");
	int N=sc.nextInt();
	System.out.println("X power N is:"+Powerofbase.power(X,N));
	sc.close();
}
}
