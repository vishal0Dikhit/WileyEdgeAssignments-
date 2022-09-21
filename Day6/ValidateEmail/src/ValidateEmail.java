import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class ValidateEmail {

	private String email;

	public ValidateEmail(String email) {
		this.email = email;
	}

	public boolean isValid() {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (this.email == null)
			return false;
		return pat.matcher(this.email).matches();
	}

}
