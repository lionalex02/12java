import static org.junit.jupiter.api.Assertions.*;

public class Test
        {
    @org.junit.jupiter.api.Test
    void testNegative() {
        assertEquals(-123, Integer.decode("-123"));
    }

    @org.junit.jupiter.api.Test
    void testPositive() {
        assertEquals(123, Integer.decode("123"));
    }

    @org.junit.jupiter.api.Test
    void testOctal() {
           assertEquals(123, Integer.decode("0173"));
    }

    @org.junit.jupiter.api.Test
    void testHexadecimalOne() {
        assertEquals(123, Integer.decode("0x7B"));
    }

    @org.junit.jupiter.api.Test
    void testHexadecimalTwo() {
        assertEquals(123, Integer.decode("+#7B"));
    }

    @org.junit.jupiter.api.Test
    void testMaxValue() {
        String maxValue = "2147483647";
        assertEquals(Integer.MAX_VALUE, Integer.decode(maxValue));
    }

    @org.junit.jupiter.api.Test
    void testIncorrectMinusPosition() {
        assertThrows(NumberFormatException.class, () -> Integer.decode("123-"));
    }

    @org.junit.jupiter.api.Test
    void testEmptyString() {
        assertThrows(NumberFormatException.class, () -> Integer.decode(""));
    }


    @org.junit.jupiter.api.Test
    void testInvalidFormat() {
        assertThrows(NumberFormatException.class, () -> Integer.decode("Bukvy bukavki"));
    }

    @org.junit.jupiter.api.Test
    void testLargeNum() {
        assertThrows(NumberFormatException.class, () -> Integer.decode("-2147483647000"));
    }
}