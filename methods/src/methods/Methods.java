package methods;

public class Methods {

	public static void main(String[] args) {
	Child child = new Child();
	child.show(10);           // Наследованная перегрузка: "Parent int: 10"
	child.show("text");       // Наследованная перегрузка: "Parent String: text"  
	child.show(3.14);         // Своя перегрузка: "Child double: 3.14"
	child.display();          // Переопределение: "Child display"
	}
}

class Parent {
    // Перегруженные методы
    void show(int x) {
        System.out.println("Parent int: " + x);
    }
    
    void show(String s) {
        System.out.println("Parent String: " + s);
    }
    
    // Будет переопределен
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    // Переопределение
    @Override
    void display() {
        System.out.println("Child display");
    }
    
    // Перегрузка (только в Child)
    void show(double d) {
        System.out.println("Child double: " + d);
    }
}