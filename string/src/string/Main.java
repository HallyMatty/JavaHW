package string;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
    	String str = " Hello, World! ";
        // length() - длина строки
        System.out.println("1. Длина: " + str.length());
        
        // trim() - удаление пробелов по краям
        String trimmed = str.trim();
        System.out.println("2. Trim: '" + trimmed + "'");
        
        // toUpperCase() / toLowerCase() - регистр
        System.out.println("3. UpperCase: " + str.toUpperCase());
        
        // substring() - подстрока
        System.out.println("4. Substring(7,11): " + str.substring(7, 11));
        
        // replace() - замена символов
        System.out.println("5. Replace 'l'→'L': " + str.replace('l', 'L'));
        
        // contains() - проверка наличия подстроки
        System.out.println("6. Contains 'Java': " + str.contains("Java"));
        
        // startsWith() / endsWith()
        System.out.println("7. Starts with ' He': " + str.startsWith(" He"));
        
        // split() - разделение на массив
        String[] parts = "a,b,c,d".split(",");
        System.out.println("8. Split: " + String.join("|", parts));
        
        // charAt() - символ по индексу
        System.out.println("9. charAt(2): " + str.charAt(2));
        
        // equals() / equalsIgnoreCase() - сравнение
        System.out.println("10. Equals 'hello': " + "hello".equalsIgnoreCase("HELLO"));
        
        
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Java").add("Python").add("C++");
        System.out.println("\nStringJoiner: " + joiner);
        
        // StringJoiner с префиксом/суффиксом
        StringJoiner sj2 = new StringJoiner(" - ", "Студенты: ", "!");
        sj2.add("Анна").add("Иван").add("Мария");
        System.out.println("Форматированный: " + sj2);
        

        String textBlock = """
            Это текст-блок:
            1. Сохраняет форматирование
            2. Автоматически удаляет пробелы слева
            3. Удобен для JSON, SQL, HTML
            
            Пример JSON:
            {
              "name": "Иван",
              "age": 25
            }
            """;
        
        System.out.println("\nText Block:\n" + textBlock);
    }
}