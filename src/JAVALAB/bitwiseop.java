package JAVALAB;

import java.awt.*;

public class bitwiseop {
    public static void main(String[] args) {
        int a = 10;
        int leftshift = a << 2;
        int rightshift = a >> 1;
        int zerofillrightshift = a >>> 1;
        System.out.println("leftshift" + leftshift);
        System.out.println("rightshift" + rightshift);
        System.out.println("zero-fill rightshift" + zerofillrightshift);
    }
}
