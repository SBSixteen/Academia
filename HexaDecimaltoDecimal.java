import java.util.Scanner;

public class HexaDecimaltoDecimal {
	
static void convert(String a){
		
	String hex = "0123456789ABCDEF"; 
	a = a.toUpperCase();
	
	long ans = 0;
	for (int i = 0; i < a.length(); i++) {
		
        char c = a.charAt(i);  
        int d = hex.indexOf(c);  
        System.out.println(" Working Step#" + (i+1) + " = " + "(16 x " + ans + ") + " + d + " = " + (16*ans + d)); 
        System.out.println("");
        ans = 16*ans + d;  		
	}
	
	System.out.println("ANSWER : " + ans);
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("Enter String :");
			String a = (input.nextLine());
			System.out.println("//////////////////////////////// START OF WORKING for " + a + "///////////////////////////////////////////////");
		    convert(a);
			System.out.println("//////////////////////////////// END OF WORKING for " + a + "/////////////////////////////////////////////////");
		}			
		
	}

}
