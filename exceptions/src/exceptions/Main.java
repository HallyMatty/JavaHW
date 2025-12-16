package exceptions;

/* 
Throwable - корень иерархии
  ├── Error (непроверяемые) - системные ошибки (OutOfMemoryError, StackOverflowError)
  └── Exception
      ├── RuntimeException (непроверяемые) - ошибки программиста
      └── IOException и др. (проверяемые) - внешние ошибки
*/

public class Main {
    
    
    public static void main(String[] args) {
        
        // Практика 2: Примеры исключений
        
        // 1. ArithmeticException - деление на ноль
        try {
            int result = 10 / 0; // ❌ Генерирует ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("1. ArithmeticException: " + e.getMessage());
        }
        
        // 2. ArrayIndexOutOfBoundsException - выход за границы массива
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5]; // ❌ Индекс 5 не существует
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. ArrayIndexOutOfBoundsException");
        }
        
        // 3. IllegalArgumentException - неверный аргумент
        try {
            setAge(-5); // ❌ Возраст не может быть отрицательным
        } catch (IllegalArgumentException e) {
            System.out.println("3. IllegalArgumentException: " + e.getMessage());
        }
        
        // 4. ClassCastException - неверное приведение типов
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // ❌ String нельзя привести к Integer
        } catch (ClassCastException e) {
            System.out.println("4. ClassCastException: " + e.getMessage());
        }
        
        // 5. NullPointerException - обращение к null
        try {
            String str = null;
            int length = str.length(); // ❌ У null нет метода length()
        } catch (NullPointerException e) {
            System.out.println("5. NullPointerException: " + e.getMessage());
        }
    }
    
    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
    }
}