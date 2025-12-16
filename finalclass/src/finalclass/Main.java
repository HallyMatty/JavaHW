package finalclass;

class Parent {
    public final void finalMethod() {
        System.out.println("Метод final");
    }
    
    public void normalMethod() {
        System.out.println("Метод public");
    }
}

class Child extends Parent {
    // не компилируется: нельзя переопределить final метод
    // @Override
    // public void finalMethod() { 
    //     System.out.println("Попытка переопределения final метода");
    // }
    
    @Override
    public void normalMethod() {
        System.out.println("Переопределенный public метод");
    }
}

final class FinalClass {
    public void method() {
        System.out.println("Метод final класса");
    }
}

// не компилируется: нельзя наследовать final класс
// class ExtendedClass extends FinalClass {
// }

class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.finalMethod(); // Вызов final метода
        
        Child c = new Child();
        c.finalMethod(); // Наследуется и вызывается метод Parent
        c.normalMethod(); // Вызывается переопределенный метод
        
       FinalClass fc = new FinalClass();
        fc.method();
    }
}