import java.util.*;

public class StringAnagramOrNot {
	private String str1;
	private String str2;

	public StringAnagramOrNot(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}

	public boolean areAnagram() {
		char []char1 = str1.toCharArray();
		char []char2 = str2.toCharArray();
		int n1 = char1.length;
		int n2 = char2.length;

		if (n1 != n2) {
			return false;
		}
		Arrays.sort(char1);
		Arrays.sort(char2);

		for (int i = 0; i < n1; i++) {
			if (char1[i] != char2[i]) {
				return false;
			}
		}
		return true;
	}
}
