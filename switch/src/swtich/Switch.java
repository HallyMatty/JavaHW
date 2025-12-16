package swtich;

public class Switch {

	public static void main(String[] args) {
		// int
		int intValue = 1;
		switch (intValue) { 
		case 1: 
			System.out.println(intValue);
			break;
		}

		// enum
		enum Color { RED, GREEN, BLUE }
		Color color = Color.RED;
		switch (color) {
		    case RED:
		        System.out.println("Красный");
		        break;
		}

		// String
		String str = "A";
		switch (str) {
		    case "A":
		        System.out.println("Буква A");
		        break;
		}

		// char
		char ch = 'a';
		switch (ch) {
		    case 'a':
		        System.out.println("Строчная a");
		        break;
		}

		// byte
		byte b = 1;
		switch (b) {
		    case 1:
		        System.out.println("byte 1");
		        break;
		}
		
		// short
		short s = 10;
		switch (s) {
		    case 10:
		        System.out.println("short 10");
		        break;
		}
		
		int x = 2;
		switch (x) {
	    case 1:
	    	System.out.println("1");
	        break;
	    case 2:  // НЕТ break!
	    	System.out.println("2");
	    case 3: // будет также выполнен блок кода case 3:
	    	System.out.println("3");
	        break;
		}
	}

}
