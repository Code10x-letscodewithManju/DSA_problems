package P1;


public class C {
    public static void main(String[] args) {
        A c=new A();

        System.out.println("inside class c package 1");

        // a.privateMethod(); // Error: privateMethod() has private access in A
        c.publicMethod();
        c.protectedMethod();
        c.defaultMethod();
    }
}
