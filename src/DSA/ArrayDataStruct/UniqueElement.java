package DSA.ArrayDataStruct;

import java.util.Scanner;
public class UniqueElement {
    public static int findunique(int[] nums) {
        // Write your code here.
        int uni=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[i]=-1;
                    nums[j]=-1;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                uni=nums[i];
            }
        }
        return uni;
    }
    public static void main(String args[]){
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("unique ele is; "+findunique(a));

    }
}