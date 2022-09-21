package com.revrsestring;

public class ReverseString {
	String str;

	public ReverseString(String str) {
		this.str = str;
	}
	
	public String reverse()
	{
		String reverse = "";
		for(int i = str.length()-1; i >= 0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
}
