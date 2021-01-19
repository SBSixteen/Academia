
/**
 *
 * @author 19660
 */
import java.util.Scanner;

public class Tickets {
 public static void main(String args[]) {
     
	 Scanner input = new Scanner(System.in);
	 Aircraft One = new Aircraft();
	 
	 One.createAircraft();
	 One.firstseat();
	 One.businessseat();
	 One.createsummary();
	 
	 while(true) {
	 System.out.println("Do you want to book a ticket for this flight? Y/N?");
     String a = input.nextLine();
	 if(a.equals("Y")|| a.equals("y")) { 
		 One.createticket();
		 One.showseats();
		 One.bookseat();
		 One.printticket();
		 break;}
	 
	 else break;        
	             }
	 
	 
	 }
}