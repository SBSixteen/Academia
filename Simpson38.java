package com.PowerPlay;

public class Simpson38 {
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

      // EDIT EQUATION HERE
 
      //EDIT EQUATION HERE
      y[i] = Math.pow(3,x[i]);
     
      System.out.println("y["+i+"] = " + y[i]);
    
     if(i%n == 0) {
       sum = sum + y[i];
       System.out.println("1 × " + y[i]);
     }
    
      else if(i%3 == 0){
        sum = sum + 2*y[i];
        System.out.println("2 × " + y[i]);
      }
      else{
      
      sum = sum + 3*y[i];
      System.out.println("3 × " + y[i]);
      }
      
    }   
        System.out.println("Area = (Sum of all shown above) × 3/8 ×" + deltax);
    sum = sum * 3/8 * deltax;
    
    System.out.println("Area is " + sum);
    
  }

  public static void main(String[] args) {
    
     weddle(-2,2,6);
 
 
  }
}
