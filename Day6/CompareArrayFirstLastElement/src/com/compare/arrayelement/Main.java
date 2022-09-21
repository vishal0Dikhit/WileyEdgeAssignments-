package com.compare.arrayelement;

public class Main {

	public static void main(String[] args) {
		char charArray[] = new char[] {'a','d','e','g','v','w','a'};
		CompareArrayFirstLastElement c = new CompareArrayFirstLastElement(charArray);
		boolean flag = c.compareFirstLastElement();
		if(flag)
		{
			System.out.println("Array have first and last element equal is : "+charArray[0]);
		}
		else
		{
			System.out.println("Array do not have first and last element equal");
		}
	}

}
