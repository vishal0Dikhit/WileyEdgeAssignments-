
public class Main {

	public static void main(String[] args) {
		StringAnagramOrNot s = new StringAnagramOrNot("race", "ecar");
		if (s.areAnagram()) {
			System.out.println("The two strings are anagram of each other");
		} else {
			System.out.println("The two strings are not anagram of each other");
		}
	}

}
