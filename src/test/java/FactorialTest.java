import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void shouldReturnOneForFactorialOfZero() {
        Factorial factorial = new Factorial(0);
        int factorialOf0 = factorial.getFactorial();
        int expectedFactorialOf0 = 1;
        assertEquals(expectedFactorialOf0, factorialOf0);
    }

    @Test
    public void shouldReturnOneForFactorialOfOne(){
        Factorial factorial = new Factorial(1);
        int factorialOf1 = factorial.getFactorial();
        int expectedFactorialOf1 = 1;
        assertEquals(expectedFactorialOf1, factorialOf1);
    }

    @Test
    public void shouldReturnCorrectFactorial(){
        Factorial factorial = new Factorial(5);
        int factorialOf5 = factorial.getFactorial();
        int expectedFactorialOf5 = 120;
        assertEquals(expectedFactorialOf5, factorialOf5);
    }

    @Test
    public void shouldReturnCorrectFactorialForLargeNumber() {
        Factorial factorial = new Factorial(10);
        int factorialOf10 = factorial.getFactorial();
        int expectedFactorialOf10 = 3628800;
        assertEquals(expectedFactorialOf10, factorialOf10);
    }

    @Test
    public void shouldThrowAnErrorForNegativeNumber() {
        Factorial factorial = new Factorial(-4);
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            int factorialOfNegativeFour = factorial.getFactorial();
        });
        String expectedMessage = "Factorial is undefined for Negative numbers!";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

}
