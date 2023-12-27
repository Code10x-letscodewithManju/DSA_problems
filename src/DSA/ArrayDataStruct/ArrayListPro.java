package DSA.ArrayDataStruct;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPro {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(4);
        System.out.println(a);

//        //print list using for loop
//        for(int i=0;i<a.size();i++){
//            System.out.println(a.get(i));
//        }
//        //print list directly
//        System.out.println(a);
//
//        //add element to list
//        a.add(1,10);
//        System.out.println(a);

        //print ele using get()
        //System.out.println(a.get(1));

        //set ele in list using set()
        //System.out.println(a.set(1,100));

        //removing element from index i in list
        // a.remove(1);
        //  System.out.println(a);

        //removing ele from list
//        a.remove(Integer.valueOf(2));
//        System.out.println(a);
//
        //checking if an ele exists
        Scanner sc=new Scanner(System.in);
//        boolean i=a.contains(Integer. valueOf(1));
//        System.out.println(i);

        //indexof function
       System.out.println(a.indexOf(Integer.valueOf(1)));

       //lastindeof function
        System.out.println(a.lastIndexOf(Integer.valueOf(1)));

    }
}
