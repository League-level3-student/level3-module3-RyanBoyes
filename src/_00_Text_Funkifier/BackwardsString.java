package _00_Text_Funkifier;
import java.util.Scanner;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		int length = s.length();
		String reverse = "";
		for(int i = length-1; i>=0; i--) {
			reverse = reverse + s.charAt(i);
		}
		
		return reverse;
	}

}
