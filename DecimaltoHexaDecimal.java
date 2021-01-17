import java.util.Scanner;

public class DecimaltoHexaDecimal {

static void convert(int a){
		
		Double A = new Double(a);
		double len = Math.log(A)/Math.log(16.0);
		
		 char[] bin = new char[(int)len + 2];
		char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F',};
		
		int i = 0;
		while(a>0) {
			System.out.println("Working Step#" + (i+1) + ".1a = " + a + " Mod 16 = " + a%16);
			if(a%16>9)
			{System.out.println("Working Step#" + (i+1) + ".1b = Character for " + a%16 + " = " + hex[a%16]);}			
			System.out.println("Working Step#" + (i+1) + ".2 = " + a + " divided by 16 = " + a/16);
			
			System.out.println();
			bin[i++] = hex[a%16];
			a = a/16;
		}

		System.out.print("Answer = ");
		
		for (int j = bin.length-1; j >-1; j--) {
			System.out.print(bin[j]);
		}
        
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("Enter Number: ");
			int a = Integer.parseInt(input.nextLine());
			System.out.println("//////////////////////////////// START OF WORKING for " + a + "///////////////////////////////////////////////");
		    convert(a);
			System.out.println("//////////////////////////////// END OF WORKING for " + a + "/////////////////////////////////////////////////");
		}			
		
	}
	
}
