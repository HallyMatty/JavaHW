package finals;

public class A {
    public final int a;  // должно быть инициализировано
    
    // В конструкторе по умолчанию
    public A() {
        a = 10;
    }
    
    // В блоке инициализации (тогда все конструкторы должны его не трогать)
    {
        a = 20;  // Инициализация для ВСЕХ конструкторов
    }
    
    // Через вызов метода в конструкторе
    public A(String str) {
        a = calculateValue(str);
    }
    private int calculateValue(String s) {
        return s.length();
    }
    
    // В перегруженных конструкторах с разными значениями
    public A(boolean flag) {
        a = flag ? 1 : 0;
    }
}