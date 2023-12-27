package P1;

public class B extends A {
    public static void main(String[] args) {
        B b=new B();
        System.out.println("inside class B package 1  ");
        // privateMethod(); // Error: privateMethod() has private access in A
        b.publicMethod();
       b.protectedMethod();
       b.defaultMethod();
    }


}

