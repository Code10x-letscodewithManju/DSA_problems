package JAVALAB;

public class Sorting {
    public static void main(String[] args) {
        int a[]={8,5,1,3,7};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Ascending order sorted array");
        for(int value:a){
            System.out.println(value+" ");
        }
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("descending order sorted array");
        for(int value:a){
            System.out.println(value+" ");
        }
    }

}
