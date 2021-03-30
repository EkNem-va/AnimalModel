package Exception;

public class IllegalFoodNotAnimalException extends IllegalArgumentException {
    public static String DEFAULT_MESSAGE = "Жертва не является животным";
    public IllegalFoodNotAnimalException(String s) {
        super(s);
    }
    public IllegalFoodNotAnimalException() {
        super(DEFAULT_MESSAGE);
    }
}
