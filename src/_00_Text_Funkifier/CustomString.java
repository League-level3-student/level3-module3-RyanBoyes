package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
		
	}

	@Override
	public String funkifyText(String s) {
		
		
		int length = s.length();
		String newS = "";
		
		for(int i = 0; i<length; i++) {
			char x = s.charAt(i);
			
	
	char Uppered = Character.toUpperCase(x);
		
		newS+=Uppered;
		
		
		
		}
		
		
		
		
		
		
		
	
		
		
	
		return newS;
	
	
	
	}




}
