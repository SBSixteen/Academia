
/**
 *
 * @author 19660
 */

import java.util.Scanner;

public class Aircraft {
     
	public  String     consume;
	private String     name, route;
	private int        capacity, division, business, first,seatnum;
	private String[][] seats;
	
	 private String UID, FID, pname;
	 private double ecost = 299.0, bcost= 399.0, fcost = 499.0;
	 
	Scanner input = new Scanner(System.in);
	
	public void createAircraft() {
		System.out.println("Welcome to Aircraft Maker!");
		System.out.println("Please name your aircraft!");
		String a = input.nextLine();
		name = a;
		
		System.out.println(" ");
		System.out.println("Set route of your aircraft! (Departure > Arrival)");
		String b = input.nextLine();
		route = b;
		FID =Character.toString((char)(Math.random()*24 + 65)) + "-" + Integer.toString((int)(Math.random()*100));
		
                System.out.println(" ");
		System.out.println("What is the capacity of your aircraft?");
		int c = input.nextInt();
		capacity = c;
		
		System.out.println(" ");
		System.out.println("What is the maximum seats you want to assign to a row? [E.g if '5' then seats are labelled A1,A2,....,A5]");
		int d = input.nextInt();
		division = d;
		
		seats = new String[2][capacity]; 
		System.out.println(" ");
		
        for(int j=1,k=0,i = 0; k<capacity ;k++,j++) { //[][] == [rows][columns]
          
        	char sort = (char)('A'+i); //sort = 'A'           
            seats[0][k] =(Character.toString(sort) + Integer.toString(j));
            
            int random = (int)(Math.random()*2);
            
            if(random==0)   seats[1][k] = "V";
            else            seats[1][k] = "T";
            
            if(division == j) {j=0; i++;}
            
            
        }
		
	}
    public void firstseat() {
		
    	while(true)
    	{System.out.println(" ");
		System.out.println("How many First Class seats would you like?");
		int c = input.nextInt();	
		 if(c<= capacity || c<0 ) { 
			 first = c; 
			 System.out.println(c + " First Class seats have been assigned to " + name);
			 
			 for(int i =0;i<first;i++) 
				 {seats[0][i] = seats[0][i] + "-FC";}
			 
				 break;}
							 			
		 else
		  {System.out.println("Number is invalid. Please check for capacity of plane.");
			 continue;}}	 
   }   	
    public void businessseat() {
		
    	while(true)
    	{System.out.println(" ");
		System.out.println("How many Business Class seats would you like?");
		int c = input.nextInt();
		consume = input.nextLine();
		 if(c+first<= capacity || c<0 ) { 
			 business = c; 
			 System.out.println(c + " Business Class seats have been assigned to " + name);
			 
			 for(int i =first;i<business + first;i++) 
				 {seats[0][i] = seats[0][i] + "-BC";}
				 
				 break;}
					 			 			
		 else
		 { System.out.println("Number is invalid. Please check for capacity of plane.");
			 continue;	 }
    }
    	
    }
    public void showseats() {
    	System.out.println(" ");
    	System.out.println("Seats with the tag FC are First Class seats. Seats with the tag BC are business class seats. Rest are economy class ");
    	System.out.println(" ");
    	for(int i = 0; i < capacity;i++) {
    		if(seats[1][i].equals("V"))
    		System.out.println((i+1) + ". Seat# " + seats[0][i] + " is vacant.");
    		else
    	    System.out.println((i+1) +". Seat# " + seats[0][i] + " is taken.");	   		
    		}
    }
    public void createsummary() {
    	System.out.println(" ");
    	System.out.println("Aircraft Name: " + name);
    	System.out.println("Aircraft Capacity: " + first + " First Class Seats. " + business + " Business Class seats. " +(capacity-business-first) + " Economy Class Seats." +" For a total of " + capacity + " seats." );
    	System.out.println("Route: " + route);
    	System.out.println("Speed of Aircraft: " +(double)((Math.random()*190)+740) + " km/h"); // 740-930Km/h Source: Google
    }  
    public String getSeat(int a) {
    	return seats[0][a];
    }
    public String getroute() {
    	return route;
    }
    public void createticket() {
	 	UID =Character.toString((char)(Math.random()*24 + 65)) + Integer.toString((int)(Math.random()*10000000));
	      System.out.println("What is your name?");
	      pname = input.nextLine();
	 
	     System.out.println("Are you a senior citizen (aged over 65) or a junior (aged under 10)? Y/N");
	     String a = input.nextLine();
	     if(a.equals("Y")) {
		  ecost = ecost*0.75;
		   bcost = bcost*0.75;
		    fcost = fcost*0.75;}
		    
		    System.out.println(" ");
		    System.out.println("Choose a seat for your flight!");

 
}
	public void bookseat() {
		System.out.println("Please type number of your seat. (Do not type the Label 'A1' etc.)");
            
            while(true){
               
                seatnum = input.nextInt();
               
                if(seatnum>0){
                consume = input.nextLine();
                 if( seats[1][seatnum-1].equals("V"))
                 {seats[1][seatnum-1] = "T";
            System.out.println("Succesfully booked seat " + seats[0][seatnum-1]); break;}
	
               else {System.out.println("Seat " + seats[0][seatnum-1] +" is already taken. Choose again!");}}
                
                else{System.out.println("Please pick a valid number"); continue;}
            }
        }
    public void printticket() {
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	System.out.println("TICKET HAS BEEN MADE");
    	System.out.println("UID: " + UID);
        System.out.println("FID: " + FID);
    	System.out.println("Name: " +pname );
    	System.out.println("Route: " + route);
    	System.out.println("Seat: " + getSeat(seatnum));
    	if(seatnum < first + 1) {System.out.println("Ticket: First Class"); System.out.println("Cost: " +fcost + "$");}
    	
    	if(seatnum >first && seatnum <=business) {System.out.println("Ticket: Business Class"); System.out.println("Cost: " +bcost + "$");}
    	
    	if(seatnum> business) {System.out.println("Ticket : Economy Class"); System.out.println("Cost: " + ecost +"$");}
    	
    	}
    	
    }
	
    

