import java.util.Scanner;
/**
 *
 * @author 19660
 */
public class Television {
    
    private String Manufacturer, consume;
    private   int  Screen_size;
    private   int      channel = 2;
    private   int      volume  = 20;
    private  int[]  screensize = {12,16,20,24};
    public boolean PowerON   =  false;
    Scanner input              = new Scanner (System.in);
    
    public void    createTV(){
    	System.out.println("Weclome to Television Maker!!!!!!");
        System.out.println("Write Manufacturer Name");
        Manufacturer = input.nextLine();
               
        for(int i =1,j=0; j<screensize.length;i++,j++)
        { System.out.println(i + ". " + screensize[j] );
        }
       
        
        while(true){
        System.out.println(" ");
        System.out.println("Select Screen Size.(Sizes are in inches. Measured Diagonally.) (Select Serial Number)");     
            Screen_size = input.nextInt();
                 consume = input.nextLine();
                 if(Screen_size > 4 || Screen_size <1) { System.out.println("Please Choose correct size."); continue; }
                 else {System.out.println("Size Chosen (Inches): " + screensize[Screen_size-1]); break;}
                 
        }}   
    public String  getScreensize(){
            return "Size: " + Integer.toString(screensize[Screen_size-1]);
         }
    public    int  getvolume(){
        return volume;}
    public    int  getchannel(){
        return channel;
    }
    public    int  increasevolume(){
    return volume++;}
    public    int  decreasevolume(){
    return volume--;}
    public    int  increaseChannel(){
    return  channel++;}
    public    int  decreaseChannel(){
    return channel--;}
    public boolean power(){
        if(PowerON)  PowerON = false;
        else PowerON =  true;
                      return PowerON;    }
    public String getManufacturer(){ return "Manufacturer: " + Manufacturer;}
    
}
