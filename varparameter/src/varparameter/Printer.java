package varparameter;

class Printer {
    void print(String... strs) {
        for (String s : strs) System.out.print(s + " ");
        System.out.println();
    }
    
    void print(int... nums) {
        for (int n : nums) System.out.print(n + " ");
        System.out.println();
    }
    
    void print(String prefix, int... nums) {
        System.out.print(prefix + ": ");
        for (int n : nums) System.out.print(n + " ");
        System.out.println();
    }


	public static void main(String[] args) {
		Printer p = new Printer();
		p.print("a", "b", "c");     // String varargs
		p.print(1, 2, 3);           // int varargs  
		p.print("Numbers", 4, 5, 6); // смешанный
	}

}
