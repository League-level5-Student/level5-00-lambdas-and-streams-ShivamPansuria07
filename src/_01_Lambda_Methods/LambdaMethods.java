package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
		//DONE
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			for(int i = s.length()-1; i >= 0; i--) {
				System.out.println(s.charAt(i));
			}
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			for(int i = 0; i <s.length(); i++) {
				if(i%2==0) {
					System.out.println(Character.toUpperCase(s.charAt(i)));
				}else {
					System.out.println(s.charAt(i));
				}
				
			}
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			for(int i = 0; i <s.length(); i++) {
				
					//System.out.println(Character.toUpperCase(s.charAt(i)));
			
					System.out.println(s.charAt(i)+".");
				}
				
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			for(int i = 0; i <s.length(); i++) {
				switch(s.charAt(i)) {
				case 'a': 		break;
				case 'e': 		break;
				case 'i': 		break;
				case 'o': 		break;
				case 'u': 		break;
				default: System.out.println(s.charAt(i));		break;
				}
//				if(s.charAt(i)) {
//					System.out.println(Character.toUpperCase(s.charAt(i)));
//				}else {
//					System.out.println(s.charAt(i));
//				}
				
			}
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
