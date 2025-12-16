package myexception;

class MyCustomException extends Exception {
    
    // Конструктор по умолчанию
    public MyCustomException() {
        super();
    }
    
    // Конструктор с сообщением
    public MyCustomException(String message) {
        super(message);
    }
    
    // Конструктор с сообщением и причиной
    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Main{
    public static void main(String[] args) {
        try {
            validateAge(-5);
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void validateAge(int age) throws MyCustomException {
        if (age < 0) {
            throw new MyCustomException("Возраст не может быть отрицательным: " + age);
        }
    }
}
