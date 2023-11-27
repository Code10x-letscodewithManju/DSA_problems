package JAVALAB;

import java.util.Scanner;

public class QuadraticEqn {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a b and c values");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         double d=(b*b)-(4*a*c);
         if(d>0){
             Double r1=-b-(Math.sqrt(d))/(2*a);
             Double r2=-b+(Math.sqrt(d))/(2*a);
             System.out.println("roots are real and distinct");
             System.out.println("r1: "+r1);
             System.out.println("r2: "+r2);
         }else if(d==0){
             System.out.println("roots are real equal:");
             int root=-b/(2*a);
             System.out.println("r1=r2="+root);
         }else{
             System.out.println("roots are imaginary and complex");
         }
    }
}
