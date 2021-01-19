package com.PowerPlay;

public class Romberg {

static void RombergIt(double a, double b, int h){

//b is upper limit
//a is lower limit
//h is quantity of iteration

Double n = new Double(h);
double diff = b-a;

double[] area = new double[h];

for(int i = 0; i<h;i++){
  
  double deltax = diff/Math.pow(2,i);
  int len = (int)Math.pow(2,i) +1;
  double[] x = new double[len];
  double[] y = new double[len];
  double sum = 0;
  System.out.println("Length = " + len);
  
  for(int j = 0; j < len ;j++){
    
     
    x[j] = a+(deltax*j);
   
   //Edit Equation here
    y[j] = Math.pow(3,x[j]);
    
          System.out.println("x["+j+"] = " + x[j]);
          System.out.println("y["+j+"] = " + y[j]);

   
      System.out.println("2 × " + y[j]  + " = " + 2*y[j]+ " | show in working and add");
     sum = sum + 2*y[j];
    }
    
        System.out.println("Area =  "  +sum + " - " + y[0]+ " - " + y[len-1]+" | show in working");
  
  
 sum = sum-y[0]-y[len-1];
 
 
 System.out.println("Sum of Area = " + sum);
 area[i] = deltax/2 * sum ;

 System.out.println("Area for h/"+(int)Math.pow(2,i) + " is "+area[i]);
 
  System.out.println("");
  }
  
  double[] storeImix = new double[h+1];
 
  for(int i = 0; i<area.length-1;i++){
  
 //  System.out.println("Area[i, i+1] = " + area[i] + " , "+area[i+1]);

  storeImix[i] = ((4*area[i+1])-area[i])*(0.333333);
  
 
  System.out.println("I(H/"+(int)(Math.pow(2,i))+",H/"+ (int)(Math.pow(2,i+1))+ ") = " +storeImix[i]);
  }

}

public static void main(String[] args){

RombergIt(-2,2,3);

System.out.println("[4×I(H/2,H/4) - I(H/4,H/8)] ÷ 3 = I(H/2,H/4,H/8)");


  
}
}
