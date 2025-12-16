package override;

class Calculator {
 int add(int a, int b) {
     return a + b;
 }

 
 int add(int a, int b, int c) {
     return a + b + c;
 }
}

class Animal {
 void sound() {
     System.out.println("Звук");
 }
 
 Animal get() {
     return new Animal();
 }
}

class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Гав");
 }
 
 // ошибка если тип возвращаемого значения не совпадает
 // @Override
 // Dog get() { // Не скомпилируется если в Animal: Animal get()
 //     return new Dog();
 // }
 
 @Override
 Dog get() {
     return new Dog(); // Можно сузить тип возврата
 }
}

class Base {
 void method() {}
}

class Derived extends Base {
 // опечатка в имени метода
 // @Override
 // void metod() {} // Ошибка: метод не переопределяет ничего
 
 @Override
 void method() {}
}

public class Main {
 public static void main(String[] args) {
     Calculator calc = new Calculator();
     System.out.println(calc.add(2, 3));      // 2 int версия
     System.out.println(calc.add(2, 3, 4));  // 3 int версия
     
     Animal animal = new Animal();
     Animal dog = new Dog(); // Полиморфизм
     
     animal.sound(); // Звук
     dog.sound();    // Гав
 }
}