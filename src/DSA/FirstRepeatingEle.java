package DSA;


import java.util.Scanner;

class arraypro4{
    public static int repeatingele(int[] m){
        int ele=-1;
        for(int i=0;i<m.length;i++) {
            for(int j=i+1;j<m.length;j++){
                if(m[i]==m[j]){
                    return m[i];
                }
            }

        }
        return ele;
    }
}

public class FirstRepeatingEle {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("First repeating element is"+arraypro4.repeatingele(arr));
    }
}
