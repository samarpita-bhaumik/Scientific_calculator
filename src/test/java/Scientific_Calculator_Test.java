import org.example.Scientific_Calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Scientific_Calculator_Test {
    Scientific_Calculator ob= new Scientific_Calculator();

    @Test
    public void testSquareRootFunc() {
        assertEquals("Square root of16 should be 4", 4, ob.squareRoot(16), 0);
        assertEquals("Square root of 25 should be 5", 5, ob.squareRoot(25), 0);
        assertEquals("Square root of 36 should be 6", 6, ob.squareRoot(36), 0);
    }
    @Test
    public void testSquareRootZero() {
        assertEquals("Square root of 0 should be 0", 0, ob.squareRoot(0), 0);
    }


    @Test
    public void testFactorialFunc() {
        assertEquals("Factorial of 5 should be 120",120, ob.factorial(5),0);
        assertEquals("Factorial of 6 should be 720", 720, ob.factorial(6), 0);
        assertEquals("Factorial of 10 should be 3628800", 3628800, ob.factorial(10), 0);
    }
    @Test
    public void testFactorialZer() {
        assertEquals("Factorial of 0 should be 1", 1, ob.factorial(0), 0);
    }
    @Test
    public void testLogNatural() {
        assertEquals("Natural logarithm of 16 should be approximately 2.772588722239781",2.772588722239781, ob.naturalLogFun(16),0);
        assertEquals("Natural logarithm of 25 should be approximately 3.2188758248682006", 3.2188758248682006, ob.naturalLogFun(25), 0.000000000000001);
        assertEquals("Natural logarithm of 36 should be approximately 3.58351893845611", 3.58351893845611, ob.naturalLogFun(36), 0.00000000000001);
    }



    @Test
    public void testPowerFunc() {
        assertEquals("2 raised to the power of 4 should be 16",16, ob.powerFunc(2,4),0);
        assertEquals("3 raised to the power of 3 should be 27", 27, ob.powerFunc(3, 3), 0);
        assertEquals("5 raised to the power of 2 should be 25", 25, ob.powerFunc(5, 2), 0);
    }

    @Test
    public void testPowerFuncZeroExponent() {
        // Any number raised to the power of 0 should be 1
        assertEquals("Any number raised to the power of 0 should be 1", 1, ob.powerFunc(10, 0), 0);
        assertEquals("Any number raised to the power of 0 should be 1", 1, ob.powerFunc(0, 0), 0);
        assertEquals("Any number raised to the power of 0 should be 1", 1, ob.powerFunc(-5, 0), 0);
    }

}
