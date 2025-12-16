package innerclass;

public class Outer {
    private String outerPrivate = "outer private";
    String outerDefault = "outer default";
    protected String outerProtected = "outer protected";
    public String outerPublic = "outer public";
    
    private class PrivateInner {}      // только внутри Outer
    class DefaultInner {}              // доступ в том же пакете
    protected class ProtectedInner {}  // доступ в пакете + наследники Outer
    public class PublicInner {}        // доступ везде
    
    public class Inner {
        private String innerPrivate = "inner private";
        
        void accessOuter() {
            System.out.println(outerPrivate);    // private
            System.out.println(outerDefault);    // default  
            System.out.println(outerProtected);  // protected
            System.out.println(outerPublic);     // public
        }
        
        void callOuterMethod() {
            outerMethod();  // вызов метода внешнего класса
        }
        
        public String getPrivateField() {
            return "private field";
        }
    }
    
    void accessInner() {
        Inner inner = new Inner();
        // System.out.println(inner.innerPrivate); // private - недоступно
        // Для доступа к private нужен public метод
        System.out.println(inner.getPrivateField()); // через геттер
    }
    
    private void outerMethod() {
        System.out.println("Outer method");
    }
    
    
    public static void main(String[] args) {
        Outer outer = new Outer();
        
        Outer.Inner inner = outer.new Inner();
        inner.accessOuter();  // Внутренний класс видит всё внешнее
        
        // new Outer().new PrivateInner(); // ❌ private - только внутри Outer
        Outer.PublicInner publicInner = outer.new PublicInner(); // public
        
        outer.accessInner();
    }
}

class Test {
    void test() {
        Outer outer = new Outer();
        // Outer.PrivateInner pi = outer.new PrivateInner(); // private
        Outer.PublicInner pub = outer.new PublicInner(); // public
        // Outer.DefaultInner def = outer.new DefaultInner(); // если в том же пакете
    }
}