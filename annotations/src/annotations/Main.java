package annotations;

//@Override - проверка переопределения
class Parent {
 void method() {
     System.out.println("Родительский метод");
 }
}

class Child extends Parent {
 @Override // Проверяет, что метод действительно переопределяется
 void method() {
     System.out.println("Дочерний метод");
 }
 
 // @Override
 // void metod() {} // Опечатка - такого метода в родителе нет
}

//@Deprecated - пометка устаревшего кода
class OldAPI {
 @Deprecated // Метод устарел
 public void oldMethod() {
     System.out.println("Старый метод");
 }
 
 @Deprecated(since = "1.8", forRemoval = true) // С версии 1.8, будет удален
 public void veryOldMethod() {}
 
 public void newMethod() {
     System.out.println("Новый метод");
 }
}

//@SuppressWarnings - подавление предупреждений
class WarningExample {
 @SuppressWarnings("unchecked") // Подавляем unchecked warning
 public void unsafeMethod() {
     java.util.List list = new java.util.ArrayList(); // Raw type
     list.add("text"); // Warning без аннотации
 }
 
 @SuppressWarnings({"deprecation", "unused"}) //Подавляем несколько warnings
 public void test() {
     OldAPI obj = new OldAPI();
     obj.oldMethod(); // Используем deprecated метод без warning
     
     int unusedVar = 10; // Переменная не используется
 }
}

public class Main {
 public static void main(String[] args) {
     // @Override
     Child child = new Child();
     child.method();
     
     // warning
     OldAPI old = new OldAPI();
     old.oldMethod(); //метод устарел
     
     //@SuppressWarnings
     WarningExample example = new WarningExample();
     example.unsafeMethod(); // Без warning
     example.test(); // Без warning
 }
}