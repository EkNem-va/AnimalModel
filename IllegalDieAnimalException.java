package Exception;

public class IllegalDieAnimalException extends IllegalStateException {
    public static String DEFAULT_MESSAGE = "Животное мертво";
    public IllegalDieAnimalException(String s) {
        super(s);
    }
    public IllegalDieAnimalException() {
        super(DEFAULT_MESSAGE);
    }
}
