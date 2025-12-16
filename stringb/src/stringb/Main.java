package stringb;

public class Main {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello");
        
        // append() - добавление в конец
        sb.append(" World");
        System.out.println("1. Append: " + sb); // Hello World
        
        // insert() - вставка по индексу
        sb.insert(6, "Java ");
        System.out.println("2. Insert: " + sb); // Hello Java World
        
        // delete() - удаление части
        sb.delete(6, 11);
        System.out.println("3. Delete: " + sb); // Hello World
        
        // reverse() - реверс строки
        System.out.println("4. Reverse: " + new StringBuilder("123").reverse()); // 321
        
        // replace() - замена части
        sb.replace(6, 11, "Universe");
        System.out.println("5. Replace: " + sb); // Hello Universe
        
        // capacity() / length() - вместимость и длина
        System.out.println("6. Capacity: " + sb.capacity() + ", Length: " + sb.length());
        
        // setLength() - установка длины
        sb.setLength(5);
        System.out.println("7. setLength(5): " + sb); // Hello
        
        // charAt() - символ по индексу
        System.out.println("8. charAt(1): " + sb.charAt(1)); // e
        
        // setCharAt() - замена символа
        sb.setCharAt(1, 'a');
        System.out.println("9. setCharAt: " + sb); // Hallo
        
        // substring() - подстрока
        System.out.println("10. substring(1,4): " + sb.substring(1, 4)); // all
        
        
        String str = "Java";
        
        // String > StringBuilder/StringBuffer
        StringBuilder sbFromStr = new StringBuilder(str);
        StringBuffer bufFromStr = new StringBuffer(str);
        
        // StringBuilder/StringBuffer > String
        String strFromSb = sbFromStr.toString();
        String strFromBuf = bufFromStr.toString();
        
        // StringBuilder <> StringBuffer
        StringBuffer bufFromSb = new StringBuffer(sbFromStr.toString());
        StringBuilder sbFromBuf = new StringBuilder(bufFromStr.toString());
        
        System.out.println("\nПреобразования:");
        System.out.println("String → StringBuilder: " + sbFromStr);
        System.out.println("StringBuilder → String: " + strFromSb);
        System.out.println("StringBuffer → String: " + strFromBuf);
    }
}
