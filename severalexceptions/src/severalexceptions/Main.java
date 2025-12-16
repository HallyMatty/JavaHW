package severalexceptions;

//Практика 1: Обработка исключений
class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class Main {
 public static void main(String[] args) {
     
     // Несколько исключений обрабатываются одинаково
     try {
         throw new ArithmeticException();
     } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
         System.out.println("Ошибка вычисления или индекса: " + e.getMessage());
     }
     
     // Иерархия исключений (Ex1 ← Ex2 ← Ex3)
     try {
         throw new Ex3(); // Самый специфичный
     } catch (Ex3 e) {
         System.out.println("Пойман Ex3");
     } catch (Ex2 e) {
         System.out.println("Пойман Ex2");
     } catch (Ex1 e) {
         System.out.println("Пойман Ex1");
     }
     
     // нельзя объединять исключения из одной цепочки
     // try {
     //     throw new Ex3();
     // } catch (Ex1 | Ex2 e) ошибка компиляции
     
     try {
         int x = 10 / 0;
     } catch (final ArithmeticException e) {
         // final запрещает переприсваивание переменной e
         // e = new ArithmeticException(); // ошибка
         System.out.println("Исключение: " + e.getMessage());
     }
 }
}
