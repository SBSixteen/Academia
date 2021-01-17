
public class OctaltoDecimal {

	static long convert(long a){
			
		long ans = 0;
		int n = 0;
		
		   while(true){    
			      if(a == 0){    
			        break;    
			      } else {    
			          long temp = a%10;  
			          System.out.println(" Working Step#" + (n+1) + ".0 = "  + a + " Mod 10  = " + temp);
			          System.out.println(" Working Step#" + (n+1) + ".1 = ("  + temp + " x 8^" + n + ") = " + temp*Math.pow(8, n));
			          System.out.println(" Working Step#" + (n+1) + ".2 = Add this to sum = " + temp*Math.pow(8, n) + " + " + ans);
			          ans += temp*Math.pow(8, n); 
			          System.out.println(" Working Step#" + (n+1) + ".3 = " + a + " / 10 = " +  ans/10);
			          a = a/10;    
			          System.out.println("");
			          
			          n++;    
			       } 
	}
		   
		   System.out.println(" Answer : " + ans);
		   return ans;
	}
	
	public static void main(String[] args) {
		convert(17356);
	}
	
}
