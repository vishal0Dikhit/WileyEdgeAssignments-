package com.string.countoccurance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "World is so big to visit every Place";
		CountOccuranceOfCharacter c = new CountOccuranceOfCharacter(str);
		char ch = 'o';
		int count  = c.countOccurance(ch);
		System.out.println("Number of occurance "+ch+" in string is : "+count);
	}

}
