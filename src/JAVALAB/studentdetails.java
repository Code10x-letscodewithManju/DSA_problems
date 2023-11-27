package JAVALAB;

import java.awt.*;
import java.util.Scanner;

class student{
    String usn;
    String name;
    String branch;
    String phno;
    double percentage;
}
public class studentdetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num of students:");
        int n = sc.nextInt();
        student[] s = new student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new student();
            System.out.println("enter the student: " + (i + 1));
            System.out.println("enter usn:");
            s[i].usn = sc.next();
            System.out.println("enter name:");
            s[i].name = sc.next();
            System.out.println("enter branch:");
            s[i].branch = sc.next();
            System.out.println("enter phno:");
            s[i].phno = sc.next();
            System.out.println("enter percentage:");
            s[i].percentage = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("student details: " + (i + 1));
            System.out.println(" usn:" + s[i].usn);
            System.out.println("name:" + s[i].name);
            System.out.println("branch:" + s[i].branch);
            System.out.println("phno:" + s[i].phno);
            System.out.println("percentage:" + s[i].percentage);

        }
    }

}