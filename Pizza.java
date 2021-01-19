
/**
 *
 * @author 19660
 */
import java.util.Scanner;

public class Pizza {
   
   private     int choice;
   private  String Bread, Flavor, Crust, Side, consume,answer ; // 
           Scanner input = new Scanner(System.in);   
private String[] repliesone = {"I am forcing you to order the pizza. (Press Y)", "You don't get to say anything except yes!", "Sorry but once run, it is mandatory to order pizza", "I have a String array of custom replies, they are finite but all demand a Yes from you!", "Submit to the computer Human. ORDER THE PIZZA! SAY YES!", "Unless you want another Terminator Movie with you as the lead role, I suggest you order the pizza", "There is a red cross at the top right. Click that or order the pizza."};
private String[]      bread = {"9- Grain Wheat", "Parmesan-Oregano", "Traditional Italian", "Honey Oat", "Cheesy", "Sourdough"};
private String[]      crust = {"Thin Crust", "Thick Crust", "Thicc Crust"};
private String[]     flavor = {"Beef", "Chicken", "Pepperoni", "Barbecue", "Mushroom", "Vegan", "Margherita"};
           public void createPizza(){
System.out.println("Welcome to Pizza Parlor!!!");

       
while (true){
    System.out.println("Would you like to order a pizza?");
    answer = input.nextLine();
    if(answer.equals("Y")|| answer.equals("y") || answer.equals("Yes") || answer.equals("yes") || answer.equals("Ya")) {System.out.println("Alright, let's go!"); break; }
    else{System.out.println(repliesone[(int)(Math.random()* repliesone.length)]);}   
}

System.out.println(" ");
System.out.println(" ");

while(true){
System.out.println("Pick a bread.(Choose a number)");
for(int i = 0; i<bread.length;i++){
  System.out.println((i+1)+ ". " + bread[i]); 
}
choice  =  input.nextInt();
consume = input.nextLine();
if(choice<1|| choice>bread.length){System.out.println("I don't think you chose the correct number, try again!"); continue;}
else {Bread   = bread[choice-1];
      System.out.println("We are preparing your pizza using " + Bread); break;}

}

while(true){
System.out.println("Pick a flavor.(Choose a number)");
for(int i = 0; i<flavor.length;i++){
  System.out.println((i+1)+ ". " + flavor[i]); 
}
choice  =  input.nextInt();
consume = input.nextLine();
if(choice<1|| choice>flavor.length){System.out.println("I don't think you chose the correct number, try again!"); continue;}
else {Flavor   = flavor[choice-1];
      System.out.println("We are preparing your pizza using " + Flavor + " as the main flavor."); break;}

}

while(true){
System.out.println("Pick a Crust.(Choose a number)");
for(int i = 0; i<crust.length;i++){
  System.out.println((i+1)+ ". " + crust[i]); 
}
choice  =  input.nextInt();
consume = input.nextLine();
if(choice<1|| choice>crust.length){System.out.println("I don't think you chose the correct number, try again!"); continue;}
else {Crust   = crust[choice-1];
      System.out.println("We are preparing your pizza with a " + Crust); break;}

}
    
}
           
public void summaryPizza(){
              System.out.println(""); 
              System.out.println("YOUR PIZZA HAS BEEN MADE!!");
              System.out.println("Dough: "+ Bread);
              System.out.println("Flavor: "+Flavor);
              System.out.println("Crust: "+Crust);
              double chance = 1.0/(double)(crust.length*flavor.length*bread.length);
              System.out.println("Chance: "+chance +". Meaning out of all the 126 pizzas possible. You made this one! "); 
              
           }


}
