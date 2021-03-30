package Exception;

public class IllegalFoodNotHerbExeption extends IllegalArgumentException {
    public static String DEFAULT_MESSAGE = "Еда не является травой";
    public IllegalFoodNotHerbExeption(String s) {
        super(s);
    }
    public IllegalFoodNotHerbExeption() {
        super(DEFAULT_MESSAGE);
    }
}
