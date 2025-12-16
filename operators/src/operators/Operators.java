package operators;

public class Operators {
	public static void main(String[] args) {
        int a = 10, b = 3;
        double x = 7.5, y = 2.5;
        
        // Сложение
        int sum = a + b;        // 10 + 3 = 13
        double dSum = x + y;    // 7.5 + 2.5 = 10.0
        
        // Вычитание
        int diff = a - b;       // 10 - 3 = 7
        double dDiff = x - y;   // 7.5 - 2.5 = 5.0
        
        // Умножение
        int prod = a * b;       // 10 * 3 = 30
        double dProd = x * y;   // 7.5 * 2.5 = 18.75
        
        // Деление
        int div = a / b;        // 10 / 3 = 3
        double dDiv = x / y;    // 7.5 / 2.5 = 3.0
        
        // Остаток от деления
        int mod = a % b;        // 10 % 3 = 1
        double dMod = x % y;    // 7.5 % 2.5 = 0.0
        
        
        int num = 10;
        num += 5;      // num = num + 5 = 15
        num -= 3;      // num = num - 3 = 12
        num *= 2;      // num = num * 2 = 24
        num /= 4;      // num = num / 4 = 6
        num %= 4;      // num = num % 4 = 2
        
        
        int age = 1;
        String status = (age > 0) ? "positive" : "nonpositive"; // Положительное ли число
        
        int max = (a > b) ? a : b;  // Находим максимум
        
        
        boolean p = true, q = false;
        
        // Логическое И (&&) - короткое замыкание
        boolean andResult = p && q;  // true && false = false
        
        // Логическое ИЛИ (||) - короткое замыкание
        boolean orResult = p || q;   // true || false = true
        
        // Логическое исключающее ИЛИ (XOR) - ^
        boolean xorResult = p ^ q;   // true ^ false = true
        
        // & - вычисляются обе части
        // boolean result2 = (5 > 10) & (10 / 0 > 0);  // ArithmeticException
        
        // || - если левая часть true, правая не вычисляется
        boolean result3 = (5 < 10) || (10 / 0 > 0);  // Нет ошибки
        
    
        int bitA = 12;
        int bitB = 10;
        
        // Битовое И (&)
        int bitAnd = bitA & bitB;  // 1100 & 1010 = 1000 (8)

        // Битовое ИЛИ (|)
        int bitOr = bitA | bitB;   // 1100 | 1010 = 1110 (14)
        
        // Битовое XOR (^)
        int bitXor = bitA ^ bitB;  // 1100 ^ 1010 = 0110 (6)
        
        // Битовое НЕ (~)
        int bitNot = ~bitA; // дополненеие числа bitA в 32-х битовом представлении
        System.out.println("bitNot " + bitNot);
        

        int shiftNum = 0b00000010;  // 2
        
        // Сдвиг влево (<<)
        int leftShift = shiftNum << 2;  // 2 * 4 = 8

        // Сдвиг вправо (>>)
        int rightShift = shiftNum >> 1;  // 2 / 2 = 1

        // Для отрицательных чисел
        int negative = -8;  // 11...11000
        int negShift = negative >> 1;  // Сохраняет знак 11...1100
        System.out.println("negShift: " + negShift);
        
        // Беззнаковый сдвиг вправо (>>>)
        int unsignedShift = negative >>> 1; // не сохраняет знак 011...11000
        System.out.println("unsignedShift: " + unsignedShift);
        
        
        // Префиксная форма (++i) - увеличивает на единицу, использует в вычислениях изменненое значение
        int pref = 5;
        System.out.println(pref + ", " + ++pref); // 5, 5
        System.out.println(pref); // 6
        
        // Постфиксная форма (i++) - увеличивает на единицу, использует в вычислениях старое значение
        int post = 5;
        System.out.println(pref + ", " + ++pref); // 5, 6
        
        
        int positive = 10;
        int negativeNum = -positive;  // -10

        boolean flag = true;
        boolean notFlag = !flag;  // false
        

        int noParens = 2 + 3 * 4;  // 2 + 12 = 14
        System.out.println("   2 + 3 * 4 = " + noParens);
        
        int withParens = (2 + 3) * 4;  // 5 * 4 = 20
        System.out.println("   (2 + 3) * 4 = " + withParens);
        
        int complex = 10 + 2 * 3 / (4 - 2);  // 10 + 6 / 2 = 13
        System.out.println("   10 + 2 * 3 / (4 - 2) = " + complex);
        
        String str1 = "Hello";
        String str2 = "World";
        
        // + для конкатенации строк
        String greeting = str1 + " " + str2;  // "Hello World"
        
        // += для строк
        String message = "Hello";
        message += " World";  // "Hello World"
        
        // + с разными типами (автоматическое преобразование)
        String info = "Number: " + 42 + ", Boolean: " + true;
        
        String noParensString = "Sum: " + 2 + 3;  // "Sum: 23" (конкатенация)
        String withParensString = "Sum: " + (2 + 3); // "Sum: 5" (сначала сложение)

        int[] numbers = {10, 20, 30, 40, 50};

        // Доступ по индексу
        int first = numbers[0];  // 10
        int third = numbers[2];  // 30
        numbers[4] = 100;        // Изменение элемента
        
        // instanceof
        
	    // Создаем объекты
        Parent parent = new Parent();
        Child child = new Child();
        
        //Проверка объектов класса на принадлежность классу
        System.out.println((parent instanceof Parent));      // true
        System.out.println((child instanceof Child));          // true
        
        //Проверка наследования
        System.out.println((child instanceof Parent));        // true
        System.out.println((parent instanceof Child));        // false

        //null instanceof любой_тип = всегда false
        Parent nullParent = null;
        Child nullChild = null;
        Object nullObject = null;
        
        System.out.println((nullParent instanceof Parent));          // false
        System.out.println((nullChild instanceof Child));            // false
        System.out.println((nullObject instanceof Object));          // false
    }
}


class Parent {
    // Пустой класс
}


class Child extends Parent {
    // Пустой класс, наслденик класса Parent
}
