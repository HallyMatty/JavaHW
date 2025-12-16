package staticoverride;

class A {
    public static void method() {
        System.out.println("A static method");
    }
}

class B extends A {
    // скрытие
    public static void method() {
        System.out.println("B static method");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        
        a.method(); // "A static method" ← вызов по типу ссылки (A), а не объекта
        A.method(); // "A static method"
        B.method(); // "B static method"
    }
}
