package methodHiding;

public class MethodHidingImplemented {
    public static void main (String[] args){
        ParentClassA p = new ParentClassA();
        p.staticMethod();
        ChildClassA c= new ChildClassA();
        c.staticMethod();
        // When static method of the child class is overriding the same static method
        // it is method hiding and not overriding.
        // In method hiding, the method from parent is invoked,
        // because it is taken based on the reference type
        ParentClassA methodHide= new ChildClassA();
        methodHide.staticMethod();
        // When non static method of the child class is overriding the same non static method
        // it is overriding.
        // In overriding, the method from Child is invoked,
        // because it is taken based on the runtime Object which is "new ChildClassA()" here.
        ParentClassA overRiding = new ChildClassA();
        overRiding.nonStatic();

    }
}
