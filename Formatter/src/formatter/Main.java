package formatter;

import java.time.LocalDateTime;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        // 1. %s - строковый
        System.out.printf("1. Строка: %s%n", "Hello");
        
        // 2. %d - целое число
        System.out.printf("2. Целое число: %d%n", 42);
        
        // 3. %f - дробное число
        System.out.printf("3. Дробное: %.2f%n", 3.14159);
        
        // 4. %b - логическое значение
        System.out.printf("4. Логическое: %b%n", true);
        
        // 5. %c - символ
        System.out.printf("5. Символ: %c%n", 'A');
        
        
        FileWriter writer = new FileWriter("test.txt");
        writer.write("Текст в буфере");
        writer.flush(); // Принудительно записывает данные из буфера в файл
        writer.close();
        System.out.println("flush() принудительно записывает буфер");
        
        
        LocalDateTime now = LocalDateTime.now();
        
        // 1. %tY - год (4 цифры)
        System.out.printf("1. Год: %tY%n", now);
        
        // 2. %tB - полное название месяца
        System.out.printf("2. Месяц: %tB%n", now);
        
        // 3. %tA - день недели
        System.out.printf("3. День недели: %tA%n", now);
        
        // 4. %tH:%tM - часы и минуты
        System.out.printf("4. Время: %tH:%tM%n", now, now);
        
        // 5. %td.%tm.%tY - дата
        System.out.printf("5. Дата: %td.%tm.%tY%n", now, now, now);
    }
}