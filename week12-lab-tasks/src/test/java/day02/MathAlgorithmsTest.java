package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void greatestDivisor() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        assertEquals(10, mathAlgorithms.greatestDivisor(100,10));
    }
}