package Exception;

public class IllegalMassaExceptionMassa extends IllegalArgumentException{
    public static String DEFAULT_MESSAGE = "Масса не может быть нулевой или отрицательной";

    public IllegalMassaExceptionMassa(String s) {
        super(s);
    }
    public IllegalMassaExceptionMassa() {
        super(DEFAULT_MESSAGE);
    }
}
