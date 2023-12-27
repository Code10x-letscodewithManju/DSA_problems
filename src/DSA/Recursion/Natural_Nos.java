package DSA.Recursion;

import java.util.Scanner;
 class Naturalnoindecreasing{
    static void recursion(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        //recursion(n-1); //for printing natural no in increasing order
        System.out.println(n);
        recursion(n-1);
    }
}


public class Natural_Nos {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=s.nextInt();
        //Naturalnoindecreasing.recursion(n);
        Naturalnoindecreasing.recursion(n);
    }
}
