package DSA;

import java.util.Scanner;

//Find the triplet whose sum is equal to the given input ele
 class arraydatastrut {
    public static int pairsum(int[] m, int n,int target ){
        int ans=0;
        for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
             for(int k=j+1;k<n;k++){
                 if(m[i]+m[j]+m[k]==target){
                     ans++;
                 }
             }
         }
     }
        return ans;
    }

}
public class Tripletsum{
    public static void main(String[] args) {
        arraydatastrut o = new arraydatastrut();
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int tar =sc.nextInt();
        System.out.println("No of doublets are"+" "+o.pairsum(arr,n,tar));
    }
}
