
public class Main {

	public static void main(String[] args) {
		ValidateEmail v = new ValidateEmail("wiley@g@.com");
		if (v.isValid()) {
			System.out.println("Your email in is valid");
		} else {
			System.out.println("Your email in is Invalid");
		}
	}

}
