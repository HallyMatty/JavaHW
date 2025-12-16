package exceptionshandling;

public class Main {
    public static void main(String[] args) {
        try {
            // Перехват
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
        
        // аварийная остановка
        String str = null;
        System.out.println(str.length()); // NullPointerException
    }
}
