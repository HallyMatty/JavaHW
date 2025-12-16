package interfaces;

interface PackageInterface {
 // Виден только в этом пакете
 void method();
}

//protected interface ProtectedInterface {} // Ошибка компиляции

//private interface PrivateInterface {} // Ошибка компиляции

//private можно ТОЛЬКО для вложенных интерфейсов
class Outer {
 private interface NestedInterface {
     // Виден только внутри Outer
     void method();
 }
}

abstract class AbstractClass implements PublicInterface {
 // Не реализован метод method(), должен быть abstract
}

class ConcreteClass implements PublicInterface {
 @Override
 public void method() {
     System.out.println("Реализация метода интерфейса");
 }
}

//Множественная реализация
interface A { void a(); }
interface B { void b(); }

class MultiImpl implements A, B {
 @Override public void a() {}
 @Override public void b() {}
}

//Интерфейс наследует интерфейсы
interface C extends A, B {
 void c();
}

public class Main {
 public static void main(String[] args) {
     ConcreteClass obj = new ConcreteClass();
     obj.method();
     
     // Все поля в интерфейсе public static final
     System.out.println("MAX в интерфейсе: " + Constants.MAX_VALUE);
 }
}

interface Constants {
 int MAX_VALUE = 100; // Автоматически public static final
 String NAME = "Interface"; 
}