package javadoc;

import java.util.Objects;

/**
 * @author Artyom
 * @version 1.0.0
 * @since 1.0
 * @see java.lang.Object
 * @see java.lang.Comparable
 */
public class TemplateClass {
    
    /**
     * Имя объекта. Не может быть {@code null}.
     * <p>
     * Используется для идентификации объекта в системе.
     * </p>
     */
    private final String name;
    
    /**
     * Числовое значение объекта.
     */
    private int value;
    
    /**
     * Создает новый объект с указанным именем.
     *
     * @param name имя объекта, не может быть {@code null}
     * @throws IllegalArgumentException если имя пустое
     * @throws NullPointerException если имя равно {@code null}
     */
    public TemplateClass(String name, int value) {
    	 Objects.requireNonNull(name, "Имя не может быть null");
         
         String trimmed = name.trim();
         if (trimmed.isEmpty()) {
             throw new IllegalArgumentException("Имя не может быть пустым");
         }
        this.name = name;
        this.value = value;
    }
    
    /**
     * Выполняет основную операцию с объектом.
     * <p>
     * Метод производит вычисления на основе текущего значения.
     * </p>
     *
     * @return результат операции
     */
    public String method() {   
    	String result = name + value;
        return result;
    }

    /**
     * Возвращает имя объекта.
     *
     * @return имя объекта, никогда не {@code null}
     * @see name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Возвращает числовое значение объекта.
     *
     * @return текущее значение
     * @see value
     */
    public int getValue() {
        return value;
    }
}