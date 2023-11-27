package JAVALAB;
abstract class animal {
    public abstract void makesound();
}
class cat extends animal{
    public void makesound(){
        System.out.println("cat meows");
    }
}
class dog extends animal{
    public void makesound(){
        System.out.println("dog barks");
    }
}
public class dynamicdispatch {
    public static void main(String[] args) {
        animal obj=new cat();
        animal obj1=new dog();
        obj.makesound();
        obj1.makesound();
    }
}
