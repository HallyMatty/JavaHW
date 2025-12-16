package otherPackage;

import thisPackage.This.Parent;

public class Other {
	class Child extends Parent {
	    void test() {
	        // this.privateVar = 5;    // Ошибка - private
	        // this.defaultVar = 5;    // Ошибка - default (другой пакет)
	        this.protectedVar = 5;      // protected (наследник)
	        this.publicVar = 5;         // public
	    }
	}

	class OtherPackageClass {
	    void test() {
	        Parent p = new Parent();
	        // p.privateVar = 5;      // Ошибка - private
	        // p.defaultVar = 5;      // Ошибка - default
	        // p.protectedVar = 5;    // Ошибка - protected (не наследник)
	        p.publicVar = 5;           // OK - public
	    }
}
