package arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int a1[] = {1,2,3,4,5};
		int a2[] = {6,7,8,9,10};
		a1 = a2;
		// переменные a1 и a2 хранят ссылку на массив {6,7,8,9,10}, массив {1,2,3,4,5} теряет ссылку и удаляется
		
		int[] arr = {5, 3, 8, 1, 9};
        
        // 1. toString() - строковое представление массива
        System.out.println(Arrays.toString(arr)); // "[5, 3, 8, 1, 9]"
        
        // 2. sort() - сортировка (изменяет исходный массив)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 3, 5, 8, 9]
        
        // 3. binarySearch() - бинарный поиск (только для сортированных массивов)
        int index = Arrays.binarySearch(arr, 8);
        System.out.println("Индекс 8: " + index); // 3
        
        // 4. equals() - сравнение массивов
        int[] arr2 = {1, 3, 5, 8, 9};
        System.out.println(Arrays.equals(arr, arr2)); // true
        
        // 5. compare() - лексикографическое сравнение
        int[] arr3 = {1, 3, 5};
        System.out.println(Arrays.compare(arr, arr3)); // 2 (arr > arr3)
        System.out.println(Arrays.compare(arr, arr2)); // 0 (равны)
        System.out.println(Arrays.compare(arr3, arr)); // -2 (arr3 < arr)
		
	}

}
