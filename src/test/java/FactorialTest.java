import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void shouldReturnOneForFactorialOfZero() {
        int expectedFactorialOf0 = 1;
        Factorial factorial = new Factorial(0);

        int factorialOf0 = factorial.getFactorial();

        assertEquals(expectedFactorialOf0, factorialOf0);
    }

    @Test
    public void shouldReturnOneForFactorialOfOne() {
        int expectedFactorialOf1 = 1;
        Factorial factorial = new Factorial(1);

        int factorialOf1 = factorial.getFactorial();

        assertEquals(expectedFactorialOf1, factorialOf1);
    }

    @Test
    public void shouldReturnCorrectFactorial() {
        int expectedFactorialOf5 = 120;
        Factorial factorial = new Factorial(5);

        int factorialOf5 = factorial.getFactorial();

        assertEquals(expectedFactorialOf5, factorialOf5);
    }

    @Test
    public void shouldReturnCorrectFactorialForLargeNumber() {
        int expectedFactorialOf10 = 3628800;
        Factorial factorial = new Factorial(10);

        int factorialOf10 = factorial.getFactorial();

        assertEquals(expectedFactorialOf10, factorialOf10);
    }

    @Test
    public void shouldThrowAnErrorForNegativeNumber() {
        Factorial factorial = new Factorial(-4);
        String expectedMessage = "Factorial is undefined for Negative numbers!";

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            factorial.getFactorial();
        });

        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

}
