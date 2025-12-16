package inheritance;

public class Inheritance {
	class Parent {
	    String name = "Parent";
	    
	    void print() {
	        System.out.println("Parent method");
	    }
	}

	class Child extends Parent {
	    String name = "Child"; // скрывает поле родителя
	    
	    void print() {
	        // this - ссылка на текущий объект
	        System.out.println("this.name: " + this.name); // Child
	        
	        // super - доступ к членам родителя
	        System.out.println("super.name: " + super.name); // Parent
	        
	        // Вызов метода родителя
	        super.print();
	        
	        // Вызов конструктора родителя (только в конструкторе)
	        // super();
	    }
	    
	    void test() {
	        this.print(); // вызов метода Child
	        super.print(); // вызов метода Parent
	    }
	}
	
	class A {
	    int a1;                 // default (package-private)
	    public int a2;          // public
	    protected int a3;       // protected
	    private int a4;         // private
	    
	    void method1() {}       // default
	    public void method2() {} // public
	    protected void method3() {} // protected
	    private void method4() {}   // private
	}

	class B extends A {
	    void testB() {
	        a1 = 1;
	        a2 = 2;
	        a3 = 3;
	        // a4 = 4;   // не наследуется: private
	        
	        method1();
	        method2();
	        method3();
	        // method4();   // не наследуется: private
	    }
	}

	class C extends B {
	    void testC() {
	        a1 = 1;
	        a2 = 2;
	        a3 = 3;
	        // a4 = 4;    // не наследуется: private
	        
	        method1();
	        method2();
	        method3();
	        // method4();   // не наследуется: private
	    }
	}
}
