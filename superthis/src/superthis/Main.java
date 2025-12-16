package superthis;

class Parent {
 String name = "Parent";
 
 Parent(String name) {
     System.out.println("Parent constructor: " + name);
 }
 
 void display() {
     System.out.println("Parent method");
 }
}

class Child extends Parent {
 String name = "Child";
 
 Child() {
     super("test"); // Вызов конструктора родителя
 }
 
 void show() {
     System.out.println(super.name); // Доступ к полю родителя
     super.display(); // Вызов метода родителя
 }
}

class A {
 int a = 10;
 void method() {
     System.out.println("A method, a = " + a);
 }
}

class B extends A {
 // Наследует a и method() от A
}

class C extends B {
 void method() {
     int a = super.a; // a из класса A
     super.method(); // method() из класса A
     System.out.println("C method");
 }
}

class Test {
 int a, b, c, z;
 
 public Test() {
     this(0, 0, 0); // Вызов конструктора с 3 параметрами
 }
 
 public Test(int a) {
     this(a, 0, 0); // Вызов конструктора с 3 параметрами
 }
 
 public Test(int a, int b) {
     this(a, b, 0); // Вызов конструктора с 3 параметрами
 }
 
 public Test(int a, int b, int c) {
     this.a = a;
     this.b = b;
     this.c = c;
     this.z = 1;
 }
}

public class Main {
 public static void main(String[] args) {
     Child child = new Child();
     child.show();
     
     C objC = new C();
     objC.method(); // Вызов method() из C, который вызывает method() из A
     
     Test t1 = new Test();
     Test t2 = new Test(1);
     Test t3 = new Test(1, 2);
     Test t4 = new Test(1, 2, 3);
 }
}