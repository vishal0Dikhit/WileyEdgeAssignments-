package com.compare.arrayelement;

public class CompareArrayFirstLastElement {
	char charArray[] = new char[50];

	public CompareArrayFirstLastElement(char[] charArray) {
		super();
		this.charArray = charArray;
	}
	
	public boolean compareFirstLastElement()
	{
		if(charArray[0] == charArray[ charArray.length - 1]) {
			return true;
		}
		return false;
	}
}
