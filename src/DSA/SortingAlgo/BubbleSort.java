//Demonstrate bubble sorting program
/*
 Worst case TC = O(n^2)
 Average case TC = O(n^2)
 Best case TC = O(n)
 SC = O(1)

 Bubble sorting is
 >STABLE sorting algo (In which the Duplicate elements are not swapped)
 >In place algorithm (because space complexity = O(1) )
*/



package DSA.SortingAlgo;

import java.util.Scanner;

import static java.lang.System.out;

class Main{
        static void Sort(int a[]) {
            int n = a.length;
            for (int i = 0; i < n - 1; i++) {
                boolean flag=false;
                for (int j = 0; j < n - 1 - i; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        flag = true;
                    }
                }
                if(!flag){
                    return;
                }
            }
        }
    }
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        out.println("enter the array elements: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Main.Sort(a);
        out.println("Array after sorting in ascending order:");
        for(int i=0;i<n;i++)
            out.println(a[i]);
        out.println("Array after sorting in descending order");
        for(int i=n-1;i>=0;i--)
            out.println(a[i]);
    }
}
