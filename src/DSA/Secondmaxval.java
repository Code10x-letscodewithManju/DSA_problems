package DSA;
//find the second largest ele in the array
class arry2 {
    public static int firstmax(int[] m) {
        int max =Integer.MIN_VALUE ;
        for (int i = 0; i < m.length; i++)
            if(m[i]>max)
                max=m[i];
        return max;
    }
    public static int secondmax(int[] m){
        int max=firstmax(m);
        for(int i=0;i<m.length;i++)
            if(m[i]==max)
                m[i]=Integer.MIN_VALUE;
        int secondmax=firstmax(m);
        return secondmax;
    }
}
public class Secondmaxval {
    public static void main(String[] args) {
        int[] arr = {1,5,7,6,3,2};
        System.out.println("the second large no is "+" "+arry2.secondmax(arr));
        System.out.println("");
    }
}
