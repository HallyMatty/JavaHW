package finall;

public class Main {
    public static void main(String[] args) {
        
        // try {
        //     System.out.println("Попытка");
        // } // Ошибка компиляции: нужен catch или finally
        
        try {
            System.out.println("Выполняем try");
        } finally {
            System.out.println("Выполняем finally (всегда!)");
        }
        
        // try {
        //     System.out.println("Try");
        // } finally {
        //     System.out.println("First finally");
        // } finally { // Ошибка компиляции: только один finally
        //     System.out.println("Second finally");
        // }
        
        try {
            System.out.println("Основной код");
        } catch (Exception e) {
            System.out.println("Обработка исключения");
        } finally {
            System.out.println("Очистка ресурсов");
        }
    }
}