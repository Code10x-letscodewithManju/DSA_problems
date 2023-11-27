package JAVALAB;

import java.awt.*;

public class arraymultiplication {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {2,1,4,3};
        int res[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i] * b[i];
        }
        System.out.println("array elements are:");
        for (int num : res) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
