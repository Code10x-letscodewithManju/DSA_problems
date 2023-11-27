package JAVALAB;

public class overloadingDemo
{
    public overloadingDemo(){
        System.out.println("Default constructor is called");
    }
    public overloadingDemo(int a){
        System.out.println(" constructor with one parameter is called"+a);
    }
    public overloadingDemo(int a,int b){
        System.out.println(" constructor with two parameters is called"+a+" "+b);
    }
    void methodoverloading(){
        System.out.println("default method is called");
    }
    void methodoverloading(int a){
        System.out.println("method with one parameter is called"+a);
    }
    void methodoverloading(int a,int b){
        System.out.println("method with two parameters is called"+a+" "+b);
    }

    public static void main(String[] args) {
        overloadingDemo obj=new overloadingDemo();
        obj.methodoverloading();
        obj.methodoverloading(10);
        obj.methodoverloading(20,30);

        overloadingDemo obj1=new overloadingDemo(10);
        overloadingDemo obj2=new overloadingDemo(12,14);
    }
}
