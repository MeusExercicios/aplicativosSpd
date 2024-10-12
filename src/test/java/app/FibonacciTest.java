package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacciResolution(){
        assertEquals(0,Fibonacci.fibonacciResolution(1));
        assertEquals(1,Fibonacci.fibonacciResolution(2));
        assertEquals(1,Fibonacci.fibonacciResolution(3));
        assertEquals(2,Fibonacci.fibonacciResolution(4));
        assertEquals(3,Fibonacci.fibonacciResolution(5));
        assertEquals(5,Fibonacci.fibonacciResolution(6));
        assertEquals(8,Fibonacci.fibonacciResolution(7));
        assertEquals(13,Fibonacci.fibonacciResolution(8));
    }


}
