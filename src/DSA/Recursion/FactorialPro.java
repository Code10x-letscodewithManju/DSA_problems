package DSA.Recursion;

import java.util.Scanner;



public class FactorialPro{


    static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no to find its factoial:");
        int num=s.nextInt();
        System.out.println(fact(num));

    }
}
