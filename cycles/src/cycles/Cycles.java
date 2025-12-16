package cycles;

public class Cycles {
	public static void main(String[] args) {
	for (;;) {
		// блок кода в бесконечном цикле
		break;
	}
	
	while (true){
		// блок кода в бесконечном цикле
		break;
	}
	do{
		// блок кода в бесконечном цикле
		break;
	} while(true);
	
	for (int i = 0; i < 10; i++) {
	    if (i == 5) break; // выходим при i=5
	    System.out.println(i); // 0 1 2 3 4
	}

	for (int i = 0; i < 5; i++) {
	    if (i == 2) continue; // пропускаем i=2, переход к следующей итерации
	    System.out.println(i); // 0 1 3 4
	}
	}
}
