package fields;

class A {
    public static int a = 1;
    public static int b;
    
    public static void printVars() {
        System.out.println("a = " + a + ", b = " + b);
    }
    
    public static void callFromSameClass() {
        System.out.print("A.callFromSameClass(): ");
        printVars();
    }
}

// Класс-наследник
class B extends A {
    public static void callFromChildStatic() {
        System.out.print("B.callFromChildStatic(): ");
        printVars();
        A.printVars();
    }
    
    public void callFromChildInstance() {
        System.out.print("B.callFromChildInstance(): ");
        printVars();
        super.printVars();
    }
}

public class Fields {
    public static void main(String[] args) {
        
        System.out.print("A.printVars(): ");
        A.printVars();
        
        System.out.print("new A().printVars(): ");
        new A().printVars();
        
        System.out.print("A.callFromSameClass(): ");
        A.callFromSameClass();
        
        System.out.print("B.callFromChildStatic(): ");
        B.callFromChildStatic();
        
        System.out.print("new B().callFromChildInstance(): ");
        new B().callFromChildInstance();
        
        
        System.out.print("Анонимный класс: ");
        new Runnable() {
            @Override
            public void run() {
                A.printVars();
            }
        }.run();
        
        System.out.print("Лямбда: ");
        ((Runnable) () -> A.printVars()).run();
    }
    
}


