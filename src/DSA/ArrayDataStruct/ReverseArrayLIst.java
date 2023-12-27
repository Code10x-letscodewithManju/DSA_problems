package DSA.ArrayDataStruct;

import java.util.ArrayList;
import java.util.Collections;

class arryList{
    public static void reverseArrList(ArrayList<Integer> l){
        int i=0,j=l.size()-1;
        while (i<j){
            Integer temp=Integer.valueOf(l.get(i));
            l.set(i,l.get(j));
            l.set(j,temp);
            i++;
            j--;

        }
    }
}
public class ReverseArrayLIst {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(8);
        System.out.println("Before reversing list: " + a);
        //reversing using collections class reverse()
        //Collections.reverse(a);
        arryList.reverseArrList(a);
        System.out.println("After reversing list: " + a);

        //sorting list using collections class
//        Collections.sort(a);
//        System.out.println("sorted list is "+a);

        //sorting string Arraylist
        ArrayList<String> s=new ArrayList<>();
        s.add("hello");
        s.add("Welcome");
        s.add("to");
        s.add("Codex");
        System.out.println("Orginal list" +s);
        Collections.sort(s,Collections.reverseOrder());
        System.out.println("sorted string ArrayList "+s);




    }
}