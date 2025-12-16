package methodsinterface;

interface Greeting {
 // default метод
 default void sayHello() {
     System.out.println("Hello from interface!");
 }
 
 // static метод
 static void staticMethod() {
     System.out.println("Static method in interface");
 }
 
 // Абстрактный метод
 void abstractMethod();
}

class Person implements Greeting {
 @Override
 public void abstractMethod() {
     System.out.println("Implemented abstract method");
 }
 
 // переопределение default метода
 @Override
 public void sayHello() {
     System.out.println("Hello from Person!");
 }
}

interface A {
 default void method() {
     System.out.println("Method from A");
 }
}

interface B {
 default void method() {
     System.out.println("Method from B");
 }
}

//class Conflict implements A, B {} ошибка компиляции без явного переопредлеения

//Переопределяем метод
class Solution1 implements A, B {
 @Override
 public void method() {
     System.out.println("My own implementation");
 }
}

class Solution2 implements A, B {
 @Override
 public void method() {
     A.super.method(); // Вызываем метод из A
 }
}

public class Main {
 public static void main(String[] args) {
     Person person = new Person();
     person.sayHello();          // Вызов default метода
     person.abstractMethod();    // Вызов реализованного метода
     
     // Вызов static метода интерфейса
     Greeting.staticMethod();    // Вызов по имени интерфейса
     // person.staticMethod();   // Нельзя через экземпляр
     
     Solution1 s1 = new Solution1();
     s1.method(); // My own implementation
     
     Solution2 s2 = new Solution2();
     s2.method(); // Method from A
 }
}
