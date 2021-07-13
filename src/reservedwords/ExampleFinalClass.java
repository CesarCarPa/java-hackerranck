package reservedwords;

public abstract class ExampleFinalClass {
    private int data = 30;
    abstract int someMethod();
    static void voidMethod(){
        System.out.println("hi from parent");
    }
}

class InheritanceClass extends ExampleFinalClass{

    @Override
    int someMethod() {
        return 0;
    }
}

class ImplementsInterface implements InterfaceTest{
    @Override
    public void emptyVoidMethod() {
        System.out.println("Hi from emptuVoidMethod Implementation");
    }

    public void voidMethod() {
        System.out.println("Hi from voidMethod Implementation");
    }
}

class MainClass {
    public static void main(String... args){

        ImplementsInterface ii = new ImplementsInterface();
        ii.emptyVoidMethod();
        ii.voidMethod();
    }
}

interface InterfaceTest {

    void emptyVoidMethod();

    default void voidMethod(){
        System.out.println("hi from void interface method");
    }
}