package com.PowerPlay;

public class Trapezoidal {
 //a is lower limit, b is upper limit, n is iterations
  static void weddle(double a, double b, int n){
    
     Double N = new Double(n);
    
    double deltax = (b-a)/N;
    double[] x = new double[n+1];
    double[] y = new double[n+1];
    double sum = 0;
    
    for(int i = 0; i<x.length; i++){
      
      x[i] = a + deltax*i;
     
     
      x[i] = a + deltax * i;
      System.out.println("x["+i+"] = " + x[i]);

 
      //EDIT EQUATION HERE
      y[i] = Math.pow(2.71828 ,-1*x[i]);
     
      System.out.println("y["+i+"] = " + y[i]);
    
      
      if(i%n == 0){
        sum = sum + y[i];
        System.out.println("1 × " + y[i]);
      }
      else{
        
        sum = sum + 2*y[i];
        System.out.println("2 × " + y[i]);
        
      }
      
    }   
    
    sum = sum * 0.5* deltax;
        System.out.println("Area = (Sum of all shown above) × 0.5 ×" + deltax);
    
    System.out.println("Area is " + sum);
    
  }

  public static void main(String[] args) {
    
     weddle(0,2,4);
 
 
  }
}
