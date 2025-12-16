package thisPackage;

public class This {
	public class Parent {
	    private int privateVar = 1;        // Доступ только внутри Parent
	    int defaultVar = 2;                // Доступ том же пакете
	    protected int protectedVar = 3;    // Доступ в том же пакете + наследники
	    public int publicVar = 4;          // Доступ везде
	}

	class SamePackageClass {
	    void test() {
	        Parent p = new Parent();
	        // p.privateVar = 5;      // Ошибка (доступ вне класса)
	        p.defaultVar = 5;          // default
	        p.protectedVar = 5;        // protected
	        p.publicVar = 5;           // public
	    }
	}
}
