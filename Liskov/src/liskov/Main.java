package liskov;
public class Main {
    public static void main(String[] args) {
    	 Animal[] animals = {
    			 new Bird("eagle", true),
    		     new Bird("pinguin", false),
    		     new Fish("shark", 280.0),
    		     new Fish("golden fish", 8.5),
    	        };
    	        
    	        for (Animal animal : animals) {
    	            System.out.printf("- %s: movement='%s'\n",
    	                animal.getName(),
    	                animal.move()
    	            );
    	            assert animal.move().isEmpty() : "invariant violated"; // Проверка непустого вывода метода каждого животного
    	        }
    	}
}