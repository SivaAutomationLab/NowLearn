package methodHiding;

public class ChildClassA extends ParentClassA {
    public static void staticMethod(){
        System.out.println("child");
    }
    public void nonStatic(){
        System.out.println("Child1");
    }

}
