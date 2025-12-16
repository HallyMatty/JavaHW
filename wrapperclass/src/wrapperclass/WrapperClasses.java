package wrapperclass;

public class WrapperClasses {
	public static void main(String[] args) {
		// decode() распознает числа в 16-ричной, 8-ричной и 10-чной записи 
        Integer hex = Integer.decode("0xFF"); // 16-ричная 
        Integer oct = Integer.decode("0377"); // 8-ричная
        Integer dec = Integer.decode("255");  // 10-ричная
        
        System.out.println("0xFF = " + hex); // 255
        System.out.println("0377 = " + oct); // 255
        System.out.println("255 = " + dec);  // 255
        
        
        Boolean bool1 = Boolean.valueOf(true); // используем boolean
        Boolean bool2 = Boolean.valueOf("true"); // используем string
        Boolean bool3 = Boolean.valueOf("TRUE");
        Boolean bool4 = Boolean.valueOf("false");
        Boolean bool5 = Boolean.valueOf("anything"); // false
        Boolean bool6 = true; // автоупаковка
        
        
        Integer nullInteger = null;
        
        // Автораспаковка null > NullPointerException
        try {
            int value = nullInteger;  // NPE!
        } catch (NullPointerException e) {
            System.out.println("NPE при автораспаковке null Integer");
        }
        
        // Арифметика с null тоже вызывает NPE
        try {
            int result = nullInteger + 5;  // NPE!
        } catch (NullPointerException e) {
            System.out.println("NPE при арифметике с null");
        }
        
        
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        System.out.println("a1==i1 " + (a1 == i1));        // true (автораспаковка)
        System.out.println("b1==i1 " + (b1 == i1));        // true (автораспаковка)  
        System.out.println("a1==b1 " + (a1 == b1));        // false (разные объекты)
        
        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2));        // true (автораспаковка)
        System.out.println("b2==i2 " + (b2 == i2));        // true (автораспаковка)
        System.out.println("a2==b2 " + (a2 == b2));        // true! (кеш -128..127)
        
        // IntegerCache: в диапазоне -128..127 диапазоне возвращается кешированный объект, в иных случаях создается новый объект
        // поэтому оператор == выдал ожидаемый результат для классов-оболочек с числом 127
        
        // equals всегда работает правильно
        System.out.println("a1.equals(b1) " + a1.equals(b1));  // true
        
        
	}
}
