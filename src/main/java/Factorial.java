public class Factorial {
    private final int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int getFactorial() {
        if (number < 0) {
            throw new ArithmeticException("Factorial is undefined for Negative numbers!");
        }
        if(number == 0) return 1;
        if(number == 1) return 1;
        return calculateFactorial();
    }

    private int calculateFactorial() {
        int result = 1;
        for (int i = number; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }
}
