package DSA.ArrayDataStruct;
import java.util.Scanner;
public class LinearSearch {
    public static int search(int []nums, int target) {
        // Write your code here.
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index=i;
            }
        }
        return index;
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
        System.out.println("enter the target element");
        int target=sc.nextInt();
        System.out.println("target ele is at the index: "+search(a,target));
    }
}