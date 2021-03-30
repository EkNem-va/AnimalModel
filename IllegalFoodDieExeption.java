package Exception;

public class IllegalFoodDieExeption extends IllegalStateException {
    public static String DEFAULT_MESSAGE = "Жертва уже мертва";
    public IllegalFoodDieExeption(String s) {

        super(s);
    }
    public IllegalFoodDieExeption() {

        super(DEFAULT_MESSAGE);
    }
}
