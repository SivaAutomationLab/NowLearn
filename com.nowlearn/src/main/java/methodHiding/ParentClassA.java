package methodHiding;

public class ParentClassA {
    public static void staticMethod(){
        System.out.println("Parent");

    }
    public void nonStatic(){
        System.out.println("parent1");
    }
}
