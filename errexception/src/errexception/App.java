package errexception;

public class App {
	  final static int START_COUNTER;
	  static {
	    START_COUNTER = Integer.parseInt("Y-"); //ExceptionInInitializerError
	  }
	  public static void main(String[] args) {
	    System.out.println("Hello"); // Не выполняется
	  }
	}