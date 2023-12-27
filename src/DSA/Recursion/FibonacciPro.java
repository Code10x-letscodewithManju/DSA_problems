package DSA.Recursion;

import java.util.Scanner;

public class FibonacciPro {
    static int fibo(int n){
    if(n==0||n==1)
        return n;
    return fibo(n-1)+fibo(n-2);
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no to find its fibonacci num:");
        int num=s.nextInt();
        //System.out.println(fibo(num));
        //nth term fibonacci series
        for(int i=0;i<num;i++)
        System.out.println(fibo(i));
    }
}


