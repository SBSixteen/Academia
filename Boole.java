package com.PowerPlay;

public class Boole {
 
  static void weddle(double a, double b, int n){
    
     Double N = new Double(n);
    
    double deltax = (b-a)/N;
    double[] x = new double[n+1];
    double[] y = new double[n+1];
    double sum = 0;
    
    System.out.println("delta x = " + deltax);
    
    int j =0;
    for(int i = 0; i<x.length; i++){
      
      x[i] = a + deltax*i;
     
     
      x[i] = a + deltax * i;
      System.out.println("x["+i+"] = " + x[i]);

      // EDIT EQUATION HERE
      //EDIT EQUATION HERE
      y[i] = Math.pow(3,x[i]);
     
      System.out.println("y["+i+"] = " + y[i]);
    
      
      if(i%2== 1){
        sum = sum + 32*y[i];
        System.out.println("32 × "+ y[i]);
      }
         else if(i%n == 0){
        sum = sum + 7*y[i];
        
        System.out.println("7 × " +y[i]);
      }

      else if (i == (4*j) + 2){
        j++;
        sum = sum + 12*y[i];
        System.out.println("12 × " +y[i]);
      }
      else if(i%4==0){
        sum = sum + 14*y[i];
     System.out.println("14 × " +y[i]);
      }
      
    
    }   
    
  //  sum = sum + 7*(y[0]+y[x.length-1]);
    sum = sum * 1/45 * 2*deltax;
        System.out.println("Area = (Sum of all shown above) × 1/45 × 2 ×" + deltax);
    System.out.println("Area is " + sum);
    
  }

  public static void main(String[] args) {
    
     weddle(-2,2,8);
 
 
  }



}
