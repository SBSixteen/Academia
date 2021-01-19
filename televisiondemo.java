import java.util.Scanner;

public class televisiondemo {
    public static void main(String args[]){
    
        Television TV = new Television();
        TV.createTV();
        int select = 0;
        boolean power;
        String consume, a;
        Scanner input = new Scanner(System.in);
        while(true){
                    System.out.println("Do you want to turn on the power?");
                    a= input.nextLine();
                    if(a.equals("N")) continue;
                    if(a.equals("Y")) {System.out.println("TV has been turned on!"); power = TV.power(); break;}
                    else {System.out.println("You can only reply in Y or N"); continue;}
        }
        while(true){
       
        System.out.println("");
        System.out.println("You are now using the TV Remote. What do you want to do?");
        System.out.println("1. Show info");
        System.out.println("2. Increase Channel");
        System.out.println("3. Decrease Channel");
        System.out.println("4. Increase Volume");
        System.out.println("5. Decrease Volume");
        System.out.println("6. Press Power Button");
         
        select  = input.nextInt();
        consume = input.nextLine();
               
            if(select > 1 && power == false){
            	if(select<6) 
            	{System.out.println("TV cannot function if powered off.");}
            	}      
            
            if(select == 1 && power != false){
            System.out.println("Channel: " + TV.getchannel());
            System.out.println("Volume: " + TV.getvolume());     
            System.out.println(TV.getManufacturer());
            System.out.println(consume);}
                     

                     if(select == 1 && power == false){
            System.out.println("Power is on?: " + power);    
            System.out.println(TV.getManufacturer());
            System.out.println(consume);}
                    
                    if(select == 2 && power != false){TV.increaseChannel();}
                    if(select == 3 && power != false){TV.decreaseChannel();}
                    if(select == 4 && power != false){TV.increasevolume();}
                    if(select == 5 && power != false){TV.decreasevolume();}
                    
                    if(select == 6)                  {    power = TV.power(); 
                                                       if(power == true) 
                                                    	    System.out.println("TV has been turned on!");
                                                       else System.out.println("TV has been turned off"); }
                                              
        }

    }
    
}

