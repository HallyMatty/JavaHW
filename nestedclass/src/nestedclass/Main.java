package nestedclass;

interface Calculator {
 // Статический вложенный класс в интерфейсе
 static class Operations {
     public static int add(int a, int b) {
         return a + b;
     }
     
     public static int multiply(int a, int b) {
         return a * b;
     }
 }
 
 class DefaultImpl implements Calculator {

 }
}

public class Main {
	 public static void main(String[] args) {
	     // Вызов метода вложенного класса из интерфейса
	     int sum = Calculator.Operations.add(5, 3);
	     System.out.println("5 + 3 = " + sum); // 8
	     
	     int product = Calculator.Operations.multiply(5, 3);
	     System.out.println("5 * 3 = " + product); // 15
	     
	     // Создание экземпляра вложенного класса из интерфейса
	     Calculator.DefaultImpl impl = new Calculator.DefaultImpl() {
	         // анонимный класс
	     };
	 }
	}

