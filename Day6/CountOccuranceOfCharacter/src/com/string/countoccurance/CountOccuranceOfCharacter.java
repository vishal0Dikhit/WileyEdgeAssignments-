package com.string.countoccurance;

public class CountOccuranceOfCharacter {
	String str;

	public CountOccuranceOfCharacter(String str) {
		super();
		this.str = str;
	}
	
	public int countOccurance(char ch)
	{
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(ch == str.charAt(i))
			{
				count++;
			}
		}
		return count;
	}
}
