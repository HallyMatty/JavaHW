package object;

import java.util.Objects;

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /*It is reflexive: for any non-null reference value x, x.equals(x) should return true.
	It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
	It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, 
	then x.equals(z) should return true.
	It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or 
	consistently return false, provided no information used in equals comparisons on the objects is modified.
	For any non-null reference value x, x.equals(null) should return false.
	*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (obj == null) return false;
        
        if (getClass() != obj.getClass()) return false;
        
        Person other = (Person) obj;
        
        return age == other.age && name.equals(other.name);
    }
    
    //переопределение equals() требует также переопределения hashCode
    @Override
    public int hashCode() {
    	return Objects.hash(name, age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Anna", 25);
        Person p2 = new Person("Anna", 25);
        Person p3 = new Person("Ivan", 30);
        
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
        System.out.println(p1.equals(null)); // false
        System.out.println(p1.equals("text")); // false
    }
}