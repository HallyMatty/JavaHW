package scanner;

import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        try {
            File file = new File("test.txt");
            Scanner scanner = new Scanner(file);
            
            System.out.println("Чтение из файла:");
            
            // Чтение построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
            scanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        
        //чтение с консоли
        Scanner console = new Scanner(System.in);
        System.out.print("\nВведите ваше имя: ");
        String name = console.nextLine();
        System.out.println("Привет, " + name + "!");
        
        console.close();
    }
}
