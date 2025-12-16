package logicalblock;

public class A {
	{ // вызывается после static {}
        System.out.println("logic (1) id= " + this.id);
    }

    static { // вызывается при создании первого объекта
        System.out.println("static logic");
    }

    private int id = 1; // после нестатического блока

    public A(int id) { // метод последним
        this.id = id;
        System.out.println("ctor id= " + id);
    }

    { // вызвается после инициализации id
        System.out.println("logic (2) id= " + id);
    }
}
