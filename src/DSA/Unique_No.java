package DSA;
//Find the unique ele which don't repeat twice in the array
class arraydatast {
    public static int Maxmin(int[] m ){
       int ans=-1;
        for(int i=0;i<m.length;i++) {
            for(int j=i+1;j<m.length;j++){
                if(m[i]==m[j]){
                  m[i]=-1;
                  m[j]=-1;
                }
            }

        }
        for(int i=0;i<m.length;i++) {
            if(m[i]>0){
               ans=m[i];
            }

        }
        return ans;
    }

}
public class Unique_No{
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,4, 1, 2};
        System.out.println("Unique element is"+" "+arraydatast.Maxmin(arr));

    }
}
