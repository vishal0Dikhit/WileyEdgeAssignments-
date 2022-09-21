
public class DepositeAmountException extends Exception {
	String str;
	public DepositeAmountException (String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return str;
	}
}
