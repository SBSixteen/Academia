import java.util.Scanner;

public class Stopwatch {
	private int    hour,minute,second;
	private String hours,minutes,seconds;
	Scanner input = new Scanner(System.in);
	
	public void myTime() {
		while(true) {
		System.out.println("Enter Hours");
		hour = input.nextInt();
		if(hour<24&& hour>-1) {break;}
		else System.out.println("Invalid Digit Entered");}
		
		while(true) {
		System.out.println("Enter Minutes");
		minute = input.nextInt();
		if(minute<60&& minute>-1) {break;}
		else System.out.println("Invalid Digit Entered");}
		
		while(true) {
		System.out.println("Enter seconds");
		second = input.nextInt();
		if(second<60&& second>-1) {break;}
		else System.out.println("Invalid Digit Entered");}
	}
    public void myTime(int x,int y,int z) {
    	x=hour;
    	y=minute;
    	z= second;
    	if(hour>23 || hour<0 || minute >59 || minute <0|| second >59 ||second<0) myTime();
    	
    }
    public void setTime() {
		while(true) {
		System.out.println("Enter Hours");
		hour = input.nextInt();
		if(hour<23&& hour>-1) {break;}
		else System.out.println("Invalid Digit Entered");}
		
		while(true) {
		System.out.println("Enter Minutes");
		minute = input.nextInt();
		if(minute<60&& minute>-1) {break;}
		else System.out.println("Invalid Digit Entered");}
		
		while(true) {
		System.out.println("Enter seconds");
		hour = input.nextInt();
		if(second<60&& second>-1) {break;}
		else System.out.println("Invalid Digit Entered");}
    }
    public int gethour(){
    	return hour;}
    public int getminute() {
    	return minute;}    
    public int getsecond() {
	return second; }
    public void sethour(){
    	
    	while(true) {
    		System.out.println("Enter Hours");
    		hour = input.nextInt();
    		if(hour<23&& hour>-1) {break;}
    		else System.out.println("Invalid Digit Entered");}
    	
    }
    public void setminute() {
    	
    	while(true) {
    		System.out.println("Enter Minutes");
    		minute = input.nextInt();
    		if(minute<60&& minute>-1) {break;}
    		else System.out.println("Invalid Digit Entered");}
    	
    }
    public void setsecond() {
		while(true) {
		System.out.println("Enter seconds");
		hour = input.nextInt();
		if(second<60&& second>-1) {break;}
		else System.out.println("Invalid Digit Entered");
    }
}
    public String toString(){
    	
    	hours   = Integer.toString(hour);
        minutes = Integer.toString(minute);
    	seconds = Integer.toString(second);
    	
    	if(hour < 10) {hours ="0" + Integer.toString(hour);}
    	if(minute < 10) {minutes ="0" + Integer.toString(minute);}
    	if(second < 10) {seconds ="0" + Integer.toString(minute);}
    	if(second == 60) {seconds = "00"; second =0; minute++;}
    	if(minute == 60) {minutes = "00"; minute =0; hour++;}
    	if(hour == 24) {hours = "00"; hour =0;}
    	if(second < 0) {seconds = "59"; second =59; minute--;}
    	if(minute < 0) {minutes = "59"; minute =59; hour--;}
    	if(hour < 0) {hours = "23"; hour =23;}
    	return hours + ":" + minutes + ":" + seconds ;
    }    	
    public void nextsecond() {
    	second++;
    	this.toString();
    }
    public void nextminute() {
    	minute++;
    	this.toString();
    }
    public void nexthour() {
    	hour++;
    	this.toString();
    }
    public void prevsecond() {
        	second--;
        	this.toString();
        }
    public void prevminute() {
    	minute--;
    	this.toString();
    }
    public void prevhour() {
    	hour--;
    	this.toString();
    }
    
    }

