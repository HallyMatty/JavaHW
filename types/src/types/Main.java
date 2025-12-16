package types;

public class Main{
	public static void main(String[] args) {
		byte byteZero = 0;
        short shortZero = 0;
        int intZero = 0;
        long longZero = 0L;
        float floatZero = 0.0f;
        double doubleZero = 0.0;
        char charZero = '\u0000';
        boolean booleanFalse = false;
        
        
        System.out.println("\u0041\u0072\u0074\u0079\u006F\u006D"); // Вывод имени символами юникода
        
        System.out.println();
        
        System.out.println("int a = 1;\r\n"
        		+ "        {\r\n"
        		+ "            int b = 2;\r\n"
        		+ "        }\r\n"
        		+ "        int c = a + b;\r\n"
        		+ "Приведет к ошибке компиляции, т.к. переменная b доступна только внутри фигурных скобок");
        
        System.out.println();
        
        String str = "строка";

        System.out.println(str + byteZero);
        System.out.println(str + floatZero);
        System.out.println(str + booleanFalse);
        System.out.println(str + charZero);
        // все нестроковые типы приводятся к строке
        
        System.out.println();
        
        
        int intVal = 5;
        double doubleVal = 2.5;
        System.out.println(((Object)(intVal + doubleVal)).getClass()); // double
        
        float floatVal = 3.14f;
        System.out.println(((Object)(floatVal + doubleVal)).getClass()); // double
        
        long longVal = 10000000000L;
        System.out.println(((Object)(longVal + intVal)).getClass()); // long
        
        char charVal = 'A';
        System.out.println(((Object)(charVal + 5)).getClass()); // int
        
        byte byte1 = 10;
        byte byte2 = 20;
        System.out.println(((Object)(byte1 + byte2)).getClass()); // int
        
        System.out.println();
        
        intVal = (int) doubleVal;
        System.out.println(intVal + " = (int) " + doubleVal); // опускается дробная часть
        
        intVal = (int) longVal;
        System.out.println(intVal + " = (int) " + longVal); // просходит переполнение типа данных 
        
        int mediumInt = 200;
        byte tinyByte = (byte) mediumInt;
        System.out.println(tinyByte + " = (byte) " + mediumInt);
        System.out.println("Двоичные коды совпадают в int и byte, но означают разные числа");
        
        System.out.println();
        
        int a = 120;
        byte c = (byte)(a + 10);
        System.out.println("byte b = a + 10;"+
        		"byte d = a + 1;" + 
        		"эти две строки не скомпелируются, так как это сужающее приведение");
        System.out.println(c + " = (byte) (" + a + " + 10)" +
        		"Двоичные коды совпадают в int и byte, но означают разные числа");
        
        System.out.println();
        
        var scanner = new java.util.Scanner(System.in);
        System.out.print("Введите имя: ");
        var userName = scanner.nextLine();
        var greeting = "Привет, " + userName;
        System.out.println(greeting);
        System.out.println("var используется для автоматического определения типа переменной комплятором");
	}
}