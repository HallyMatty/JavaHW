package parameterclass;

import java.util.*;

class Box<T> {
 T value;
}

public class ParameterClass {
 public static void main(String[] args) {
     // instanceof с generic
     Box<String> box = new Box<>();
     System.out.println(box instanceof Box);        // true
     System.out.println(box instanceof Box<?>);     // true
     // System.out.println(box instanceof Box<String>); // ошибка
     
     List<String> list = new ArrayList<>();
     System.out.println(list instanceof List<?>);   // true
     
     // Wildcards <? extends T> и <? super T>
     List<Integer> ints = Arrays.asList(1, 2, 3);
     List<Double> doubles = Arrays.asList(1.1, 2.2);
     List<Number> nums = new ArrayList<>();
     
     // <? extends Number> - для записи
     System.out.println("Sum ints: " + sum(ints));       // 6.0
     System.out.println("Sum doubles: " + sum(doubles)); // 3.3
     
     // <? super Integer> - для чтения
     addInt(nums, 10);   // Number super Integer
     System.out.println("nums: " + nums); // [10]
     
 }
 
 // <? extends T> - PRODUCER (для чтения)
 static double sum(List<? extends Number> list) {
     return list.stream().mapToDouble(Number::doubleValue).sum();
 }
 
 // <? super T> - CONSUMER (для записи)
 static void addInt(List<? super Integer> list, Integer value) {
     list.add(value);  // можно добавлять Integer
     // Integer i = list.get(0); // нельзя читать как Integer
 }
}
