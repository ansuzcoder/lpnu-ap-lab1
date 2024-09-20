package lab1;

public class FibonacciNumber {
    private final int numberPosition;
    private final int numberValue;

    /**
     * class builder
     *
     * @param newNumberPosition position in the array
     * @param newNumberValue    number value
     */
    public FibonacciNumber(
            int newNumberPosition,
            int newNumberValue
    ) {
        this.numberPosition = newNumberPosition;
        this.numberValue = newNumberValue;
    }

    /**
     * number position getter
     *
     * @return int
     */
    public int getNumberPosition() { return numberPosition; }

    /**
     * number value getter
     *
     * @return int
     */
    public int getNumberValue() { return numberValue; }

    /**
     * determine whether a number is a perfect square
     *
     * @return boolean
     */
    public boolean isSquare() {
        int intVal = (int) Math.sqrt(numberValue);
        return intVal * intVal == numberValue;
    }
}
