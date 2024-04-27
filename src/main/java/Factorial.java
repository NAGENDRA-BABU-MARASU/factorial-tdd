public class Factorial {
    private final int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int getFactorial() {
        if (number < 0) {
            throw new ArithmeticException("Factorial is undefined for Negative numbers!");
        }
        return calculateFactorial();
    }

    private int calculateFactorial() {
        int result = 1;
        if (number == 0 || number == 1) {
            return result;
        }

        for (int i = number; i >= 2; i--) {
            result = result * i;
        }
        return result;
    }
}
