import java.util.Scanner;

public class DecimaltoOctal {

	static void convert(long a){
		
		Double A = new Double(a);
		double len = Math.log(A)/Math.log(8.0);
		
		 long[] bin = new long[(int)len + 2];
		
		int i = 0;
		while(a>0) {
			System.out.println("Working Step#" + (i+1) + ".1 = " + a + " Mod 8 = " + a%8);
			System.out.println("Working Step#" + (i+1) + ".2 = " + a + " divided by 8 = " + a/8);
			System.out.println();
			bin[i++] = a%8;
			a = a/8;
		}

		System.out.print("Answer = ");
		
		for (int j = bin.length-1 ; j >-1; j--) {
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
