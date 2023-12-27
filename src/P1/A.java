package P1;

public class A {
    private int privateVar = 10;
    public int publicVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;

    private void privateMethod() {
        System.out.println("Private Method in A");
    }

    public void publicMethod() {
        System.out.println("Public Method in A");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method in A");
    }

    void defaultMethod() {
        System.out.println("Default Method in A");
    }
    public static void main(String[] args) {
       A a=new A();
       System.out.println(a.defaultVar);
       System.out.println(a.publicVar);
       System.out.println(a.privateVar);
       System.out.println(a.protectedVar);
        a.publicMethod();
        a.privateMethod();
        a.defaultMethod();
        a.protectedMethod();
    }
}
