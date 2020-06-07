package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		
	int length = s.length();
	String newS = "";
	
	for(int i = 0; i<length; i++) {
		char x = s.charAt(i);
		if(i%2==1) {
		
		char Uppered = Character.toUpperCase(x);
		
			System.out.println(Uppered);
			
			s = s.replace(x, Character.toUpperCase(x));
			newS+=Uppered;
				
		}
		if(i%2==0) {
			
		
		char Lowered = Character.toLowerCase(x);
			
			System.out.println(Lowered);
			
			s = s.replace(x, Character.toLowerCase(x));
			newS+=Lowered;
		}
	}
		
		return newS;
		
		
	}

}
