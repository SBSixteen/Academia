import java.util.Scanner;
public class StopwatchDemo {
 
	public static void main(String[] args) {
	 Stopwatch MyStopwatch = new Stopwatch();
	 
	  Scanner input = new Scanner(System.in);
	  int intake=0;
	  String consume, show;
	 MyStopwatch.myTime();
	 
	 while(true) {
		 System.out.println("Welcome to stopwatch!");
		 System.out.println("1. Show Time");
		 System.out.println("2. Increase Time");
		 System.out.println("3. Decrease Time");
         intake = input.nextInt();
         consume = input.nextLine();
		 
         if(intake == 1) {show =MyStopwatch.toString(); System.out.println(show);}
         if(intake == 2) {
        	 while(true) {
        		 System.out.println("1. Increase Second");
        		 System.out.println("2. Increase Minute");
        		 System.out.println("3. Increase Hour");
        		 System.out.println("4. exit");
        		 intake = input.nextInt();
        		 consume = input.nextLine();
        		 
        		 if(intake == 1) {MyStopwatch.nextsecond(); show =MyStopwatch.toString(); System.out.println(show);}
        		 if(intake == 2) {MyStopwatch.nextminute(); show =MyStopwatch.toString(); System.out.println(show);}
        		 if(intake == 3) {MyStopwatch.nexthour(); show =MyStopwatch.toString(); System.out.println(show);}
        		 if(intake == 4) {break;}
        	 }
         }
		 
         if(intake == 3) {
        	 while(true) {
        		 System.out.println("1. Decrease Second");
        		 System.out.println("2. Decrease Minute");
        		 System.out.println("3. Decrease Hour");
        		 System.out.println("4. exit");
        		 intake = input.nextInt();
        		 consume = input.nextLine();
        		 
        		 if(intake == 1) {MyStopwatch.prevsecond(); show =MyStopwatch.toString(); System.out.println(show);}
        		 if(intake == 2) {MyStopwatch.prevminute(); show =MyStopwatch.toString(); System.out.println(show);}
        		 if(intake == 3) {MyStopwatch.prevhour(); show =MyStopwatch.toString(); System.out.println(show);}
        		 if(intake == 4) {break;}
        	 }
         }
	 }
 }
}
