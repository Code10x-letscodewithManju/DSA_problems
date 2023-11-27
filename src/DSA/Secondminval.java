package DSA;
//find the second largest ele in the array
class arrypro5{
    public static int firstmin(int[] m) {
        int min =Integer.MAX_VALUE ;
        for (int i = 0; i < m.length; i++)
            if(m[i]<min)
                min=m[i];
        return min;
    }
    public static int secondmin(int[] m){
        int min=firstmin(m);
        for(int i=0;i<m.length;i++)
            if(m[i]==min)
                m[i]=Integer.MAX_VALUE;
        int secondmin=firstmin(m);
        return secondmin;
    }
}
public class Secondminval {
    public static void main(String[] args) {
        int[] arr = {1,5,7,6,3,2};
        System.out.println("the second small no is "+" "+arrypro5.secondmin(arr));
        System.out.println("");
    }
}
